<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hoang
  Date: 11/16/2023
  Time: 5:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Email</h1>
<table>
    <tr>
        <th>Languages</th>
        <td>${emails.languages}</td>
    </tr>
    <tr>
        <th>Page Size</th>
        <td>${emails.pageSize}</td>
    </tr>
    <tr>
        <th>Spams Filter</th>
        <td><input
        <c:if test="${emails.spamsFilter == 'true'}">
                checked
        </c:if>
                type="checkbox" disabled value="${emails.spamsFilter}"></td>
    </tr>
    <tr>
        <th>Signature</th>
        <td>
            <textarea disabled>${emails.signature}</textarea>
        </td>
    </tr>
</table>
<a href="/">
    Back
</a>
</body>
</html>
