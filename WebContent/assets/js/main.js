function hola(event){
	alert("hola");
	event.preventDefault();
}

function register(event){
	console.log("entro al register");
	var user = $("input[name='user']").val();
	console.log(user);
	//$.post('profile?user='+user+'',user, function(response){
	//$.post('profile/'+user+'',user, function(response){
	$.post('profile',user, function(response){
		console.log("entro al post");
	});
	event.preventDefault();
}

function enviarDatos(url, metodo, datos){
	Swal.fire({
		  title: 'Esta seguro?',
		  text: "Verifique bien sus datos!",
		  type: 'warning',
		  showCancelButton: true,
		  confirmButtonColor: '#3085d6',
		  cancelButtonColor: '#d33',
		  confirmButtonText: 'Si, estoy seguro!'
		}).then((result) => {
		  if (result.value) {
			    var r = $.ajax({
					url: url,
					type: metodo,
					data: datos,
					success: function(response) {
						if (response.indexOf("error:") != 0) {
							var respuesta = JSON.parse(response);
							console.log(respuesta.id);
							//eliminarFila(producto.id);
							//agregarFila(producto);
							//mostrarMensajeExito("Item modificado satisfactoriamente!!!");
							console.log("Entro al "+metodo);
							return respuesta;
						}
						else {
							//mostrarMensajeError(response.substring(6));
			 			}
					},
					error: function(jqXHR, estado, error) {
						//mostrarMensajeError(error);
					},
					complete: function(jqXHR, estado) {
						//$('#ventana').modal('hide');
					},
					timeout: 10000
				}).responseJSON;
		    Swal.fire(
		      'Exitoso!',
		      'Datos personales guardados',
		      'success'
		    );
		  }
		});
}