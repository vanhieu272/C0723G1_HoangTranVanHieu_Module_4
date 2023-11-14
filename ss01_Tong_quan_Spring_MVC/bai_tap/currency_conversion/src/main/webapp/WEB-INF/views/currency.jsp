<%--
  Created by IntelliJ IDEA.
  User: hoang
  Date: 11/14/2023
  Time: 11:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
    Currency Conversion Application
</h1>
<form action="" method="post">
    <label for="rate">Rate: </label>
    <input type="text" id="rate" placeholder="Rate..." name="rate">

    <label for="usd">USD: </label>
    <input type="text" id="usd" placeholder="USD..." name="usd">

    <p>RESULT: ${result} VND</p>

    <button>
        CONVERT
    </button>
</form>
</body>
</html>
