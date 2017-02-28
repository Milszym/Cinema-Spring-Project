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

function addCalendarLi(){
	var container = document.getElementById(".days");
	
	for (var i = 0; i < 31; i++) {
	   container.innerHTML += '<a href="/seanses/'+i+'"><li>'+i+'</li></a>';
	}
}

$(document).ready(function() {
		
	var txt;
	for(var i=0;i<31;i++){
		
		txt = '<a href="/cinema/seanses/'+i+'"><li>'+i+'</li></a>';
		$(".days").append(txt);
		
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