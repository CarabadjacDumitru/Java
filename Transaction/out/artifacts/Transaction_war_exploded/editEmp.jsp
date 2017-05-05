<!DOCTYPE html>					  
<html>
  <head>
    <title>Edit employee</title>
    <link rel = "stylesheet" href = "style.css" type = "text/css"></link>
  </head>
  <body>
    <div>
      <fieldset><legend class = "legend">Edit employee</legend>
	<form action = "verifyAndSave" method = "post">
          <table>
            <tbody>
              <tr style = "background: white;}">
		<td><label for = "id1">Id:</label></td><td>
		  <input id = "id1" name = "id1"
                          value = '${empsID}'
                          type = "text" 
                          readonly/></td>
              </tr>
              <tr style="background: white;}">
		<td><label for = "ename">Name:</label></td><td>
		  <input id = "ename" name = "ename"
			  value = "${ename}"
                          type = "text"
			  minlength = "6" required/></td>
              </tr>
              <tr style="background: white;}">
		<td><label for = "department">Department:</label></td><td>
		  <input id = "department" name = "department"
			  value = "${department}"
			  type = "text"
			  minlength = "6"required/></td>
              </tr>
	      <tr style = "background: white;}">
		<td><label for = "salary">Salary:</label></td><td>
		  <input id = "salary" name = "salary" 
                          value = "${salary}"
                          type = "number" step = "0.01" min = "0"/></td>
              </tr>
            </tbody>
          </table>

          <p><input type = "submit" value = " Save edits "/></p>
          <p><a href="${pageContext.request.contextPath}/findEmp.html">Back</a></p>
	</form>
      </fieldset>
    </div>
  </body>
</html>
