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
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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
        <div class = "br"></div>
        <div class = "relative-games-container">
            <div class = "relative-games">
                    <br/>
                    <h2 class="game_description_header">ПОХОЖИЕ ТОВАРЫ</h2>
                    <br/>
                    <div class = "relative-games-body">
                        <div class = "arrows" id = "arrow-left">
                            <img src = "${pageContext.servletContext.contextPath}/resources/images/arrowleft.png">
                        </div>
                        <div class = "relative-game-unchanged">
                            <div class = "relative-game-image">
                                <a href = "gamepage/${relatedGameList[0].id}" id = "${relatedGameList[0].id}" class = "left_element"><img src="${relatedGameList[0].pictureBig}" class = "game_objects"></a>
                            </div>
                            <div class = "relative-game-image">
                                <a href = "gamepage/${relatedGameList[1].id}" id = "${relatedGameList[1].id}" class = "left_element"><img src="${relatedGameList[1].pictureBig}" class = "game_objects"></a>
                            </div>
                            <div class = "relative-game-image">
                                <a href = "gamepage/${relatedGameList[2].id}" id = "${relatedGameList[2].id}" class = "left_element"><img src="${relatedGameList[2].pictureBig}" class = "game_objects"></a>
                            </div>
                        </div>
                        <div class = "arrows" id = "arrow-right">
                            <img src = "${pageContext.servletContext.contextPath}/resources/images/arrowright.png">
                        </div>
                        <div class = "relative-game-changed">
                            <div class = "relative-game-image-changed">
                                <a href = "gamepage/${relatedGameList[3].id}" id = "${relatedGameList[3].id}" class = "left_element"><img src="${relatedGameList[3].pictureBig}" class = "game_objects"></a>
                            </div>
                            <div class = "relative-game-image-changed">
                                <a href = "gamepage/${relatedGameList[4].id}" id = "${relatedGameList[4].id}" class = "left_element"><img src="${relatedGameList[4].pictureBig}" class = "game_objects"></a>
                            </div>
                            <div class = "relative-game-image-changed">
                                <a href = "gamepage/${relatedGameList[5].id}" id = "${relatedGameList[5].id}" class = "left_element"><img src="${relatedGameList[5].pictureBig}" class = "game_objects"></a>
                            </div>
                        </div>

                    </div>
            </div>
        </div>

        <div class = "comments-container">
            <div class = "inner-review">
                <sec:authorize access="isAuthenticated()">
                    <div class = "add-comment-container">
                        <div class = "add-comment-window">
                            <div class = "add-comment-header">
                                <p class = "add-review">Добавить обзор</p>
                            </div>
                            <div class = "add-comment-body">
                                <form id = "addReviewForm" role="form">
                                    <div class = "common-info">
                                        <div class = "would-you-recommend">
                                            <p>Рекомендуете ли Вы эту игру?</p>
                                        </div>
                                        <div class = "radio-yes">
                                            <p><input name="positive" type="radio" value="true" checked="checked">Да</p>
                                        </div>
                                        <div class = "radio-no">
                                            <p><input name="positive" type="radio" value="false">Нет</p>
                                        </div>
                                    </div>
                                    <div class = "review-content">
                                        <textarea rows="10" cols="130" name="content" class = "review-content-area"></textarea>
                                    </div>
                                    <div class = "content-submit-button">
                                        <div class = "button-submit">
                                            <button type = "submit" id = "submitCommentButton">Опубликовать</button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </sec:authorize>
                <sec:authorize access="isAnonymous()">
                    <div></div>
                </sec:authorize>

                <div class = "inner-comment-container">
                        <div class="comments-info">
                            <p class = "all-comments">Все обзоры</p>
                            <p class = "positive-or-negative">В основном ${relation} (всего: )</p>
                        </div>
                        <div class = "comment-types">
                            <div class = "comment-type">
                                <p class = "comment-type-p">Тип обзора</p>
                                <select class = "choose-type">
                                    <option>Все</option>
                                    <option>Положительные</option>
                                    <option>Отрицательные</option>
                                </select>
                            </div>
                            <div class = "comment-show">
                                <p class = "show-class">Отображать: </p>
                                <select class = "choose-actual">
                                    <option>Актуальные</option>
                                    <option>Полезные</option>
                                </select>
                            </div>
                        </div>
                </div>
                <div class = "user-comment-box">
                    <c:forEach items="${commentsList}" var="comment">
                        <div class = "inner-user-comment">
                            <div class = "user-info">
                                <div class = "avatar-div">
                                    <img src = "#" class = "avatar">
                                </div>
                                <div class = "user-info-inner-div">
                                    <p class = "user-about">Ник: ${comment.user.username}</p>
                                    <p class = "user-about">Товаров: </p>
                                    <p class = "user-about">Обзоров: </p>
                                </div>
                            </div>
                            <div class = "user-text">
                                <div class = "is-recommended"></div>
                                <div class = "comment-date">
                                    <p class = "date-of-publishing">Опубликовано:</p>
                                </div>
                                <div class = "content" style="max-height: 50px">
                                    ${comment.content}
                                </div>
                                <div class = "posted">
                                    <div class = "view-more">
                                        <p class = "view-more-p">Подробнее</p>
                                    </div>
                                </div>
                                <div class = "control">
                                    <span class = "was-it-useful">Был ли обзор полезен? </span>
                                    <a href="#" class = "yes">Да</a>
                                    <a href="#" class = "yes">Нет</a>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
