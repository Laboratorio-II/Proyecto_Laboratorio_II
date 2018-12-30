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
  <div class="page-header header-filter" style="background-image: url('assets/img/bg7.jpg'); background-size: cover; background-position: top center;">
    <div class="container">
      <div class="row">
        <div class="col-lg-4 col-md-6 ml-auto mr-auto">
          <div class="card card-login">
            <form class="form" method="" action="">
              <div class="card-header card-header-danger text-center">
                <h4 class="card-title">Iniciar sesi&oacute;n</h4>
                <!-- <div class="social-line">
                  <a href="#pablo" class="btn btn-just-icon btn-link">
                    <i class="fa fa-facebook-square"></i>
                  </a>
                  <a href="#pablo" class="btn btn-just-icon btn-link">
                    <i class="fa fa-twitter"></i>
                  </a>
                  <a href="#pablo" class="btn btn-just-icon btn-link">
                    <i class="fa fa-google-plus"></i>
                  </a>
                </div>-->
              </div>
              <p class="description text-center">Ingrese sus datos</p>
              <div class="card-body">
                <div class="input-group">
                  <div class="input-group-prepend">
                    <span class="input-group-text">
                      <i class="material-icons">mail</i>
                    </span>
                  </div>
                  <input type="email" class="form-control" placeholder="Correo...">
                </div>
                <div class="input-group">
                  <div class="input-group-prepend">
                    <span class="input-group-text">
                      <i class="material-icons">lock_outline</i>
                    </span>
                  </div>
                  <input type="password" class="form-control" placeholder="Contrase&ntilde;a...">
                </div>
              </div>
              <div class="footer text-center">
                <button type="submit" href="#pablo" class="btn btn-danger">Ingresar</button>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
    <#include "/vistas/includes/footer.html">
  </div>
  
  <#include "/vistas/includes/scripts.html">
</body>

</html>