<%@page import="java.time.LocalDate"%>
<%@page import="java.time.LocalDateTime"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>about page</title>
</head>
<body>
<h1>Hi this is our about page</h1>

${name}
<br>
${roll_no}
<br>
${date}

<c:forEach var="item" items="${marks }">
<h1>${item }</h1>
</c:forEach>


<%-- <%String name=(String)request.getAttribute("name"); 
Integer roll_no=(Integer)request.getAttribute("roll_no");
LocalDateTime local= (LocalDateTime)request.getAttribute("date");

%>
<h1>Name is <%=name %></h1>
<h1> roll no : <%= roll_no %></h1>
<h1> Date is: <%= local %></h1>
< --%>
</body>
</html>