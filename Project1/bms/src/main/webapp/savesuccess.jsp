<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Saved Successfully
	     Customer Id : ${customer.cid }
   	<br> Customer Name: ${customer.name }
   	<br> Customer Type: ${customer.type }
   	<br> Phone: ${customer.phone}
	<br> Street :${customer.street }
	<br> City :${customer.city }
	<br> State: ${customer.state }
	<br> Country: ${customer.country }
    <br> Created by: ${customer.created_by }
    <br> Created on:${customer.created_on }
	<br>
	<a href = "save">Add New Customer</a>
	<a href="home">Home Page</a>
</body>
</html>