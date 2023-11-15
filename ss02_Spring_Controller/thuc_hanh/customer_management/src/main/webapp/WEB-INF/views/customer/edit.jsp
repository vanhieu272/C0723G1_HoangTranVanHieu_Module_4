<%--
  Created by IntelliJ IDEA.
  User: hoang
  Date: 11/15/2023
  Time: 11:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/edit" method="post">
  <table>
    <tr>
      <td><label for="name">ID:</label></td>
      <td><input readonly type="text" name="id" id="id" value="${customer.id}"></td>
    </tr>
    <tr>
      <td><label for="name">Name:</label></td>
      <td><input type="text" name="name" id="name" value="${customer.name}"></td>
    </tr>
    <tr>
      <td><label for="email">Email:</label> </td>
      <td><input type="text" name="email" id="email" value= "${customer.email}"></td>
    </tr>
    <tr>
      <td><label for="address">Address:</label> </td>
      <td><input type="text" name="address" id="address" value="${customer.address}"></td>
    </tr>
    <tr>
      <td></td>
      <td><button type="submit">Edit</button></td>
    </tr>
  </table>
</form>
</body>
</html>
