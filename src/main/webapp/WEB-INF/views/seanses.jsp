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
<link href="<c:url value="/resource/css/calendar.css" />"
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
			</a> <a href="<c:url value="/movies"></c:url>">
				<div class="col-md-4 col-sm-4 col-lg-4" id="rowMenu3">

					<p>
						<spring:message code="welcome.rowMenu.movies" />
					</p>

				</div>
			</a>

		</div>
</section>
		<section class="container" style="margin-bottom: 50px">

			<div class="month">
				<ul>
					<li class="prevMonth">❮</li>
					<li class="nextMonth">❯</li>
					<li style="text-align: center" id="calMonth">
					</li>
				</ul>
			</div>

			<ul class="weekdays">
				<li>Poniedziałek</li>
				<li>Wtorek</li>
				<li>Środa</li>
				<li>Czwartek</li>
				<li>Piątek</li>
				<li>Sobota</li>
				<li>Niedziela</li>
			</ul>

			<ul class="days" onclick="addCalendarLi()">
			<!-- 	<li>1</li>
				<li>2</li>
				<li>3</li>
				<li>4</li>
				<li>5</li>
				<li>6</li>
				<li>7</li>
				<li>8</li>
				<li>9</li>
				<li><span class="active">10</span></li>
				<li>11</li>
				<li>12</li>
				<li>13</li>
				<li>14</li>
				<li>15</li>
				<li>16</li>
				<li>17</li>
				<li>18</li>
				<li>19</li>
				<li>20</li>
				<li>21</li>
				<li>22</li>
				<li>23</li>
				<li>24</li>
				<li>25</li>
				<li>26</li>
				<li>27</li>
				<li>28</li>
				<li>29</li>
				<li>30</li>
				<li>31</li> -->
			</ul>


		



	</section>

	<section class="container">
	
		<div class="rows">

			<c:forEach items="${seanses}" var="seanse">
				<div class="col-md-12 col-sm-12 col-lg-12" id="movieDiv"
					style="padding-bottom: 15px;width:90">
					<div class="rows">
						<div class="col-md-12 col-sm-12 col-lg-12" style="padding-bottom:50px">
							<p>Rodzaj seansu: ${seanse.type }</p>
			
							<br />
							<p>Cena: ${seanse.price }</p>
							<p>Data: ${seanse.date }</p>
							<p>Godzina: ${seanse.time }</p>
							<p>Tytuł filmu: ${seanse.movie.polishTitle }</p>
							<div style="font-size: 20px">
													
								<p style="font-size:32px">Język: ${seanse.languageSpoken }</p>

							</div>
						</div>
					</div>
				</div>
			</c:forEach>

		</div>
	
	</section>


</body>
</html>