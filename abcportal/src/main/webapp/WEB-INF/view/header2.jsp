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
			class=" container d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
			<h2 class="col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
				<a href="${pageContext.request.contextPath}/homepage" class="text-decoration-none logo">ABC
					Jobs</a>
			</h2>
			
			<!-- search -->
			<form action="search" method="get"
				class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3 d-flex">
				<input type="text" class="form-control me-2" placeholder="Search..."
					aria-label="Search" name="searchValue" id="searchValue">
				<button class="btn btn-outline-dark h-6" type="submit">Search</button>
			</form>

			<div class="dropdown text-end">
				<a role="button"
					class="d-block link-dark text-decoration-none dropdown-toggle"
					id="dropdownUser" data-bs-toggle="dropdown" aria-expanded="false">
					<img src="https://www.pinclipart.com/picdir/big/181-1814767_person-svg-png-icon-free-download-profile-icon.png" alt="mdo" width="32"
					height="32" class="rounded-circle">
				</a>
				<ul class="dropdown-menu text-small" aria-labelledby="dropdownUser">
					<li><a class="dropdown-item" href="profile">Profile</a></li>
					<li><hr class="dropdown-divider"></li>
					<li><a class="dropdown-item" href="${pageContext.request.contextPath}/logout">Sign out</a></li>
				</ul>
			</div>
		</header>
	</div>
	
</body>
</html>