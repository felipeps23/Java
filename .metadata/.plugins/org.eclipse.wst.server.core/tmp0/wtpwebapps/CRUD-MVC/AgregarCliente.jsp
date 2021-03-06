<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Agregar Cliente</title>
	<link rel="stylesheet" type="text/css" href="style.css">
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
	<div id="header">
		<ul class="nav">
			<li><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
			<li><a>Clientes</a>
				<ul>
					<li><a href="${pageContext.request.contextPath}/AgregarCliente">Agregar Cliente</a></li>
					<li><a href="${pageContext.request.contextPath}/VerDetalleCliente">Ver Cliente</a></li>
					<li><a href="${pageContext.request.contextPath}/ListadoClientes">Listar Clientes</a></li>
					<li><a href="${pageContext.request.contextPath}/EditarCliente">Editar Cliente</a></li>
					<li><a href="${pageContext.request.contextPath}/EliminarCliente">Eliminar Cliente</a></li>
				</ul>
			</li>
		</ul>
	</div>
	<br>
	<c:if test="${ccmensaje != null }">
		<h3><c:out value="${ccmensaje}"></c:out></h3>
	</c:if>
	<br><br>
	<h2>Agregar Cliente</h2>
	<form action="AgregarCliente" method="post">
		<label>Nombre:</label>
		<input type="text" name="nombre"><br>
		<label>Telefono:</label>
		<input type="text" name="telefono"><br>
		<label>Email:</label>
		<input type="text" name="email"><br>
		<label>Rubro:</label>
		<input type="text" name="rubro"><br>
		<label>Direccion:</label>
		<input type="text" name="direccion"><br>
		<input type="submit" value="AgregarCliente"><br>
	</form>
</body>
</html>