<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html class="x-admin-sm">

<head>
    <meta charset="UTF-8">
    <title>健康科室</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="x-nav">
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" onclick="location.reload()" title="刷新">
        <i class="layui-icon layui-icon-refresh" style="line-height:30px"></i>
    </a>
</div>
<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-body ">
                    <form class="layui-form layui-col-space5" action="${pageContext.request.contextPath}/query01" method="post">
                        <div class="layui-input-inline layui-show-xs-block">
                            <input class="layui-input" placeholder="体检人姓名或体检卡号" name="word"></div>
                        <div class="layui-input-inline layui-show-xs-block">
                            <input class="layui-input" type="submit" value="查询">
                        </div>
                    </form>
                    <hr>
                </div>
                <div class="layui-card-body ">
                    <table class="layui-table layui-form">
                        <thead>
                        <tr>
                            <th width="30">体检卡号</th>
                            <th width="30">体检人姓名</th>
                            <th width="20">体检人性别</th>
                            <th width="20">体检人年龄</th>
                            <th width="50">体检的项目</th>
                            <th width="30">体检医生</th>
                            <th width="30">价格</th>
                            <th width="50">所属科室</th>
                            <th width="250">操作</th>
                        </thead>
                        <tbody class="x-cate">
                        <c:forEach items="${offices}" var="o">
                            <tr>
                                <td>${o.cardsid}</td>
                                <td>${o.cname}</td>
                                <td>${o.sex}</td>
                                <td>${o.age}</td>
                                <td>${o.finame}</td>
                                <td>${o.uname}</td>
                                <td>${o.ficonsult}</td>
                                <td>${o.room}</td>
                                <td class="td-manage">
                                    <button class="layui-btn layui-btn layui-btn-xs"  onclick="xadmin.open('体检报告','${pageContext.request.contextPath}/toReport01/01',650,500)" ><i class="layui-icon">&#xe642;</i>体检</button>
                                </td>
                            </tr>
                        </c:forEach>

                        </tbody>
                    </table>
                </div>

            </div>
        </div>
    </div>
</div>
<script>
    layui.use(['form'], function(){
        form = layui.form;

    });


</script>
</body>
</html>
