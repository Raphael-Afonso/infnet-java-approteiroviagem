<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>AppRoteiroViagem</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Roteiro de Viagens</a>
			</div>
			<ul class="nav navbar-nav">
				<c:if test="${not empty user}">
					<li class="nav-item"><a class="nav-link" href="/usuario/lista">Usu�rios</a></li>
					<li class="nav-item"><a class="nav-link" href="/roteiro/lista">Roteiros</a></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown">Servi�os<span class="caret"></span>
					</a>
						<ul class="dropdown-menu">
							<li><a href="/evento/lista">Eventos</a></li>
							<li><a href="/hospedagem/lista">Hospedagens</a></li>
							<li><a href="/transporte/lista">Transportes</a></li>
							<li><a href="/servico/lista">Todos servi�os</a>
						</ul></li>
					<li class="nav-item"><a class="nav-link" href="/turista/lista">Turistas</a></li>
				</c:if>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<c:if test="${empty user}">
					<li><a href="/usuario"><span
							class="glyphicon glyphicon-user"></span>Sign Up</a></li>
					<li><a href="/login"><span
							class="glyphicon glyphicon-log-in"></span>Login</a></li>
				</c:if>
				<c:if test="${not empty user}">
					<li><a href="/logout"><span
							class="glyphicon glyphicon-log-out"></span>Logout
							${user.getNome()}</a></li>
				</c:if>
			</ul>
		</div>
	</nav>
</body>
</html>
