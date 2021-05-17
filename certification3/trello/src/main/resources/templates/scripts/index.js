$(document).ready(function (){
    $("#btn1").click(function(){
        $.ajax({
            url: "http://localhost:8080/trello/task",
            type: "GET",
            dataType: "json",
            success: function (responce){
                console.log(responce);
            },
            error: function (responce){
                console.log("Что-то пошло не так"+responce);
            }
        });
    });

    $("#regbtn").click(async function(){
        let varData = {
            "firstName": $("#firstName").val(),
            "lastName": $("#secondName").val(),
            "middleName": $("#middleName").val(),
            "login": $("#username").val(),
            "passwordHash": $("#password").val(),
            "passwordRepeat": $("#passwordRepeat").val()
        };
        if(varData.passwordRepeat===varData.passwordHash){
            let response = await fetch("http://localhost:8080/trello/user",{
                method : "POST",
                headers: {
                    'Content-Type': 'application/json;charset=utf-8'
                },
                body: JSON.stringify(varData)
            });
            if(response.status===200){
                console.log("sdfg")


            }
            if(response.status === 201){
                console.log("dfghjkl")
            }
            else{
                console.log("sdfg")
            }


        }
        else{
            console.log("Password are incorrect");
            JSON.stringify(varData)
        }

    });
})