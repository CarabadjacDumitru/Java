<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="../error.jsp"%>
<html>
<head>
    <title>Temp Conversions</title>
    <link rel="stylesheet" type="text/css" href="../style.css">
</head>
<body>
    <fieldset>
        <legend class="legend">Temeperature conve_rsion results</legend>
        <p class="result">
            ${result}
        </p>
    </fieldset>
    <p>
        <a href="input_temp.html">Convert another temperature</a>
    </p>
</body>
</html>
