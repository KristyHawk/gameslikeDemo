<%--
  Created by IntelliJ IDEA.
  User: KristyHawk
  Date: 10.07.2018
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Game</title>
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/css/gamepage.css" type = "text/css">
    <script src = "https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src = "${pageContext.servletContext.contextPath}/resources/js/gamepage.js"></script>
</head>
<body>
    <div class = "container">
        <div class = "global_header">
            <div class = "menu_content">
                <div class = "menu_items">
                    <a href = "" class = "menu_objects">GAMESLIKE</a>
                    <a href = "shop" class = "menu_objects">Магазин</a>
                    <a href = "library" class = "menu_objects">Библиотека</a>
                    <a href = "wishList" class = "menu_objects">Список желаемого</a>
                    <a href = "admin" class = "admin_menu">Админ</a>
                </div>
                <div class = "login_logout"></div>
            </div>
        </div>
        <div class = "game_container">
            <div class = "game_container_2">
                <div class = "game_screens">
                    <div class = "main_screen">
                        <img class = "image_window" src="${gameDTO.pictureBig}">
                    </div>
                    <div class = "screen_menu">
                        <div class = "choose_image">
                            <img class = "image_element_cover" src = "${gameDTO.pictureBig}">
                        </div>
                        <div class = "choose_image">
                            <img class = "image_element" src = "${gameDTO.screenshotOne}" >
                        </div>
                        <div class = "choose_image">
                            <img class = "image_element" src = "${gameDTO.screenshotTwo}" >
                        </div>
                    </div>
                </div>
                <div class = "game_info">
                    <div class = game_info_picture>
                        <img class = "image_element_2" src = "${gameDTO.pictureBig}">
                   </div>
                    <br />
                    <div class = "game_info_text">
                        <h2 class = "name">${gameDTO.name}</h2>
                        <span style="color:whitesmoke; font-size: 14px; display: inline;">Описание: </span><p id = "description" class = "game_info_body">${gameDTO.description}</p>
                        <p></p>
                        <span class = "game_info_headers">Разработчик: </span><p id = "developer" class = "game_info_body">${gameDTO.developer}</p><br />
                        <p></p>
                        <span class = "game_info_headers">Издатель: </span><p id = "publisher" class = "game_info_body">Издатель: ${gameDTO.publisher}</p><br />
                        <p></p>
                        <span class = "game_info_headers">Дата выхода: </span><p id = "release_date" class = "game_info_body">Дата выхода: <fmt:formatDate type="date" value="${gameDTO.releaseDate}" /></p>
                    </div>
                </div>
            </div>
            <div class = "tags_container">
                <c:forEach items="${tagList}" var="tag">
                    <a class = "tags_list" href = "#">${tag.tag}</a>
                </c:forEach>
            </div>
        </div>
        <div class = "description_div_container">
            <div class = description_div id = "descriptionDiv">
                <br/>
                <h2 class="game_description_header">ОПИСАНИЕ ИГРЫ</h2>
                <div class = "game-detailed-description" id = "gameDetailedDescription">${gameDTO.detailedDescription}</div>
                <p class = "scroll-down-click">Показать полностью</p>
            </div>
        </div>
        <div class = "br"></div>
        <div class = "requirements_container">
            <div class = "requirements">
                <br/>
                <h2 class="game_description_header">СИСТЕМНЫЕ ТРЕБОВАНИЯ</h2>
                <br/>
                <div class = "os_container">
                    <div class = "os" id = "winos">Windows</div>
                    <div class = "os" id = "macos">Mac OS X</div>
                    <div class = "os" id = "linos">Linux</div>
                </div>
                <div class = "win_container">
                    <div class = "minimum_req_container">
                        <ul class = "min_req_list_container">
                            <strong>Минимальные:</strong>
                            <ul class = "min_req_list">
                                <li><strong>ОС: </strong>${gameDTO.minSR.os}</li>
                                <li><strong>Процессор: </strong>${gameDTO.minSR.processor}</li>
                                <li><strong>Оперативная память: </strong>${gameDTO.minSR.memory}</li>
                                <li><strong>Видеокарта: </strong>${gameDTO.minSR.graphics}</li>
                                <li><strong>DirectX: </strong>${gameDTO.minSR.directx}</li>
                                <li><strong>Сеть: </strong>${gameDTO.minSR.network}</li>
                                <li><strong>Место на диске: </strong>${gameDTO.minSR.storage}</li>
                                <li><strong>Дополнительно: </strong>${gameDTO.minSR.additionalNotes}</li>
                            </ul>
                        </ul>
                    </div>
                    <div class = "recommended_req_container">
                        <ul class = "rec_req_list_container">
                            <strong style="margin-left: 40px;">Рекомендуемые:</strong>
                            <ul class = "rec_req_list">
                                <li><strong>ОС: </strong>${gameDTO.recSR.os}</li>
                                <li><strong>Процессор: </strong>${gameDTO.recSR.processor}</li>
                                <li><strong>Оперативная память: </strong>${gameDTO.recSR.memory}</li>
                                <li><strong>Видеокарта: </strong>${gameDTO.recSR.graphics}</li>
                                <li><strong>Сеть: </strong>${gameDTO.recSR.network}</li>
                                <li><strong>Место на диске: </strong>${gameDTO.recSR.storage}</li>
                            </ul>
                        </ul>
                    </div>
                </div>
                <div class = "mac_container">
                    <div class = "minimum_req_container">
                        <ul class = "min_req_list_container">
                            <strong>Минимальные:</strong>
                            <ul class = "min_req_list">
                                <li><strong>ОС: </strong>${gameDTO.minMacSR.os}</li>
                                <li><strong>Процессор: </strong>${gameDTO.minMacSR.processor}</li>
                                <li><strong>Оперативная память: </strong>${gameDTO.minMacSR.memory}</li>
                                <li><strong>Сеть: </strong>${gameDTO.minMacSR.network}</li>
                                <li><strong>Место на диске: </strong>${gameDTO.minMacSR.storage}</li>
                            </ul>
                        </ul>
                    </div>
                    <div class = "recommended_req_container">
                        <ul class = "rec_req_list_container">
                            <strong style="margin-left: 40px;">Рекомендуемые:</strong>
                            <ul class = "rec_req_list">
                                <li><strong>ОС: </strong>${gameDTO.recMacSR.os}</li>
                                <li><strong>Процессор: </strong>${gameDTO.recMacSR.processor}</li>
                                <li><strong>Оперативная память: </strong>${gameDTO.recMacSR.memory}</li>
                                <li><strong>Сеть: </strong>${gameDTO.recMacSR.network}</li>
                                <li><strong>Место на диске: </strong>${gameDTO.recMacSR.storage}</li>
                            </ul>
                        </ul>
                    </div>
                </div>
                <div class = "linux_container">
                    <div class = "minimum_req_container">
                        <ul class = "min_req_list_container">
                            <strong>Минимальные:</strong>
                            <ul class = "min_req_list">
                                <li><strong>ОС: </strong>${gameDTO.minLinSR.os}</li>
                                <li><strong>Процессор: </strong>${gameDTO.minLinSR.processor}</li>
                                <li><strong>Оперативная память: </strong>${gameDTO.minLinSR.memory}</li>
                                <li><strong>Сеть: </strong>${gameDTO.minLinSR.network}</li>
                                <li><strong>Место на диске: </strong>${gameDTO.minLinSR.storage}</li>
                            </ul>
                        </ul>
                    </div>
                    <div class = "recommended_req_container">
                        <ul class = "rec_req_list_container">
                            <strong style="margin-left: 40px;">Рекомендуемые:</strong>
                            <ul class = "rec_req_list">

                                <li><strong>Процессор: </strong>${gameDTO.recLinSR.processor}</li>
                                <li><strong>Оперативная память: </strong>${gameDTO.recLinSR.memory}</li>
                                <li><strong>Сеть: </strong>${gameDTO.recLinSR.network}</li>
                                <li><strong>Место на диске: </strong>${gameDTO.recLinSR.storage}</li>
                            </ul>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class = "comments"></div>
    </div>
</body>
</html>
