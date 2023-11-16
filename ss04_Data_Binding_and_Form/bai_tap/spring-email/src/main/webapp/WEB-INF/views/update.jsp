<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
</head>
<body>
<h1>Settings</h1>
<form:form action="/update" modelAttribute="email" method="post">
    <table>
        <tr>
            <td>
                <form:hidden path="id" value="${email.id}"/>
            </td>
        </tr>
        <tr>
            <th>Languages</th>
            <td>
                <form:select path="languages" value="${email.languages}">
                    <form:options items="${languagesList}" />
                </form:select>
            </td>
        </tr>
        <tr>
            <th>Page Size</th>
            <td>
                <form:select path="pageSize" value="${email.pageSize}">
                    <span>Show </span>
                    <form:options items="${pages}" /> <span> emails per page</span>
                </form:select>
            </td>
        </tr>
        <tr>
            <th>Spams Filter</th>
            <td><form:checkbox path="spamsFilter" label="Enable spams filter" value="${email.spamsFilter}"/></td>
        </tr>
        <tr>
            <th>Signature</th>
            <td>
                <form:textarea path="signature" value="${email.signature}"/>
            </td>
        </tr>

        <tr>
            <td>
                <button type="submit">Update</button>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
