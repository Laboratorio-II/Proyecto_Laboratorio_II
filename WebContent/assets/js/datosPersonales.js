var url = "perfil_profesional";

function guardarDatosPersonales(e){
	console.log("Funcion: guardarDatosPersonales");
	e.preventDefault();
	var metodo = "POST";
	var datos = $("#formDatosPersonales").serialize();
	
	enviarDatos(url, metodo, datos);
}