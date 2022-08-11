<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Forgot Password</title>
</head>
<body>

	<%@ include file="header1.jsp"%>
	
	<h1 class="d-flex justify-content-center mb-5">Send Your Email</h1>
	
	<div class="container" style="height: 500px">
	<div class="d-flex flex-wrap align-items-center justify-content-center bg-light mx-auto pt-3 pb-5 mb-5 rounded" style="width: 50%">
		<form method="post" class="col-8" id="sendMail" action="sendEmail">
		<div class="mb-3">
			<span class="err-msg">${error}</span>
		</div>
		<div class="mb-3">
			<span class="fst-italic">${msg}</span>
		</div>
		<div class="mb-3">
			<p>Please enter your email address to get a verification email</p>
		</div>
	    <div class="mb-3">
	        <label class="form-label" for="inputEmail">Email</label>
	        <input type="text" class="form-control" name="email" id="email"/>
	    </div>
	    <button type="submit" class="btn btn-primary" id="send" name="send">Send</button>
		</form>
	</div>
	</div>
	
</body>
</html>