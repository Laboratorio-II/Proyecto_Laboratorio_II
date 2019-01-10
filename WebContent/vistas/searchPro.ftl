<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="assets/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    Búsqueda de profesionales
  </title>
  <#include "/vistas/includes/links.html">
</head>

<body class="profile-page sidebar-collapse">
  <#include "/vistas/includes/navbar.html">
  <div class="page-header header-filter" data-parallax="true" style="background-image: url('assets/img/city-profile.jpg');"></div>
  <div class="main main-raised">
    <div class="profile-content">
    	<div class="container">
    		<form class="form">
    			<div class="row">
			  		<div class="col-md-11 ml-auto mr-auto">
			 			<div class="card">
			  				<div class="card-body">
			  					<div class="form-group">
								    <label for="ubicacion">Búsqueda por ubicación geográfica</label>
								    <select class="form-control selectpicker" data-style="btn btn-link" id="ubicacion">
								      <option>Cualquiera...</option>
								      <option>Lara</option>
								      <option>Caracas</option>
								      <option>Zulia</option>
								      <option>Maracay</option>
								    </select>
								  </div>
								  
								  <div class="form-group">
								    <label for="area">Búsqueda por área</label>
								    <select class="form-control selectpicker" data-style="btn btn-link" id="area">
								      <option>Cualquiera...</option>
								      <option>Programación</option>
								      <option>Comercio</option>
								      <option>Publicidad</option>
								      <option>Contenido</option>
								    </select>
								  </div>
								  
								  <div class="form-group">
								    <label for="dedicacion">Búsqueda por tipo de dedicación</label>
								    <select class="form-control selectpicker" data-style="btn btn-link" id="dedicacion">
								      <option>Cualquiera...</option>
								      <option>Full-time</option>
								      <option>Part-time</option>
								      <option>Freelancer</option>
								      <option>Pasantia</option>
								    </select>
								  </div>
								  
			  				</div>
			  				
			  				<div class="footer text-center">
    							<button type="button" class="btn btn-danger">Buscar profesional</button>
    						</div>
			  			</div>
			  		</div>
				</div>
    			
    		</form>
    	</div>
    </div>
  </div>
  
	
    
  <#include "/vistas/includes/footer.html">
  
  <#include "/vistas/includes/scripts.html">
</body>

</html>