var url = "ControladorEntidades";

var tablaDedicaciones;
$(document).ready(function() {
	tablaDedicaciones = 
	$('#tablaDedicaciones').DataTable({
		"bAutoWidth": 'false',

		"language": {
            "lengthMenu": "Mostrar _MENU_ registros por pagina",
            "zeroRecords": "No se encontraron registros",
            "info": "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
            "infoEmpty": "No hay registros disponibles",
            "infoFiltered": "(filtrado de _MAX_ registros totales)",
            "search": "Buscar:",
            "paginate": {
        		"first":    "Primero",
        		"last":     "Ultimo",
        		"next":     "Siguiente",
        		"previous": "Anterior"
        	}
        }
	});

});

function guardarDedicacion(e){
	console.log("Funcion: guardarDedicacion");
	console.log("???????");
	e.preventDefault();
	var metodo = "POST";
	var datos = $("#formDedicacion").serialize();
	
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
							agregarFilaDedicaciones(respuesta);
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
		      'Dedicacion guardada',
		      'success'
		    );
		  }
		});
	
}

function eliminarDedicacion(id){
	console.log("Funcion: eliminarDedicacion");
	var metodo = "DELETE";
	var op = "eliminarDedicacion";
	
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
							eliminarFilaDedicacion(id);
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
		      'Dedicación eliminada',
		      'success'
		    );
		  }
		});
	
}

function agregarFilaDedicacion(datos) {
	//console.log(datos);
	tablaDedicaciones.row.add( [
        '<td id="idDedicacion'+datos.id+'</td>',
        '<td>'+datos.nombre+'</td>',
        '<td class="td-actions text-right"><button type="button" id="btnEliminar'+datos.id+'" rel="tooltip" title="Eliminar" class="btn btn-danger btn-fab btn-fab-mini btn-round" onclick="eliminarDedicacion('+datos.id+')"><i class="fa fa-times"></i></button></td>'
    ] ).draw();
	//$('[data-toggle="confirmation"]').confirmation('hide');
}

function eliminarFilaDedicacion(id) {
	fila = $('#btnEliminar'+id).closest("tr")[0];
	$(fila).addClass('selected');
	tablaDedicaciones.row('.selected').remove().draw( false );
}