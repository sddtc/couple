<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>faceword</title>
<link rel="stylesheet" href="resources/css/faceword.css" />
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="resources/js/faceword.js"></script>
</head>
<body>
<div id="container">
<div id="portfolio"></div>

<ul id="portfolio-item">
<c:forEach items="${facewords}" var="faceword">
<li><div title="快乐">${faceword.text}</div>
</c:forEach>
</ul>

<nav id="navigation">
<a href="#1" class="nav selected" data-page="1">1</a>
<c:forEach begin="2" end="${page}" var="i">
<a href="#${i}" class="nav" data-page="${i}">${i}</a>
</c:forEach>
</nav>
</div>
</body>
</html>