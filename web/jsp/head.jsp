<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="navbar navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container">
			<a class="brand" href="/couple" style="font-size: 20px;">couple <span
				style="font-size: 12px; margin-left: 0px; font-weight: bold;">[cp]</span>
			</a>
			<ul class="nav">
				<li><a href="/editor/" class="nav_item">二次元CP</a></li>
				<li><a href="/pricing">三次元CP</a></li>
				<li><a href="/pricing">异地恋</a></li>
				<li><a href="/pricing">异国恋</a></li>
			</ul>
			<ul class="nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> 其它 <b class="caret"></b>
				</a>
					<ul class="dropdown-menu">
						<li><a href="" target="_blank">FAQ</a></li>
						<li><a href="" target="_blank">About</a></li>
						<li class="divider"></li>
						<li><a href="">Support</a></li>
					</ul></li>
			</ul>
			<ul class="nav pull-right">
				<c:choose>
					<c:when test="${currUser eq null}">
						<a href="account/login">注册</a>
					</c:when>
					<c:otherwise>
						<li><a href="accounts" class="nav_item">${currUser.nick_name}</a></li>
					</c:otherwise>
				</c:choose>
			</ul>
		</div>
	</div>
</div>