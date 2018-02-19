var btn_login = $("#btn_loginl");

btn_login.on("click", function() {

	var email = $("#emaill").val();
	var senha = $("#senhal").val();

	if (email == '' || email == null) {
		alert("Invalid Email");
		return false;
	} else if (senha == '' || senha == null) {
		alert("Invalid Password");
		return false;
	} else {

		$.post("Doall?tarefa=Login", {
			emailparaml : email,
			senhaparaml : senha
		}, function(data) {
			if (data == 'True') {
				$("#resposta").html(data);
				window.location = "index.jsp";
			} else{
				alert('Login Fail');
				window.location.reload();}
		});
		

	}

})