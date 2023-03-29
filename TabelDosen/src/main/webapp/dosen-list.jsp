<%@ page import="com.salma.web.model.Dosen"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data Dosen</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: grey">
			<div>
				<h1 class="navbar-brand">Tabel Dosen</h1>
			</div>
			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Dosen</a></li>
			</ul>

		</nav>
	</header>
	<br>

	<div class="row">

		<div class="container">
			<h3 class="text-center">Tabel Dosen</h3>
			<hr>
			<div class="container text-left">
				<a href="new" class="btn btn-success">Tambah Dosen</a>
			</div>
			<br>
			<table class="table table-bordered">
					<thead>
						<tr>
							<th>Kode Dosen</th>
							<th>Nama Dosen</th>
							<th>Actions</th>
						</tr>		
					</thead>
					<tbody>
						<c:forEach var="dosen" items="${daftarDosen}">
							<tr> 
								<td><c:out value="${dosen.id}" /></td>
								<td><c:out value="${dosen.nama}" /></td>
								<td>
									<a href="edit?id=<c:out value="${dosen.id}" />">Edit</a>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									
									<a href="delete?id=<c:out value="${dosen.id}" />" onclick="return confirm('Anda yakin mau menghapus data ini ?')">Delete</a>
									
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
</body>
</html>