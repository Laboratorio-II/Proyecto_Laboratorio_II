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
  <#include "/vistas/includes/navbarAdmin.ftl">
  <div class="page-header header-filter" data-parallax="true" style="background-image: url('assets/img/city-profile.jpg');"></div>
  <div class="main main-raised">
  	<div class="container">
      <div class="section text-center">
        <h2 class="title">Listado de usuarios</h2>
        <div class="team">
          <a href="#" class="btn btn-primary btn-round">Nuevo usuario</a>
          <div class="row">
            <div class="table-responsive">
              <table class="table  table-hover">
                <thead>
                    <tr>
                        <th class="text-center">#</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Correo</th>
                        <th class="text-right">Estatus</th>
                        <th class="text-right">Opciones</th>
                    </tr>
                </thead>
                <tbody>
                  <#include "/vistas/tests/usuarios.ftl">
                </tbody>
              </table>
            </div>
          </div>
          <div class="d-flex justify-content-center">
           
          </div>
        </div>
      </div>
    </div>
    
  </div>
    
  <#include "/vistas/includes/footer.html">
  
  <#include "/vistas/includes/scripts.html">
</body>

</html>