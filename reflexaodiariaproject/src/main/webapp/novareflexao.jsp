<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html; charset=ISO-8859-1" language="java"
	pageEncoding="UTF-8" import="java.sql.*" errorPage=""%>
<!DOCTYPE html>
<html lang="pt-br">


<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Clean Blog - Start Bootstrap Theme</title>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template -->
<link href="vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link
	href='https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
	rel='stylesheet' type='text/css'>

<!-- Custom styles for this template -->
<link href="css/clean-blog.min.css" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-light fixed-top"
		id="mainNav">
		<div class="container">
			<a class="navbar-brand"> ${usuarioLogado.nome} </a>
			<button class="navbar-toggler navbar-toggler-right" type="button"
				data-toggle="collapse" data-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
				Menu <i class="fa fa-bars"></i>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="index.html"></a>
					</li>
					<li class="nav-item"><a class="nav-link" href="about.html"></a>
					</li>
					<li class="nav-item"><a class="nav-link"
						href="cadastro.jsp#tabs-1"></a></li>
					<li class="nav-item"><a class="nav-link"
						href="cadastro.jsp#tabs-2"></a></li>
					<li class="nav-item"><a class="nav-link"
						href="Doall?tarefa=Logout"></a></li>
					<li class="nav-item"><a class="nav-link" href="contact.html"></a>
					</li>
				</ul>
			</div>
		</div>
	</nav>

	<!-- Page Header -->

	<c:choose>
		<c:when test="${not empty usuarioLogado}">
			<header class="masthead"
				style="background-image: url('img/home-bg.jpg')">
				<div class="overlay"></div>
				<div class="container">
					<div class="row">
						<div class="col-lg-8 col-md-10 mx-auto">
							<div class="site-heading">
								<span class="subheading">Compartilhe uma frase ou
									pensamento</span>
									<br>
								<div class="form-group">
									<form method="post" action="Doall?tarefa=NovoPensamento"
										id="form3" name="form3">
										<input class="form-control" type="text" placeholder="Digite o título da sua publicação" name="nomepensamento">
										
										<label for="comment"></label>
										<textarea class="form-control" rows="5" id="comment"
											name="contpensamento" placeholder="..."></textarea>
											
										<br>
										<button  type="submit" class="btn btn-info">Postar</button>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</header>
		</c:when>

		<c:when test="${empty usuarioLogado}">
			<br>
			<br>


			<div class="container">
				<div class="row">
					<div class="col-lg-8 col-md-10 mx-auto">
						<div class="site-heading">
							<span class="subheading"
								style="display: flex; justify-content: center; align-items: center;">Precisa
								Estar Logado!</span>
								<br>
							<div class="form-group"
								style="display: flex; justify-content: center; align-items: center;">
									<button onclick="window.location.href = 'cadastro.jsp#tabs-2';" class="btn btn-info">Logar</button>
									
								
							</div>
						</div>
					</div>
				</div>
			</div>

		</c:when>
	</c:choose>


	<!-- Main Content -->


	<!-- Footer -->
	<footer>
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-md-10 mx-auto">
					<ul class="list-inline text-center">
						<li class="list-inline-item"><a href="#"> <span
								class="fa-stack fa-lg"> <i
									class="fa fa-circle fa-stack-2x"></i> <i
									class="fa fa-twitter fa-stack-1x fa-inverse"></i>
							</span>
						</a></li>
						<li class="list-inline-item"><a href="#"> <span
								class="fa-stack fa-lg"> <i
									class="fa fa-circle fa-stack-2x"></i> <i
									class="fa fa-facebook fa-stack-1x fa-inverse"></i>
							</span>
						</a></li>
						<li class="list-inline-item"><a href="#"> <span
								class="fa-stack fa-lg"> <i
									class="fa fa-circle fa-stack-2x"></i> <i
									class="fa fa-github fa-stack-1x fa-inverse"></i>
							</span>
						</a></li>
					</ul>
					<p class="copyright text-muted">Copyright &copy; Your Website
						2017</p>
				</div>
			</div>
		</div>
	</footer>

	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Custom scripts for this template -->
	<script src="js/clean-blog.min.js"></script>

</body>

</html>
