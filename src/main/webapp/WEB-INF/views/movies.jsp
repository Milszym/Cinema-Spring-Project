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
<title>Filmy Chino</title>

</head>
<body style="background-color: #18446b;">

	<section>
		<!-- onmouseover="alert('Czesc')"-->
		<div class="jumbotron" id="mainHeader">
			<p class="headingger" style="font-size: 72px">
				<spring:message code="movies.mainHeading" />
			</p>

		</div>

	</section>

	<section class="container">

		<div class="rows">

			<a href="<c:url value="/"></c:url>">
				<div class="col-md-4 col-sm-4 col-lg-4" id="rowMenu1">

					<p>
						<spring:message code="welcome.rowMenu.welcomePage" />
					</p>

				</div>
			</a> <a href="<c:url value="/welcome/test"></c:url>">
				<div class="col-md-4 col-sm-4 col-lg-4" id="rowMenu2">

					<p>
						<spring:message code="welcome.rowMenu.tickets" />
					</p>

				</div>
			</a> <a href="<c:url value="/welcome/test"></c:url>">
				<div class="col-md-4 col-sm-4 col-lg-4" id="rowMenu3">

					<p>
						<spring:message code="welcome.rowMenu.seanses" />
					</p>

				</div>
			</a>

		</div>


		<div class="rows">

			<c:forEach items="${movies}" var="movie">
				<div class="col-md-6 col-sm-6 col-lg-6" id="movieDiv"
					style="padding-bottom: 15px">
					<div class="rows">
						<div class="col-md-6 col-sm-6 col-lg-6" style="padding-bottom:50px">
							<img src="<c:url value="/resource/images/${movie.polishTitle}.jpg"></c:url>" width="350px" height="500px">
						</div>
						<div class="col-md-6 col-sm-6 col-lg-6" style="align:center; text-align:center">
							<br />
							<p>${movie.polishTitle }</p>
							<div style="font-size: 20px">
								<br />							
								<p style="font-style: italic">${movie.englishTitle }</p>
								<p>Gatunek: ${movie.genre }</p>
								<p>Reżyser: ${movie.director }</p>
								<p>Rok produkcji: ${movie.productionYear }</p>
								<p>Kraj produkcji: ${movie.productionCountry }</p>
								<p>Długość: ${movie.length }</p>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>

		</div>





	</section>


</body>
</html>