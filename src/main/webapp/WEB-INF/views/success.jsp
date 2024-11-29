<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success!</title>
</head>
<body>
   
   <%-- <!-- First Way -->
   <h1>Hello, ${name} </h1>
   
   <h1>Your email is: ${email} </h1>
    
   <h1>Your password is: ${pass} <br> Please try to secure it!! </h1>
   
   <hr> --%>
   
   <!-- Second Way using Model Attribute -->
   <h3>${Header}</h3>
   
   <p>${Desc}</p>
   
   <h1>Hello, ${user.userName} </h1>
   
   <h1>Your email is: ${user.userEmail} </h1>
    
   <h1>Your password is: ${user.userPassword} <br> Please try to secure it!! </h1>
   
</body>
</html>