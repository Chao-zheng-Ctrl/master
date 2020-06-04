<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zcyy
  Date: 2020/6/2
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="src\main\webapp\WEB-INF\css\index.css" >
</head>
<body>
<table class="table">
    <thead>
        <tr>
            <th width="50">uid</th>
            <th>username</th>
            <th>password</th>
            <th>name</th>
            <th>email</th>
            <th>phone</th>
            <th>addr</th>
            <th>state</th>
            <th>code</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${userList}" var="us">
            <tr>
                <td width="100">${us.uid}</td>
                <td>${us.username}</td>
                <td>${us.password}</td>
                <td>${us.name}</td>
                <td>${us.email}</td>
                <td>${us.phone}</td>
                <td>${us.addr}</td>
                <td>${us.state}</td>
                <td>${us.code}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<
</body>
</html>
