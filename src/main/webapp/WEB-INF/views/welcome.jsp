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
<body>

	<section>
		<div class="jumbotron" id="mainHeader">
			<p class="headingger" style="font-size: 72px">
				<spring:message code="welcome.mainHeading" />
			</p>
			<br />

			<p class="headingSmaller" id="demo2">
				<spring:message code="welcome.description" />
			</p>
		</div>

	</section>

	<section class="container">

		<div class="rows">
			<a href="<c:url value="/movies"></c:url>">
				<div class="col-md-4 col-sm-4 col-lg-4" id="rowMenu1">

						<p>
							<spring:message code="welcome.rowMenu.movies" />
						</p>

				</div>
			</a> <a href="<c:url value="/tickets"></c:url>">
				<div class="col-md-4 col-sm-4 col-lg-4" id="rowMenu2">

						<p>
							<spring:message code="welcome.rowMenu.tickets" />
						</p>
					
				</div>
			</a> <a href="<c:url value="/seanses"></c:url>">
				<div class="col-md-4 col-sm-4 col-lg-4" id="rowMenu3">
					
						<p>
							<spring:message code="welcome.rowMenu.seanses" />
						</p>
					
				</div>
			</a>
		</div>

		




	</section>


</body>
</html>