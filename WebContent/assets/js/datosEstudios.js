function guardarDatosEstudios(e){
	console.log("Funcion: guardarDatosEstudios");
	e.preventDefault();
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
			    $.post('home',{param: datos},function(req,resp){
					console.log("Entro al post");
				});
		    Swal.fire(
		      'Exitoso!',
		      'Datos de estudios guardados',
		      'success'
		    );
		  }
		});
}