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

    $("#right_arrow_3, #right_arrow_4").bind("click", function(){

        if ($(".other_new_games").is(':visible')) {
            $(".other_new_games").hide();
            $(".other_new_games_changed").show();
        } else {
            $(".other_new_games_changed").hide();
            $(".other_new_games").show();
        }
    });

    $("#left_arrow_3, #left_arrow_4").bind("click", function(){

        if ($(".other_new_games").is(':visible')) {
            $(".other_new_games").hide();
            $(".other_new_games_changed").show();
        } else {
            $(".other_new_games_changed").hide();
            $(".other_new_games").show();
        }
    });



    $('#options').hover(function () {
        $('#optionsExpanded').css("visibility", "visible");
    },
        function() {
            $('#optionsExpanded').css("visibility", "hidden");
    });

    $('#optionsExpanded').hover(function () {
        $('#optionsExpanded').css("visibility", "visible");
    }, function() {
            $('#optionsExpanded').css("visibility", "hidden");
    });


    $(".mini-menu-item").hover(function () {
        $(this).removeClass("mini-menu-item");
        $(this).addClass("mini-menu-item-hover");
        $(this).children("div").removeClass("mini-menu-item-expanded");
        $(this).children("div").addClass("mini-menu-item-expanded-hover");
    }, function() {
        $(this).removeClass("mini-menu-item-hover");
        $(this).addClass("mini-menu-item");
        $(this).children("div").removeClass("mini-menu-item-expanded-hover");
        $(this).children("div").addClass("mini-menu-item-expanded");
    });

    $(".mini-menu-item-expanded").hover(function () {
        $(this).removeClass("mini-menu-item-expanded");
        $(this).addClass("mini-menu-item-expanded-hover");
    }, function() {
        $(this).removeClass("mini-menu-item-expanded-hover");
        $(this).addClass("mini-menu-item-expanded");
    });

    $(".mini-menu-expanded-inner-item").hover(function () {
       $(this).removeClass("mini-menu-expanded-inner-item") ;
       $(this).addClass("mini-menu-expanded-inner-item-hover");
    }, function () {
        $(this).removeClass("mini-menu-expanded-inner-item-hover") ;
        $(this).addClass("mini-menu-expanded-inner-item");
    });

});


