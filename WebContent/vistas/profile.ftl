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
  <#include "/vistas/includes/navbarLogon.ftl">
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
		                <h3 class="title">Christian Louboutin</h3>
		                <h6>Designer</h6>
		                <a href="#pablo" class="btn btn-just-icon btn-link btn-dribbble"><i class="fa fa-dribbble"></i></a>
		                <a href="#pablo" class="btn btn-just-icon btn-link btn-twitter"><i class="fa fa-twitter"></i></a>
		                <a href="#pablo" class="btn btn-just-icon btn-link btn-pinterest"><i class="fa fa-pinterest"></i></a>
		              </div>
		              <h6>Acerca de mi</h6>
		              <div class="description text-center">
				        <p>An artist of considerable range, Chet Faker &#x2014; the name taken by Melbourne-raised, Brooklyn-based Nick Murphy &#x2014; writes, performs and records all of his own music, giving it a warm, intimate feel with a solid groove structure. </p>
				      </div>
				      <h6>Conocimientos
				      	<span data-toggle="modal" data-target="#conocimientos">
					      <button class="btn btn-warning btn-fab btn-fab-mini btn-round" 
					      data-toggle="tooltip" data-placement="top" title="Modificar">
	  						<i class="material-icons">edit</i>
						  </button>
						</span>
					  </h6>
				      
				      <div class="">
				      	<span class="badge badge-info">Ingl&eacute;s</span>
				      	<span class="badge badge-info">PHP</span>
				      	<span class="badge badge-info">Java</span>
				      	<span class="badge badge-info">Mercadeo</span>
				      	<span class="badge badge-info">SQL</span>
				      	<span class="badge badge-info">Redes</span>
				      </div>
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
			            <#include "/vistas/forms/laboral.ftl">
			          </div>
			          <div class="tab-pane text-center gallery" id="favorite">
			            <#include "/vistas/forms/estudio.ftl">
			          </div>
			        </div>
			        
    			</div>
    		</div>
    	</div>
    </div>
  </div>
  
	<div class="row">
  		<div class="col-md-11 ml-auto mr-auto">
 			<div class="card">
  				<div class="card-body text-center">
  				<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#exampleModal">
				  Postulaciones realizadas
				</button>
				<button type="button" class="btn btn-danger" data-toggle="modal" data-target="#exampleModal">
				  Mi lista de empresas
				</button>
    			<#include "/vistas/tests/modal.html">
    			<#include "/vistas/modals/conocimientos.ftl">
    			<#include "/vistas/modals/areas.ftl">
    			<#include "/vistas/modals/dedicacion.ftl">
  				</div>
  			</div>
  		</div>
	</div>
    
  <#include "/vistas/includes/footer.html">
  
  <#include "/vistas/includes/scripts.html">
</body>

</html>