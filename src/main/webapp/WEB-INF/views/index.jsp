<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <meta charset="utf-8">
    <title>GamesLike</title>
    <link rel="stylesheet" href="resources/css/index.css" type = "text/css">
    <link rel="stylesheet" href="resources/css/headerMenu.css" type = "text/css">
    <script src = "https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src = "resources/js/index.js"></script>
</head>
<body>
    <div class = "container">
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

        <div class = "mini-menu-container">
            <div class = "mini-menu-inner-container">
                <div class = "mini-menu-item" id = "mini-menu-first-item">
                    <span class = "inner-mini-menu-item">Магазин</span>
                    <div class = "mini-menu-item-expanded" id = "mini-menu-first-item-expanded">
                        <a href="#" class = "mini-menu-expanded-inner-item">Главная страница</a>
                        <a href="#" class = "mini-menu-expanded-inner-item">Недавно просмотренные</a>
                    </div>
                </div>
                <div class = "mini-menu-item" id = "mini-menu-second-item">
                    <span class = "inner-mini-menu-item">Игры</span>
                    <div class = "mini-menu-item-expanded" id = "mini-menu-second-item-expanded">
                        <a href="#" class = "mini-menu-expanded-inner-item">Популярные</a>
                        <a href="#" class = "mini-menu-expanded-inner-item">Рекомендуемые</a>
                        <a href="#" class = "mini-menu-expanded-inner-item">Бесплатные</a>
                        <a href="#" class = "mini-menu-expanded-inner-item">Ранний доступ</a>
                        <a href="#" class = "mini-menu-expanded-inner-item">Демо</a>
                        <a href="#" class = "mini-menu-expanded-inner-item">Вирт. реальность</a>
                    </div>
                </div>
                <div class = "mini-menu-item" id = "mini-menu-third-item">
                    <span class = "inner-mini-menu-item">Жанры</span>
                    <div class = "mini-menu-item-expanded" id = "mini-menu-third-item-expanded">
                        <a href="#" class = "mini-menu-expanded-inner-item">Гонки</a>
                        <a href="#" class = "mini-menu-expanded-inner-item">Инди</a>
                        <a href="#" class = "mini-menu-expanded-inner-item">Казуальная игра</a>
                        <a href="#" class = "mini-menu-expanded-inner-item">ММО</a>
                        <a href="#" class = "mini-menu-expanded-inner-item">Приключения</a>
                        <a href="#" class = "mini-menu-expanded-inner-item">Ролевая игра</a>
                        <a href="#" class = "mini-menu-expanded-inner-item">Симулятор</a>
                        <a href="#" class = "mini-menu-expanded-inner-item">Спортивная игра</a>
                        <a href="#" class = "mini-menu-expanded-inner-item">Стратегия</a>
                        <a href="#" class = "mini-menu-expanded-inner-item">Экшен</a>
                    </div>
                </div>
                <div class = "mini-menu-item" id = "mini-menu-fourth-item">
                    <span class = "inner-mini-menu-item">Фильтр</span>
                    <div class = "mini-menu-item-expanded" id = "mini-menu-fourth-item-expanded">
                        <a href="#" class = "mini-menu-expanded-inner-item">По популярности</a>
                        <a href="#" class = "mini-menu-expanded-inner-item">По дате выхода</a>
                    </div>
                </div>
                <div class = "mini-menu-item" id = "mini-menu-fifth-item">
                    <span class = "inner-mini-menu-item">Новости</span>
                </div>
                <div class = "search" id = "mini-menu-search-item">
                    <input type="text" class = "search-by-name" placeholder = "Поиск"/>
                </div>
            </div>
        </div>


        <div class = "games_list_body">
            <div class = "popular_games">
                <h2>САМЫЕ ПОПУЛЯРНЫЕ ИГРЫ</h2>
                <div class = "popular_games_area">
                    <div class = "game_details"></div>
                    <div class = "game_list">
                        <div class = three_left_large_elements>
                            <div class = "game_1">
                                <a href = "gamepage/${popularGameList[0].id}" id = "${popularGameList[0].id}" class = "left_element"><img src="${popularGameList[0].pictureBig}" class = "game_objects"></a>
                            </div>
                            <div class = game_2_3>
                                <a href = "gamepage/${popularGameList[1].id}" id = "${popularGameList[1].id}" class = "first_right_element"><img src="${popularGameList[1].pictureBig}" class = "game_objects"></a>
                                <a href = "gamepage/${popularGameList[2].id}" id = "${popularGameList[2].id}" class = "second_right_element"><img src="${popularGameList[2].pictureBig}" class = "game_objects"></a>
                            </div>
                        </div>
                        <div class = "other_popular_games">
                            <div class = "small_game_objects" id = "left_arrow"><img src = "resources/images/arrowleft.png" class="small_game_objects_2"></div>
                            <div class = "small_game_objects" id = "small_popular_game_1">
                                <a href="gamepage/${popularGameList[3].id}" id = "${popularGameList[3].id}" class = "first_less_popular_game"><img src = "${popularGameList[3].pictureBig}" class = small_game_objects_2></a>
                            </div>
                            <div class = "small_game_objects" id = "small_popular_game_2">
                                <a href="gamepage/${popularGameList[4].id}" id = "${popularGameList[4].id}" class = "second_less_popular_game"><img src = "${popularGameList[4].pictureBig}" class = small_game_objects_2></a>
                            </div>
                            <div class = "small_game_objects" id = "small_popular_game_3">
                                <a href="gamepage/${popularGameList[5].id}" id = "${popularGameList[5].id}" class = "third_less_popular_game"><img src = "${popularGameList[5].pictureBig}" class = small_game_objects_2></a>
                            </div>
                            <div class = "small_game_objects" id = "small_popular_game_4">
                                <a href="gamepage/${popularGameList[6].id}" id = "${popularGameList[6].id}" class = "fourth_less_popular_game"><img src = "${popularGameList[6].pictureBig}" class = small_game_objects_2></a>
                            </div>
                            <div class="small_game_objects" id = "right_arrow"><img src = "resources/images/arrowright.png" class="small_game_objects_2"></div>
                        </div>
                        <div class = "other_popular_games_changed">
                            <div class = "small_game_objects" id = "left_arrow_2"><img src = "resources/images/arrowleft.png" class="small_game_objects_2"></div>
                            <div class = "small_game_objects" id = "small_popular_game_1_1">
                                <a href="gamepage/${popularGameList[7].id}" id = "${popularGameList[7].id}" class = "first_less_popular_game_changed"><img src = "${popularGameList[7].pictureBig}" class = small_game_objects_2></a>
                            </div>
                            <div class = "small_game_objects" id = "small_popular_game_2_2">
                                <a href="gamepage/${popularGameList[8].id}" id = "${popularGameList[8].id}" class = "second_less_popular_game_changed"><img src = "${popularGameList[8].pictureBig}" class = small_game_objects_2></a>
                            </div>
                            <div class = "small_game_objects" id = "small_popular_game_3_3">
                                <a href="gamepage/${popularGameList[9].id}" id = "${popularGameList[9].id}" class = "third_less_popular_game_changed"><img src = "${popularGameList[9].pictureBig}" class = small_game_objects_2></a>
                            </div>
                            <div class = "small_game_objects" id = "small_popular_game_4_4">
                                <a href="gamepage/${popularGameList[10].id}" id = "${popularGameList[10].id}" class = "third_less_popular_game_changed"><img src = "${popularGameList[10].pictureBig}" class = small_game_objects_2></a>
                            </div>
                            <div class="small_game_objects" id = "right_arrow_2"><img src = "resources/images/arrowright.png" class="small_game_objects_2"></div>
                        </div>
                    </div>
                    <a href = "" class = "popular_game_list">Список популярных игр</a>
                </div>
            </div>




            <div class = "new_games">
                <h2>НОВЫЕ ИГРЫ</h2>
                <div class = "new_games_area">
                    <div class = "game_details"></div>
                    <div class = "game_list">
                        <div class = three_left_large_elements>
                            <div class = "game_1">
                                <a href = "gamepage/${newGameList[0].id}" id = "${newGameList[0].id}" class = "left_element"><img src="${newGameList[0].pictureBig}" class = "game_objects"></a>
                            </div>
                            <div class = game_2_3>
                                <a href = "gamepage/${newGameList[1].id}" id = "${newGameList[1].id}" class = "first_right_element"><img src="${newGameList[1].pictureBig}" class = "game_objects"></a>
                                <a href = "gamepage/${newGameList[2].id}" id = "${newGameList[2].id}" class = "second_right_element"><img src="${newGameList[2].pictureBig}" class = "game_objects"></a>
                            </div>
                        </div>
                        <div class = "other_new_games">
                            <div class = "small_game_objects" id = "left_arrow_3"><img src = "resources/images/arrowleft.png" class="small_game_objects_2"></div>
                            <div class = "small_game_objects" id = "small_new_game_1">
                                <a href="gamepage/${newGameList[3].id}" id = "${newGameList[3].id}" class = "first_less_popular_game"><img src = "${newGameList[3].pictureBig}" class = small_game_objects_2></a>
                            </div>
                            <div class = "small_game_objects" id = "small_new_game_2">
                                <a href="gamepage/${newGameList[4].id}" id = "${newGameList[4].id}" class = "second_less_popular_game"><img src = "${newGameList[4].pictureBig}" class = small_game_objects_2></a>
                            </div>
                            <div class = "small_game_objects" id = "small_new_game_3">
                                <a href="gamepage/${newGameList[5].id}" id = "${newGameList[5].id}" class = "third_less_popular_game"><img src = "${newGameList[5].pictureBig}" class = small_game_objects_2></a>
                            </div>
                            <div class = "small_game_objects" id = "small_new_game_4">
                                <a href="gamepage/${newGameList[6].id}" id = "${newGameList[6].id}" class = "fourth_less_popular_game"><img src = "${newGameList[6].pictureBig}" class = small_game_objects_2></a>
                            </div>
                            <div class="small_game_objects" id = "right_arrow_3"><img src = "resources/images/arrowright.png" class="small_game_objects_2"></div>
                        </div>
                        <div class = "other_new_games_changed">
                            <div class = "small_game_objects" id = "left_arrow_4"><img src = "resources/images/arrowleft.png" class="small_game_objects_2"></div>
                            <div class = "small_game_objects" id = "small_new_game_1_1">
                                <a href="gamepage/${newGameList[7].id}" id = "${newGameList[7].id}" class = "first_less_popular_game_changed"><img src = "${newGameList[7].pictureBig}" class = small_game_objects_2></a>
                            </div>
                            <div class = "small_game_objects" id = "small_new_game_2_2">
                                <a href="gamepage/${newGameList[8].id}" id = "${newGameList[8].id}" class = "second_less_popular_game_changed"><img src = "${newGameList[8].pictureBig}" class = small_game_objects_2></a>
                            </div>
                            <div class = "small_game_objects" id = "small_new_game_3_3">
                                <a href="gamepage/${newGameList[9].id}" id = "${newGameList[9].id}" class = "third_less_popular_game_changed"><img src = "${newGameList[9].pictureBig}" class = small_game_objects_2></a>
                            </div>
                            <div class = "small_game_objects" id = "small_new_game_4_4">
                                <a href="gamepage/${newGameList[10].id}" id = "${newGameList[10].id}" class = "third_less_popular_game_changed"><img src = "${newGameList[10].pictureBig}" class = small_game_objects_2></a>
                            </div>
                            <div class="small_game_objects" id = "right_arrow_4"><img src = "resources/images/arrowright.png" class="small_game_objects_2"></div>
                        </div>
                    </div>
                    <a href = "" class = "popular_game_list">Список новых игр</a>
                </div>

            <div class = "recommended_games"></div>
        </div>
        </div>
        <br/>
    </div>
</body>
</html>
