var url = "crear_oferta";

function agregarOferta(e){
	console.log("Funcion: agregarOferta");
	e.preventDefault();
	var metodo = "POST";
	var datos = $("#crearOferta").serialize();
	
	enviarDatos(url, metodo, datos);
}