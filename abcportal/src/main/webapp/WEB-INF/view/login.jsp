<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"> -->
<link href="css/style.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Login</title>
</head>
<body>
	<%@ include file="header1.jsp"%>
	<h1 class="d-flex justify-content-center mb-5">Login</h1>

	<div class="container" style="height: 500px">
	<div class="d-flex flex-wrap align-items-center justify-content-center bg-light mx-auto pt-3 pb-5 mb-5 rounded" style="width: 50%">
		<form:form method="post" class="col-8" id="loginForm" modelAttribute="loginDto"
		action="check">
		<div class="mb-3 text-center">
			<h5>Welcome Back to ABC Jobs</h5>
			<p>Doesn't have an account? <a style="color: blue;" href="register">Sign Up</a></p>
		</div>
		<div class="mb-3">
			<span class="err-msg">${response}</span>
		</div>
	    <div class="mb-3">
	        <form:label class="form-label" for="inputEmail" path="emailId">Email</form:label>
	        <form:input type="text" class="form-control" path="emailId" name="email" id="email"/>
	    </div>
	    <div class="mb-3">
	        <form:label class="form-label" for="inputPassword" path="password">Password</form:label>
	        <form:input type="password" class="form-control" path="password" name="pass" id="pass"/>
	    </div>
	    <div class="mb-3">
	    	<a href="forgotPassword"><span style="color: blue;">Forgot password</span></a>
	    </div>
	    <form:button type="submit" class="btn btn-primary" id="login" name="login">Login</form:button>
		</form:form>
	</div>
	</div>

	<%@ include file="footer.jsp"%>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.17.0/dist/jquery.validate.js"></script>
<script type="text/javascript" src="script/login.js"></script>
</body>
</html>