<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html  class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>后台登录</title>
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
            background: url("images/bg.png") no-repeat;
            background-size: 100% 100%  ;
        }
        /*#sub{background-color: darkgray}*/
    </style>
</head>
<body class="login-bg">

<div class="login layui-anim layui-anim-up">
    <div class="message" style="text-align: center">管理登录</div>
    <div id="darkbannerwrap"></div>

    <form method="post" class="layui-form" action="${pageContext.request.contextPath}/login" >
        <input name="uname" onblur="isName()" onchange="checkUserStatus(this.value)" id="username" placeholder="请输入用户名"  type="text" lay-verify="required" class="layui-input" required ><span id="sp1"></span>
        <hr class="hr15">
        <input name="upwd" id="password" onblur="isPwd()" lay-verify="required" placeholder="请输入密码"  type="password" class="layui-input" required>
        <hr class="hr15">
        <input value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit" id="sub">
        <hr class="hr20" >
    </form>
    <form method="post" action="${pageContext.request.contextPath}/toRegister">
        <input value="注册" lay-submit lay-filter="login" style="width:100%;color: black;background-color: red" type="submit">
        <hr class="hr20" >
    </form>
</div>

</body>
<script type="application/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script>
    function isName() {
        var username = $("#username").val();
        $.ajax({
            url:"${pageContext.request.contextPath}/isUsername",
            data:{"username":username},
            success:function (data) {
                if(data == "false"){
                    alert("用户名不存在!");
                }
            }
        })
    }
    // function isPwd() {
    //     var username = $("#username").val();
    //     var password = $("#password").val();
    //     $.ajax({
    //         url:"isPassword",
    //         data:{"username":username,"password":password},
    //         success:function (data) {
    //             if(data == "false"){
    //                 alert("密码输入错误！请重新输入！");
    //                 $("#password").val(" ");
    //             }
    //         }
    //     })
    // }

    // 判断账号的状态：启用或禁用
    function checkUserStatus(userName) {

        $.ajax(
            {
                type:"post",
                url:"${pageContext.request.contextPath}/checkUserStatus",
                data:{uname:userName},
                cache:false,
                success:function (data) {

                    if(data=="false"){
                        $("#sp1").html("禁用");
                        $("#password").attr("placeholder","禁止输入密码");
                        $("#password").attr("disabled","disabled");
                        $("#sub").val("禁止登录");
                        $("#sub").css("background","darkgray");
                        $("#sub").attr("disabled","true");
                    }else{
                        $("#sp1").html("正常");
                        $("#password").removeAttr("disabled","disabled");
                        $("#password").attr("placeholder","请输入密码");
                        $("#sub").removeAttr("disabled","true");
                        $("#sub").val("登录");
                        $("#sub").css("background","#189f92");

                    }
                }
            }
        )

    }
</script>
</html>
