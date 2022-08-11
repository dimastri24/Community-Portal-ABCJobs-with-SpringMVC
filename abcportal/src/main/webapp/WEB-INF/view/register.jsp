<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"> -->
<link href="css/style.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Registration</title>
</head>
<body>
	<%@ include file="header1.jsp"%>
	<h1 class="d-flex justify-content-center mb-5">Registration Form</h1>

	<div
		class="d-flex flex-wrap align-items-center justify-content-center bg-light mx-auto pt-3 pb-5 mb-5 rounded"
		style="width: 50%">
		<form:form method="post" class="col-8" id="regForm"
			modelAttribute="user" action="registerProcess">
			<div class="mb-3 text-center">
				<h5>Welcome to ABC Jobs</h5>
				<p>Already have an account? <a style="color: blue;" href="login">Sign In</a></p>
			</div>
			<div class="mb-3">
				<form:label class="form-label" for="inputfname" path="firstName">First Name</form:label>
				<form:input type="text" class="form-control" path="firstName"
					name="firstName" id="firstname" />
			</div>
			<div class="mb-3">
				<form:label class="form-label" for="inputlname" path="lastName">Last Name</form:label>
				<form:input type="text" class="form-control" path="lastName" name="lastname" id="lastName" />
			</div>
			<div class="mb-3">
				<form:label class="form-label" for="inputEmail" path="email">Email</form:label>
				<form:input type="text" class="form-control" path="email"
					name="email" id="email" />
				<span class="err-msg">${dupe}</span>
			</div>
			<div class="mb-3">
				<form:label class="form-label" for="inputPassword" path="pass">Password</form:label>
				<form:input type="password" class="form-control" path="pass"
					name="pass" id="password" />
			</div>
			<div class="mb-3">
				<label class="form-label" for="inputPassword2">Confirm Password</label>
				<input type="password" class="form-control"
					name="pass2" id="password2" />
			</div>
			<div class="mb-3">
				<form:label class="form-label" for="inputcountry" path="country">Country</form:label>
				<form:input type="text" class="form-control" path="country" name="country" id="country" />
			</div>
			<div class="mb-3">
				<form:label class="form-label" for="inputcity" path="city">City</form:label>
				<form:input type="text" class="form-control" path="city" name="city" id="city" />
			</div>
			<div class="mb-3">
				<form:label class="form-label" for="inputphone" path="phone">Phone</form:label>
				<form:input type="text" class="form-control" path="phone" name="phone" id="phone" />
			</div>
			<div class="mb-3">
				<form:label class="form-label" for="inputcompany" path="company">Company</form:label>
				<form:input type="text" class="form-control" path="company" name="company" id="company" />
			</div>
			<div class="mb-3">
				<form:input type="text" class="form-control" path="role" hidden="hidden" value="1"/>
			</div>
			<form:button type="submit" class="btn btn-primary" id="register"
				name="register">Register</form:button>
		</form:form>
	</div>
	
<%@ include file="footer.jsp"%>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.17.0/dist/jquery.validate.js"></script>
<script type="text/javascript" src="script/registration.js"></script>
</body>
</html>