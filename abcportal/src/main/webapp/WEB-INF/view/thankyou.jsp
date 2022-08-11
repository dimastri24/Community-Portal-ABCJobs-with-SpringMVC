<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"> -->
<link href="css/style.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Thank You</title>
</head>
<body>
	<%@ include file="header1.jsp"%>
	<div class="container mb-5">
		<h2 class="d-flex justify-content-center mt-1">Registration Complete</h2>
		<img class="mx-auto d-block" width="360" alt="green-check" src="img/green-check.png">
		<div class="d-flex flex-column align-items-center justify-content-center bg-light mx-auto py-4 rounded"
			style="width: 50%">
			<p>Thank you ${firstName} for join us.</p>
			<span class="fst-italic">${msg}</span>
			<span class="err-msg">${error}</span>
			<p>Please click <span style="text-decoration: underline;">Go back</span> below to do a login</p>
			<button class="btn btn-primary" onclick="window.location.href='${pageContext.request.contextPath}/';">Go back</button>
		</div>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>