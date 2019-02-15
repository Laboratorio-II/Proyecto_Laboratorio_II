function login(e){
	console.log("Funcion: login");
	e.preventDefault();
	var datos = $("#formLogin").serialize();
	
	if(!validarLogin()){
		Swal.fire(
		  'Error!',
		  'Error en las credenciales!',
		  'error'
		)
	}
}

function validarLogin(){
	if(false){
		return true;
	}else
		return false;
}