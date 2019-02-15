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
        <h2 class="title">Listado de empresas</h2>
        <div class="team">
          <a href="perfil_empresa" class="btn btn-primary btn-round">Nueva empresa</a>
          <div class="row">
            <div class="table-responsive">
              <table class="table  table-hover">
                <thead>
                    <tr class="d-flex">
                        <th class="col-1 text-center">#</th>
                        <th class="col-2">RIF</th>
                        <th class="col-4">Nombre</th>
                        <th class="col-2">Correo</th>
                        <th class="col-1 text-right">Estatus</th>
                        <th class="col-2 text-right">Opciones</th>
                    </tr>
                </thead>
                <tbody>
                  <#include "/vistas/tests/empresas.ftl">
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