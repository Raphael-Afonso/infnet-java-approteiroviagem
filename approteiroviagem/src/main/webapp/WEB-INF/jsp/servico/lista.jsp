<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
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
	    		<th>Id</th>
			    <th>Fornecedor</th>
			    <th>Nome</th>
			    <th>Valor</th>
			    <th>Usuario</th>
	    	</tr>
	    	</thead>
		  	<tbody>
	    		<c:forEach var="servico" items="${ listagem }">
			    	<tr>
			    		<td>${ servico.getId() }</td>
			      		<td>${ servico.getFornecedor() }</td>
			        	<td>${ servico.getNome() }</td>
			        	<td>${ servico.getValor() }</td>
			        	<td>${ servico.usuario.getId() }</td>
			        	<td>
			        		<a class="btn btn-danger" href="/servico/${ servico.getId() }/excluir">Excluir</a>
			        	</td>
			    	</tr>
	    		</c:forEach>
		    </tbody>
	  </table>
	</div>
</body>
</html>