<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"> -->
<link href="css/style.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Page not found</title>
</head>
<body>
	<%@ include file="header1.jsp"%>
	<div class="container mb-5">
		<h2 class="d-flex justify-content-center mt-1">OOPS! PAGE NOT BE FOUND</h2>
		<img class="mx-auto d-block" width="360" alt="green-check" src="img/error404.png">
		<div class="d-flex flex-column align-items-center justify-content-center bg-light mx-auto py-4 rounded"
			style="width: 50%">
			<p>Sorry your request page could not be found</p>
			<span class="fst-italic">${msg}</span>
			<button class="btn btn-primary" onclick="window.location.href='/homepage';">Back to homepage</button>
		</div>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>