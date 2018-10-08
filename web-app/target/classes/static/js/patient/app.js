var patient = $.extend(true, {}, BaseManage, {
    save: function () {
        var data = JSON.stringify({"name": "liu", "password": "888888", "sex": "MAN"});

        http.post("/patient/save", data).then(function (data) {
            console.log(data);
        });

    }
})