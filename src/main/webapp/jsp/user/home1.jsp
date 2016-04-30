<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${currUser.nick_name}</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/public/style.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/account.css" />
</head>
<body>
<jsp:include page="../head.jsp" />

<div id="board" style="margin-top: 50px;">
<h2>留言版</h2>
<form id="bdform">
<textarea name="bd_text" style="width:97%;height:50px;margin-bottom: 5px"></textarea>
<input type="submit" value="留言" />
</form>
</div>
<script src="//code.jquery.com/jquery-latest.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
<script type="text/javascript">
$("#bdform").submit(function() {
	var url = "comment/add";
	$.ajax({
		type : "POST",
		url : url,
		data : $("#bdform").serialize(),
		success : function(data) {
			alert(data);
		}
	});
	return false;
});
</script>
</body>
</html>