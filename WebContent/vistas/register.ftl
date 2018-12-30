<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="assets/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    Registro de usuarios
  </title>
  <#include "/vistas/includes/links.html">
</head>

<body class="signup-page sidebar-collapse">
  <#include "/vistas/includes/navbar.html">
  <div class="page-header header-filter" style="background-image: url('assets/img/bg7.jpg'); background-size: cover; background-position: top center;">
    <div class="container">
      <div class="card card-nav-tabs">
	    <div class="card-header card-header-danger">
	        <!-- colors: "header-primary", "header-info", "header-success", "header-warning", "header-danger" -->
	        <div class="nav-tabs-navigation">
	            <div class="nav-tabs-wrapper">
	                <ul class="nav nav-tabs" data-tabs="tabs">
	                    <li class="nav-item">
	                        <a class="nav-link active" href="#registerOne" data-toggle="tab">
	                        	<i class="material-icons">dashboard</i>
	                        	Candidato???
	                        </a>
	                    </li>
	                    <li class="nav-item">
	                        <a class="nav-link" href="#updates" data-toggle="tab">
	                        	<i class="material-icons">dashboard</i>
	                        	Empresa???
	                        </a>
	                    </li>
	                </ul>
	            </div>
	        </div>
	    </div><div class="card-body ">
	        <div class="tab-content tab-space text-center">
	            <div class="tab-pane active" id="registerOne">
	                <#include "/vistas/forms/registerOne.html">
	            </div>
	            <div class="tab-pane" id="updates">
	                <#include "/vistas/forms/registerTwo.html">
	            </div>
	        </div>
	    </div>
	  </div>
    </div>
    <#include "/vistas/includes/footer.html">
  </div>
  
  <#include "/vistas/includes/scripts.html">
</body>

</html>