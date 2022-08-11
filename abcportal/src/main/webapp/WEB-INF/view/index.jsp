<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"> -->
<%-- <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet"> --%>
<link href="css/style.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>ABC Jobs Community Portal</title>
</head>
<body>
	<header
		class="container-fluid d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
		<h2>
			<a href="/" class="text-dark text-decoration-none">ABC
				Jobs</a>
		</h2>
		<div class="col-md-3 text-end">
			<button type="button" onclick="window.location.href='login';"
				class="btn me-2 rounded btn1">Login</button>
			<button type="button"
				onclick="window.location.href='register';"
				class="btn btn2">Sign-up</button>
		</div>
	</header>
	<div class="container mb-4">
<!-- 	<p>This is the Main Landing page || <a href="admin/viewuser">Admin Page</a>
	|| <a href="homepage">Home page user</a></p> -->
		<div class="d-flex">
			<div class="me-auto mt-5">
				<p class="display-2 p-index-head">Collaborate with other programmer</p>
				<p class="p-index-body">Communication will be much easier for programmer to share their mind through ABC Jobs community portal.</p>
			</div>
			<img width="680" alt="index-img1" src="img/index-img1.jpg">
		</div>
		<div class="d-flex">
			<img width="680" alt="index-img2" src="img/index-img2.jpg">
			<div class="me-auto mt-5">
				<p class="display-2 p-index-head">Connect to become partner</p>
				<p class="p-index-body">Let's broader our connection with people around the world and become an expert at your field.</p>
			</div>
		</div>
	</div>

	<%@ include file="footer.jsp"%>

</body>
</html>