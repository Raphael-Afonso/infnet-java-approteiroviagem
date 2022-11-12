<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastramento de hospedagens</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Hospedagens: ${listagem.size()}</h3>
	</div>
	
	<div class="container">         
		<table class="table table-striped">
	    	<thead>
	    	<tr>
	    		<th>Id</th>
			    <th>Fornecedor</th>
			    <th>Nome</th>
			    <th>Valor</th>
			    <th>Empresa</th>
			    <th>Estrelas</th>
			    <th>Total de quartos</th>
	    	</tr>
	    	</thead>
		  	<tbody>
	    		<c:forEach var="hospedagem" items="${ listagem }">
			    	<tr>
			    		<td>${ hospedagem.getId() }</td>
			      		<td>${ hospedagem.getFornecedor() }</td>
			        	<td>${ hospedagem.getNome() }</td>
			        	<td>${ hospedagem.getValor() }</td>
			        	<td>${ hospedagem.getEmpresa() }</td>
			        	<td>${ hospedagem.getEstrelas() }</td>
			        	<td>${ hospedagem.getTotalQuartos() }</td>
			        	<td>
			        		<a class="btn btn-danger" href="/hospedagem/${ hospedagem.getId() }/excluir">Excluir</a>
			        	</td>
			    	</tr>
	    		</c:forEach>
		    </tbody>
	  </table>
	</div>
</body>
</html>