<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Updated Successfully
	     Customer Id: ${customer.cid }
   	<br> Name:${customer.name }
   	<br> Type:${customer.type }
	<br> Phone:${customer.phone }
	<br> Street${customer.street }
	<br> City: ${customer.city }
	<br> State: ${customer.state }
	<br> Country:${customer.country }
	<br> Modified By:${customer.modified_by }
	<br> Modified On${customer.modified_on }
	<a href = "update">Update Customer</a>
	<a href="home">Home Page</a>
</body>
</html>