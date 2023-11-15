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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <style>
        button{
            margin: 10px;
        }
    </style>
</head>
<body>
    <h1>Calculator</h1>
    <form action="/calc" method="post">
        <div class="d-flex">
            <input type="number" name="number1" class="mx-2">
            <input type="number" name="number2" class="mx-2">
        </div>
        <div class="d-flex">
            <button class="btn btn-primary" name="calculation" value="+">ADDITION (+)</button>
            <button class="btn btn-success" name="calculation" value="-">SUBTRACTION (-)</button>
            <button class="btn btn-warning" name="calculation" value="*">MULTIPLICATION (*)</button>
            <button class="btn btn-danger" name="calculation" value="/">DIVISION (/)</button>
        </div>
    </form>
    <p>RESULT: ${result}</p>
</body>
</html>
