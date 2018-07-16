<%--
  Created by IntelliJ IDEA.
  User: KristyHawk
  Date: 07.07.2018
  Time: 23:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src = "https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src = "resources/js/index.js"></script>
</head>
<body>
<div style="float: right!important; display: inline-block; vertical-align: middle; width: 300px;">

    <table border="1">

        <th>Название</th>
        <th>Дествия</th>

        <c:forEach var = "game" items = "${gameList}">
            <tr>
                <td>${game.name}</td>
                <td>
                    <a href = "addDescription/${game.id}">Редактировать описание</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
