<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li><a href="produite">Page1</a>
		<li><a href="clients">page2</a>
		<li><a href="fournisseurs">page3</a>
	</ul>
	<p>Bienvenue</p>
	<h3>
		<%   
String attribut = (String) request.getAttribute("category");             
out.println( attribut );  
%>
	</h3>
	<h3>
		<%   
String attribut1 = (String) request.getAttribute("Local");             
out.println( attribut1 );  
%>
	</h3>
	<h3>
		<%   
String attribut2 = (String) request.getAttribute("Pc");             
out.println( attribut2 );  
%>
	</h3>
</body>
</html>