<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Cadastramento de eventos</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Eventos: ${listagem.size()}</h3>
	</div>
	
	<div class="container">         
		<table class="table table-striped">
	    	<thead>
	    	<tr>
	    		<th>Id</th>
			    <th>Código</th>
			    <th>Nome</th>
			    <th>Valor</th>
			    <th>Duração</th>
			    <th>Horário</th>
			    <th>Local</th>
	    	</tr>
	    	</thead>
		  	<tbody>
	    		<c:forEach var="evento" items="${ listagem }">
			    	<tr>
			    		<td>${ evento.getId() }</td>
			      		<td>${ evento.getCodigo() }</td>
			        	<td>${ evento.getNome() }</td>
			        	<td>${ evento.getValor() }</td>
			        	<td>${ evento.getDuracao() }</td>
			        	<td>${ evento.getHorario() }</td>
			        	<td>${ evento.getLocal() }</td>
			        	<td>
			        		<a class="btn btn-danger" href="/evento/${ evento.getId() }/excluir">Excluir</a>
			        	</td>
			    	</tr>
	    		</c:forEach>
		    </tbody>
	  </table>
</div>
</body>
</html>