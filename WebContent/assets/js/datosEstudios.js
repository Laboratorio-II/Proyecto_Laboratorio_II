var url = "perfil_profesional";

var tablaEstudiosFormales;
$(document).ready(function() {
	tablaEstudiosFormales = 
	$('#tablaEstudiosFormales').DataTable({
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
	
	var row = $('#tablaEstudiosFormales').children('tbody').children('tr:first');
	row.hide();
});

function guardarEstudiosFormales(e){
	console.log("Funcion: guardarEstudiosFormales");
	console.log("???????");
	e.preventDefault();
	var metodo = "POST";
	var datos = $("#formDatosEstudios").serialize();
	
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
							agregarFilaEstudios(respuesta);
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

function eliminarEstudiosFormales(id){
	console.log("Funcion: eliminarEstudiosFormales");
	var metodo = "DELETE";
	var op = "eliminarEstudios";
	
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
							eliminarFilaEstudios(id);
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

function agregarFilaEstudios(datos) {
	//console.log(datos);
	tablaEstudiosFormales.row.add( [
        '<td id="idEF'+datos.id+'">'+datos.id+'</td>',
        '<td>'+datos.usuario+'</td>',
        '<td>'+datos.centro+'</td>',
        '<td>'+datos.periodo+'</td>',
        '<td class="td-actions text-right"><button type="button" id="btnEliminar'+datos.id+'" rel="tooltip" title="Eliminar" class="btn btn-danger btn-fab btn-fab-mini btn-round" onclick="eliminarEstudiosFormales('+datos.id+')"><i class="fa fa-times"></i></button></td>'
    ] ).draw();
	//$('[data-toggle="confirmation"]').confirmation('hide');
}

function eliminarFilaEstudios(id) {
	fila = $('#btnEliminar'+id).closest("tr")[0];
	$(fila).addClass('selected');
	tablaEstudiosFormales.row('.selected').remove().draw( false );
}