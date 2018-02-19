<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>

<!-- Website CSS style -->
<link rel="stylesheet" type="text/css" href="css/style.css">

<!-- Website Font style -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">

<!-- Google Fonts -->
<link href='https://fonts.googleapis.com/css?family=Passion+One'
	rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Oxygen'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.0/jquery-ui.css" />
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.1.0.js"></script>
<script type="text/javascript"
	src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>

</head>
<body>
	<div class="container">
		<div id="tabs">
			<ul>
				<li><a href="#tabs-1">Registre-se</a></li>
				<li><a href="#tabs-2">Login</a></li>
			</ul>
			<div id="tabs-1">
				<div class="row main">
					<div class="panel-heading">
						<div class="panel-title text-center">
							<h1 class="title">Cadastro</h1>
							<hr>
						</div>
					</div>

					<div class="main-login main-center">
						<!--  	<form class="form-horizontal" method="post"
						action="Doall?tarefa=Cadastrar" id="form1" name="form1">-->
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Nome:</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"> <i
										class="fa fa-user fa" aria-hidden="true"> </i>
									</span> <input type="text" class="form-control" name="nome" id="nome"
										placeholder="Name.." />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Email:</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="fa fa-envelope fa" aria-hidden="true"></i></span> <input
										type="text" class="form-control" name="email" id="email"
										placeholder="Email.." />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Senha:</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <input
										type="password" class="form-control" name="senha" id="senha"
										placeholder="Password.." />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label for="confirm" class="cols-sm-2 control-label">Confirme
								a Senha:</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i
										class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <input
										type="password" class="form-control" name="confirm"
										id="confirm_senha" placeholder="Confirm Password.." />
								</div>
							</div>
						</div>

						<div class="form-group ">
							<button class="btn btn-primary btn-lg btn-block login-button"
								id="btn-cadastrar">Cadastrar</button>
						</div>

						<!-- </form> -->
					</div>
				</div>
			</div>
			<!-- end tabs 1 -->

			<div id="tabs-2">
				<div class="row main">
					<div class="panel-heading">
						<div class="panel-title text-center">
							<h1 class="title">LOGIN</h1>
							<hr>
						</div>
					</div>

					<div class="main-login main-center">
						<form class="form-horizontal" method="post"
							action="Doall?tarefa=Login" id="form2" name="form2">
							<div class="form-group">
								<label for="email" class="cols-sm-2 control-label">Email:</label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-envelope fa" aria-hidden="true"></i></span> <input
											type="text" class="form-control" name="emaill" id="emaill"
											placeholder="Email.." />
									</div>
								</div>
							</div>

							<div class="form-group">
								<label for="password" class="cols-sm-2 control-label">Senha:</label>
								<div class="cols-sm-10">
									<div class="input-group">
										<span class="input-group-addon"><i
											class="fa fa-lock fa-lg" aria-hidden="true"></i></span> <input
											type="password" class="form-control" name="senhal"
											id="senhal" placeholder="Password.." />
									</div>
								</div>
							</div>

							<div class="form-group ">
								<button class="btn btn-primary btn-lg btn-block login-button"
									id="btn_loginl" type="submit">LOGIN</button>
							</div>

						</form>
					</div>
				</div>

			</div>

		</div>
	</div>
     <script src="js/validacadastro.js"></script>
	<script src="js/validalogin.js"></script>
	<script src="js/ajaxarchives.js"></script>

	<script>
		$(function() {
			$("#tabs").tabs();
		});
	</script>

</body>
</html>