<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/resource/css/mystyle.css" />"
	rel="stylesheet">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script src="resource/js/welcomeScript.js"></script>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<link rel="shortcut icon" href="resource/images/balloon.png">
<title>Kino Chino</title>

</head>
<body style="background-color: #002d68">

	<section>
		<!-- onmouseover="alert('Czesc')"-->
		<div class="jumbotron" id="mainHeader"
			style="background-color: #001e44;">
			<p class="headingger" style="font-size: 72px">
				<spring:message code="welcome.mainHeading" />
			</p>
			<br />

			<p class="headingSmaller"
				style="font-size: 40px; display: none; text-align: center; position: absolute; margin-left: auto; margin-right: auto; top: 165px; left: 0; right: 0;"
				id="demo2">
				<spring:message code="welcome.description" />
			</p>
		</div>

	</section>

	<section class="container">

		<div class="rowsdas">

			<div style="text-align: center">
				<button type="button" class="btn btn-default" id="balloonButton">Show
					me what you got!</button>


				<form action="<c:url value="/welcome/test"></c:url>">
					<input type="submit" value="Test Hibernate!" class="btn btn-primary" style="color:white"/>
				</form>

				<!-- 				<br /> <br /> <img id="balloonPng"
					src="resource/images/balloon.png"
					style="text-align: center; height: 10%; width: 10%"></img> -->
			</div>

		</div>




	</section>


</body>
</html>