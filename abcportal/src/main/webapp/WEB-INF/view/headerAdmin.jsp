<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="bg-prpl sticky-top">
		<header
			class="container d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
			<h2>
				<a href="${pageContext.request.contextPath}/admin/dashboard" class="logo text-decoration-none">ABC
					Jobs</a>
			</h2>
			<div class="dropdown text-end">
				<a role="button" class="d-block link-dark text-decoration-none dropdown-toggle h4"
					id="dropdownAdmin" data-bs-toggle="dropdown" aria-expanded="false">
					Admin
				</a>
				<ul class="dropdown-menu text-small" aria-labelledby="dropdownAdmin">
					<li><a class="dropdown-item" href="adprofile">Profile</a></li>
					<li><hr class="dropdown-divider"></li>
					<li><a class="dropdown-item" href="${pageContext.request.contextPath}/logout">Sign out</a></li>
				</ul>
			</div>
		</header>
	</div>

</body>
</html>