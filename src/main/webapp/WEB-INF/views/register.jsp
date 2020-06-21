<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html  class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>注册</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="stylesheet" href="./css/font.css">
    <link rel="stylesheet" href="./css/login.css">
    <link rel="stylesheet" href="./css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="./lib/layui/layui.js" charset="utf-8"></script>
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
        body{
            background: url("${pageContext.request.contextPath}/images/bg.png") no-repeat;
            background-size: 100% 100%;
        }
    </style>
</head>
<body class="login-bg">
<div >
    <form action="${pageContext.request.contextPath}/toLogin" class="layui-form" method="post">
        <input type="submit" class="layui-btn layui-btn-primary layui-btn-sm" style="background-color: #189F92;border: none"  value="返回">
    </form>
</div>
<%--<form method="post" action="${pageContext.request.contextPath}/Register" class="layui-form" >--%>
<form method="post" action="Register">
    <div class="login layui-anim layui-anim-up" style="margin-left: 30%;margin-top: 20px">
        <div class="message" style="text-align: center">注册</div>
        <div id="darkbannerwrap"></div>

        <div style="margin: 10px">
            选择职务：        <select name="wid" style="width: auto;height: 20px;margin: 10px">
            <%--                <option value="0">患者</option>--%>
            <option value="1">医生</option>
            <option value="2">护士</option>
        </select>
        </div>
        <div style="margin: 10px">
            选择科室：       <select name="prid" style="width: auto;height: 20px;margin: 10px">
            <%--<option value="0">患者</option>--%>
            <option value="01">健康科</option>
            <option value="02">过敏01科</option>
            <option value="03">肝功能科</option>
            <option value="04">过敏02科</option>
        </select>
        </div>
        <%--    <form method="post" action="${pageContext.request.contextPath}/Register" class="layui-form" >--%>
        <input name="uname" id="username" onblur="isExist()" placeholder="用户名"  type="text" lay-verify="required" class="layui-input" required>
        <hr class="hr15">
        <input name="upwd" id="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input" required>
        <hr class="hr15">
        <input name="upwd1" onblur="Pwd()" id="password1" lay-verify="required" placeholder="请再次输入密码"  type="password" class="layui-input" required>
        <hr class="hr15">

        <input value="注册" lay-submit lay-filter="login" style="width:100%;" type="submit">
        <hr class="hr20" >
</form>

</div>
<script type="application/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript">
    function Pwd() {
        var password = $("#password").val();
        var password1 = $("#password1").val();
        if(password != password1){
            alert("两次密码输入不一致！请重新输入！");
            $("#password").val("");
            $("#password1").val("");
        }
    }
    function isExist() {
        var username = $("#username").val();
        $.ajax({
            url:"${pageContext.request.contextPath}/isUsername",
            data:{"username":username},
            success:function (data) {
                if(data == "true"){
                    alert("用户名已存在！");
                    $("#username").val(" ");
                }
            }
        })
    }
</script>

</body>
</html>
