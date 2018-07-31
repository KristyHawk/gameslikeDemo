<%--
  Created by IntelliJ IDEA.
  User: KristyHawk
  Date: 31.07.2018
  Time: 5:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Регистрация</title>
    <link rel="stylesheet" href="resources/css/registration.css" type = "text/css">
    <link rel="stylesheet" href="resources/css/headerMenu.css" type = "text/css">
    <script src = "https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src = "resources/js/registration.js"></script>
</head>
<body>
<div id = "global_header">
    <div class = "menu_content">
        <div class = "menu_items">
            <a href = "" class = "menu_objects">GAMESLIKE</a>
            <a href = "shop" class = "menu_objects">Магазин</a>
            <a href = "library" class = "menu_objects">Библиотека</a>
            <a href = "wishList" class = "menu_objects">Список желаемого</a>
        </div>
        <div class = "auth_container">
            <div class = "login-logout">
                <sec:authorize access="isAnonymous()">
                    <p style="height: 15px"></p>
                </sec:authorize>
                <sec:authorize access="isAnonymous()">
                    <div class = "login_a">
                        <a href="/login" id = "login" class = "login-a">Войти</a>
                    </div>
                </sec:authorize>
                <sec:authorize access="isAuthenticated()">
                    <p class = 'username'>Вы вошли как: <sec:authentication property="name"/> </p>
                </sec:authorize>
                <sec:authorize access="isAuthenticated()">
                    <p class = "options" id = "options">Настройки</p>
                </sec:authorize>

                <sec:authorize access="isAuthenticated()">
                    <div class = "options-expanded" id = "optionsExpanded" style="visibility: hidden;">
                        <p class = "add-container">
                            <sec:authorize access="hasRole('ADMIN')">
                                <a href = "admin/gamelist" class = "admin_menu login-logout-a">Админ</a>
                            </sec:authorize>
                        </p>
                        <p class = "add-container">
                            <a href="options/userOptions" class = login-logout-a>Пользователь</a>
                        </p>
                        <p class = "add-container">
                            <a href="<c:url value="/logout"/>" class = "login-logout-a">Выйти</a>
                        </p>
                    </div>
                </sec:authorize>

            </div>
        </div>
    </div>
</div>
</body>
</html>
