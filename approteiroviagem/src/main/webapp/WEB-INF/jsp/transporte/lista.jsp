<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>        
<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de transportes</title>
</head>
<body>
	<div class="container mt-3">
	  <h3>Transportes: ${ listagem.size() }</h3>
	</div>
	
	<div class="container">         
		<table class="table table-striped">
	    	<thead>
	    	<tr>
	    		<th>Id</th>
			    <th>Fornecedor</th>
			    <th>Nome</th>
			    <th>Valor</th>
			    <th>EnderecoDesembarque</th>
			    <th>EnderecoEmbarque</th>
			    <th>Veiculo</th>
	    	</tr>
	    	</thead>
		  	<tbody>
	    		<c:forEach var="transporte" items="${ listagem }">
			    	<tr>
			    		<td>${ transporte.getId() }</td>
			      		<td>${ transporte.getFornecedor() }</td>
			        	<td>${ transporte.getNome() }</td>
			        	<td>${ transporte.getValor() }</td>
			        	<td>${ transporte.getEnderecoDesembarque() }</td>
			        	<td>${ transporte.getEnderecoEmbarque() }</td>
			        	<td>${ transporte.getVeiculo() }</td>
			        	<td>
			        		<a class="btn btn-danger" href="/transporte/${ transporte.getId() }/excluir">Excluir</a>
			        	</td>
			    	</tr>
	    		</c:forEach>
		    </tbody>
	  </table>
	</div>
		
</body>
</html>