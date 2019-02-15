<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="assets/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    Listado de profesionales
  </title>
  <#include "/vistas/includes/links.html">
</head>

<body class="profile-page sidebar-collapse">
  <#include "/vistas/includes/navbarAdmin.ftl">
  <div class="page-header header-filter" data-parallax="true" style="background-image: url('assets/img/city-profile.jpg');"></div>
  <div class="main main-raised">
    <div class="profile-content">
    	<div class="container">
    		
    			
    			<h1>Listado de profesionales</h1>
    			
    			
    				<#include "/vistas/listas/profesionales.ftl">
    			
    		
    	</div>
    </div>
  </div>
  
  <#include "/vistas/includes/footer.html">
  
  <#include "/vistas/includes/scripts.html">
</body>

</html>