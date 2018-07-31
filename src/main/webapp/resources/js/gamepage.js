$(document).ready(function() {

    $( ".is-rec-inner:contains('true')" ).addClass( "is-recommended-thumb-up");
    $( ".is-rec-inner:contains('false')" ).addClass( "is-recommended-thumb-down");
    $(".is-rec-inner").text('');

    if($('.content').text().length > 336){
        $($(this).siblings('p').eq(0)).removeAttr('style');
    }


    $("#new-comment-container").hide();

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

    $(".arrows").bind("click", function () {
        if ($(".relative-game-unchanged").is(':visible')) {
            $(".relative-game-unchanged").hide();
            $(".relative-game-changed").show();
            $(".relative-game-changed").css("display","inline-block");
        } else {
            $(".relative-game-changed").hide();
            $(".relative-game-unchanged").show();
        }
    });

    $(".view-more-p").bind("click", function () {
        $($(this).parents('div').eq(3).find(".content")).removeAttr('style');
        $(this).css("display", "none");
        return false;
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

    var url = document.location.href;
    var id = url.split("/")[4];

    $("#submitCommentButton").bind("click", function (e) {
        e.preventDefault();
        e.stopPropagation();

        var recommended = $(".message_pri:checked").val();
        var content = $(".review-content-area").val();
        var object = {"recommended":recommended,"content":content}

        $.ajax({
            url: id + "/addComment",
            type: "POST",
            data: JSON.stringify(object),
            contentType: "application/json; charset=utf-8",

            success: function(dto){
                alert("success");

                $("#new-comment").text(dto.content);
                var formattedDate = new Date(dto.time);
                var d = formattedDate.getDate();
                var m =  formattedDate.getMonth();
                m += 1;
                var y = formattedDate.getFullYear();
                var h = formattedDate.getHours();

                var mins = formattedDate.getMinutes();
                if(mins.toString().length === 1){
                    mins = "0" + mins;
                }
                $('#new-date-of-publishing').text("Опубликовано: " + d + "/" + m + "/" + y + " " + h + ":" + mins);

                $("#new-comment-container").show();
                $(".review-content-area").val('');
                $('#new-comment-container').addClass('highlighted-div');
                window.setTimeout(function() {
                    $('#new-comment-container').removeClass('highlighted-div');
                }, 200);
                if(dto.recommended.toString() === 'true') {
                    $(".is-rec-inner-new").addClass( "is-recommended-thumb-up");
                }
                else {
                    $(".is-rec-inner-new").addClass( "is-recommended-thumb-down");
                }

            },
            error: function (jqXHR, textStatus, errorThrown) {
                alert(jqXHR);
                alert(textStatus);
                alert(errorThrown);
            }
        });
    });

    $('.enter-to-comment').hover(function () {
        $(this).css("text-decoration", "underline");
    },
    function () {
        $(this).css("text-decoration", "none");
    });

    $('.login-a').hover(function () {
            $(this).css("color", "white");
        },
        function () {
            $(this).css("color", "#b8b6b4");
    });
});

