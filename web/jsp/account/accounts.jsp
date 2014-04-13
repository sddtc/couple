<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${currUser.nick_name}的帐号</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/public/style.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/account.css" />
</head>
<body>
<jsp:include page="../head.jsp" />
<div class="account_content">
个人资料：<br />
	<form action="update" method="post">
		<table>
			<tbody>
				<tr>
					<td>名号：</td>
					<td><input type="text" value="${currUser.nick_name}"
						name="nick_name" /></td>
				</tr>
				<tr>
					<td>我的域名:</td>
					<td>
						${currUser.id}
					</td>
				</tr>
				<tr>
					<td>头像:</td>
					<td>
					<img alt="small_icon" src="#" style="margin:10px;float:left">
					<img alt="big_icon" src="${icon_big}" style="margin:10px;float:left">
					<a href="user_icon" style="margin:10px;float:left">更新</a>
					</td>
				</tr>
				<tr>
				<td>登陆邮箱:</td>
				<td>xxx@gmail.com</td>
				</tr>
				<tr>
					<td>${result}</td>
					<td><input type="hidden" value="${currUser.id}" name="id" /></td>
				</tr>
				<tr>
					<td><input type="submit" /></td>
				</tr>
			</tbody>
		</table>
	</form>
</div>

<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-latest.js"></script>
</body>
</html>