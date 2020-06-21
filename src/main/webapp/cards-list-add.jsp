<%--
  Created by IntelliJ IDEA.
  User: wherohero
  Date: 2020/6/19
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>cards-list-add</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="stylesheet" href="./css/font.css">
    <link rel="stylesheet" href="./css/xadmin.css">
    <script type="text/javascript" src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="layui-fluid">
    <div class="layui-row">
        <form action="creationCards" method="post">
            <div class="layui-form-item">
                <label for="cardsid" class="layui-form-label">
                    <span class="x-red">*</span>卡号:</label>
                <div class="layui-input-inline">
                    <input name="cardsid"  onblur="iscardsid()" id="cardsid" type="text"   class="layui-input"></div>
                <div class="layui-form-mid layui-word-aux">8个字符</div></div>
            <div class="layui-form-item" style="margin-left: 120px">
                <button type="submit" class="layui-btn" >增加</button></div>
        </form>
    </div>
</div>
<script>
    function iscardsid() {
        var cardsid = $("#cardsid").val();
        // alert("卡号已存在！--"+cardsid);
        $.ajax({
            url:"findCardsid",
            data:{"cardsid":cardsid},
            success:function (data) {
                if(data =="true"){
                    alert("卡号已存在！");
                }
            }
        })
    }
</script>
<script>var _hmt = _hmt || []; (function() {
    var hm = document.createElement("script");
    hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(hm, s);
})();</script>
</body>

</html>
