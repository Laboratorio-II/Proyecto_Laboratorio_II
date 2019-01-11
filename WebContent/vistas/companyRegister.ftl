<!doctype html>
<html lang="en">
  <head>
    <title>Registro de empresa</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
   	<link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
    <link rel="icon" type="image/x-icon" href="assets/img/favicon.ico"/>
    <#include "/vistas/includes/links.html">
  </head>
  <body>
  	<header>

  		<#include "/vistas/includes/navbar2.html">
		
  	</header>

	<div class="page-header header-filter" data-parallax="true" style="background-image: url('assets/img/negro.jpg')">
	  <div class="container">
	    <div class="row">
	      <div class="col-md-8">
	        <!-- <div class="brand text-center"> -->
	          <h1>Registro de empresa</h1>
	          <br>
	          <h4>Selecciona ahora entre los mejores perfiles que aplican a tus vacantes o busca el mejor talento en nuestra base de datos de CV. Aqu&iacute;, en <b>Find a Job</b> hacemos que tu proceso de selecci&oacute;n sea r&aacute;pido y efectivo.</h4>
	        <!-- </div> -->
	      </div>
	    </div>
	  </div>
	</div>

	<div class="main main-raised">
	  <div class="container">
	    <div class="section text-center">
	      <!-- Inicio Formulario de registro de empresas -->

          <#include "/vistas/forms/registerEmpresa.html">
		  
	    	<!-- Fin Formulario de registro de empresas -->
	    </div>
	  </div>
	</div>


<#include "/vistas/includes/footer.html">

<#include "/vistas/includes/scripts.html">

</body>
</html>