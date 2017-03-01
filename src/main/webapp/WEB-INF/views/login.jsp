<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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

		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Zaloguj się</h3>
					</div>
					<div class="panel-body">
						<c:if test="${not empty error }">
							<div class="alert alert-danger">
								<spring:message
									code="AbstractUserDetailsAuthenticationProvider.badCredentials" />
								<br />
							</div>
						</c:if>
						<form action="<c:url value="/j_spring_security_check"></c:url>"
							method="post">
							<fieldset>
								<div class="form-group">
									<input class="form-control" placeholder="Nazwa użytkownika"
										name='j_username' type="text">
								</div>
								<div class="form-group">
									<input class="form-control" placeholder="Hasło"
										name='j_password' type="password">
								</div>
								<input type="hidden" name="${_csrf.parameterName}"
									value="${_csrf.token}" /> <input
									class="btn btn-lg btn-success btn-bloc" type="submit"
									value="Zaloguj się">
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>



	</section>


</body>
</html>