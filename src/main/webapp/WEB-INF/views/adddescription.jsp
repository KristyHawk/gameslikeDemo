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
    <script src = "https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js"></script>
    <script src = "https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.bundle.min.js"></script>
    <script src = "${pageContext.servletContext.contextPath}/resources/js/addDescription.js"></script>
    <link rel = "stylesheet" href = "https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" type = "text/css">
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/css/addDescription.css" type = "text/css">
</head>
    <body>
        <button class="btn btn-info" data-toggle="modal" data-target="#addHeader" id = "addHeaderButton">Добавить заголовок</button>
        <button class="btn btn-info" data-toggle="modal" data-target="#addParagraph" id = "addParagraphButton">Добавить абзац</button>
        <button class="btn btn-info" data-toggle="modal" data-target="#myModalBox">Добавить картинку</button>
        <button class="btn btn-info" data-toggle="modal" data-target="#myModalBox">Добавить маркированный список</button>

        <div id="addHeader" class="modal fade">
            <div class="modal-dialog" id = "modalDialogue">
                <div class="modal-content">
                    <!-- Заголовок модального окна -->
                    <div class="modal-header">
                        <h4 class="modal-title">Добавить заголовок</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    </div>
                    <!-- Основное содержимое модального окна -->
                    <div class="modal-body">
                        <form id = "addHeaderForm" role = "form">
                            <div class = "html-variable-id-hidden">
                                <input type="hidden" name="id" id="htmlVariableHeaderId">
                            </div>
                            <div class = "html-variable-type-disabled">
                                <p>Тип</p>
                                <input type="hidden" name="type" id="htmlVariableHeaderType" value="Header" class = "variable-type">
                            </div>
                            <br/>
                            <div class = "html-variable-content">
                                <p>Содержимое</p>
                                <textarea rows="4" cols="57" name="content" id="addHeaderArea"></textarea>
                            </div>
                            <br/>
                            <div class = "html-variable-position">
                                <p>Позиция на странице</p> <button type="button" class = "close question">?</button>
                                <div class="question-answer" style="display: none">
                                    <p style="color: #A9A9A9;">
                                        Укажите порядок расположения данного элемента на странице в виде порядкового номера.
                                        Он не должен совпадать с теми, что Вы указывали ранее.
                                    </p>
                                </div>
                                <input type="number" name="position" id="htmlVariableHeaderPosition">
                            </div>
                        </form>
                    </div>
                    <!-- Футер модального окна -->
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Закрыть</button>
                        <button type="button" class="btn btn-primary save-html-variable-button">Сохранить</button>
                    </div>
                </div>
            </div>
        </div>

        <div id="addParagraph" class="modal fade">
            <div class="modal-dialog" id = "modalDialogue2">
                <div class="modal-content">
                    <!-- Заголовок модального окна -->
                    <div class="modal-header">
                        <h4 class="modal-title">Добавить абзац</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    </div>
                    <!-- Основное содержимое модального окна -->
                    <div class="modal-body">
                        <form id = "addParagraphForm" role = "form">
                            <div class = "html-variable-id-hidden">
                                <input type="hidden" name="id" id="htmlVariableParagraphId">
                            </div>
                            <div class = "html-variable-type-disabled">
                                <p>Тип</p>
                                <input type="hidden" name="typed" id="htmlVariableParagraphTyped" value="Paragraph" class = "variable-type">
                            </div>
                            <br/>
                            <div class = "html-variable-content">
                                <p>Содержимое</p>
                                <textarea rows="10" cols="57" name="content" id="addParagraphArea"></textarea>
                            </div>
                            <br/>
                            <div class = "html-variable-position">
                                <p>Позиция на странице</p> <button type="button" class = "close question">?</button>
                                <div class="question-answer" style="display: none">
                                    <p style="color: #A9A9A9;">Укажите порядок расположения данного элемента на странице в виде порядкового номера</p>
                                </div>
                                <input type="number" name="position" id="htmlVariableParagraphPosition">
                            </div>
                        </form>
                    </div>
                    <!-- Футер модального окна -->
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Закрыть</button>
                        <button type="button" class="btn btn-primary save-html-variable-button">Сохранить</button>
                    </div>
                </div>
            </div>
        </div>

        <div id="addBulletedList" class="modal fade">
            <div class="modal-dialog" id = "modalDialogue3">
                <div class="modal-content">
                    <!-- Заголовок модального окна -->
                    <div class="modal-header">
                        <h4 class="modal-title">Добавить абзац</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    </div>
                    <!-- Основное содержимое модального окна -->
                    <div class="modal-body">
                        <form id = "addBulletedListForm" role = "form">
                            <div class = "html-variable-id-hidden">
                                <input type="hidden" name="id" id="htmlVariableBulletedListId">
                            </div>
                            <div class = "html-variable-type-disabled">
                                <p>Тип</p>
                                <input type="hidden" name="type" id="htmlVariableBulletedListType" value="Paragraph" class = "variable-type" disabled>
                            </div>
                            <br/>
                            <div class = "html-variable-content">
                                <p>Содержимое</p>
                                <textarea rows="10" cols="57" name="content" id="addBulletedListArea"></textarea>
                            </div>
                            <br/>
                            <div class = "html-variable-position">
                                <p>Позиция на странице</p> <button type="button" class = "close question">?</button>
                                <div class="question-answer" style="display: none">
                                    <p style="color: #A9A9A9;">Укажите порядок расположения данного элемента на странице в виде порядкового номера</p>
                                </div>
                                <input type="number" name="position" id="htmlVariableBulletedListPosition">
                            </div>
                        </form>
                    </div>
                    <!-- Футер модального окна -->
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Закрыть</button>
                        <button type="button" class="btn btn-primary save-html-variable-button">Сохранить</button>
                    </div>
                </div>
            </div>
        </div>













    <br/>
    <br/>
    <div class = "view-filed-container">
        <div class = "view-field"></div>
    </div>




    </body>
</html>
