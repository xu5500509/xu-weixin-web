$(function () {
    var indexVm = avalon.define({
        $id: 'indexVm',
        sex:"",

        getFirst: function(){
            $.p("/first/firstAnswer", {}, function (res) {
                indexVm.sex = res.sex;
            },layer);
        },

        getCommon: function(){
            $.ajax({
                type:'post',
                url:'/first/firstAnswer',
                success:function(data){//返回json结果
                    indexVm.sex = data.sex;
                }

            });
        },
        init: function(){
            indexVm.getFirst();
        }

    });
    indexVm.init();
    avalon.scan();
});



