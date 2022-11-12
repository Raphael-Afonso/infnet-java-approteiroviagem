<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/jsp/header.jsp" />
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Autenticação</title>
</head>
<body>
	<div class="container mt-3">
		<div class="container">
			<h2>Autenticação</h2>
			<form action="" method="post">
				<div class="form-group">
					<label>E-mail:</label>
					<input type="email" class="form-control" placeholder="Entre com o e-mail" name="email">
				</div>
				<div class="form-group">
					<label>Senha:</label>
					<input type="password" class="form-control" placeholder="Entre com a senha" name="senha">
				</div>
				<button type="submit" class="btn btn-default">Acessar</button>
			</form>
		</div>
	</div>

</body>
</html>