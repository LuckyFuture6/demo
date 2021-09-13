function getAll(){
    $.ajax({
        type: "get",
        url: "depart/selectAll",
        data: {
        },
        success:function (data) {
            console.log(data)
            $("#result").empty()
            for(var i = 0;i < data.length;i++){
                $("#result").append(JSON.stringify(data[i]) + "<br>")
            }
        },
    });
}
function login() {
    $.ajax({
        type: "get",
        url: "login/loginSuccess",
        data: {},
        success:function (data){
            window.alert(data);
        },
        error:function (){
            window.alert("failed");
        }
    })

}