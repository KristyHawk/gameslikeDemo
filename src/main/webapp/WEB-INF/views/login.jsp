<%--
  Created by IntelliJ IDEA.
  User: KristyHawk
  Date: 21.07.2018
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="resources/css/login.css" type = "text/css">
    <link rel="stylesheet" href="resources/css/index.css" type = "text/css">
    <link rel="stylesheet" href="resources/css/headerMenu.css" type = "text/css">
    <script src = "https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src = "resources/js/login.js"></script>
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
                <div class = "login-logout login-log">
                    <sec:authorize access="isAnonymous()">
                        <p style="height: 15px"></p>
                    </sec:authorize>
                    <sec:authorize access="isAnonymous()">
                        <div class = "login_logout">
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

    <div class = "body-container">
        <div class = "authorize-container">
            <div class = "authorize-window">
                <div class = "authorize-window-next">
                    <h2 class = "enter">ВОЙТИ</h2>
                    <p class = "current-account-p">в существующий аккаунт Gameslike</p>
                    <div class = "login-div">
                        <div class = "form-container">
                            <font color="red">${SPRING_SECURITY_LAST_EXCEPTION.message}</font>
                            <form action="<%=request.getContextPath()%>/appLogin" method="POST">
                                <p>Имя аккаунта Gameslike: </p>
                                <input type="text" name="app_username" class = "input-login"/><br/>
                                <p>Пароль: </p>
                                <input type="password" name="app_password" class = "input-login"/> <br/><br/>
                                <input type="submit" value="Войти" class = "submit-btn"/>
                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                <a href="/forgetpass" class = "login-logout-a forgot-password">Забыли пароль?</a>
                            </form>
                        </div>
                    </div>
                </div>

                <div class = "registration-div">
                    <h2 class = "enter">СОЗДАТЬ</h2>
                    <p class = "current-account-p">новый аккаунт Gameslike</p>
                    <p class = "current-account-p">
                        Gameslike бесплатен и удобен в использовании. Создайте аккаунт и присоединяйтесь к Gameslike — ведущей платформе для игр и приложений на ПК, Mac и Linux.
                    </p>
                </div>
                <div class = "registration-div">
                    <a href = "/registration" class = "new-account"><span class = "registration-span">Регистрация</span></a>
                </div>
            </div>
            <div class = "description_window">
                <div class = "description-div">
                    <h2 class = "why-gameslike-header">ЗАЧЕМ НУЖЕН GAMESLIKE?</h2>
                    <ul class = "description-desc-inside">
                        <li class = "li_point">Приобретайте и загружайте полные версии игр</li>
                        <li class = "li_point">Присоединяйтесь к сообществу Gameslike</li>
                        <li class = "li_point">Общайтесь с друзьями во время игры</li>
                        <li class = "li_point">Играйте в ваши игры на любой поддерживаемой платформе</li>
                        <li class = "li_point">Организуйте игру, соревнование или сетевую вечеринку</li>
                        <li class = "li_point">Получайте автоматическое обновление игр и многое другое!</li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

</body>
</html>
