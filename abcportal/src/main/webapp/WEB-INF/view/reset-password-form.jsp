<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Reset Password</title>
</head>
<body>

	<%@ include file="header1.jsp"%>
	
	<h1 class="d-flex justify-content-center mb-5">Reset Password</h1>
	
	<div class="container" style="height: 500px">
	<div class="d-flex flex-wrap align-items-center justify-content-center bg-light mx-auto pt-3 pb-5 mb-5 rounded" style="width: 50%">
		<form method="post" class="col-8" id="resetPass" action="savePassword">
		<div class="mb-3">
			<span class="err-msg">${error}</span>
		</div>
		<div class="mb-3">
			<span >${msg}</span>
		</div>
		<div class="mb-3">
			<p>Please enter your new password</p>
		</div>
		<div class="mb-3">
	        <input type="hidden" class="form-control" name="token" id="token" value="${token}"/>
	    </div>
	    <div class="mb-3">
	        <label class="form-label" for="pass1">Password</label>
	        <input type="text" class="form-control" name="pass1" id="pass1"/>
	    </div>
	   	<div class="mb-3">
	        <label class="form-label" for="pass2">Confirm Password</label>
	        <input type="text" class="form-control" name="pass2" id="pass2"/>
	    </div>
	    <button type="submit" class="btn btn-primary" id="save" name="save">Change Password</button>
		</form>
	</div>
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.17.0/dist/jquery.validate.js"></script>
<script type="text/javascript" src="script/resetpw.js"></script>
</body>
</html>