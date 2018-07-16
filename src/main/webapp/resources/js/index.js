$(document).ready(function(){

    $(".menu_objects").hover(function () {
        $(this).toggleClass('menu_objects_hover');
    });

    $(".game_objects").hover(function () {
        $(this).toggleClass('game_objects_hover');
    });

    $(".small_game_objects_2").hover(function () {
        $(this).toggleClass('game_objects_hover');
    });

    $(".popular_game_list").hover(function () {
        $(this).toggleClass('popular_game_list_hover');
    });

    $("#right_arrow, #right_arrow_2").bind("click", function(){

        if ($(".other_popular_games").is(':visible')) {
            $(".other_popular_games").hide();
            $(".other_popular_games_changed").show();
        } else {
            $(".other_popular_games_changed").hide();
            $(".other_popular_games").show();
        }
    });

    $("#left_arrow, #left_arrow_2").bind("click", function(){

        if ($(".other_popular_games").is(':visible')) {
            $(".other_popular_games").hide();
            $(".other_popular_games_changed").show();
        } else {
            $(".other_popular_games_changed").hide();
            $(".other_popular_games").show();
        }
    });


});


