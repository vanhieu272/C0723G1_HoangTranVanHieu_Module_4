<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hoang
  Date: 11/14/2023
  Time: 12:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/save" method="post">
    <input type="checkbox" id="vehicle1" name="Lettuce" value="Lettuce">
    <label for="vehicle1">Lettuce</label><br/>

    <input type="checkbox" id="vehicle2" name="Tomato" value="Tomato">
    <label for="vehicle2">Tomato</label><br/>

    <input type="checkbox" id="vehicle3" name="Mustard" value="Mustard">
    <label for="vehicle3">Mustard</label><br/>

    <input type="checkbox" id="vehicle4" name="Sprouts" value="Sprouts">
    <label for="vehicle4">Sprouts</label><br/>

    <input type="submit" value="Save"><br/>
    <h1>RESULT = ${spice}</h1>
</form>
</body>
</html>
