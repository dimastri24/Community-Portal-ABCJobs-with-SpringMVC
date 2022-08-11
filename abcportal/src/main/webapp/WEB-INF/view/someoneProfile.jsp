<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="../css/style.css" rel="stylesheet">
<link href="../css/bootstrap.min.css" rel="stylesheet">
<title>Profile</title>
</head>
<body>
	<%@ include file="header2.jsp"%>

	<%-- <c:forEach var="user" items="${user}"> --%>
	<div class="container py-3" style="height: 600px">
		<div class="row">
			<div class="col-lg-4">
				<div class="card mb-4 bg-crm">
					<div class="card-body text-center">
						<img
							src="https://www.pinclipart.com/picdir/big/181-1814767_person-svg-png-icon-free-download-profile-icon.png"
							alt="avatar" class="rounded-circle img-fluid"
							style="width: 150px;">
						<h5 class="my-3">${user.firstName} ${user.lastName}</h5>
						<p class="text-muted mb-1">${user.company}</p>
					</div>
				</div>
			</div>
			<div class="col-lg-8">
				<div class="card mb-4">
					<div class="card-body bg-crm">
						<div class="row">
							<div class="col-sm-3">
								<p class="mb-0">Email</p>
							</div>
							<div class="col-sm-9">
								<p class="text-muted mb-0">${user.email}</p>
							</div>
						</div>
						<hr>
						<div class="row">
							<div class="col-sm-3">
								<p class="mb-0">Phone</p>
							</div>
							<div class="col-sm-9">
								<p class="text-muted mb-0">${user.phone}</p>
							</div>
						</div>
						<hr>
						<div class="row">
							<div class="col-sm-3">
								<p class="mb-0">Location</p>
							</div>
							<div class="col-sm-9">
								<p class="text-muted mb-0">${user.city}, ${user.country}</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
<%-- 	</c:forEach> --%>
	
	<%@ include file="footer.jsp"%>
	
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>
</html>