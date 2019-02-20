var url = "perfil_empresa";

function guardarDatosLaboralesEmpresa(e){
	console.log("Funcion: guardarDatosLaboralesEmpresa");
	e.preventDefault();
	var metodo = "POST";
	var datos = $("#formDatosLaboralesEmpresa").serialize();
	
	enviarDatos(url, metodo, datos);
}