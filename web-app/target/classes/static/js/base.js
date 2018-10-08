var BaseManage = {
    url: null,
    list: function () {
        http.post("/patient/list", {}).then(function (data) {
            console.log(data);
        });
    }
};


//AJAX工具
var http = {
    post: function (url, data) {
        return $.ajax({
            type: "post",
            url: url,
            contentType: "application/json",
            dataType: 'json',
            data: data
        });
    },
    get: function (url, param) {
        var query = "";
        $.each(param, function (name, value) {
            query += name + "=" + value + "&"
        });

        return $.get({
            url: url + "?" + query
        })
    }
};