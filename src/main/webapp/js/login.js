$(function() {
	$("ul").hide();
	$(".form-control.me-2").hide();
	$(".btn.btn-outline-success").hide();
	$("#login-btn").hide();
});

function toggleResetPswd(e) {
	e.preventDefault();
	$('#logreg-forms .form-signin').toggle() // display:block or none
	$('#logreg-forms .form-reset').toggle() // display:block or none
}

function toggleSignUp(e) {
	e.preventDefault();
	$('#logreg-forms .form-signin').toggle(); // display:block or none
	$('#logreg-forms .form-signup').toggle(); // display:block or none
}

$(() => {
	// Login Register Form
	$('#logreg-forms #forgot_pswd').click(toggleResetPswd);
	$('#logreg-forms #cancel_reset').click(toggleResetPswd);
	$('#logreg-forms #btn-signup').click(toggleSignUp);
	$('#logreg-forms #cancel_signup').click(toggleSignUp);
})

function clickNavHome() {
	location.replace('./');
}

function clickNavLogin() {
}

function clickSignUp() {
	$(".main").load("jsp/RegisterForm.jsp");
}
