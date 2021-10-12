<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Pagina Inicio Cliente</title>
	<link rel="stylesheet" type="text/css" href="style.css">
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
	<h1>Sistema Cliente</h1>
	<div id="header">
		<ul class="nav">
			<li><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
			<li><a>Clientes</a>
				<ul>
					<li><a href="${pageContext.request.contextPath}/AgregarCliente.jsp">Agregar Cliente</a></li>
					<li><a href="${pageContext.request.contextPath}/VerDetalleCliente">Ver Cliente</a></li>
					<li><a href="${pageContext.request.contextPath}/ListadoClientes">Listar Clientes</a></li>
					<li><a href="${pageContext.request.contextPath}/EditarCliente">Editar Cliente</a></li>
					<li><a href="${pageContext.request.contextPath}/EliminarCliente">Eliminar Cliente</a></li>
				</ul>
			</li>
		</ul>
	</div>
</body>
</html>