<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="assets/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
   Postularse Oferta
  </title>
  <#include "/vistas/includes/links.html">
</head>

<body class="profile-page sidebar-collapse">
  <#include "/vistas/includes/navbarProfesional.ftl">
  <div class="page-header header-filter" data-parallax="true" style="background-image: url('assets/img/pexels-photo-905873.jpeg');"></div>
  <div class="main main-raised">
    <div class="profile-content">
    	<div class="container">
    		<#include "/vistas/listas/OfertasCreadasEmpresas2.ftl">
    	</div>
    </div>
  </div>
  
	
  <script src="/WebContent/assets/js/jquery.js" ></script>
  <script src="/WebContent/assets/js/bootstrap.min.js" ></script>
    
  <#include "/vistas/includes/footer.html">
  
  <#include "/vistas/includes/scripts.html">
</body>

</html>