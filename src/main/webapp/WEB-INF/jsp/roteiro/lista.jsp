<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Cadastramento de roteiros</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Roteiros: ${ listagem.size() }</h3>
	</div>
	
	<div class="container">         
		<table class="table table-striped">
	    	<thead>
	    	<tr>
			    <th>Data</th>
			    <th>Descricao</th>
			    <th>Internacional</th>
			    <th>Serviços</th>
			    <th>Turista</th>
	    	</tr>
	    	</thead>
		  	<tbody>
	    		<c:forEach var="roteiro" items="${ listagem }">
			    	<tr>
			      		<td>${ roteiro.getData() }</td>
			        	<td>${ roteiro.getDescricao() }</td>
			        	<td>${ roteiro.isInternacional() }</td>
			        	<td>${ roteiro.getServicos().size() }</td>
			        	<td>${ roteiro.getTurista().getNome() }</td>
			    	</tr>
	    		</c:forEach>
		    </tbody>
	  </table>
	</div>
	
</body>
</html>