<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <title>注册 - couple</title> 
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/public/style.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/account.css" />
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-latest.js"></script>
</head>

<body id="">
<div class="container container-site">
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <a class="brand" href="/couple" style="font-size:20px;">couple
                <span style="font-size: 12px; margin-left: 0px; font-weight: bold;">[cp]</span>
            </a>
            <ul class="nav pull-right">
                <li class="dropdown">
                    <a href="#"
                      class="dropdown-toggle"
                      data-toggle="dropdown">
                        其它 <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="http://markable.in/file/fa30c686-9dc0-11e1-8ea2-984be164924a/" target="_blank">FAQ</a></li>
                        <li><a href="http://markable.in/file/aa191728-9dc7-11e1-91c7-984be164924a/" target="_blank">Markdown Syntax Cheat Sheet</a></li>
                        <li class="divider"></li>
                        <li><a href="javascript:UserVoice.showPopupWidget();">Support</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</div>
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
            <!-- <input name="nick_name" maxlength="30" placeholder="User Name" type="text" class="span5" id="nick_name" />
            <input id="password1" type="password" placeholder="Password" class="span5" name="password1" />
            <input id="password2" type="password" placeholder="Confirm Password" class="span5" name="password2" /> -->
            <input id="email" type="text" placeholder="Email" class="span5" name="login_id" />
        </fieldset>
        <p class="grey-text">
            By clicking "Sign Up", you are indicating that you have read and agree to the <a href="/tos">Terms of Service</a> and <a href="/privacy">Privacy Policy</a>.
        </p>
        <div class="actions">
            <button type="submit" class="btn btn-success btn-large">
                发送验证邮件到邮箱
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