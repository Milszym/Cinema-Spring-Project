/**
 * 
 */

function changeSizeFunction() {
	document.getElementById('demo2').style.fontSize = "56px";
}
function showFunction() {
	document.getElementById('demo2').style.display = "block";
}
function hideFunction() {
	document.getElementById('demo2').style.display = "none";
}

function hideById(id) {
	document.getElementById(id).style.display = "none";
}

function showById(id) {
	document.getElementById(id).style.display = "block";
}


/*function addCalendarLi() {
	var container = document.getElementById(".days");

	for (var i = 0; i < 31; i++) {
		container.innerHTML += '<a href="/seanses/' + i + '"><li>' + i
				+ '</li></a>';
	}
}*/

var monthCounter=0;
$(document).ready(
		
		
		function() {

			var txt;
			var counter = 1;
			var d = new Date();
			d.setDate(1);
			var firstDay = d.getDay();
			d=new Date();
			
			var d2 = LastDayOfMonth(d.getFullYear(), d.getMonth()+1);
		    var lastDayOfMonth= d2.getDate();
			
		    var months = [ "Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", 
	               "Lipiec", "Sierpień", "Wrzesień", "Październik", "Listopad", "Grudzień" ];

		    var selectedMonthName = months[d2.getMonth()+monthCounter];
		    var txt2=selectedMonthName+'<br> <span style="font-size: 18px" id="calYear">'+d2.getFullYear()+'</span>';
		    $("#calMonth").append(txt2);
		    
		    for (var i = 0; i < 39; i++) {

				if (i < firstDay-1) {
					$(".days").append("<li> </li>");
				} else {
					while (counter <= lastDayOfMonth) {
						txt = '<a href="/cinema/seanses/' + counter + '"><li>'
								+ counter + '</li></a>';
						$(".days").append(txt);
						counter = counter + 1;
					}
				}
			}
		    
			
			$(".prevMonth").onclick(function(){
				monthCounter=monthCounter-1;
			})
			$(".nextMonth").onclick(function(){
				monthCounter=monthCounter+1;
			})

			function LastDayOfMonth(Year, Month) {
				return new Date((new Date(Year, Month, 1)) - 1);
			}

			var img = document.getElementById('balloonPng');
			$("#demo2").hide();
			$("#balloonPng").hide();
			$("#demo2").css({
				fontSize : 52
			});
			$("#mainHeader").mouseover(function() {
				$("#demo2").fadeIn();
			});

			$('#mainHeader').mouseleave(function() {
				$("#demo2").fadeOut();
			});

			$('#rowMenu1').hover(function() {
				$(this).stop().animate({
					fontSize : '62px'
				}, 200);
			}, function() {
				$(this).stop().animate({
					fontSize : '50px'
				}, 200);
			});

			$('#rowMenu2').hover(function() {
				$(this).stop().animate({
					fontSize : '62px'
				}, 200);
			}, function() {
				$(this).stop().animate({
					fontSize : '50px'
				}, 200);
			});

			$('#rowMenu3').hover(function() {
				$(this).stop().animate({
					fontSize : '62px'
				}, 200);
			}, function() {
				$(this).stop().animate({
					fontSize : '50px'
				}, 200);
			});

			$()

		});