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
<title>Cadastramento de eventos</title>
</head>
<body>
	<div class="container mt-3">
		<h3>Eventos: ${listagem.size()}</h3>


		<h4>
			<a class="btn btn-success" href="/evento">Cadastrar evento</a>
		</h4>

		<div class="container">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Id</th>
						<th>Fornecedor</th>
						<th>Nome</th>
						<th>Valor</th>
						<th>Duração</th>
						<th>OpenBar</th>
						<th>Local</th>
						<th>Usuario</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="evento" items="${ listagem }">
						<tr>
							<td>${ evento.getId() }</td>
							<td>${ evento.getFornecedor() }</td>
							<td>${ evento.getNome() }</td>
							<td>${ evento.getValor() }</td>
							<td>${ evento.getDuracao() }</td>
							<td>${ evento.isOpenBar() }</td>
							<td>${ evento.getLocal() }</td>
							<td>${ evento.getUsuario().getNome() }</td>
							<td><a class="btn btn-danger"
								href="/evento/${ evento.getId() }/excluir">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>