<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="assets/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    Listado de usuarios
  </title>
  <#include "/vistas/includes/links.html">
</head>

<body class="profile-page sidebar-collapse">
  <#include "/vistas/includes/navbarAdmin.ftl">
  <div class="page-header header-filter" data-parallax="true" style="background-image: url('assets/img/city-profile.jpg');"></div>
  <div class="main main-raised">
  	<div class="container">
      <div class="section text-center">
        <h2 class="title">Listado de usuarios<#if Session.sessionUser?exists>
    ${Session.sessionUser.email}
</#if></h2>
        <div class="team">
          <a href="#" class="btn btn-primary btn-round">Nuevo usuario</a>
          <div class="row">
            
              <table id="tablaProfesionales" class="table table-striped table-bordered table-hover table-responsive">
                <thead>
                    <tr>
                        <th class="text-center">#</th>
                        <th>Correo</th>
                        <th>Rol</th>
                        <th>Estatus</th>
                        <th class="text-right">Opciones</th>
                    </tr>
                </thead>
                <tbody>
                  <#include "/vistas/listas/profesionales.ftl">
                </tbody>
              </table>
          </div>
          
        </div>
      </div>
    </div>
    
  </div>
    
  <#include "/vistas/includes/footer.html">
  
  <#include "/vistas/includes/scripts.html">
  <script src="assets/js/profesionales.js" type="text/javascript"></script>
</body>

</html>