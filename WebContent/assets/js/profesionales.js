var tabla;
$(document).ready(function() {
	tabla = 
	$('#tablaProfesionales').DataTable({
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

function onEliminar(id) {
	$.ajax({
		url: "profesionales",
		type: "DELETE",
		data: {"id":id},
		success: function(response) {
			if (response == "ok") {
				eliminarFila(id);
				//mostrarMensajeExito('Item eliminado satisfactoriamente!!!');
			}
			else {
				//mostrarMensajeError(response);
			}
		},
		error: function(jqXHR, estado, error) {
			//mostrarMensajeError(error);
		},
		timeout: 10000
	});
	//alert("EPALE CIUDADANO");
}

function eliminarFila(id) {
	fila = $('#btnEliminar'+id).closest("tr")[0];
	$(fila).addClass('selected');
	tabla.row('.selected').remove().draw( false );
}