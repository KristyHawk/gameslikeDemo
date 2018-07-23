<%--
  Created by IntelliJ IDEA.
  User: KristyHawk
  Date: 21.07.2018
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>You are not authorized to access user profile.</h3>
<form action="<%=request.getContextPath()%>/appLogout" method="POST">
    <input type="submit" value="Logout"/>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
</body>
</html>
