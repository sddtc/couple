<%@page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<title>登陆 - couple</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/public/style.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/account.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/font-awesome.css">
</head>
<body id="">
<div class="container container-site">
<jsp:include page="../head.jsp" />
		<div style="height: 40px;"></div>
		<div style="margin: 10px 20px 20px 20px; min-height: 300px;">
			<div id="message_div"></div>
			<div id="signup_container" class="">
				<div id="signup_header">
					<div id="login_div">
						<a href="${pageContext.request.contextPath}/account/login/">登陆</a>
					</div>
					<h1>注 册</h1>
				</div>
				<form id="signup_form" method="post" class="app_form" onsubmit="return validate(this)">
					<fieldset>
						<input id="email" type="text" placeholder="Email" class="span5" name="login_id" />
					</fieldset>
					<p class="grey-text">
					input your email and get valid url
					</p>
					<div class="actions">
						<button type="submit" class="btn btn-success btn-large">
							发送验证邮件到邮箱</button>
					</div>
				</form>
			</div>
		</div>

		<div class="span11 footer">
			<p style="padding-left: 30px;">
				<a href="https://twitter.com/sddtc_" class="twitter-follow-button"
					data-show-count="false">Follow @sddtc_</a> <a
					href="https://twitter.com/share" class="twitter-share-button"
					data-text="Couple: web editor." data-url="http://prouis.com"
					data-counturl="http://prouis.com">Tweet</a>
				<script>
					!function(d, s, id) {
						var js, fjs = d.getElementsByTagName(s)[0];
						if (!d.getElementById(id)) {
							js = d.createElement(s);
							js.id = id;
							js.src = "//platform.twitter.com/widgets.js";
							fjs.parentNode.insertBefore(js, fjs);
						}
					}(document, "script", "twitter-wjs");
				</script>
			</p>
			<a href="https://twitter.com/sddtc_" target="_blank">@sddtc</a>
		</div>
	</div>

	<script type="text/javascript">
		function validate(form) {
			with (form) {
				if (validate_required(login_id, "Email must be filled out!") == false) {
					login_id.focus();
					return false;
				}
			}
		}
		function validate_required(field, alerttxt) {
			with (field) {
				if (value == null || value == "") {
					alert(alerttxt);
					return false;
				} else {
					return true;
				}
			}
		}
	</script>
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
    <script src="//code.jquery.com/jquery-latest.js"></script>
</body>
</html>