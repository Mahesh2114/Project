<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/delete" method="post">

        <div>
			<label>Customer Id</label><input type="text" name="cid">
		</div>
		<div>
			<button type="submit">Delete</button>
		</div>
		<a href="home">Home</a>
</form>
</body>
</html>