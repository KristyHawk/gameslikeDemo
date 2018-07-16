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

});