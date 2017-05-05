import java.math.BigDecimal;
import java.sql.DriverManager;                 // handles communication with the DB
import java.sql.Connection;                    // a connection to the DB
import java.sql.Statement;
import java.sql.PreparedStatement;             // an SQL statement for the DB to execute
import java.sql.ResultSet;                     // a table of rows generated from an SQL query
import java.sql.SQLException;                  // what's thrown when the JDBC operations fail
import java.util.Properties;                   // key/value pairs
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class DataVerifierT extends HttpServlet {
    private static final int MinLength = 6;

    public DataVerifierT() {
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) {
        Connection conn = getConnection();
        verifyUserInputsAndUpdateDB(conn, req, res);
        try {
            conn.close();
        } catch (SQLException e) {
        }
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        sendResponse(req, res, "POST requests only, please.", true);
    }

    private void verifyUserInputsAndUpdateDB(Connection conn,
                                             HttpServletRequest req,
                                             HttpServletResponse res) {
        String name = req.getParameter("ename");
        String department = req.getParameter("department");
        String salary = req.getParameter("salary");
        String idE = req.getParameter("id1");

        // data verification checks
        if (name == null) {
            sendResponse(req, res, "Employee name is missing.", true);
            return;
        }
        if (department == null) {
            sendResponse(req, res, "Employee department is missing.", true);
            return;
        }
        if (salary == null) {
            sendResponse(req, res, "Employee salary is missing.", true);
            return;
        }
        if (idE == null) {
            sendResponse(req, res, "Employee ID is missing.", true);
            return;
        }

        if (name.length() < MinLength) {
            sendResponse(req, res, "A product's name must be at least " + MinLength + " characters.", true);
            return;
        }

        if (department.length() < MinLength) {
            sendResponse(req, res, "A category's name must be at least " + MinLength + " characters.", true);
            return;
        }

        BigDecimal salaryBD = convertSalary(salary);
        if (salaryBD == null) {
            sendResponse(req, res, "The salary contains invalid characters: +/-, ., and decimal digits only.", true);
            return;
        }

        // Capitalize product name and category name parts.
        name = capitalizeParts(name);
        department = capitalizeParts(department);

        if (handleEdit(conn,
                res,
                idE,
                name,
                department,
                salaryBD))
            sendResponse(req, res, "Employee " + name + " updated successfully.", false);
        else
            sendResponse(req, res, "Problem updating " + name, true);
    }

    private boolean handleEdit(Connection conn,
                               HttpServletResponse res,
                               String idE,
                               String name,
                               String department,
                               BigDecimal salary) {
        boolean flag = false;
        String sql1 = "UPDATE emps SET name = ?, department = ? WHERE id = ?";
        String sql2 = "UPDATE sals SET salary = ? WHERE emp_id = ?";
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;

        try {
            conn.setAutoCommit(false);   // expclit commitment or rollback required

            int idEmp = Integer.parseInt(idE.trim());

            pstmt1 = conn.prepareStatement(sql1);
            pstmt1.setString(1, name);
            pstmt1.setString(2, department);
            pstmt1.setInt(3, idEmp);

            pstmt2 = conn.prepareStatement(sql2);
            pstmt2.setBigDecimal(1, salary);
            pstmt2.setInt(2, idEmp);

            pstmt1.executeUpdate();      // 1st update in transaction
            pstmt2.executeUpdate();      // 2nd update in transaction

            conn.commit();               // commit the transaction

            flag = true;
        } catch (NumberFormatException e) {
        } catch (SQLException e) {
            try {
                conn.rollback();             // rollback the transaction
            } catch (Exception e2) {
            }
        } finally {
            try {
                if (pstmt1 != null) pstmt1.close();
                if (pstmt2 != null) pstmt2.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
            }
        }
        return flag;
    }

    private void sendResponse(HttpServletRequest req,
                              HttpServletResponse res,
                              String msg,
                              boolean error) {
        try {
            HttpSession session = req.getSession();
            session.setAttribute("result", msg);
            if (error)
                res.sendRedirect("badResult.jsp");
            else
                res.sendRedirect("goodResult.jsp");
        } catch (IOException e) {
        }
    }

    private BigDecimal convertSalary(String price) {
        BigDecimal result = null;
        try {
            result = new BigDecimal(price);
        } catch (NumberFormatException e) {
        }
        return result;
    }

    private String capitalizeParts(String str) {
        if (str.length() < 1) return str;
        String[] parts = str.split(" ");  // split on blanks
        String result = "";

        for (String part : parts) {
            if (part.length() > 0)
                result += new String(Character.toUpperCase(part.charAt(0)) + part.substring(1) + " ");
        }
        result = result.trim();
        return result;
    }

    private boolean productNameInUse(Connection conn, String name) {
        boolean flag = false;
        try {
            //*** There's a better way--an exercise waiting to happen.
            Statement stmt = conn.createStatement();
            String sql = "SELECT product FROM skisEtc";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String product = rs.getString("product");
                if (product.equalsIgnoreCase(name)) {
                    flag = true;
                    break;
                }
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
        }
        return flag;
    }

    private Connection getConnection() {
        String uri = "jdbc:postgresql://localhost:5353/skistuff";
        Properties props = setLoginForDB("OPEN_U", "POU");
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver"); //*** load the PostreSQL driver
            conn = DriverManager.getConnection(uri, props);
        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
        }
        return conn;
    }

    private Properties setLoginForDB(final String uname, final String passwd) {
        Properties props = new Properties();
        props.setProperty("user", uname);
        props.setProperty("password", passwd);
        return props;
    }
}