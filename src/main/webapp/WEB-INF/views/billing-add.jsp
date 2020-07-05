<%--
  Created by IntelliJ IDEA.
  User: wherohero
  Date: 2020/6/20
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html class="x-admin-sm">

<head>
    <meta charset="UTF-8">
    <title>cards-add</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="stylesheet" href="./css/font.css">
    <link rel="stylesheet" href="./css/xadmin.css">
    <script src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js">



</script>
    <![endif]-->
</head>

<body style="background-color:lightblue">
<div class="x-nav">
            <span class="layui-breadcrumb">
                <a href="">首页</a>
                <a href="">演示</a>
                <a>
                    <cite>导航元素</cite></a>
            </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" onclick="location.reload()" title="刷新">
        <i class="layui-icon layui-icon-refresh" style="line-height:30px"></i>
    </a>
</div>
<div class="layui-fluid">
                    <form action="updateCards" method="post">
                        <div style="margin: 30px" class="layui-inline layui-show-xs-block">
                            id:   <input type="text" name="cid" placeholder="id" autocomplete="off" class="layui-input"></div>
                        <div  class="layui-inline layui-show-xs-block">
                            体检人: <input type="text" name="cname" placeholder="体检人" autocomplete="off" class="layui-input"></div><br>
                        <div style="margin: 30px"  class="layui-inline layui-show-xs-block">
                            年龄:   <input type="text" name="age" placeholder="年龄" autocomplete="off" class="layui-input"></div>
                        <div style="margin: 30px"  class="layui-inline layui-show-xs-block">
                        性别：<input type="radio" name="sex" value="男" />男
                        <input  type="radio" name="sex" value="女"/>女</div><br>
                        <div style="margin: 30px"  class="layui-inline layui-show-xs-block">
                            手机:   <input type="text" name="telephone" placeholder="手机" autocomplete="off" class="layui-input"></div>
                        <div class="layui-inline layui-show-xs-block">
                            预存金额 :  <input type="text" name="cprice" placeholder="金额" autocomplete="off" class="layui-input"></div><br>
                        <div style="margin: 30px" class="layui-inline layui-show-xs-block" >
                        套餐: <br>
                                <select name="teid" id="teid" onchange="mySelect()" style="width: 165px;height: 30px">
                                            <option value="0">请选择</option>
                                            <option value="1">五官套餐</option>
                                            <option value="2">过敏套餐</option>
                                            <option value="3">内脏功能套餐</option>
                                    </select>
                        </div>
                        <div style="margin: 0px" class="layui-inline layui-show-xs-block">
                        项目:<br>
                               <select name="prid" id="prid" style="width: 165px;height: 30px">
                            <option value="">请选择</option>
                        </select>
                        </div>
                        <br>
                        <div style="margin: 30px"  class="layui-inline layui-show-xs-block">
                        <button type="submit"  id="cid" class="layui-btn" lay-submit="" lay-filter="sreach" value="开单">
                            <i ></i>开单&结算</button>
                        </div>
                    </form>
</div>
</body>
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script type="text/javascript">
    $("cid").click(function(){
        var cid = $("#cid").val();
        $.ajax({
            url:"updateState",
            data:{"cid":cid},
            success:function (data) {
                if(data =="true"){
                    alert("支付成功！");
                }
            }
        })
    });
        function mySelect() {
            var se = document.getElementById("teid");
            var sr = se.value;
            var st = document.getElementById("prid");
            switch (sr) {
                case "0":
                    st.innerHTML = "<option value=''>请选择</option>";
                    break;
                case "1":
                    st.innerHTML = "<option value='01'>体检鼻咽喉镜检查</option>";
                    break;
                case "2":
                    st.innerHTML = "<option value='02'>过敏原全套</option><option value='04'>食入性过敏原筛查</option>";
                    break;
                case "3":
                    st.innerHTML = "<option value='03'>体检大肝功全套</option>";
                    break;
            }
        }
</script>
<script>
    layui.use('laydate',
    function() {
        var laydate = layui.laydate;

        //执行一个laydate实例
        laydate.render({
            elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
            elem: '#end' //指定元素
        });

    });</script>
<script>layui.use('table',
    function() {
        var table = layui.table;

        //监听单元格编辑
        table.on('edit(test)',
            function(obj) {
                var value = obj.value //得到修改后的值
                    ,
                    data = obj.data //得到所在行所有键值
                    ,
                    field = obj.field; //得到字段
                layer.msg('[ID: ' + data.id + '] ' + field + ' 字段更改为：' + value);
            });

        //头工具栏事件
        table.on('toolbar(test)',
            function(obj) {
                var checkStatus = table.checkStatus(obj.config.id);
                switch (obj.event) {
                    case 'getCheckData':
                        var data = checkStatus.data;
                        layer.alert(JSON.stringify(data));
                        break;
                    case 'getCheckLength':
                        var data = checkStatus.data;
                        layer.msg('选中了：' + data.length + ' 个');
                        break;
                    case 'isAll':
                        layer.msg(checkStatus.isAll ? '全选': '未全选');
                        break;
                };
            });
    });</script>
<script>var _hmt = _hmt || []; (function() {
    var hm = document.createElement("script");
    hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(hm, s);
})();</script>

</html>