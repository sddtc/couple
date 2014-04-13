<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${currUser.nick_name}的帐号-上传头像</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/public/style.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/account.css" />
</head>
<body>
	<jsp:include page="../head.jsp" />
	<div class="account_content">
		<form action="uploadIcon" method="post" enctype="multipart/form-data">
			<table>
				<tbody>
					<tr>
						<td><img alt="icon_big" src="${icon_big}"></td>
					</tr>
					<tr>
						<td><input type="file" name="file" /></td>
						<td><input type="submit" value="更新" /></td>
					</tr>
					<tr>
						<td>${result}</td>
						<td><input type="hidden" value="${currUser.id}" name="id" /></td>
					</tr>
					<tr>
						<td><input type="submit" value="保存小头像" /></td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>

	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
	<script src="//code.jquery.com/jquery-latest.js"></script>
</body>
</html>