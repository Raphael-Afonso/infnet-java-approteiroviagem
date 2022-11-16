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
<title>Cadastramento de hospedagens</title>
</head>
<body>
	<div class="container mt-3">
		<h3>Hospedagens: ${listagem.size()}</h3>

		<h4>
			<a class="btn btn-success" href="/hospedagem">Cadastrar hospedagem</a>
		</h4>

		<div class="container">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Id</th>
						<th>Fornecedor</th>
						<th>Nome</th>
						<th>Valor</th>
						<th>Cafe Incluso</th>
						<th>Estrelas</th>
						<th>Total de quartos</th>
						<th>Usuario</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="hospedagem" items="${ listagem }">
						<tr>
							<td>${ hospedagem.getId() }</td>
							<td>${ hospedagem.getFornecedor() }</td>
							<td>${ hospedagem.getNome() }</td>
							<td>${ hospedagem.getValor() }</td>
							<td>${ hospedagem.isCafeIncluso() }</td>
							<td>${ hospedagem.getEstrelas() }</td>
							<td>${ hospedagem.getTotalQuartos() }</td>
							<td>${ hospedagem.getUsuario().getNome() }</td>
							<td><a class="btn btn-danger"
								href="/hospedagem/${ hospedagem.getId() }/excluir">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>