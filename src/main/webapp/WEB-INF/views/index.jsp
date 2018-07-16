<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>GamesLike</title>
    <link rel="stylesheet" href="resources/css/index.css" type = "text/css">
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
                    <a href = "admin/gamelist" class = "admin_menu">Админ</a>
                </div>
                <div class = "login_logout"></div>
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
            <div class = "recommended_games"></div>
            <div class = "new_games"></div>
        </div>
    </div>
</body>
</html>
