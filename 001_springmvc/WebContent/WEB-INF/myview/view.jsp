<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"></meta>
<title>Insert title here</title>
</head>
<body>
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th></tr>  
     <c:forEach var="employee" items="${list}"> 
   <tr>  
   <td>${employee.id}</td>  
   <td>${employee.name}</td>  
   <td>${employee.salary}</td>  
   <td>${employee.designation}</td>  
   </tr>  
   </c:forEach>  
   </table>  
</body>
</html>