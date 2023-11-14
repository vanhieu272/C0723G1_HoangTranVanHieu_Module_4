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
<div class="d-flex justify-content-center align-items-center text-align-center">
    <h1>English - Vietnamese Dictionary</h1>
</div>

<form action="/" method="get" class="mt-5" style="padding: 0 500px">
    <div class="input-group mb-3">
        <span class="input-group-text">Eng</span>
        <input value="${vocab}" name="vocab" type="text" class="form-control" aria-label="Dollar amount (with dot and two decimal places)">
    </div>
    <button type="submit" class="btn btn-outline-primary">Translate</button>
    <div class="input-group mb-3 mt-3">
        <span class="input-group-text">Vie</span>
        <input value="${result}" readonly type="text" class="form-control" aria-label="Dollar amount (with dot and two decimal places)">
    </div>

</form>

</body>
</html>
