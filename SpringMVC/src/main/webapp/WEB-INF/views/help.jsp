<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>

<%-- <%

String name = (String)request.getAttribute("name");
Integer roll = (Integer)request.getAttribute("roll");

%>
 --%>

<h1>My name is<%--  <%=name %> --%>
${name}
</h1>
<h1>Welcome to my tutorial....</h1>
<h1>My roll no.. is <%-- <%=roll %> --%>
${roll}
</h1>
</body>
</html>