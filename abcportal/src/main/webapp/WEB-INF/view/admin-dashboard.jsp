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
<title>User list</title>
</head>
<body>
	<%@ include file="headerAdmin.jsp"%>

	<div class="container mb-4">
		<button type="button" onclick="window.location.href='adduser';"
			class="btn btn-primary">Add User</button>
		<table class="table">
			<tr>
				<th>Id</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Email</th>
				<th>Password</th>
				<th>Country</th>
				<th>City</th>
				<th>Phone</th>
				<th>Company</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="user" items="${listuser}">
				<tr>
					<td>${user.userID}</td>
					<td>${user.firstName}</td>
					<td>${user.lastName}</td>
					<td>${user.email}</td>
					<td>${user.pass}</td>
					<td>${user.country}</td>
					<td>${user.city}</td>
					<td>${user.phone}</td>
					<td>${user.company}</td>
					<td><a href="edituser/${user.userID}">Edit</a></td>
					<td><a href="deleteuser/${user.userID}">Delete</a></td>
					<!-- <td><a type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">Delete</a></td> -->
				</tr>
<%-- 	<!-- Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
          </div>
          <div class="modal-body">
            Are you sure want to delete the user?
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
            <button type="button" class="btn btn-primary" onclick="window.location.href='deleteuser/${user.userID}';">Yes</button>
            <a href="deleteuser/${user.userID}" type="button" class="btn btn-primary">Delete</a>
          </div>
        </div>
      </div>
    </div> --%>
			</c:forEach>
		</table>
	</div>
	
	
	<%@ include file="footer.jsp"%>
	
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>
</html>