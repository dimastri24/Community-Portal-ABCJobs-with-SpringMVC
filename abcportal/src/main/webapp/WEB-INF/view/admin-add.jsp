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
<link href="../css/style.css" rel="stylesheet">
<link href="../css/bootstrap.min.css" rel="stylesheet">
<title>User Form</title>
</head>
<body>
<%@ include file="headerAdmin.jsp"%>
	
	<h1 class="d-flex justify-content-center mb-5">Administer User</h1>

	<div
		class="d-flex flex-wrap align-items-center justify-content-center bg-light mx-auto pt-3 pb-5 mb-5 rounded"
		style="width: 50%">
		<form:form method="post" class="col-8" id="admin-add"
			modelAttribute="user" action="save">
			<div class="mb-3">
				<form:hidden class="form-label" path="userID"/>
			</div>
			<div class="mb-3">
				<form:label class="form-label" for="inputfname" path="firstName">First Name</form:label>
				<form:input type="text" class="form-control" path="firstName"
					name="firstName" id="firstname" />
			</div>
			<div class="mb-3">
				<form:label class="form-label" for="inputfname" path="lastName">Last Name</form:label>
				<form:input type="text" class="form-control" path="lastName" name="lastname" id="lastName" />
			</div>
			<div class="mb-3">
				<form:label class="form-label" for="inputEmail" path="email">Email</form:label>
				<form:input type="text" class="form-control" path="email"
					name="email" id="email" />
			</div>
			<div class="mb-3">
				<form:label class="form-label" for="inputPassword" path="pass">Password</form:label>
				<form:input type="password" class="form-control" path="pass"
					name="pass" id="password" />
			</div>
			<div class="mb-3">
				<form:label class="form-label" for="inputfname" path="country">Country</form:label>
				<form:input type="text" class="form-control" path="country" name="country" id="country" />
			</div>
			<div class="mb-3">
				<form:label class="form-label" for="inputfname" path="city">City</form:label>
				<form:input type="text" class="form-control" path="city" name="city" id="city" />
			</div>
			<div class="mb-3">
				<form:label class="form-label" for="inputfname" path="phone">Phone</form:label>
				<form:input type="text" class="form-control" path="phone" name="phone" id="phone" />
			</div>
			<div class="mb-3">
				<form:label class="form-label" for="inputcompany" path="company">Company</form:label>
				<form:input type="text" class="form-control" path="company" name="company" id="company" />
			</div>
			<div class="mb-3">
				<label class="form-label">Role</label>
				<div class="form-check">
					<form:radiobutton class="form-check-input" path="role" value="1"
						name="flexRadioDefault" id="softwareprogrammer"/> 
					<label class="form-check-label" for="softwareprogrammer">Software Programmer</label>
				</div>
				<div class="form-check">
					<form:radiobutton class="form-check-input" path="role" value="2"
						name="flexRadioDefault" id="flexRadioDefault2"/> 
					<label class="form-check-label" for="flexRadioDefault2">Administrator</label>
				</div>
			</div>
			<form:button type="submit" class="btn btn-primary" id="save"
				name="save">Save</form:button>
		</form:form>
	</div>
	
	<%@ include file="footer.jsp"%>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>
</html>