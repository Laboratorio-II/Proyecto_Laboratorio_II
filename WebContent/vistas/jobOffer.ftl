<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="assets/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    Oferta de trabajo
  </title>
  <#include "/vistas/includes/links.html">
</head>

<body class="profile-page sidebar-collapse">
  <#include "/vistas/includes/navbarLogon.ftl">
  <div class="page-header header-filter" data-parallax="true" style="background-image: url('assets/img/office.jpg');"></div>
  <div class="main main-raised">
    <div class="profile-content">
    	<div class="container">

    		<div class="alert alert-success">
		        <div class="container">
		          <div class="alert-icon">
		            <i class="material-icons">check</i>
		          </div>
		          <button type="button" class="close" data-dismiss="alert" aria-label="Close">
		            <span aria-hidden="true"><i class="material-icons">clear</i></span>
		          </button>
		          <b>Éxito:</b> Ha enviado su CV correctamente.
		        </div>
		      </div>

		      <br><br>

    		<div class="row">
    			<div class="col-md-4">
    				<div class="profile">
		              <div class="name">
		                <h3 class="title">Programador Freelancer</h3> <!-- cargo -->
		                <h6>Cidesa</h6> <!-- Empresa -->
		              </div>
		              <h6>Lugar de trabajo</h6>
		              <div class="">
				        <span class="badge badge-info">Remoto</span>
				      </div>
				      <h6>Salario</h6>
				      <p>100.000 BsS</p>
				      <h6>&Aacute;reas</h6>
				      <div class="">
				      	<span class="badge badge-primary">Programaci&oacute;n</span>
				      	<span class="badge badge-primary">Frontend</span>
				      </div>
				      <h6>Dedicaci&oacute;n </h6>
				      <div class="">
				      	<span class="badge badge-success">Full-time</span>
				      </div>
		            </div>
    			</div>
    			
    			<div class="col-md-8">

    				<h6 class="text-center">Descripción</h6>
    				<div class="description text-center">
				        <p>An artist of considerable range, Chet Faker — the name taken by Melbourne-raised, Brooklyn-based Nick Murphy — writes, performs and records all of his own music, giving it a warm, intimate feel with a solid groove structure.</p>
				    </div>
				    <h6 class="text-center">Requerimientos</h6>
    				<div class="description text-left">
				        <ul>
				        	<li>Educación Mínima:</li>
				        	<li>Años de Experiencia:</li>
				        	<li>Edad:</li>
				        </ul>
				    </div>

    			</div>

    		</div>

    			<div class="row">
			  		<div class="col-md-12 ml-auto mr-auto">
			 			<div class="card">
			  				<div class="card-body text-center">
			 					<button type="button" class="btn btn-danger" data-container="body" data-toggle="popover" data-placement="top"  data-original-title="CV Enviado" data-content="Su CV se ha enviado correctamente">
								  Enviar mi CV
								</button>
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