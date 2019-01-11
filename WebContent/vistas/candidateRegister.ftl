<!doctype html>
<html lang="en">
  <head>
    <title>Registro de candidatos</title>
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
	          <h1>Registro de candidatos</h1>
	          <br>
	          <h4>Selecciona ahora entre las mejores empresas para aplicar en sus vacantes. Aqu&iacute;, en <b>Find a Job</b> puedes buscar y recibir gratis por correo las nuevas vacantes.</h4>
	        <!-- </div> -->
	      </div>
	    </div>
	  </div>
	</div>

	<div class="main main-raised">
	  <div class="container">
	    <div class="section text-center">
	      <!-- Inicio Formulario de registro de empresas -->
	      
	       <!-- Nav tabs -->
        <ul class="nav justify-content-end">
          <li><ul class="nav nav-pills nav-pills-danger" id="myTab" role="tablist">
            <li class="nav-item">
              <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="false">1</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" id="profile-tab" data-toggle="tab" href="#datosPersonales" role="tab" aria-controls="datosPersonales" aria-selected="true">2</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" id="messages-tab" data-toggle="tab" href="#estudiosFormales" role="tab" aria-controls="estudiosFormales" aria-selected="false">3</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" id="settings-tab" data-toggle="tab" href="#datosLaborales" role="tab" aria-controls="datosLaborales" aria-selected="false">4</a>
            </li>
          </ul></li>
        </ul>
      

      <div class="tab-content">
        <div class="tab-pane" id="home" role="tabpanel" aria-labelledby="home-tab">...</div>
        <div class="tab-pane active" id="datosPersonales" role="tabpanel" aria-labelledby="datosPersonales-tab">
          <#include "/vistas/forms/datosPersonales.html">
        </div>
        <div class="tab-pane" id="estudiosFormales" role="tabpanel" aria-labelledby="estudiosFormales-tab">
          <#include "/vistas/forms/estudiosFormales.html">
        </div>
        <div class="tab-pane" id="datosLaborales" role="tabpanel" aria-labelledby="datosLaborales-tab">
          <#include "/vistas/forms/datosLaborales.html">
        </div>
      </div>
		  
	    	<!-- Fin Formulario de registro de empresas -->
	    </div>
	  </div>
	</div>


<#include "/vistas/includes/footer.html">

<#include "/vistas/includes/scripts.html">

</body>
</html>