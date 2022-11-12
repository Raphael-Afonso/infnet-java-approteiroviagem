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
<title>Cadastramento de usuarios</title>
</head>
<body>
	<div class="container mt-3">
		<div class="container">
			<form action="/cep" method="post">
				<div class="form-group">
					<label>Cep:</label> <input type="text" class="form-control"
						placeholder="Entre com o cep" name="cep">
				</div>
				<button type="submit" class="btn btn-default">Cadastrar</button>
			</form>

			<h2>Usuário</h2>
			<form action="/usuario/incluir" method="post">
				<div class="form-group">
					<label>Nome:</label> <input type="text" class="form-control"
						placeholder="Entre com o nome" name="nome">
				</div>
				<div class="form-group">
					<label>Email:</label> <input type="email" class="form-control"
						placeholder="Entre com o e-mail" name="email">
				</div>
				<div class="form-group">
					<label>Senha:</label> <input type="password" class="form-control"
						placeholder="Entre com a senha" name="senha">
				</div>

				<c:import url="/WEB-INF/jsp/endereco.jsp" />

				<button type="submit" class="btn btn-default">Cadastrar</button>
			</form>
		</div>
	</div>

</body>
</html>