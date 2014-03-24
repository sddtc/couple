<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${currUser.nick_name}的帐号</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/public/style.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/account.css" />
<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-latest.js"></script>
</head>
<body>
<jsp:include page="../head.jsp" />
<hr />

个人资料：<br />
<form action="update" method="post">
名号：<input type="text" value="${currUser.nick_name}" name="nick_name"/>
<input type="submit" />
</form>
</body>
</html>