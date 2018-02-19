var btn_cadastrar = $("#btn-cadastrar");

btn_cadastrar.on("click", function() {

	var senha = $("#senha").val();
	var repetir_senha = $("#confirm_senha").val();
	var nome = $("#nome").val();
	var email = $("#email").val();

	if (nome == '' || nome == null) {
		alert("invalid name!");
		return false;
	} else if (email == '' || email == null) {
		alert("Invalid Email! ");
		return false;
	} else if (senha == '' || senha == null) {
		alert("Invalid Password");
		return false;
	} else if (repetir_senha == '' || repetir_senha == null) {
		alert("Incorrect Passwords");
		return false;
	} else if (repetir_senha != senha) {
		alert("Incorrect Passwords");
		return false;
	} else if (repetir_senha == senha) {
		$.post("Doall?tarefa=Cadastrar", {
			nomeparam : nome,
			emailparam : email,
			senhaparam : senha
		}, function(data) {
			$("#resposta").html(data);
			window.location = "cadastro.jsp#tabs-2";
			
		});
		alert("Registration successfully Complete");
		window.location.reload();
	}

});
