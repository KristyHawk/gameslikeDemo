<%--
  Created by IntelliJ IDEA.
  User: KristyHawk
  Date: 15.07.2018
  Time: 2:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Добавить описание</title>
    <meta charset="utf-8">
    <title>Game</title>
    <script src = "https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src = "${pageContext.servletContext.contextPath}/resources/js/addDescription.js"></script>
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/css/addDescription.css" type = "text/css">
</head>
<body>
    <div class="description-and-view-container">
        <div class = "description-container">
            <div class = "description-form-container">
                <form id = "addDescriptionForm" role = "form">
                    <div class = "description-code">
                        <p>СОДЕРЖИМОЕ</p>
                    </div>
                    <div class = "action-button">
                        <button type="button" id = "set-preview-button" class = "action-btn">Предпросмотр</button>
                    </div>
                    <div class = "action-button">
                        <button type="button" id = "save-description-button" class = "action-btn">Сохранить</button>
                    </div>
                    <div class = "html-variable-content">
                        <textarea rows="70" cols="125" name="detailedDescription" id="addDescriptionArea" >${result.detailedDescription}</textarea>
                    </div>
                    <br/>
                    <input type="hidden" id="csrfToken" value="${_csrf.token}"/>
                    <input type="hidden" id="csrfHeader" value="${_csrf.headerName}"/>
                </form>
            </div>
        </div>
        <div class = "preview-container">
            <p class = "preview_code">ПРЕДПРОСМОТР</p>
            <br/>
            <br/>
            <div class = "view-filed-container">
                <div class = "view-field">
                    <div class = "view-field-inner">

                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
