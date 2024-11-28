<%@ page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
   <h1>Help Help Help Help</h1>
   
   <!-- This is a dynamically generated Data -->
    <% 
      /* String name = (String) request.getAttribute("name");
      Integer num = (Integer) request.getAttribute("number");
      LocalDateTime time = (LocalDateTime) request.getAttribute("time"); */
    %>
    
    <h1>Name is: 
                <%-- <%=name%> --%>
                ${name}
    </h1>
    
    <h1>Number is: 
                  <%-- <%=num%> --%>
                  ${number}
    </h1>
    
    <h1>Date and time is: 
                         <%-- <%=time.toString()%> --%>
                         ${time}
    </h1>
    <hr>
    
    <%-- ${random} --%>
    <c:forEach var="item" items="${random}">
        <%-- <h1>${item}</h1> --%>
        <h1><c:out value="${item}"></c:out></h1>
    </c:forEach>
    
</body>
</html>