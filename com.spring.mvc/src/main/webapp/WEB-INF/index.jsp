<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parvaiz sajad</title>
</head>
<body>
<h1>This is the test heading of mvc</h1>
<%String name=(String)request.getAttribute("name"); 
List<String> friends=(List<String>)request.getAttribute("f");
for(String s:friends){
%>
<h1><%=s %></h1>

<%} %>
<h1>Name:<%= name %></h1>
</body>
</html>