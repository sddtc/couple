<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8" />
    <title>couple</title> 
    <meta name="keywords" content="couple." />
    <meta name="description" content="can we be couple." />
    <link rel="stylesheet" href="resources/css/bootstrap.css">
    <link rel="stylesheet" href="resources/css/public/style.css">
    <link rel="stylesheet" href="resources/css/font-awesome.css">
</head>
<body>
<div class="container container-site">
<!-- head -->
<jsp:include page="./jsp/head.jsp" />
<div style="height: 40px;"></div>
    <div style="margin: 10px 20px 20px 20px; min-height: 300px;">
        <div id="message_div"></div>
    <div class="hero-unit" style="margin: 30px 0 50px 0;">
    
    <div width="400" style="float: right; border: 1px solid #ddd; position:relative; top: -23px;" >用户列表</div>
    
    <h1><i class="fa fa-home fa-fw"></i>couple</h1>
    <p><i class="fa fa-camera-retro fa-lg"></i> fa-camera-retro</p>
    <p style="margin-top: 100px;">
        <a class="btn btn-success btn-large" href="faceword" target="_blank">颜文字</a>
    </p>
    <ul>
     <i class="fa fa-spinner fa-spin"></i>
     <i class="fa fa-refresh fa-spin"></i>
     <i class="fa fa-cog fa-spin"></i>
    </ul>
    </div>
</div>
<div class="span11 footer">
<a href="https://twitter.com/sddtc_" target="_blank">@sddtc</a>
</div>
</div>
    <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="resources/js/bootstrap.js"></script>
</body>
</html>
