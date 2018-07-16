$(document).ready(function() {

    $('#addHeaderButton').bind("click", function () {
       $('.variable-type').val('Header');
    });

    $('#addParagraphButton').bind("click", function () {
        $('.variable-type').val('Paragraph');
    });

    $('#addBulletedListButton').bind("click", function () {
        $('.variable-type').val('BulletedList');
    });

    $('#addImageButton').bind("click", function () {
        $('.variable-type').val('Image');
    });



    $('.save-html-variable-button').bind("click", function () {

        var url = document.location.href;
        var id = url.split("/")[5];
        var form;

        if ($(".variable-type").val() === "Header") {
            $("#htmlVariableParagraphType").val('Header');
            form = $("#addHeaderForm").serialize();

            $.ajax({
                url: id + "/saveDescription/",
                type: "POST",
                data: form,
                dataType: "json"
            });
            var content = '<h2>' + $("#addHeaderArea").val() + '</h2>';
            $(".view-field").append(content);
        }
        else if($(".variable-type").val() === "Paragraph") {
            $("#htmlVariableParagraphType").val('Paragraph');
            form = $("#addParagraphForm").serialize();
            $.ajax({
                url: id +"/saveDescription/",
                type: "POST",
                data: form,
                dataType: "json"
            });
            var content = '<p>' + $("#addParagraphArea").val() + '</p>';
            $(".view-field").append(content);
        }
        else if($(".variable-type").val() === "BulletedList") {
            form = $("#addBulletedListForm").serialize();
            $.ajax({
                url: id +"/saveDescription/",
                type: "POST",
                data: form,
                dataType: "json"
            });
            var content = '<ul>' + $("#addParagraphArea").val() + '</ul>';
            $(".view-field").append(content);
        }

    });

    $('.question').bind("click", function () {
        if($(".question-answer").is(':visible')) {
            $('.question-answer').hide();
        }
        else {
            $('.question-answer').show();
        }
    });
});