<%@ page errorPage = "error.jsp" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>	
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql" %>   
<!DOCTYPE html>					  
<html>
<head>
<title>Create new user</title>
<link rel = "stylesheet" href = "style.css" type = "text/css"></link>
</head>
<body>
    <sql:setDataSource
        var = "myDS"
        driver = "org.postgresql.Driver"
        url = "jdbc:postgresql://localhost:5353/skistuff"
        user = "OPEN_U"
        password = "POU"
    />
    <sql:query var = "listStuff" dataSource = "${myDS}">
        SELECT * FROM skisEtc where id = ${param.id}; 
    </sql:query>

    <div>
        <fieldset><legend class = "legend">Edit product</legend>
           <form action = "dataVerifier" method = "post">
              <table>
                 <tbody>
                   <tr style = "background: white;}">
                      <td><label for = "id">Id:</label></td><td>
			<input id = "id" name = "id"
                               value = '${param.id}'
                               type = "text" 
                               readonly/></td>
                   </tr>
                   <tr style="background: white;}">
                      <td><label for = "product">Product:</label></td><td>
			<input id = "product" name = "product"
			       value = "${listStuff.rows[0].product}"
                               type = "text"
			       minlength = "8" required/></td>
                   </tr>
                   <tr style="background: white;}">
                      <td><label for = "category">Category:</label></td><td>
			<input id = "category" name = "category"
                               value = "${listStuff.rows[0].category}"
                               type = "text"
			       minlength = "8" required/></td>
                   </tr>
		   <tr style = "background: white;}">
                     <td><label for = "price">Price:</label></td><td>
		       <input id = "price" name = "price" 
                              value = "${listStuff.rows[0].price}"
                              type = "number" step = "0.01" min = "0"/></td>
                   </tr>
                 </tbody>
              </table>
              <p><input type = "submit" value = " Save edits "/></p>
              <p><a href="${pageContext.request.contextPath}/skiStuffCRUD.jsp">Back</a></p>
           </form>
        </fieldset>
    </div>
</body>
</html>
