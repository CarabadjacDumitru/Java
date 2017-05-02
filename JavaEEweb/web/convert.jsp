<%@ page errorPage =  "error.jsp" %>

<!doctype html>
<html>
  <body>
    <jsp:useBean id="tempConverter" class="tempC.TempConverter"/>

    <fieldset>
          <p class="results">
            ${tempConverter.convert(param.tempIn)}
        </p>
    </fieldset>



    <p>
      <a href = 'input.html'>Convert another temperature</a>
    </p>
  </body>
</html>
