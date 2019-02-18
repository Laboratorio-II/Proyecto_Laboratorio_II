var url = "perfil_profesional";

var tablaDatosLaborales;
$(document).ready(function() {
	tablaDatosLaborales = 
	$('#tablaDatosLaborales').DataTable({
		"bAutoWidth": 'false',
		 /*"aoColumns" : [
			    { "sWidth": '20%' },
			    { "sWidth": '20%' },
			    { "sWidth": '20%' },
			    { "sWidth": '20%' },
			    { "sWidth": '10%' }
			  ],*/
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
	//$('#formProducto').validate();
	//$('#cantidad').numeric();
	//$('#precio').numeric('.');
});

function guardarDatosLaborales(e){
	console.log("Funcion: guardarDatosLaborales");
	console.log("???????");
	e.preventDefault();
	var metodo = "POST";
	var datos = $("#formDatosLaborales").serialize();
	
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
							agregarFilaLaborales(respuesta);
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
		      'Datos personales guardados',
		      'success'
		    );
		  }
		});
	
}

function eliminarDatosLaborales(id){
	console.log("Funcion: eliminarDatosLaborales");
	var metodo = "DELETE";
	var op = "eliminarDatosLaborales";
	
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
							eliminarFilaLaborales(id);
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

function agregarFilaLaborales(datos) {
	//console.log(datos);
	tablaDatosLaborales.row.add( [
        '<td id="idDL'+datos.id+'">'+datos.id+'</td>',
        '<td>'+datos.usuario+'</td>',
        '<td>'+datos.empresa+'</td>',
        '<td>'+datos.cargo+'</td>',
        '<td class="td-actions text-right"><button type="button" id="btnEliminar'+datos.id+'" rel="tooltip" title="Eliminar" class="btn btn-danger btn-fab btn-fab-mini btn-round" onclick="eliminarDatosLaborales('+datos.id+')"><i class="fa fa-times"></i></button></td>'
    ] ).draw();
	//$('[data-toggle="confirmation"]').confirmation('hide');
}

function eliminarFilaLaborales(id) {
	fila = $('#btnEliminar'+id).closest("tr")[0];
	$(fila).addClass('selected');
	tablaDatosLaborales.row('.selected').remove().draw( false );
}