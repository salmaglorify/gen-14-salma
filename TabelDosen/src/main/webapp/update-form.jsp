

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored = "false" %>
<html>
<head>
<title>Tabel Dosen</title>
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
				<a href="<%=request.getContextPath()%>/list" class="navbar-brand"> Tabel Dosen </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Dosen</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${dosen != null}">
					<form action="update" method="post"></form>
				</c:if>
				<c:if test="${dosen == null}">
					<form action="insert" method="post"></form>
				</c:if>

				
					<h2>
						<c:if test="${dosen != null}">
            				Edit Dosen
            			</c:if>
						<c:if test="${dosen == null}">
            				Tambah Dosen
            			</c:if>
					</h2>
				

				<c:if test="${dosen != null}">
					<input type="hidden" name="id" value="<c:out value='${dosen.id}' />" />
				</c:if>
						
				<fieldset class="form-group">
					<label>Kode Dosen</label> <input type="number"
						value="<c:out value='${dosen.id}' />" class="form-control" readonly
						name="id" required="required"/>
						
				</fieldset>

				<fieldset class="form-group">
					<label>Nama Dosen</label> <input type="text"
						value="<c:out value='${dosen.nama}' />"  class="form-control"
						name="nama" required="required">
				</fieldset>

				<button type="submit" class="btn btn-success">Simpan</button>
				 
			</div>
		</div>
	</div>
</body>
</html>