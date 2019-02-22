<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="assets/img/favicon.png">
  
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>Perfil Admin</title>
  <#include "/vistas/includes/links.html">
    
  <script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
  <script src="http://code.highcharts.com/highcharts.js"></script>
  <script src="http://code.highcharts.com/modules/exporting.js"></script>
  
</head>

<body class="profile-page sidebar-collapse">
  <#include "/vistas/includes/navbarAdmin.ftl">
  <div class="page-header header-filter" data-parallax="true" style="background-image: url('assets/img/pexels-photo-1432942.jpeg');"></div>
  
  <#include "/vistas/modals/areaprofesional.ftl">
  <#include "/vistas/modals/cargo.ftl">
  <#include "/vistas/modals/carrera.ftl">
  <#include "/vistas/modals/ciudad.ftl">
  <#include "/vistas/modals/dedicacion1.ftl">
  <#include "/vistas/modals/estado.ftl">
  <#include "/vistas/modals/etapa.ftl">
  <#include "/vistas/modals/idioma.ftl">
  <#include "/vistas/modals/pais.ftl">  			    	
    			    	
  	<div class="main main-raised">
    	<div class="profile-content">
    		<div class="container">
		    	<br><br>
				<div class="footer text-center">
		        	<h2 class="title">Administración del sitio</h2>
				</div>
				<a href="admin"  class="btn btn-success btn-lg active" role="button" aria-pressed="true">Regresar</a>

		      	<br>		      <br>
		      
  <div class="row">
  
 	<div class="col-md-6">
    	<div class="card">
    	
        	<div class="card-header card-header-danger">
            	<h4 class="card-title" class="description text-center">Paises</h4>
        	</div>
        				
        	<div class="card-body">
         		<div class="col-sm-14">
         			
         			<table id="tablaPaises" class="table table-striped table-bordered table-hover table-responsive">
						<thead>
							<tr>
								<th class="text-center">#</th>
		                    	<th>Nombre</th>
		                    	<th class="text-right">Opciones</th>
							</tr>
						</thead>
						<tbody>
							<#include "/vistas/listas/paises.ftl">
	                	</tbody>
					</table>
         		
         			<div  class="footer text-center">
						<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#paisModal">Agregar</button>
					</div>
					
				</div>
			</div>
        	
    	</div>
	</div>
	
	
	<div class="col-md-6">
    	<div class="card">
    	
        	<div class="card-header card-header-danger">
            	<h4 class="card-title" class="description text-center">Estados</h4>
        	</div>
        				
        	<div class="card-body">
         		<div class="col-sm-14">
         			
         			<table id="tablaEstados" class="table table-striped table-bordered table-hover table-responsive">
						<thead>
							<tr>
								<th class="text-center">#</th>
		                    	<th>Nombre</th>
		                    	<th>Pais</th>
		                    	<th class="text-right">Opciones</th>
							</tr>
						</thead>
						<tbody>
							<#include "/vistas/listas/estados.ftl">
	                	</tbody>
					</table>
         		
         			<div  class="footer text-center">
						<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#estadoModal">Agregar</button>
					</div>
					
				</div>
			</div>
        	
    	</div>
	</div>
	
	<br>
	
	<div class="col-md-6">
    	<div class="card">
    
        	<div class="card-header card-header-danger">
            	<h4 class="card-title">Ciudades</h4>
        	</div>
        
        	<div class="card-body">
        		<div class="col-sm-14">
         					
         			<table id="tablaCiudades" class="table table-striped table-bordered table-hover table-responsive">
						<thead>
							<tr>
								<th class="text-center">#</th>
	             				<th>Nombre</th>
	             				<th>Estado</th>
	           					<th class="text-right">Opciones</th>
							</tr>
						</thead>
						<tbody>
							<#include "/vistas/listas/ciudades.ftl">
	           			</tbody>
					</table>
         					
         			<div  class="footer text-center">
						<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#ciudadModal">Agregar</button>
					</div>
				
		   		</div>
			</div>
		
     	</div>
   	</div>
    	
    	
    <div class="col-md-6">
    	<div class="card">
        	<div class="card-header card-header-danger">
            	<h4 class="card-title"> Areas profesionales</h4>
        	</div>
        	<div class="card-body">
        		<div class="col-sm-14">
        		
        			<table id="tablaAreasProfesionales" class="table table-striped table-bordered table-hover table-responsive">
						<thead>
							<tr>
								<th class="text-center">#</th>
		                    	<th>Nombre</th>
		                    	<th class="text-right">Opciones</th>
							</tr>
						</thead>
						<tbody>
							<#include "/vistas/listas/areasprofesionales.ftl">
	                	</tbody>
					</table>
        	
         			<div  class="footer text-center">
						<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#areaprofesionalModal">Agregar</button>
					</div>
						      	
				</div>
        	</div>
    	</div>
  	</div>	
    	
    <br>	
    	
    <div class="col-md-6">
    	<div class="card">
    
        	<div class="card-header card-header-danger">
            	<h4 class="card-title">Carreras</h4>
        	</div>
        
        	<div class="card-body">
        		<div class="col-sm-14">
         					
         			<table id="tablaCarreras" class="table table-striped table-bordered table-hover table-responsive">
						<thead>
							<tr>
								<th class="text-center">#</th>
	             				<th>Nombre</th>
	             				<th>Area profesional</th>
	           					<th class="text-right">Opciones</th>
							</tr>
						</thead>
						<tbody>
							<#include "/vistas/listas/carreras.ftl">
	           			</tbody>
					</table>
         					
         			<div  class="footer text-center">
						<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#carreraModal">Agregar</button>
					</div>
				
		   		</div>
			</div>
		
     	</div>
   	</div>
   	
   	<div class="col-md-6">
    	<div class="card">
    
        	<div class="card-header card-header-danger">
            	<h4 class="card-title">Cargos</h4>
        	</div>
        
        	<div class="card-body">
        		<div class="col-sm-14">
         					
         			<table id="tablaCargos" class="table table-striped table-bordered table-hover table-responsive">
						<thead>
							<tr>
								<th class="text-center">#</th>
	             				<th>Nombre</th>
	           					<th class="text-right">Opciones</th>
							</tr>
						</thead>
						<tbody>
							<#include "/vistas/listas/cargos.ftl">
	           			</tbody>
					</table>
         					
         			<div  class="footer text-center">
						<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#cargoModal">Agregar</button>
					</div>
				
		   		</div>
			</div>
		
     	</div>
   	</div>	
    
    <br>
    
    <div class="col-md-6">
    	<div class="card">
    
        	<div class="card-header card-header-danger">
            	<h4 class="card-title">Dedicaciones</h4>
        	</div>
        
        	<div class="card-body">
        		<div class="col-sm-14">
         					
         			<table id="tablaDedicaciones" class="table table-striped table-bordered table-hover table-responsive">
						<thead>
							<tr>
								<th class="text-center">#</th>
	             				<th>Descripcion</th>
	             				<th>Horas trabajadas</th>
	           					<th class="text-right">Opciones</th>
							</tr>
						</thead>
						<tbody>
							<#include "/vistas/listas/dedicaciones.ftl">
	           			</tbody>
					</table>
         					
         			<div  class="footer text-center">
						<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#dedicacionModal">Agregar</button>
					</div>
				
		   		</div>
			</div>
		
     	</div>
   	</div>
   	
   	
    <div class="col-md-6">
    	<div class="card">
    
        	<div class="card-header card-header-danger">
            	<h4 class="card-title">Cargos</h4>
        	</div>
        
        	<div class="card-body">
        		<div class="col-sm-14">
         					
         			<table id="tablaIdiomas" class="table table-striped table-bordered table-hover table-responsive">
						<thead>
							<tr>
								<th class="text-center">#</th>
	             				<th>Nombre</th>
	           					<th class="text-right">Opciones</th>
							</tr>
						</thead>
						<tbody>
							<#include "/vistas/listas/idiomas.ftl">
	           			</tbody>
					</table>
         					
         			<div  class="footer text-center">
						<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#idiomaModal">Agregar</button>
					</div>
				
		   		</div>
			</div>
		
     	</div>
   	</div>
   	
   	<br>
   	
   	<div class="col-md-6">
    	<div class="card">
    
        	<div class="card-header card-header-danger">
            	<h4 class="card-title">Cargos</h4>
        	</div>
        
        	<div class="card-body">
        		<div class="col-sm-14">
         					
         			<table id="tablaIdiomas" class="table table-striped table-bordered table-hover table-responsive">
						<thead>
							<tr>
								<th class="text-center">#</th>
	             				<th>Nombre</th>
	           					<th class="text-right">Opciones</th>
							</tr>
						</thead>
						<tbody>
							<#include "/vistas/listas/idiomas.ftl">
	           			</tbody>
					</table>
         					
         			<div  class="footer text-center">
						<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#idiomaModal">Agregar</button>
					</div>
				
		   		</div>
			</div>
		
     	</div>
   	</div>
    	
    	
  </div>
  		      
		  
			</div>

    	</div>

    </div>

  </div>
				 	
    			   
  <#include "/vistas/includes/footer.html">
  
  <#include "/vistas/includes/scripts.html">
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
