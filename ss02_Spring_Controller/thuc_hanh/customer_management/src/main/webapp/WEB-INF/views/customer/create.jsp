<%--
  Created by IntelliJ IDEA.
  User: hoang
  Date: 11/15/2023
  Time: 11:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/create" method="post">
  <table>
    <tr>
      <td><label for="name">ID:</label></td>
      <td><input type="text" name="id" id="id"></td>
    </tr>
    <tr>
      <td><label for="name">Name:</label></td>
      <td><input type="text" name="name" id="name"></td>
    </tr>
    <tr>
      <td><label for="email">Email:</label> </td>
      <td><input type="text" name="email" id="email"></td>
    </tr>
    <tr>
      <td><label for="address">Address:</label> </td>
      <td><input type="text" name="address" id="address"></td>
    </tr>
    <tr>
      <td></td>
      <td><button type="submit">Create</button></td>
    </tr>
  </table>
</form>
</body>
</html>
