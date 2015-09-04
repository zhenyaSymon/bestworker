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
			<li ><a href="index.jsp" accesskey="1" title="">Homepage</a></li>
			<li><a><label for="cabinet">Private page</label></a></li>
			<li class="active"><a href="#" accesskey="3" title="">Find page</a></li>
			<li><a><label for="logout">Log-out</label></a></li>
			<form method ="GET" name="cabinet" width="0" height="0" action="BaseServlet">
			 <input type="hidden" name="command" value ="cabinet"/> 
			 <input type="hidden" name="login" value ="${login }"/> 
			<input type="submit" id="cabinet" style="display:none">
			</form>
			
				<%
		}
		if((sessa!=null)&& (sess==null)){
			%>
			<li><a href="index.jsp" accesskey="1" title="">Homepage</a></li>
			<li class="active"><a href="#" accesskey="3" title="">Find page</a></li>
			<li><a><label for="logout">Log-out</label></a></li>
			<%
		}
		if((sess==null) && (sessa==null)){
			%>
			<li ><a href="#" accesskey="1" title="">Homepage</a></li>
			<li><a href="Choose-reg.jsp" accesskey="2" title="">Registration</a></li>
			<li class="active"><a href="#" accesskey="3" title="">Find page</a></li>
			<li><a href="Choose-login.jsp" accesskey="4" title="">Log-in</a></li>	
		<%
		}
		%>

		</ul>
	</div>
</div>

<div id="page" class="container">
	<div id="content">
	<c:forEach var="row" items="${rows}">
	<a class="a">
		<div id="onecolumn1">
		
	<table>
		<tr class="new">
		<td class="type1">Full name :</td><td id="Dan1"><c:out value="${row.name}"/>   <c:out value="${row.surname}"/> </td>
		</tr>
		<tr class="new">
		<td class="type1">Age : </td><td id="Dan1"><c:out value="${row.ageworker}"/></td>
		</tr>
		
		<tr class="new">
		<td class="type1">Specialization : </td><td id="Dan1"><c:out value="${row.specialization}"/></td>
		<td>
		<tr id="gavno">
		<form method ="GET" name="cabinet2" width="0" height="0" action="BaseServlet">
			 <input type="hidden" name="command" value ="cabinet"/>
			 <input type="hidden" name="login"  value="${row.login}"/>  
			<input id="gogo" type="submit"  value="Read more">
			</form></td>
		</tr>
		
		</tr>
		</table>
		</div>
		</a>
			
		
		</c:forEach>
	</div>
	<div id="sidebar">
		<div id="sbox2">
		<form name="WorkerSpecialization" method="POST" action="BaseServlet" > 
             <input type="hidden" name="command" value ="workerspecialization"/>
             <input  class="vvod" id="spec" placeholder="Specialization"  name="specialization"></br>
			<input id="butt" type="submit" value="Display" > 
		</form>
		
		<form name="Allworkers" method="POST" action="BaseServlet" > 
             <input type="hidden" name="command" value ="allworkers"/>
			<input id="butt" type="submit" value="Display all workers" > 
		</form>
	</div>
</div>
</div>
<div id="copyright" class="container">

			<form method ="GET" name="logout" width="0" height="0" action="BaseServlet">
			 <input type="hidden" name="command" value ="logout"/> 
			<input type="submit" id="logout" style="display:none">
			</form>
			
			
			
	<p>Copyright (c) 2015 Bestworker.com. All rights reserved. Design by <a href="https://vk.com/id16634734">Yevhenii Symon</a>. Photos by Fotogrph</a>.</p>
</div>
</body>
</html>