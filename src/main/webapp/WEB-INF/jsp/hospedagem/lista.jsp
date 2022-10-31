<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
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
			    <th>Código</th>
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
			      		<td>${ hospedagem.getCodigo() }</td>
			        	<td>${ hospedagem.getNome() }</td>
			        	<td>${ hospedagem.getValor() }</td>
			        	<td>${ hospedagem.getEmpresa() }</td>
			        	<td>${ hospedagem.getEstrelas() }</td>
			        	<td>${ hospedagem.getTotalQuartos() }</td>
			    	</tr>
	    		</c:forEach>
		    </tbody>
	  </table>
	</div>
</body>
</html>