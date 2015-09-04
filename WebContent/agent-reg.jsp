<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Agent-reg</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700|Archivo+Narrow:400,700" rel="stylesheet" type="text/css">
<link href="css/base1.css" rel="stylesheet" type="text/css" media="all" />
<!--[if IE 6]>
<link href="default_ie6.css" rel="stylesheet" type="text/css" />
<![endif]-->
</head>
</head>
<body>
<div id="header" class="container">
	<div id="logo">
		<h1><a href="#">Bestworker</a></h1>
	</div>
	<div id="menu">
		<ul>
			<li ><a href="index.jsp" accesskey="1" title="">Homepage</a></li>
			<li class="active"><a href="#" accesskey="2" title="">Registration</a></li>
			<li><a href="agent-login.jsp]" accesskey="4" title="">Log-IN</a></li>
		</ul>
	</div>
</div>
<div id="page2" class="container">
<p>We need some information about you :</p>
<form name="addAgentForm" method="POST" action="BaseServlet" > 
                    <input type="hidden" name="command" value ="addagent"/>
			<input class="vvod"  placeholder="Login" name="login"></br>
			<input class="vvod" placeholder="Password" type="password" name="password"></br>
			<input class="vvod"  placeholder="Firm Name" name="firmname"></br>
			<input id = "knopka" type="submit" value="Register" > 
		</form>
		<div id="copyright-long">
</div>
</div>
<div id="copyright" class="container">
	<p>Copyright (c) 2015 Bestworker.com. All rights reserved. Design by <a href="https://vk.com/id16634734">Yevhenii Symon</a>. Photos by Fotogrph</a>.</p>
</div>
</body>
</html>