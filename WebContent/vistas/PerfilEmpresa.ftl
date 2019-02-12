<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="assets/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    Perfil Empresa
  </title>
  <#include "/vistas/includes/links.html">


<body class="profile-page sidebar-collapse">
  <#include "/vistas/includes/navbarEmpresas.ftl">
  <div class="page-header header-filter" data-parallax="true" style="background-image: url('assets/img/city-profile.jpg');"></div>
  <div class="main main-raised">
    <div class="profile-content">
    	<div class="container">
    		<div class="row">
    			<div class="col-md-4">
    				<div class="profile">
		              <div class="avatar">
		                <img src="assets/img/faces/conmapy.jpg" alt="Circle Image" class="img-raised rounded-circle img-fluid">
		                
		                
		                
		                
		                
		              </div>
		              <div class="name">
		                <h3 class="title">Find Jobs</h3>
								<div class="form-group">
							      <label for="exampleInputFile">Cliack aqui para subir una imagen </label>
							      <input type="file" class="form-control-file" id="exampleInputFile" aria-describedby="fileHelp">
							      
							      <small id="fileHelp" class="form-text text-muted">.</small>
							    </div>
			    
					                <h6>Company</h6>
		                <a href="#pablo" class="btn btn-just-icon btn-link btn-dribbble"><i class="fa fa-dribbble"></i></a>
		                <a href="#pablo" class="btn btn-just-icon btn-link btn-twitter"><i class="fa fa-twitter"></i></a>
		                <a href="#pablo" class="btn btn-just-icon btn-link btn-pinterest"><i class="fa fa-pinterest"></i></a>
		              </div>
		              <h6>Acerca de mi</h6>
		              <div class="description text-center">
				        <p>Empresa dedicada a los busqueda de prosefionales  &#x2014; segun su area, conocimientos y ubucacion  &#x2014;  </p>
				      </div>
				      
				      
				  
				 
				      <h6>Dedicaci&oacute;n </h6>
				      <div class="">
				      	<span class="badge badge-success">Busqueda de Profesinales</span>
				      	<span class="badge badge-success">Areas de trabajo</span>
				      	<span class="badge badge-success">Ubicaciones por Area</span>
				      </div>
				      
				      
		            </div>
		            
    			</div>
    			
    			<div class="col-md-8">
		    				<div class="profile-tabs">
		    				<h6 class="text-center">Informaci&oacute;n de perfil</h6>
		    				
		    				
				              <ul class="nav nav-pills nav-pills-danger nav-pills-icons justify-content-center" role="tablist">
					               
					                
				                <li class="nav-item">
					                  <a class="nav-link active " href="#works" role="tab" data-toggle="tab">
					                    <i class="material-icons">work</i> Laboral
					                  </a>
				                </li>
				                
				                 <li class="nav-item">
					                <!-- #################################studio le mandamos el link --> 
						                  <a class="nav-link" href="#studio" role="tab" data-toggle="tab">
						                    <i class="material-icons">face</i> Persona a Cargo
						                  </a>
					                </li>
		            </div>
		   
		            <div class="tab-content tab-space">
		            
			          <div class="tab-pane active text-center gallery" id="works">
			            <#include "/vistas/forms/personalEmpresa.ftl">
			          </div>
			          
			   <!-- #################################studio definimos  el link --> 
			           <div class="tab-pane text-center" id="studio">
			            <#include "/vistas/forms/personacargo.ftl">
			          </div>
			          
			          
			          </div>
			         
			        
    			</div>
    		</div>
    	</div>
    </div>
  </div>
  
	
    
  <#include "/vistas/includes/footer.html">
  
  <#include "/vistas/includes/scripts.html">
  <script src="assets/js/empresaLaboral.js" type="text/javascript"></script>
  <script src="assets/js/empresaPersonal.js" type="text/javascript"></script>
</body>

</html>