<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="assets/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    Perfil
  </title>
  <#include "/vistas/includes/links.html">
</head>

<body class="profile-page sidebar-collapse">
  <#include "/vistas/includes/navbarProfesional.ftl">
  <div class="page-header header-filter" data-parallax="true" style="background-image: url('assets/img/city-profile.jpg');"></div>
  <div class="main main-raised">
    <div class="profile-content">
    	<div class="container">
    		<div class="row">
    			<div class="col-md-4">
    				<div class="profile">
		              <div class="avatar">
		                <img src="assets/img/faces/christian.jpg" alt="Circle Image" class="img-raised rounded-circle img-fluid">
		              </div>
		              <div class="name">
		                <h3 class="title">${user.email}</h3>
		                <a href="#pablo" class="btn btn-just-icon btn-link btn-dribbble"><i class="fa fa-dribbble"></i></a>
		                <a href="#pablo" class="btn btn-just-icon btn-link btn-twitter"><i class="fa fa-twitter"></i></a>
		                <a href="#pablo" class="btn btn-just-icon btn-link btn-pinterest"><i class="fa fa-pinterest"></i></a>
		              </div>
		              <!--<h6>Acerca de mi <#if Session.sessionUser?exists>
    ${Session.sessionUser.email}
</#if></h6>-->
		              <!--<div class="description text-center">
				        <p>An artist of considerable range, Chet Faker &#x2014; the name taken by Melbourne-raised, Brooklyn-based Nick Murphy &#x2014; writes, performs and records all of his own music, giving it a warm, intimate feel with a solid groove structure. </p>
				      </div>-->
				     
				      <#include "/vistas/badges/conocimientos.ftl"> 
				     
				      <h6>&Aacute;reas
				      	<span data-toggle="modal" data-target="#areas">
					      	<button class="btn btn-warning btn-fab btn-fab-mini btn-round" 
					      	data-toggle="tooltip" data-placement="top" title="Modificar">
		  						<i class="material-icons">edit</i>
							</button>
						</span>
				      </h6>
				      <div class="">
				      	<span class="badge badge-primary">Programaci&oacute;n</span>
				      	<span class="badge badge-primary">Comercio</span>
				      	<span class="badge badge-primary">Publicidad</span>
				      	<span class="badge badge-primary">Contenido</span>
				      </div>
				      <h6>Dedicaci&oacute;n
				      	<span data-toggle="modal" data-target="#dedicaciones">
					      	<button class="btn btn-warning btn-fab btn-fab-mini btn-round" 
					      	data-toggle="tooltip" data-placement="top" title="Modificar">
		  						<i class="material-icons">edit</i>
							 </button>
						</span>
				      </h6>
				      <div class="">
				      	<span class="badge badge-success">Full-time</span>
				      	<span class="badge badge-success">Part-time</span>
				      	<span class="badge badge-success">Freelancer</span>
				      	<span class="badge badge-success">Pasant&iacute;a</span>
				      </div>
		            </div>
		            <br>
		            <hr>
		            
		            <a href="postulaciones"  class="btn btn-danger">
	  					Postulaciones realizadas
	  				</a> 
		            
		            
		            
		            
		            <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#cv_empresasModal">
					  Mi lista de empresas
					</button>
		            
		       
		            
    			</div>
    			
    			<div class="col-md-8">
    				<div class="profile-tabs">
    				<h6 class="text-center">Informaci&oacute;n de perfil</h6>
		              <ul class="nav nav-pills nav-pills-danger nav-pills-icons justify-content-center" role="tablist">
		                <li class="nav-item">
		                  <a class="nav-link active" href="#studio" role="tab" data-toggle="tab">
		                    <i class="material-icons">face</i> Personal
		                  </a>
		                </li>
		                <li class="nav-item">
		                  <a class="nav-link" href="#works" role="tab" data-toggle="tab">
		                    <i class="material-icons">work</i> Laboral
		                  </a>
		                </li>
		                <li class="nav-item">
		                  <a class="nav-link" href="#favorite" role="tab" data-toggle="tab">
		                    <i class="material-icons">book</i> Estudios
		                  </a>
		                </li>
		              </ul>
		            </div>
		            
		            <div class="tab-content tab-space">
			          <div class="tab-pane active text-center gallery" id="studio">
			            <#include "/vistas/forms/personal.ftl">
			          </div>
			          <div class="tab-pane text-center gallery" id="works">

				          <div class="col-lg-12">
						  	<div class="col-sm-12">
						      <div class="card">
						         <div class="card-header card-header-text card-header-primary">
						            <div class="card-text">
						              <h4 class="card-title">Experiencias guardadas</h4>
						            </div>
						          </div>
						          <div class="card-body">
						              
						              
						              
						              <table id="tablaDatosLaborales" class="table table-striped table-bordered table-hover table-responsive">
						                <thead>
						                    <tr>
						                        <th>Empresa</th>
						                        <th>Cargo</th>
						                        <th>Estado</th>
						                        <th>Periodo</th>
						                        <th class="text-right"></th>
						                    </tr>
						                </thead>
						                <tbody>
						                  <#include "/vistas/listas/datosLaborales.ftl">
						                </tbody>
						              </table>
						              
						              
						              
						              
						              
						              
						          </div>
						      	</div>
						  	  </div>
							</div>
							<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#laboralModal">
							  A�adir
							</button>
						</div>
						<div class="tab-pane text-center gallery" id="favorite">
						
							
							<div class="col-lg-12">
							  	
							  	<div class="col-sm-12">
							      <div class="card">
							         <div class="card-header card-header-text card-header-primary">
							            <div class="card-text">
							              <h4 class="card-title">Formaciones guardadas</h4>
							            </div>
							          </div>
							          <div class="card-body">
							              <table id="tablaEstudiosFormales" class="table table-striped table-bordered table-hover table-responsive">
						                <thead>
						                    <tr>
						                        <th>Centro</th>
						                        <th>Nivel</th>
						                        <th>Estado</th>
						                        <th>Periodo</th>
						                        <th class="text-right"></th>
						                    </tr>
						                </thead>
						                <tbody>
						                  <#include "/vistas/listas/estudiosFormales.ftl">
						                </tbody>
						              </table>
							          </div>
							      	</div>
							  	  </div>
								</div>
								
								<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#estudiosModal">
								  A�adir
								</button>
			
							</div>
			   
			          	</div>
			            
			          </div>
			          
			        </div>
			        
    			</div>
    		</div>
    	</div>
    
  
	<!--<div class="row">
  		<div class="col-md-11 ml-auto mr-auto">
 			<div class="card">
  				<div class="card-body text-center">
  				<a href="postulaciones"  class="btn btn-danger">
  					Postulaciones realizadas
  				</a>  
				  
				<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#exampleModal">
				  Mi lista de empresas
				</button>
    			
  				</div>
  			</div>
  		</div>
	</div>-->
	
	<#include "/vistas/modals/conocimientos.ftl">
	<#include "/vistas/modals/areas.ftl">
	<#include "/vistas/modals/dedicacion.ftl">
	
		
	<#include "/vistas/modals/cv_empresas.ftl">
	<#include "/vistas/modals/estudios.ftl">
	<#include "/vistas/modals/laboral.ftl">
    
  <#include "/vistas/includes/footer.html">
  
  <#include "/vistas/includes/scripts.html">
  <script src="assets/js/datosPersonales.js" type="text/javascript"></script>
  <script src="assets/js/datosLaborales.js" type="text/javascript"></script>
  <script src="assets/js/datosEstudios.js" type="text/javascript"></script>
  <script src="assets/js/conocimientos.js" type="text/javascript"></script>
  <script src="assets/js/cv_empresas.js" type="text/javascript"></script>
  
   <script src="assets/js/ciudades.js" type="text/javascript"></script>
  <script src="assets/js/estados.js" type="text/javascript"></script>
  <script src="assets/js/paises.js" type="text/javascript"></script>
  <script src="assets/js/areasprofesionales.js" type="text/javascript"></script>
  <script src="assets/js/cargos.js" type="text/javascript"></script>
  <script src="assets/js/carreras.js" type="text/javascript"></script>
  <script src="assets/js/dedicaciones.js" type="text/javascript"></script>
  <script src="assets/js/etapas.js" type="text/javascript"></script>
  <script src="assets/js/idiomas.js" type="text/javascript"></script>
  
</body>

</html>