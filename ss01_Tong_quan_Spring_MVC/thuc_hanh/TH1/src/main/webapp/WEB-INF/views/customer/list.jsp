<%--
  Created by IntelliJ IDEA.
  User: hoang
  Date: 11/14/2023
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, tr, td{
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
</head>
<body>
<h1>Customer list</h1>
<h3>There are ${customerList.size()} customers in list</h3>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
<c:forEach items="${customerList}" var="customer">
    <tr>
        <td>${customer.getId()}</td>
        <td>
            <a href="detail?id=${customer.getId()}"> ${customer.getName()} </a>
        </td>
        <td>${customer.getName()}</td>
        <td>${customer.getEmail()}</td>
        <td>${customer.getAddress()}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
