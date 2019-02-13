function registrarEmpresa(e){
	console.log("Funcion: registrarEmpresa");
	e.preventDefault();
	var datos = $("#formCreateEmpresa").serialize();
	console.log("Datos: "+datos);
	
	if(validarPassEmpresa()){
		console.log("Las contraseñas son iguales");
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
				    /*$.post('home',datos,function(req,resp){
						console.log("Entro al post");
					},'json');*/
				  jQuery.ajax({
	                    type:"POST",
	                    url : "home",
	                    data : datos,
	                    beforeSend : function() {

	                    },
	                    complete : function() {
	                    	console.log("Entro al complete");
	                    },
	                    success : function(data) {
	                    	console.log("Entro al success");
	                    	//window.location="perfil_empresa";
	                    },
	                    error : function(xmlHttpRequest, textStatus, errorThrown) {
	                        alert("Error occured. Unable to open editor");
	                    }

	                });
			    Swal.fire(
			      'Exitoso!',
			      'Usuario registrado',
			      'success'
			    );
			  }
			});
	}else{
		console.log("Las contraseñas no son iguales");
		Swal.fire({
			  type: 'error',
			  title: 'Oops...',
			  text: 'Error en las contraseñas!'
			})
	}
	
	/*$.post(url,{datos},function(req,resp){
		
	},"json");*/
	
}

function registrarProfesional(e){
	console.log("Funcion: registrarProfesional");
	e.preventDefault();
	var datos = $("#formCreateProfesional").serialize();
	//Swal.fire('Any fool can use a computer');

	if(validarPassProfesional()){
		console.log("Las contraseñas son iguales");
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
			    Swal.fire(
			      'Exitoso!',
			      'Usuario registrado',
			      'success'
			    )
			    $.post('home',datos,function(data){
					console.log("Entro al post");
					//var respuesta = JSON.parse(resp);
					console.log("Dato: "+data);
				});
			  }
			});
	}else{
		console.log("Las contraseñas no son iguales");
		Swal.fire({
			  type: 'error',
			  title: 'Oops...',
			  text: 'Error en las contraseñas!'
			})
	}
}

function validarPassEmpresa(){
	var pass1 = $("#passEmpresa").val();
	var pass2 = $("#repEmpresa").val();
	if(pass1==pass2){
		return true;
	}else
		return false;
}

function validarPassProfesional(){
	var pass1 = $("#passProfesional").val();
	var pass2 = $("#repProfesional").val();
	if(pass1==pass2){
		return true;
	}else
		return false;
}