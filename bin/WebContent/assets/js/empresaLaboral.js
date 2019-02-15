function guardarDatosLaboralesEmpresa(e){
	console.log("Funcion: guardarDatosLaboralesEmpresa");
	e.preventDefault();
	var datos = $("#formDatosLaboralesEmpresa").serialize();
	
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
		      'Datos de la empresa guardados',
		      'success'
		    );
		  }
		});
}