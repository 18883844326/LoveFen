
console.log("OK1");
$(function(){

    console.log("OK2");
    $("#login").click(function(){
        console.log("OK");
        $.ajax({
            type: "POST",
            url: "127.0.0.1:8080/login",
            data: JSON.stringify({}),
            dataType: "application/json charset=utf-8",
            success: function(data){
                console.log(data)
            },
            error: function (error) {
                console.log(error)
            }
        });
    })


})