<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:forEach items="${cust }" var="customer">
         Customer Id : ${customer.cid }
   	<br> Customer Name: ${customer.name }
   	<br> Customer Type: ${customer.type }
	<br> Phone No: ${customer.phone }
	
	<br> Customer Address:
	<br> Street:${customer.street }
	<br>  City : ${customer.city }
	<br>  State :${customer.state }
	<br>  Country : ${customer.country }
	<br>  Created By:${customer.created_by }
	<br>  Created On:${customer.created_on }
	<br>  Modified By:${customer.modified_by }
	<br>  Modified On${customer.modified_on }
	<br>
	</c:forEach>
	<a href = "search">Search Customer</a>
	<a href="home">Home Page</a>
</body>
</html>