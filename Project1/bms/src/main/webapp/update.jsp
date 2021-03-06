<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function populate(s1,s2){
	var s1 = document.getElementById(s1);
	var s2 = document.getElementById(s2);
	s2.innerHTML = "";
	
		
	if(s1.value == "India"){
		
		var optionArray =[
			<c:forEach items="${indiaList}" var="state" varStatus="status">  
		    '${ state.state_Name}'
		    <c:if test="${!status.last}">    
		      ,    
		    </c:if>  
		    </c:forEach>  
		];
	} else if(s1.value == "USA"){
		var optionArray =[
			<c:forEach items="${usaList}" var="state" varStatus="status">  
		    '${ state.state_Name}'
		    <c:if test="${!status.last}">    
		      ,    
		    </c:if>  
		    </c:forEach>  
		];
	} 
	
	
	for(var option in optionArray){
		var pair = optionArray[option];
		var newOption = document.createElement("option");
		newOption.value = pair;
		newOption.innerHTML = pair;
		s2.options.add(newOption);
	}
}
</script>
</head>
<body>
	<form action="/update" method="post">

		<div>
			<label>Customer Id</label><input type="text" name="cid">
		</div>
		<div>
			<label>Customer Name</label><input type="text" name="name">
		</div>
		<div>
			<label for="type">Customer Type</label> <select name="type" id="type">
				<option value="select">Select</option>
				<option value="cheap">Cheap Customer</option>
				<option value="educated">Educated Customer</option>
				<option value="driven">Driven Customer</option>
			</select>
		</div>
		<div>
			<label>Phone No</label><input type="text" name="phone">
		</div>
		<div>
			<label>Customer Address :</label><br> <label>Street</label><input
				type="text" name="street"> <br>
		</div>
		<div>
			<label>City</label><input type="text" name="city">
		</div>
		<div>

			<label>Country: </label> <select id="country" name="country"
				class="company" onchange="populate(this.id,'state')">
				<option>Select</option>

				<c:forEach var="listValue" items="${countryList}">

					<option>${listValue.countryName}</option>

					<br>
				</c:forEach>
			</select>
		</div>

		<div>
			<label>State :</label><select id="state" name="state">
			</select>
		</div>
		<br>
		<div>
			<label>Modified By</label><input type="text" name="modified_by">
		</div>
		<button type="submit">Update</button>
		</div><br>
		<a href="home">Home</a>
	</form>
</body>
</html>