<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>This is h1 heading</h1>
<h1>/home method</h1>
<h1>MVC Tut....</h1>

<br>

<% 
String s = (String)request.getAttribute("name");
Integer i = (Integer)request.getAttribute("id");
List<String> f = (List<String>)request.getAttribute("f");

%>

<h1> Name is <%=s %></h1>
<h1>Id is <%=i %></h1>

<% for(String ss : f){
	%>
	<h1><%=ss %></h1>
	
<%} %>

</body>
</html>