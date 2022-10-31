<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Cadastramento de serviços</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Serviços: ${ listagem.size() }</h3>
	</div>
	
	<div class="container">         
		<table class="table table-striped">
	    	<thead>
	    	<tr>
			    <th>Código</th>
			    <th>Nome</th>
			    <th>Valor</th>
	    	</tr>
	    	</thead>
		  	<tbody>
	    		<c:forEach var="servico" items="${ listagem }">
			    	<tr>
			      		<td>${ servico.getCodigo() }</td>
			        	<td>${ servico.getNome() }</td>
			        	<td>${ servico.getValor() }</td>
			    	</tr>
	    		</c:forEach>
		    </tbody>
	  </table>
	</div>
</body>
</html>