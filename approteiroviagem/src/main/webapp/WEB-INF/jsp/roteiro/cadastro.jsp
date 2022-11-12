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
<title>Cadastramento de Roteiros</title>
</head>
<body>
	<div class="container mt-3">

		<h2>Roteiro</h2>
		<form action="/roteiro/incluir" method="post">
			<div class="form-group">
				<label>Descricao:</label> <input type="text" class="form-control"
					placeholder="Entre com a descrição" name="descricao">
			</div>
			<div class="form-group">
				<label>Data:</label> <input type="datetime-local"
					class="form-control" placeholder="Entre com a data" name="data">
			</div>
			<div class="form-group">
				<label>Tipo:</label>
				<div class="form-check">
					<input type="radio" class="form-check-input" name="internacional"
						value="false"> Nacional <label class="form-check-label"></label>
				</div>
				<div class="form-check">
					<input type="radio" class="form-check-input" name="internacional"
						value="true"> Internacional <label
						class="form-check-label"></label>
				</div>
			</div>

			<div class="form-group">
				<label>Turistas:</label> <select name="turista"
					class="form-control">
					<c:forEach var="turista" items="${turistas}">
						<option value="${turista.id}">${turista.nome}</option>
					</c:forEach>
				</select>
			</div>

			<div class="form-group">
				<label>Serviços:</label>
				<c:forEach var="servico" items="${servicos}">
					<div class="form-check">
						<input class="form-check-input" type="checkbox" name="servicos"
							value="${servico.id}"> <label class="form-check-label">
							${servico.nome}</label>
					</div>
				</c:forEach>
			</div>

			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>

	</div>
</body>
</html>