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
<link rel="stylesheet" href="/css/style.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<title>Facelift Sizes</title>
</head>
<body>
	<div class="main">
		<div class="container">
			<!-- <a href="/facelift/single">Single Room</a>
			<a href="/facelift/multi">Multiple Room</a>
			<a href="/facelift/house">House</a> -->
			<div class="single-room-div">
				<h2>Single Room</h2>
				<div>
					<h3>Pricing:</h3>
					<ul>
						<li>$15 - $30 per sqft</li>
						<li>120 - 150 sqft</li>
						<li>$1,800 - $4,500</li>
					</ul>
				</div>
				<button>Learn More</button>
			</div>
			
			<div class="multi-room-div">
				<h2>Multiple Room</h2>
				<div>
					<h3>Pricing:</h3>
					<ul>
						<li>$15 - $30 per sqft</li>
						<li>1270 - 1500 sqft</li>
						<li>$19,050 - $45,000</li>
					</ul>
				</div>
				<button>Learn More</button>
			</div>
			
			<div class="house-room-div">
				<h2>House</h2>
				<div>
					<h3>Pricing:</h3>
					<ul>
						<li>$15 - $30 per sqft</li>
						<li>2540 - 2700 sqft</li>
						<li>$38,100 - $81,000</li>
					</ul>
				</div>
				<button>Learn More</button>
			</div>
		</div>
	</div>
</body>
</html>