<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Search Result</title>
</head>
<body>
	<%@ include file="header2.jsp"%>
	
	<div class="container mb-4" style="height: 500px">
		<p class = "display-5">${msgsearchResult}</p>
		<table class="table">
			<tr>
				<th>Name</th>
				<th>Email</th>
				<th>Country</th>
				<th>City</th>
				<th>Company</th>
				<th>Action</th>
			</tr>
			<c:forEach var="user" items="${userlist}">
				<tr>
					<td>${user.firstName} ${user.lastName}</td>
					<td>${user.email}</td>
					<td>${user.country}</td>
					<td>${user.city}</td>
					<td>${user.company}</td>
					<td><a href="seeprofile/${user.userID}">See profile</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
	<%@ include file="footer.jsp"%>
	
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>
</html>