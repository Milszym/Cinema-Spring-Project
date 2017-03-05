<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
			</a> <a href="<c:url value="/seanses"></c:url>">
				<div class="col-md-4 col-sm-4 col-lg-4" id="rowMenu3">

					<p>
						<spring:message code="welcome.rowMenu.seanses" />
					</p>

				</div>
			</a>

		</div>

		<c:if test="${exactMovie == 0}">
			<div class="rows">

				<c:forEach items="${movies}" var="movie">
					<div class="col-md-12 col-sm-12 col-lg-12" id="movieDiv"
						style="padding-bottom: 15px; width: 90">
						<div class="rows">
							<div class="col-md-6 col-sm-6 col-lg-6"
								style="padding-bottom: 50px">
								<img
									src="<c:url value="/resource/images/${movie.polishTitle}.jpg"></c:url>"
									width="350px" height="500px">
							</div>
							<div class="col-md-6 col-sm-6 col-lg-6"
								style="align: center; text-align: center">
								<br />
								<p>${movie.polishTitle }</p>
								<div style="font-size: 20px">

									<p style="font-size: 32px">${movie.englishTitle }</p>
									<br /> <br />
									<p>Gatunek: ${movie.genre }</p>
									<p>Reżyser: ${movie.director }</p>
									<p>Rok produkcji: ${movie.productionYear }</p>
									<p>Kraj produkcji: ${movie.productionCountry }</p>
									<p>Długość: ${movie.length }</p>
									
									<c:if test="${moviesAdmin ==1 }">
										<form:form action="" modelAttribute="movieAdmin"
											class="form-horizontal" enctype="form-data">
											<form:input type="hidden" path="englishTitle" name="englishTitle" value="${movie.englishTitle }" /> 
											<form:input id="genre" path="genre" type="hidden" class="form:input-large" value="${movie.genre }" />
											<form:input id="polishTitle" path="polishTitle" type="hidden" class="form:input-large" value="${movie.polishTitle }" />
											<form:input id="length" path="length" type="hidden" class="form:input-large" value="${movie.length }" />
											<form:input id="director" path="director" type="hidden" class="form:input-large" value="${movie.director }" />
											<form:input id="productionYear" path="productionYear" type="hidden" class="form:input-large" value="${movie.productionYear }" />
											<form:input id="productionCountry" path="productionCountry" type="hidden" class="form:input-large" value="${movie.productionCountry }" />
											<input type="submit" id="btnAdd" class="btn btn-primary" value="<spring:message code="movie.adminMovie" />"/>
										</form:form>
									</c:if>
									
								</div>
							</div>
						</div>
					</div>
				</c:forEach>

			</div>

		</c:if>

		<c:if test="${exactMovie == 1}">

			<div class="col-md-12 col-sm-12 col-lg-12" id="movieDiv"
				style="padding-bottom: 15px; width: 90">
				<div class="rows">
					<div class="col-md-6 col-sm-6 col-lg-6"
						style="padding-bottom: 50px">
						<img
							src="<c:url value="/resource/images/${movie.polishTitle}.jpg"></c:url>"
							width="350px" height="500px">
					</div>
					<div class="col-md-6 col-sm-6 col-lg-6"
						style="align: center; text-align: center">
						<br />
						<p>${movie.polishTitle }</p>
						<div style="font-size: 20px">

							<p style="font-size: 32px">${movie.englishTitle }</p>
							<br /> <br />
							<p>Gatunek: ${movie.genre }</p>
							<p>Reżyser: ${movie.director }</p>
							<p>Rok produkcji: ${movie.productionYear }</p>
							<p>Kraj produkcji: ${movie.productionCountry }</p>
							<p>Długość: ${movie.length }</p>
						</div>
					</div>
				</div>
			</div>

		</c:if>



	</section>


</body>
</html>