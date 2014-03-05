<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8" />
    <title>Signup - Couple</title> 
    <meta name="keywords" content="couple" />
    <meta name="description" content="can we be couple." />
    <!-- HTML5 shim, for IE6-8 support of HTML elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <link rel="stylesheet" href="http://markable.in/site_media/static/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="http://markable.in/site_media/static/css/style.css">
    <link rel="stylesheet" href="http://markable.in/site_media/static/account/css/account.css" />
    
    <script src="http://markable.in/site_media/static/js/jquery-1.7.1.min.1.js"></script>
    <script src="resources/js/bootstrap.min.js"></script>
</head>

<body id="">
<div class="container container-site">
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <a class="brand" href="/couple" style="font-size:20px;">Couple
                <span style="font-size: 12px; margin-left: 0px; font-weight: bold;">c</span>
            </a>
            <ul class="nav">
                <li class="dropdown">
                    <a href="#"
                      class="dropdown-toggle"
                      data-toggle="dropdown">
                        Help <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="http://markable.in/file/fa30c686-9dc0-11e1-8ea2-984be164924a/" target="_blank">FAQ</a></li>
                        <li><a href="http://markable.in/file/aa191728-9dc7-11e1-91c7-984be164924a/" target="_blank">Markdown Syntax Cheat Sheet</a></li>
                        <li class="divider"></li>
                        <li><a href="javascript:UserVoice.showPopupWidget();">Support</a></li>
                    </ul>
                </li>
            </ul>
            <ul class="nav pull-right">
                <li>
                    <a href="/account/login/" class="nav_item">Login</a>                    
                </li>
                <li><a href="/account/signup/" style="color: #6cb653;" class="nav_item">Signup</a></li>
            </ul>
        </div>
    </div>
</div>
<div style="height: 40px;"></div>
    <div style="margin: 10px 20px 20px 20px; min-height: 300px;">
    <div id="message_div"></div>

<div id="signup_container" class="">
    <div id="signup_header">
        <div id="login_div"><a href="/account/login/">Log In</a></div>
        <h1>Sign Up</h1>
    </div>
    
    <form id="signup_form" method="post" action="${pageContext.request.contextPath}/account/signup" class="app_form">
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
                Sign Up
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
<a href="/">Couple.</a>
|
<a href="#">FAQ</a>
|
<a href="mailto:changhbaga@gmail.com">Contact</a>
|
<a href="/sddtc">Terms</a>
|
<a href="/privacy">Privacy</a>
</div>
</div>
</body>
</html>