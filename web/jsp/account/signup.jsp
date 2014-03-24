<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8" />
    <title>注册 - couple</title> 
    <meta name="keywords" content="couple" />
    <meta name="description" content="can we be couple." />
    <link rel="stylesheet" href="../../resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../resources/css/public/style.css">
    <link rel="stylesheet" href="../../resources/css/account.css" />
    <script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="../../resources/js/bootstrap.min.js"></script>
</head>

<body id="">
<div class="container container-site">
<jsp:include page="../head.jsp" />
<div style="height: 40px;"></div>
    <div style="margin: 10px 20px 20px 20px; min-height: 300px;">
    <div id="message_div"></div>
<div id="signup_container" class="">
    <div id="signup_header">
        <div id="login_div"><a href="${pageContext.request.contextPath}/account/login/">登 陆</a></div>
        <h1>注 册</h1>
    </div>
    
    <form id="signup_form" method="post" class="app_form">
        <fieldset>
            <input name="nick_name" maxlength="30" placeholder="User Name" type="text" class="span5" id="nick_name" />
            <input id="email" type="text" placeholder="Email" class="span5" name="email" />
            <input id="password1" type="password" placeholder="Password" class="span5" name="password1" />
            <input id="password2" type="password" placeholder="Confirm Password" class="span5" name="password2" />
        </fieldset>
        <p class="grey-text">
            By clicking "Sign Up", you are indicating that you have read and agree to the <a href="/tos">Terms of Service</a> and <a href="/privacy">Privacy Policy</a>.
        </p>
        <div class="actions">
            <button type="submit" class="btn btn-success btn-large">
                注 册
            </button>
        </div>
    </form>
</div>
</div>

<div class="span11 footer">
<p style="padding-left: 30px;">
<a href="https://twitter.com/sddtc_" class="twitter-follow-button" data-show-count="false">Follow @sddtc_</a>
<a href="https://twitter.com/share" class="twitter-share-button" data-text="Couple: web editor." data-url="http://prouis.com" data-counturl="http://prouis.com">Tweet</a>
<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0];if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src="//platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);}}(document,"script","twitter-wjs");</script>
</p>
<a href="https://twitter.com/sddtc_" target="_blank">@sddtc</a>
</div>
</div>

<script type="text/javascript">
</script>
</body>
</html>