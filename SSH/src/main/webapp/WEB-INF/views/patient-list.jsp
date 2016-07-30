<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>医院日志主页</title>
    <link rel="stylesheet" href="http://cdn.staticfile.org/twitter-bootstrap/2.3.2/css/bootstrap.min.css">
    <%--<link rel="stylesheet" href="/static/plugins/bootstrap-3.3.5-dist/css/bootstrap.min.css">--%>
    <link href="//cdn.bootcss.com/font-awesome/4.1.0/css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href="/static/css/style.css">

</head>
<body>
<div class="navbar navbar-static-top">
    <div class="navbar-inner">
        `<a class="brand" href="#">凯盛医疗</a>
        <ul class="nav">
            <li><a href="#"><i class="fa fa-home"></i>首页</a></li>
            <li><a href="#"><i class="fa fa-building-o"></i>病人档案</a></li>
            <li><a href="#"><i class="fa fa-stethoscope"></i>就诊记录</a></li>
            <li><a href="#"><i class="fa fa-bell-o"></i>复诊提醒</a></li>
            <li><a href="#"><i class="fa fa-bar-chart-o"></i>数据统计</a></li>
            <li>
                <div class="dropdown">
                    <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1"
                            data-toggle="dropdown"
                            aria-haspopup="true" aria-expanded="true">
                        系统设置
                        <span class="caret"></span>
                    </button>

                    <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                        <li><a href="#"><i class="fa fa-sitemap"></i>科室设置</a></li>
                        <li><a href="#"><i class="fa fa-medkit"></i>病种设置</a></li>
                        <li><a href="/home/insurance"><i class="fa fa-bars"></i>医保类型设置</a></li>
                        <li><a href="#"><i class="fa fa-child"></i>患者状态设置</a></li>
                        <li class="divider"></li>
                        <li><a href=""><i class="fa fa-user-md"></i>账号设置</a></li>
                    </ul>
                </div>
            </li>
        </ul>

        <ul class="nav pull-right">
            <li class="divider-vertical"></li>
            <li><a href="#"><i class="fa fa-cog"></i>个人设置</a></li>
        </ul>
    </div>
</div>


<script src="http://cdn.staticfile.org/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/twitter-bootstrap/3.0.0/js/bootstrap.min.js"></script>


</body>
</html>
