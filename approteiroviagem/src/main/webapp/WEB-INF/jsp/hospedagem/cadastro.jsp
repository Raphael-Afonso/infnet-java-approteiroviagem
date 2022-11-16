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
<title>Cadastramento de Hospedagens</title>
</head>
<body>
	<div class="container mt-3">

		<h2>Hospedagem</h2>
		<form action="/hospedagem/incluir" method="post">
			<div class="form-group">
				<label>Nome:</label> <input type="text" class="form-control"
					placeholder="Entre com o nome" name="nome">
			</div>
			<div class="form-group">
				<label>Fornecedor:</label> <input type="text" class="form-control"
					placeholder="Entre com o fornecedor" name="fornecedor">
			</div>
			<div class="form-group">
				<label>Valor:</label> <input type="number" class="form-control"
					placeholder="Entre com o valor" name="valor">
			</div>
			<div class="form-group">
				<label>Estrelas:</label> <input type="number" min=1 max=5 class="form-control"
					placeholder="Entre com as estrelas" name="estrelas">
			</div>
			<div class="form-group">
				<label>Total de quartos:</label> <input type="number" class="form-control"
					placeholder="Entre com o total de quartos" name="totalQuartos">
			</div>
			<div class="form-group">
				<label>Café da manhã incluso:</label>
				<div class="form-check">
					<input type="radio" class="form-check-input" name="cafeIncluso"
						value="true"> Sim <label class="form-check-label"></label>
				</div>
				<div class="form-check">
					<input type="radio" class="form-check-input" name="cafeIncluso"
						value="false"> Não <label
						class="form-check-label"></label>
				</div>
			</div>

			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>

	</div>
</body>
</html>