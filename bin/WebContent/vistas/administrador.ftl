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
    			<h3>Estadisticas</h3>
    				<div class="card bg-info">
					    <div class="card-body">
					        <h5 class="card-category card-category-social">
					            <i class="fa fa-"></i> Candidatos
					        </h5>
					        <h4 class="card-title">
					            700 Registrados
					        </h4>
					
					        <div class="card-stats">
					            <div class="author">
					                <a href="#pablo">
					                <div class="progress-container">
									    <span class="progress-badge">Representa el 50% de todos los usuarios registrados</span>
									    <div class="progress">
									        <div class="progress-bar" role="progressbar" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100" style="width: 50%;">
									        </div>
									    </div>
									</div>
					                  
					                </a>
					            </div>
					           <div class="stats ml-auto">
					                <i class="material-icons">favorite</i>
					            </div>
					        </div>
					    </div>
					</div>
					
					<div class="card bg-info">
					    <div class="card-body">
					        <h5 class="card-category card-category-social">
					            <i class="fa fa-"></i> Empresas
					        </h5>
					        <h4 class="card-title">
					            700 Registradas
					        </h4>
					
					        <div class="card-stats">
					            <div class="author">
					                <a href="#pablo">
					                <div class="progress-container">
									    <span class="progress-badge">Representa el 50% de todos los usuarios registrados</span>
									    <div class="progress">
									        <div class="progress-bar" role="progressbar" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100" style="width: 50%;">
									        </div>
									    </div>
									</div>
					                </a>
					            </div>
					           <div class="stats ml-auto">
					                <i class="material-icons">favorite</i>
					            </div>
					        </div>
					    </div>
					</div>
					
					<div class="card bg-success">
					    <div class="card-body">
					        <h5 class="card-category card-category-social">
					            <i class="fa fa-"></i> Ofertas de empleo
					        </h5>
					        <h4 class="card-title">
					            5000 Publicadas
					        </h4>
					
					        <div class="card-stats">
					            <div class="author">
					                <a href="#pablo">
					                   <div class="progress-container">
									    <span class="progress-badge">De las cuales el 60% se encuentran activas</span>
									    <div class="progress">
									        <div class="progress-bar" role="progressbar" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
									        </div>
									    </div>
									</div>
					                </a>
					            </div>
					           <div class="stats ml-auto">
					                <i class="material-icons">favorite</i>
					            </div>
					        </div>
					    </div>
					</div>
					
					<div class="card bg-success">
					    <div class="card-body">
					        <h5 class="card-category card-category-social">
					            <i class="fa fa-"></i> Aplicaciones de candidatos
					        </h5>
					        <h4 class="card-title">
					            12000 Realizadas
					        </h4>
					
					        <div class="card-stats">
					            <div class="author">
					                <a href="#pablo">
					                <div class="progress-container">
									    <span class="progress-badge">De las cuales el 80% han tenido resultados exitosos</span>
									    <div class="progress">
									        <div class="progress-bar" role="progressbar" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100" style="width: 80%;">
									        </div>
									    </div>
									</div>
					
					                </a>
					            </div>
					           <div class="stats ml-auto">
					                <i class="material-icons">favorite</i>
					            </div>
					        </div>
					    </div>
					</div>
					
    			</div>
    			
    			<div class="col-md-8">
    				<div class="profile-tabs">
    				<h6 class="text-center">Informaci&oacute;n de perfil</h6>
		              <ul class="nav nav-pills nav-pills-danger nav-pills-icons justify-content-center" role="tablist">
		                <li class="nav-item">
		                  <a class="nav-link active" href="#studio" role="tab" data-toggle="tab">
		                    <i class="material-icons">face</i> Areas
		                  </a>
		                </li>
		                <li class="nav-item">
		                  <a class="nav-link" href="#works" role="tab" data-toggle="tab">
		                    <i class="material-icons">work</i> Dedicacion
		                  </a>
		                </li>
		                <li class="nav-item">
		                  <a class="nav-link" href="#favorite" role="tab" data-toggle="tab">
		                    <i class="material-icons">book</i> Ubicacion
		                  </a>
		                </li>
		              </ul>
		            </div>
		            
		            <div class="tab-content tab-space">
			          <div class="tab-pane active text-center gallery" id="studio">
			            <#include "/vistas/forms/areas.ftl">
			          </div>
			          <div class="tab-pane text-center gallery" id="works">
			            <#include "/vistas/forms/dedicacion.ftl">
			          </div>
			          <div class="tab-pane text-center gallery" id="favorite">
			            <#include "/vistas/forms/ubicacion.ftl">
			          </div>
			        </div>
			        
    			</div>
    		</div>
    	</div>
    </div>
  </div>
  
  <#include "/vistas/includes/footer.html">
  
  <#include "/vistas/includes/scripts.html">
</body>

</html>