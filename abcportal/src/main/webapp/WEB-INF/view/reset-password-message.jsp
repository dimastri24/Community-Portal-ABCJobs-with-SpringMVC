<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Reset Password</title>
</head>
<body>
	
	<%@ include file="header1.jsp"%>
	<div class="container mb-5">
		<h2 class="d-flex justify-content-center mt-1">${title}</h2>
		<div class="d-flex flex-column align-items-center justify-content-center bg-light mx-auto py-4 rounded"
			style="width: 50%">
			<p>${error}</p>
			<p>${msg}</p>
			<p>Please click <span style="text-decoration: underline;">Go back</span> below to do a login</p>
			<button class="btn btn-primary" onclick="window.location.href='login';">Go back</button>
		</div>
	</div>
	<%@ include file="footer.jsp"%>
	
</body>
</html>