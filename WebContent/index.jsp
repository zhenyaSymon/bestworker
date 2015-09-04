 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Main</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700|Archivo+Narrow:400,700" rel="stylesheet" type="text/css">
<link href="css/base.css" rel="stylesheet" type="text/css" media="all" />
<!--[if IE 6]>
<link href="default_ie6.css" rel="stylesheet" type="text/css" />
<![endif]-->
</head>
<body>
<div id="header" class="container">
	<div id="logo">
		<h1><a href="#">Bestworker</a></h1>
	</div>
	<%
String sess=(String)session.getAttribute("login");
String sessa=(String)session.getAttribute("loginA");
%>
	
	<div id="menu">
		<ul>
		<%
		if((sess!=null) && (sessa==null))
		{
	%>
			<li class="active"><a href="#" accesskey="1" title="">Homepage</a></li>
			<li><a><label for="cabinet">Private page</label></a></li>
			<li><a href="Find-page.jsp" accesskey="3" title="">Find page</a></li>
			<li><a><label for="logout">Log-out</label></a></li>
			
				<%
		}
		if((sessa!=null)&& (sess==null)){
			%>
			<li class="active"><a href="#" accesskey="1" title="">Homepage</a></li>
			<li><a href="Find-page.jsp" accesskey="3" title="">Find page</a></li>
			<li><a><label for="logout">Log-out</label></a></li>
			<c:out value="${id}"/>
			<%
		}
		if((sess==null) && (sessa==null)){
			%>
			<li class="active"><a href="#" accesskey="1" title="">Homepage</a></li>
			<li><a href="Choose-reg.jsp" accesskey="2" title="">Registration</a></li>
			<li><a href="Choose-login.jsp" accesskey="4" title="">Log-in</a></li>	
		<%
		}
		%>

		</ul>
	</div>
</div>

<div id="page" class="container">
	<div id="content">
		<div id="onecolumn">
			<p><img src="img/pic01.png" width="580" height="300" alt="" /></p>
			<h2>Welcome to our website!</h2>
			<p>Welcome to the Bestworker!This site is dedicated to finding employees in the company.Only high-quality staff and a very convenient filling does not make you suffer with finding employees!</p>
		</div>
	</div>
	<div id="sidebar">
		<div id="sbox2">
			<h2>Reviews</h2>
			<p class="testimonial">Bestworker its a top site for searching best-quality workers.A large number of employees of my company I found here.</p>
			<div class="author"><img src="img/pic03.jpg" width="80" height="80" alt="" /><span class="name">Juan Dela Cruz</span><span class="position">Company CEO</span><span>MyCompany, LLC</span></div>
		</div>
	</div>
</div>
<div id="footer" class="container">
<h2>Find us in social networks :</h2>
<p>${login }</p>


<ul class="style2">
			<li><a href="#"><img src="img/social03.png" width="32" height="32" alt="" /></a></li>
			<li><a href="#"><img src="img/social01.png" width="32" height="32" alt="" /></a></li>
			<li><a href="#"><img src="img/social04.png" width="32" height="32" alt="" /></a></li>
			<li><a href="#"><img src="img/social02.png" width="32" height="32" alt="" /></a></li>
		</ul>
</div>
<div id="copyright" class="container">
			<form method ="GET" name="logout" width="0" height="0" action="BaseServlet">
			 <input type="hidden" name="command" value ="logout"/> 
			<input type="submit" id="logout" style="display:none">
			</form>
			<form method ="GET" name="cabinet" width="0" height="0" action="BaseServlet">
			 <input type="hidden" name="command" value ="cabinet"/> 
			 <input type="hidden" name="login" value ="${login }"/> 
			<input type="submit" id="cabinet" style="display:none">
			</form>
	<p>Copyright (c) 2015 Bestworker.com. All rights reserved. Design by <a href="https://vk.com/id16634734">Yevhenii Symon</a>. Photos by Fotogrph</a>.</p>
</div>
</body>
</html>
