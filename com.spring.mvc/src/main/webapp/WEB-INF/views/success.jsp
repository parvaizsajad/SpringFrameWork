<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>We page</title>
</head>
<body>

<h1 style="color: green"">${msg }</h1>
<h1 class="text-center" >${welcomeName }</h1>
      <h1 class="text-center" >${desc }</h1>
      <br>
<h1>hello user name: ${user.name }</h1>
<h1>Email : ${user.email }</h1>
<h1>Password: ${user.password }</h1>


</body>
</html>