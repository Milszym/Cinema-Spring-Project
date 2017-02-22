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

$(document).ready(function() {
	var img = document.getElementById('balloonPng');
	$("#demo2").hide();
	$("#balloonPng").hide();

	$("#mainHeader").mouseover(function() {
		$("#demo2").fadeIn();
	});

	$('#mainHeader').mouseleave(function() {
		$("#demo2").fadeOut();
	});

/*	$("#balloonButton").click(function() {
		$("#balloonPng").fadeIn();
		$("#balloonPng").animate({
			left : (window.screen.availWidth / 2),
			height : '+=10px',
			width : '+=10px'

		});
		img = document.getElementById('balloonPng');
		if (img.clientWidth > 150) {
				$("#balloonPng").animate({
					left : (window.screen.availWidth*3),
					height : '+=2000px',
					width : '+=2000px'
			});

		}
		
	});*/
});