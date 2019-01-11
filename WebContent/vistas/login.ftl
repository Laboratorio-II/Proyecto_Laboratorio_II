<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="assets/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    Inicio de sesi&oacute;n
  </title>
  <#include "/vistas/includes/links.html">
</head>

<body class="signup-page sidebar-collapse">
  <#include "/vistas/includes/navbar.html">
  <div class="page-header header-filter" style="background-image: url('assets/img/1.jpg'); background-size: cover; background-position: top center;">
    <div class="container">
      <div class="row">
        <div class="col-lg-4 col-md-6 ml-auto mr-auto">
          <div class="card card-login">
            <#include "/vistas/forms/login.html">
          </div>
        </div>
      </div>
    </div>
    <#include "/vistas/includes/footer.html">
  </div>
  
  <#include "/vistas/includes/scripts.html">
</body>

</html>