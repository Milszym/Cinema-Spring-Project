<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
		<!-- onmouseover="alert('Czesc')"-->
		<div class="jumbotron" id="mainHeader">
			<a href="<c:url value="/j_spring_security_logout" />"
				class="btn btn-danger btn-mini pull-right"><spring:message
					code="add.form.logout.label" /></a>
			<p class="headingger" style="font-size: 72px">
				<spring:message code="welcome.mainHeading" />
			</p>
			<br />

			<p class="headingSmaller" id="demo2">
				<spring:message code="welcome.description" />
			</p>
		</div>

	</section>
	<section class="container" style="color: white">

		<div class="rows">

			<a href="<c:url value="/add/seanse"></c:url>">
				<div class="col-md-4 col-sm-4 col-lg-4" id="rowMenu1">

					<p>
						<spring:message code="add.Seanse" />
					</p>

				</div>
			</a> <a href="<c:url value="/add/movie"></c:url>">
				<div class="col-md-4 col-sm-4 col-lg-4" id="rowMenu2">

					<p>
						<spring:message code="add.Movie" />
					</p>

				</div>
			</a>

		</div>

	</section>
	<c:if test="${whatToAdd == 'movie'}">
		<section class="container" style="color: white">



			<form:form action="movie" modelAttribute="newMovie"
				class="form-horizontal" enctype="form-data">


				<fieldset>

					<legend style="color: white">
						<spring:message code="addMovie.label" />
					</legend>



					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="englishTitle">
							<spring:message code="addMovie.englishTitle" />
						</label>
						<div class="col-lg-10">
							<form:input id="englishTitle" path="englishTitle" type="text"
								class="form:input-large" style="color:black" />

						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="polishTitle">
							<spring:message code="addMovie.polishTitle" />
						</label>
						<div class="col-lg-10">
							<form:input id="polishTitle" path="polishTitle" type="text"
								class="form:input-large" style="color:black" />

						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2"
							for="productionYear"> <spring:message
								code="addMovie.productionYear" />
						</label>
						<div class="col-lg-10">
							<form:input id="productionYear" path="productionYear" type="text"
								class="form:input-large" style="color:black" />

						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2"
							for="productionCountry"> <spring:message
								code="addMovie.productionCountry" />
						</label>
						<div class="col-lg-10">
							<form:input id="productionCountry" path="productionCountry"
								type="text" class="form:input-large" style="color:black" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="director">
							<spring:message code="addMovie.director" />
						</label>
						<div class="col-lg-10">
							<form:input id="director" path="director" type="text"
								class="form:input-large" style="color:black" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="length">
							<spring:message code="addMovie.length" />
						</label>
						<div class="col-lg-10">
							<form:input id="length" path="length" type="text"
								class="form:input-large" style="color:black" />
						</div>
					</div>


					<div class="form-group">
						<label class="control-label col-lg-2" for="genre"> <spring:message
								code="addMovie.genre" />
						</label>
						<div class="col-lg-10">
							<form:input type="text" class="form:input-large"
								style="color:black" id="genre" path="genre" />
						</div>
					</div>


					<div class="form-group">
						<div class="col-lg-offset-2 col-lg-10">
							<input type="submit" id="btnAdd" class="btn btn-primary"
								value="<spring:message code="add.Submit"/>" />
						</div>
					</div>

				</fieldset>

			</form:form>

		</section>
	</c:if>

	<c:if test="${whatToAdd == 'seanse'}">
		<section class="container" style="color: white">

			<spring:message code="addSeanse.addMovie" />
			<br /> <a href="<spring:url value="/movies/admin"></spring:url>"><button
					class="btn btn-success" type="button" style="font-size: 15px">
					<spring:message code="seanse.buttonMovies" />
				</button></a>
			<form:form action="seanse" modelAttribute="newSeanse"
				class="form-horizontal" enctype="form-data">

				<fieldset>

					<legend style="color: white">
						<spring:message code="addSeanse.label" />
					</legend>




					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="type">
							<spring:message code="addSeanse.type" />
						</label>
						<div class="col-lg-10">
							<form:input id="type" path="type" type="text"
								class="form:input-large" style="color:black" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="date">
							<spring:message code="addSeanse.date" />
						</label>
						<div class="col-lg-10">
							
							<form:input id="date" path="date" type="text" name="date"
								class="form:input-large" style="color:black" />
	
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2"
							for="productionCountry"> <spring:message
								code="addSeanse.time" />
						</label>
						<div class="col-lg-10">
							<form:input id="time" path="time" type="time"
								class="form:input-large" style="color:black" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2"
							for="languageSpoken"> <spring:message
								code="addSeanse.languageSpoken" />
						</label>
						<div class="col-lg-10">
							<form:input id="languageSpoken" path="languageSpoken" type="text"
								class="form:input-large" style="color:black" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="price">
							<spring:message code="addSeanse.price" />
						</label>
						<div class="col-lg-10">
							<form:input id="price" path="price" type="text"
								class="form:input-large" style="color:black" />
						</div>
					</div>
					${movieAdmin.englishTitle }
					<form:input type="hidden" path="movie.englishTitle"
						name="movie.englishTitle" value="${movieAdmin.englishTitle }" />
					<form:input type="hidden" path="movie.movieId" name="movie.movieId"
						value="${movieAdmin.movieId }" />
					<form:input type="hidden" path="movie.genre" name="movie.genre"
						value="${movieAdmin.genre }" />
					<form:input type="hidden" path="movie.polishTitle"
						name="movie.polishTitle" value="${movieAdmin.polishTitle }" />
					<form:input type="hidden" path="movie.productionYear"
						name="movie.productionYear" value="${movieAdmin.productionYear }" />
					<form:input type="hidden" path="movie.productionCountry"
						name="movie.productionCountry"
						value="${movieAdmin.productionCountry }" />
					<form:input type="hidden" path="movie.length" name="movie.length"
						value="${movieAdmin.length }" />
					<form:input type="hidden" path="movie.director"
						name="movie.director" value="${movieAdmin.director }" />

					<div class="form-group">
						<div class="col-lg-offset-2 col-lg-10">
							<input type="submit" id="btnAdd" class="btn btn-primary"
								value="<spring:message code="add.Submit"/>" />
						</div>
					</div>



				</fieldset>

			</form:form>

		</section>
	</c:if>
</body>
</html>