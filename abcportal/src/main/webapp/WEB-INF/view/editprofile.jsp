<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"> -->
<link href="../css/style.css" rel="stylesheet">
<link href="../css/bootstrap.min.css" rel="stylesheet">
<title>Edit Profile</title>
</head>
<body>
	<%@ include file="header2.jsp"%>
	
	<h1 class="d-flex justify-content-center mb-5">Edit Profile</h1>

	<div
		class="d-flex flex-wrap align-items-center justify-content-center mx-auto pt-3 pb-5 mb-5 rounded bg-crm"
		style="width: 50%">
		<form method="post" class="col-8" id="editProfile" action="../update">
		<%-- <c:forEach var="user" items="${listuser}"> --%>
			<div class="mb-3">
				<input class="form-control" value="${user.userID}"
					name="userID" id="userID" hidden="hidden"/>
			</div>
			<div class="mb-3">
				<label class="form-label" for="inputfname">First Name</label>
				<input type="text" class="form-control" value="${user.firstName}"
					name="firstName" id="firstName" />
			</div>
			<div class="mb-3">
				<label class="form-label" for="inputlname">Last Name</label>
				<input type="text" class="form-control" name="lastName" id="lastName" value="${user.lastName}"/>
			</div>
			<div class="mb-3">
				<label class="form-label" for="inputcountry">Country</label>
				<input type="text" class="form-control" name="country" id="country" value="${user.country}"/>
			</div>
			<div class="mb-3">
				<label class="form-label" for="inputcity">City</label>
				<input type="text" class="form-control" name="city" id="city" value="${user.city}"/>
			</div>
			<div class="mb-3">
				<label class="form-label" for="inputfname">Phone</label>
				<input type="text" class="form-control" name="phone" id="phone" value="${user.phone}"/>
			</div>
			<div class="mb-3">
				<label class="form-label" for="inputcompany">Company</label>
				<input type="text" class="form-control" name="company" id="company" value="${user.company}"/>
			</div>
			<button type="submit" class="btn btn-primary" id="update"
				name="update">Save</button>
		<%-- </c:forEach> --%>
		</form>
	</div>
	
	<%@ include file="footer.jsp"%>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>
</html>