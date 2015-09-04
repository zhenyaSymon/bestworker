 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Worker-Log-IN</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700|Archivo+Narrow:400,700" rel="stylesheet" type="text/css">
<link href="css/base.css" rel="stylesheet" type="text/css" media="all" />

</head>
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
			<li ><a href="#" accesskey="1" title="">Homepage</a></li>
			<li class="active"><a><label for="cabinet">Private page</label></a></li>
			<li><a href="Find-page.jsp" accesskey="3" title="">Find page</a></li>
			<li><a><label for="logout">Log-out</label></a></li>
			
				<%
		}
		if((sessa!=null)&& (sess==null)){
			%>
			<li ><a href="#" accesskey="1" title="">Homepage</a></li>
			<li class="active"><a href="Find-page.jsp" accesskey="3" title="">Find page</a></li>
			<li><a><label for="logout">Log-out</label></a></li>
			<%
		}
		if((sess==null) && (sessa==null)){
			%>
			<li ><a href="#" accesskey="1" title="">Homepage</a></li>
			<li><a href="Choose-reg.jsp" accesskey="2" title="">Registration</a></li>
			<li class="active"><a href="Find-page.jsp" accesskey="3" title="">Find page</a></li>
			<li><a href="Choose-login.jsp" accesskey="4" title="">Log-in</a></li>	
		<%
		}
		%>

			
		</ul>
	</div>
</div>
<div id="page2" class="container">
<c:forEach var="row" items="${rows}">
	<div id="head">
	
		<div id="photo">
		 
<img src="<c:out value="${row.photo}"/>" width="180" height="240" alt="" />
		</div>
		 
		<div id="Data">
		<table>
		<tr>
		<td class="type">Full name :</td><td id="Dan"><c:out value="${row.name}"/>   <c:out value="${row.surname}"/> </td>
		</tr>
		<tr>
		<td class="type">Age : </td><td id="Dan"><c:out value="${row.ageworker}"/></td>
		</tr>
		<tr>
		<td class="type">Specialization : </td><td id="Dan"><c:out value="${row.specialization}"/></td>
		</tr>
		</table>
		</div>
		
	</div>
	
	<div id="story">
		<p>Short information :</p>
	<p  id="exp" style="font-size: 20px;" >	<c:out value="${row.story}"/></p>
		</div>
		</c:forEach>
		
<%
if((sess!=null) && (sessa==null))
{
%>
<p>The quantity of companies which interested in you :</p>
<%
}
if((sessa!=null)&& (sess==null)){
	
%>
<c:out value="${row.login}"/>
<c:out value="${ida}"/>
<c:forEach var="row" items="${rows}">
<form name="Addinvet" method="POST" action="BaseServlet" > 
<input type="hidden" name="command" value ="addinvent"/>
<input type="hidden" name="login" value="${row.login}">
<input type="hidden" name="logina" value ="${loginA}">
<input type="submit" value="LIKE" > 
</form>
</c:forEach>

<%

}
if((sessa==null)&& (sess==null)){
}


%>			
		
		
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