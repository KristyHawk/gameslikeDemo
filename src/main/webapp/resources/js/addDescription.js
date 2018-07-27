$(document).ready(function() {

    var url = document.location.href;
    var id = url.split("/")[5];

    $("#set-preview-button").bind("click", function () {
        var content = $("#addDescriptionArea").val();
        var field = $(".view-field-inner");
        field.empty();
        field.append(content);
    });

    $('#save-description-button').bind("click", function () {

        var form = $("#addDescriptionForm").serialize();
        var desc = $("#addDescriptionArea").val();
        var token = $('#csrfToken').val();
        var header = $('#csrfHeader').val();


        $.ajax({
            url: id + "/saveDescription/",
            type: "POST",
            data: {"desc" : desc},
            dataType: "json",
            beforeSend: function(xhr) {
                xhr.setRequestHeader("Accept", "application/json");
                xhr.setRequestHeader("Content-Type", "application/json");
                xhr.setRequestHeader(header, token);
            }
        });
        var content = $("#addDescriptionArea").val();
        var field = $(".view-field-inner");
        field.empty();
        field.append(content);
    });

    function generateCode(N) {
        var s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        return new Array(N).join().split(',').map(function () {
            return s.charAt(Math.floor(Math.random() * s.length));
        }).join('');
    }

    var code = generateCode(8);
    $('#htmlDescriptionCode').val(code);

    $("input[name=code]").attr("readonly",true);

    $("#addDescriptionArea").bind("click", function () {
        $(".label-for-html").text("");
    });




});