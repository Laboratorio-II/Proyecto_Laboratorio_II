var url = "perfil_empresa";

function guardarDatosPersonalesEmpresa(e){
	console.log("Funcion: guardarDatosPersonalesEmpresa");
	e.preventDefault();
	var metodo = "POST";
	var datos = $("#formDatosPersonalesEmpresa").serialize();
	
	enviarDatos(url, metodo, datos);
}