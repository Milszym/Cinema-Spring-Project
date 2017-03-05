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
<title>Zakup biletów</title>

</head>
<body>

	<section>
		<!-- onmouseover="alert('Czesc')"-->
		<div class="jumbotron" id="mainHeader">
			<p class="headingger" style="font-size: 72px">
				<spring:message code="tickets.mainHeading" />
			</p>
			<br />

			<p class="headingSmaller" id="demo2">
				<spring:message code="tickets.description" />
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
			</a> <a href="<c:url value="/"></c:url>">
				<div class="col-md-4 col-sm-4 col-lg-4" id="rowMenu2">

					<p>
						<spring:message code="welcome.rowMenu.home" />
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

		<div class="rows">


			<div class="col-md-12 col-sm-12 col-lg-12" id="movieDiv"
				style="padding-bottom: 15px; width: 90;background-color: #00225b;">
				<div class="rows">
					<div class="col-md-12 col-sm-12 col-lg-12"
						style="padding-bottom: 50px">
						<c:if test="${isSeanse == 0}">
							<spring:message code="tickets.noSeanseChosen" />
							<br /><br/>
							<a href="<spring:url value="/seanses"></spring:url>"><button
									class="btn btn-success" type="button" style="font-size:35px; padding:25px">
									<spring:message code="tickets.buttonSeanses" />
								</button></a>
						</c:if>
					</div>
				</div>
			</div>


		</div>




	</section>


</body>
</html>