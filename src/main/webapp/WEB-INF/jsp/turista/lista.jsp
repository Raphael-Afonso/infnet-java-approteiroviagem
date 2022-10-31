<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Cadastramento de turistas</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Turistas: ${ listagem.size() }</h3>
	</div>
	
	<div class="container">         
		<table class="table table-striped">
	    	<thead>
	    	<tr>
	    		<th>Id</th>
			    <th>Cpf</th>
			    <th>Nome</th>
			    <th>Email</th>
	    	</tr>
	    	</thead>
		  	<tbody>
	    		<c:forEach var="turista" items="${ listagem }">
			    	<tr>
			    		<td>${ turista.getId() }</td>
			      		<td>${ turista.getCpf() }</td>
			        	<td>${ turista.getNome() }</td>
			        	<td>${ turista.getEmail() }</td>
			        	<td>
			        		<a class="btn btn-danger" href="/turista/${ turista.getId() }/excluir">Excluir</a>
			        	</td>
			    	</tr>
	    		</c:forEach>
		    </tbody>
	  </table>
	</div>	
	
</body>
</html>