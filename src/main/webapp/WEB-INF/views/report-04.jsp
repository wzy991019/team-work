<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html class="x-admin-sm">

<head>
    <meta charset="UTF-8">
    <title>欢迎页面-X-admin2.2</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">
    <script type="text/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="layui-fluid">
    <div class="layui-row">
        <form class="layui-form" action="${pageContext.request.contextPath}/insertResult4" method="post">
            <div class="layui-form-item">
                <label for="username" class="layui-form-label">
                    科室id：
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="username" name="prid" required="" lay-verify="required" value="${offices.get(1).prid}"
                           autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label for="username" class="layui-form-label">
                    卡id：
                </label>
                <div class="layui-input-inline">
                    <input type="text" name="cid" required="" lay-verify="required"
                           autocomplete="off" class="layui-input" value="${offices.get(1).cid}">
                </div>
            </div>
            <div class="layui-form-item">
                <label for="phone" class="layui-form-label">
                    姓名：
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="bname" name="phone" required="" lay-verify="phone"
                           autocomplete="off" class="layui-input" value="${offices.get(1).cname}">
                </div>
            </div>
            <div class="layui-form-item">
                <label for="phone" class="layui-form-label">
                    检查名称：
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="phone" name="finame" required="" lay-verify="phone"
                           autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label for="phone" class="layui-form-label">
                    医生：
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="" name="uname" required="" lay-verify="phone"
                           autocomplete="off" class="layui-input" value="${offices.get(1).uname}">
                </div>
            </div>
            <div class="layui-form-item">
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">体检小结</label>
                    <div class="layui-input-block">
                        <textarea placeholder="请输入内容" name="bresult" class="layui-textarea"></textarea>
                    </div>
                </div>
            </div>
            <div class="layui-input-block">
                <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
            </div>

        </form>
    </div>
</div>

</body>

</html>

