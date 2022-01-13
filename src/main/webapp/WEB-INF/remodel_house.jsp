<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Remodel House </title>
</head>
<body>
	<div class="main">
		<div class="container1">
				<h3>rate $17-$34 perSqft</h3>
				<h3>2540-2700sqft</h3>
				<h1>$43,180 - $91,800</h1>
			
			<form:form action='/new/create' method='POST' modelAttribute="proj" class="mt-3">
			
		    <div class="form-floating mb-3">
		    	<form:input  type="number" placeholder="rate" class="form-control" path="rate" />
				<form:label class="form-label" path="rate">Rate:</form:label >
		    	<form:errors class="text-danger" path="rate"/>
		    </div>
		    
		    <div class="form-floating mb-3">
		    	<form:input type="number" placeholder="sqaurefoot" class="form-control" path='squarefoot' />
				<form:label class="form-label" path="squarefoot">Squarefoot: </form:label >
		    	<form:errors class="text-danger" path="squarefoot"/>	
		    </div>
		    
		    <div class="form-floating mb-3">
		    	<form:input type="text" placeholder="add" class="form-control" path='add' />
				<form:label class="form-label" path="add">Additional Customization </form:label >
		    	<form:errors class="text-danger" path="add"/>	
		    </div>
		    
		     <div class="form-floating mb-3">
		    	<form:input type="number" placeholder="total" class="form-control" path='total' />
				<form:label class="form-label" path="total">Total: </form:label >
		    	<form:errors class="total" path="total"/>	
		    </div>
		    
		    <div class="form-floating mb-3">
		    	<form:input type="text" placeholder="email" class="form-control" path='email' />
				<form:label class="form-label" path="email">Email </form:label >
		    	<form:errors class="text-danger" path="email"/>	
		    </div>
		  
	    	<input class="btn btn-secondary" type='submit' value='Submit Project' >
		</form:form> 
	
		</div>
	</div>
</body>
</html>