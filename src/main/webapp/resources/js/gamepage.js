$(document).ready(function() {

    $(".image_element_cover").parent().css("background-image", "url('../resources/images/background.png'");

    $(".image_element").bind("click", function(){
        var temp = $(this).attr('src');
        $(".image_window").attr("src", temp);
        $(".image_element").css("border", "0px");
        $(".image_element_cover").css("border", "0px");
        $(".choose_image").css("background-image", "none");
        $(this).css("border", "1px solid white");
        $(this).parent().css("background-image", "url('../resources/images/background.png'");
    });

    $(".image_element_cover").bind("click", function() {
        var template = $(this).attr('src');
        $(".image_window").attr("src", template);
        $(".image_element").css('border', '0px');
        $(".choose_image").css("background-image", "none");
        $(this).css("border", "1px solid white");
        $(this).parent().css("background-image", "url('../resources/images/background.png'");
    });

    $("#winos").toggleClass('os_click');

    $(".os").bind("click", function (e) {
        $(".os").removeClass('os_click');
        $(this).toggleClass('os_click');

        if (e.target.id === "winos") {
            $(".mac_container").hide();
            $(".linux_container").hide();
            $(".win_container").show();
        }
        else if(e.target.id === "macos"){
            $(".linux_container").hide();
            $(".win_container").hide();
            $(".mac_container").show();
        }
        else if(e.target.id === "linos"){
            $(".win_container").hide();
            $(".mac_container").hide();
            $(".linux_container").show();
        }
        else {
            $(".mac_container").hide();
            $(".linux_container").hide();
            $(".win_container").show();
        }
    });

    $(".os").hover(function () {
        $(this).css("color", "white");
    });

    $(".scroll-down-click").bind("click", function () {
        if($('.scroll-down-click').text() === 'Показать полностью') {
            $('#descriptionDiv').removeClass('description_div');
            $('#descriptionDiv').addClass('description_div_expanded');
            $('#gameDetailedDescription').removeClass('game-detailed-description');
            $('#gameDetailedDescription').addClass('game_detailed_description_expanded');
            $('.scroll-down-click').text("Скрыть");
        } else {
            $('#descriptionDiv').removeClass('description_div_expanded');
            $('#descriptionDiv').addClass('description_div');
            $('#gameDetailedDescription').removeClass('game_detailed_description_expanded');
            $('#gameDetailedDescription').addClass('game-detailed-description');
            $('.scroll-down-click').text("Показать полностью");
        }
    });

    $(".scroll-down-click").hover(function () {
       $(".scroll-down-click").toggleClass('scroll-down-click-hover')
    });




});