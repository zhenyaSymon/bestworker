   <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
<%@page contentType="text/html" pageEncoding="UTF-8"%>
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Name       : Open Tools 
Description: A two-column, fixed-width design with dark color scheme.
Version    : 1.0
Released   : 20130803

-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Worker-reg</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700|Archivo+Narrow:400,700" rel="stylesheet" type="text/css">
<link href="css/base1.css" rel="stylesheet" type="text/css" media="all" />
<!--[if IE 6]>
<link href="default_ie6.css" rel="stylesheet" type="text/css" />
<![endif]-->
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
			<li><a href="#" accesskey="4" title="">Log-IN</a></li>
		</ul>
	</div>
</div>
<div id="page2" class="container">
<p>We need some information about you :</p>
<form name="addSWorkerForm" method="POST" action="BaseServlet" id="phone" class="registration-window"> 
                    <input type="hidden" name="command" value ="addworker"/>
			<input  class="vvod" placeholder="Login" name="login"></br>
			<input  class="vvod" placeholder="Password" type="password" name="password"></br>
			<input  class="vvod" placeholder="Name" name="name"></br>
			<input  class="vvod" placeholder="Surname" name="surname"></br>
			<input  class="vvod" placeholder="Specialization"  name="specialization"></br>
			<input  class="vvod" placeholder="Age" name="ageworker"></br>
			<input  class="vvod" placeholder="Photo" name="photo"></br>
			<p>Write a few words about your expirience  :</p>
			<textarea class="textarea1" rows=7" cols="70" name="story"></textarea></br>
			
			
			
			<input id="knopka" type="submit" value="Register" id="regbutton"> 
		</form>

		<div id="copyright-long">


</div>



	
</div>
<div id="copyright" class="container">
	<p>Copyright (c) 2015 Bestworker.com. All rights reserved. Design by <a href="https://vk.com/id16634734">Yevhenii Symon</a>. Photos by Fotogrph</a>.</p>
</div>
</body>
</html>
