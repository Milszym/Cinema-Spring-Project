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

				<div  style="align:center; text-align:center;font-size:50px">

					<p>
						<spring:message code="add.user.label1" />
					</p>

				</div>
			</a>

		</div>

	</section>
		<section class="container" style="color: white">



			<form:form action="register" modelAttribute="newUser"
				class="form-horizontal" enctype="form-data">

			<form:errors path="*" cssClass="alert alert-danger" element="div" />
			
				<fieldset>

					<legend style="color: white">
						<spring:message code="add.user.label2" />
					</legend>



					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="username">
							<spring:message code="add.user.username" />
						</label>
						<div class="col-lg-10">
							<form:input id="username" path="username" type="text"
								class="form:input-large" style="color:black" />
							<form:errors path="username" cssClass="text-danger" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="password">
							<spring:message code="add.user.password" />
						</label>
						<div class="col-lg-10">
							<form:input id="password" path="password" type="text"
								class="form:input-large" style="color:black" />
							<form:errors path="password" cssClass="text-danger" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2"
							for="matchingPassword"> <spring:message
								code="add.user.matchingPassword" />
						</label>
						<div class="col-lg-10">
							<form:input id="matchingPassword" path="matchingPassword" type="text"
								class="form:input-large" style="color:black" />
							<form:errors path="matchingPassword" class="text-danger" />
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
	


</body>
</html>