var url = "perfil_profesional";

function agregarConocimiento(e){
	console.log("Funcion: agregarConocimiento");
	e.preventDefault();
	var metodo = "POST";
	var datos = $("#formConocimientos").serialize();
	
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
			    $.ajax({
					url: url,
					type: metodo,
					data: datos,
					success: function(response) {
						if (response.indexOf("error:") != 0) {
							var respuesta = JSON.parse(response);
							console.log(respuesta.id);
							agregarListaConocimiento(respuesta);
							console.log("Entro al "+metodo);
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
				});
		    Swal.fire(
		      'Exitoso!',
		      'Conocimiento guardado',
		      'success'
		    );
		  }
		});
}

function agregarListaConocimiento(datos){
	$("#listadoConocimientos").append('<li id="'+datos.id+'"><span class="badge badge-info">'+datos.nombre+'</span><span data-toggle="modal" data-target="#conocimientos"><button id="btnEliminarC'+datos.id+'" class="btn btn-danger btn-fab btn-fab-mini btn-round" data-toggle="tooltip" data-placement="top" title="Eliminar" onclick="eliminarConocimiento('+datos.id+')"><i class="material-icons">delete</i></button></span></li>');
	$("#badgesConocimientos").append('<span id="spanCono'+datos.id+'" class="badge badge-info">'+datos.nombre+'</span>');
}

function eliminarConocimiento(id){
	console.log("Funcion: eliminarConocimiento");
	var metodo = "DELETE";
	var op = "eliminarConocimiento";
	
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
			    $.ajax({
					url: url,
					type: metodo,
					data: {"id": id, "op": op},
					success: function(response) {
						if (response == "ok") {
							console.log("okkkkkk");
							eliminarListaConocimiento(id);
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
				});
		    Swal.fire(
		      'Exitoso!',
		      'Datos personales guardados',
		      'success'
		    );
		  }
		});
}

function eliminarListaConocimiento(id){
	lista = $('#btnEliminarC'+id).closest("li")[0];
	$(lista).remove();
	$("#spanCono"+id).remove();
}