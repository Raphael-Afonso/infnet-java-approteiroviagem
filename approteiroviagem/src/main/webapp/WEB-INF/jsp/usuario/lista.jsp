<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de usuarios</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Usuarios: ${ listagem.size() }</h3>
	</div>
	
	<div class="container">         
		<table class="table table-striped">
	    	<thead>
	    	<tr>
	    		<th>Id</th>
			    <th>Nome</th>
			    <th>Email</th>
			    <th>Cep</th>
			    <th>Bairro</th>
			    <th>Uf</th>
	    	</tr>
	    	</thead>
		  	<tbody>
	    		<c:forEach var="usuario" items="${ listagem }">
			    	<tr>
			    		<td>${ usuario.getId() }</td>
			        	<td>${ usuario.getNome() }</td>
			        	<td>${ usuario.getEmail() }</td>
			        	<td>${ usuario.getEndereco().getCep() }</td>
			        	<td>${ usuario.getEndereco().getBairro() }</td>
			        	<td>${ usuario.getEndereco().getUf() }</td>
			        	<td>
			        		<a class="btn btn-danger" href="/usuario/${ usuario.getId() }/excluir">Excluir</a>
			        	</td>
			    	</tr>
	    		</c:forEach>
		    </tbody>
	  </table>
	</div>	
	
</body>
</html>