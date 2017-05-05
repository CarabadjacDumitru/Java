

import java.sql.DriverManager;                 // handles communication with the DB
import java.sql.Connection;                    // a connection to the DB
import java.sql.Statement;                     // an SQL statement for the DB to execute
import java.sql.ResultSet;                     // a table of rows generated from an SQL query
import java.sql.SQLException;                  // what's thrown when the JDBC operations fail
import java.util.Properties;                   // key/value pairs
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class EmpFinder extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) {
	executeQueryAndRedirect(req, res);
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
	sendResponse(req, res, "POST requests only, please.", true);
    }

    private void executeQueryAndRedirect(HttpServletRequest req, HttpServletResponse res) {
	Connection conn = getConnection(); 
	int eid = 0xffffffff;  // -1, all 1s in binary: not a legitimate employee ID

	try {
	    eid = Integer.parseInt(req.getParameter("eid"));
	    String sql =  
		"select emps.id, emps.name, emps.department, sals.salary from emps, sals " +
		" where emps.id = " + eid + " and emps.id = sals.emp_id;";
	    Statement stmt = conn.createStatement();
	    ResultSet rs = stmt.executeQuery(sql);

	    if (rs.isBeforeFirst()) { // Are there any records?
		rs.next();
		HttpSession session = req.getSession();
		session.setAttribute("empsID",     rs.getInt(1));
		session.setAttribute("ename",      rs.getString(2));
		session.setAttribute("department", rs.getString(3));
		session.setAttribute("salary",     rs.getBigDecimal(4));
		res.sendRedirect("editEmp.jsp");
		return;
	    }
	}
	catch(NumberFormatException e) { }
	catch(SQLException e) { System.out.println(e); }
	catch(IOException e) { }
	String msg = "There is no employee with ID " + eid + ".";
	sendResponse(req, res, msg, true);
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
	}
	catch(IOException e) { }
    }

    private Connection getConnection() {
	String uri = "jdbc:postgresql://localhost:5353/skistuff";
	Properties props = setLoginForDB("OPEN_U", "POU");
	Connection conn = null;
	try {
	    Class.forName("org.postgresql.Driver"); //*** load the PostreSQL driver
	    conn = DriverManager.getConnection(uri, props);
	}
	catch(ClassNotFoundException e) { }
	catch(SQLException e) { }
	return conn;
    }

    private Properties setLoginForDB(final String uname, final String passwd) {
	Properties props = new Properties();
	props.setProperty("user", uname);
	props.setProperty("password", passwd);
	return props;
    }
}