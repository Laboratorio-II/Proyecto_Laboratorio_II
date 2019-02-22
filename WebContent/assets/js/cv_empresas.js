var url = "perfil_profesional";

var tablaCV_Empresas;
$(document).ready(function() {
	tablaCV_Empresas = 
	$('#tablaCV_Empresas').DataTable({
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

function eliminarCV_Empresa(id){
	console.log("Funcion: eliminarCV_Empresa");
	var metodo = "DELETE";
	var op = "eliminarCV_Empresa";
	
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
							eliminarFilaCV_Empresa(id);
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

function eliminarFilaCV_Empresa(id) {
	fila = $('#btnEliminarCV'+id).closest("tr")[0];
	$(fila).addClass('selected');
	tablaCV_Empresas.row('.selected').remove().draw( false );
}

function guardarCV(e){
	
	console.log("Funcion: guardarCV");
	e.preventDefault();
	var metodo = "POST";
	var datos = $("#formDatosCV").serialize();
	
	enviarDatos("perfil_empresa", metodo, datos);
	
}