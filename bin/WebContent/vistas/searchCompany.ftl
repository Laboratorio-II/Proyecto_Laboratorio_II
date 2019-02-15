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
  <#include "/vistas/includes/navbarLogon.ftl">
  <div class="page-header header-filter" data-parallax="true" style="background-image: url('assets/img/city-profile.jpg');"></div>
  <div class="main main-raised">
    <div class="profile-content">
    	<div class="container">
    		<div class="row">
    			<form action="#">

          
	            <div class="form-group col-xs-12 col-sm-12">
	              <input type="text" class="form-control" placeholder="LocalizaciÃ³n: ciudad, estado o paÃ­s">
	            </div>
	
	            <div class="form-group col-xs-12 col-sm-12">
	              <select class="form-control selectpicker" multiple>
	                <option selected>Tipo de Empresa</option>
	                <option>Financiera</option>
	                <option>Cuidado para la salud</option>
	                <option>Venta</option>
	                <option>Marketing</option>
	                <option>Tecnologias de informaciÃ³n</option>
	                <option>Otros</option>
	              </select>
	            </div>
	
	
	          <div class="button-group">
	            <div class="action-buttons">
	              <button class="btn btn-primary">Buscar</button>
	            </div>
	          </div>
	
	        </form>
	    </div>
    </div>
  </div>
  
	<main>
      <section class="no-padding-top bg-alt">
        <div class="container">
          <div class="row">

            <div class="col-xs-12">
              <br>
              <h5>Se encontraron <strong>357</strong> CompaÃ±ias, para tu solicitud <i>10</i> de <i>20</i></h5>
            </div>

            <!-- Job item -->
            <div class="col-xs-12">
              <a class="item-block" href="company-detail">
                <header>
                  <img src="assets/img/logo-oracle.png" alt="">
                  <div class="hgroup">
                    <h4>Oracle</h4>
                  </div>
                  <time datetime="2016-03-10 20:00">34 min ago</time>
                </header>

                <div class="item-body">
                  <p>Esta empresa dedicada a la gestiÃ³n de bases de datos tambiÃ©n es hija de los 70, ya que se fundÃ³ en 1977. Su sistema Oracle Database ha dominado el mercado de bases de datos empresariales durante muchos aÃ±os. Entre las caracterÃ­sticas principales de esta empresa estÃ¡n una vez mÃ¡s el foco en la innovaciÃ³n y en la calidad de sus productos tecnolÃ³gicos</p>
                  </div>

               
              </a>
            </div>
            <!-- END Job item -->


            <!-- Job item -->
            <div class="col-xs-12">
             <a class="item-block" href="company-detail">
                <header>
                  <img src="assets/img/logo-amazon.png" alt="">
                  <div class="hgroup">
                    <h4>Amazon</h4>
                  </div>
                  <time datetime="2016-03-10 20:00">8 hours ago</time>
                </header>

                <div class="item-body">
                  <p>En sus poco mÃ¡s de 20 aÃ±os de historia, Amazon ha logrado revolucionar por completo nuestros hÃ¡bitos de compra e incluso los de lectura, ya que su Kindle es uno de los libros electrÃ³nicos mÃ¡s populares a nivel mundial. Esta gran empresa del comercio electrÃ³nico basa su Ã©xito en la atenciÃ³n a la experiencia del usuario: gracias a ellos, comprar en Internet es hoy mÃ¡s fÃ¡cil que nunca.</p>
                  </div>

              
              </a>
            </div>
            <!-- END Job item -->


            <!-- Job item -->
            <div class="col-xs-12">
              <a class="item-block" href="company-detail">
                <header>
                  <img src="assets/img/logo-microsoft.png" alt="">
                  <div class="hgroup">
                    <h4>Microsoft</h4>
                    </div>
                  <time datetime="2016-03-10 20:00">2 days ago</time>
                </header>

                <div class="item-body">
                  <p>La empresa de Bill Gates es el principal competidor de Apple y tiene una fecha de origen similar, ya que se fundÃ³ en 1975. Conocida sobre todo por el sistema operativo Windows y las soluciones de ofimÃ¡tica Microsoft Office, esta empresa emplea a 93.000 personas en 102 paÃ­ses diferentes. DetrÃ¡s de su Ã©xito se esconde la gran ambiciÃ³n de su fundador: "tener una estaciÃ³n de trabajo que funcione con nuestro software en cada escritorio y en cada hogar".</p>
                  </div>

              </a>
            </div>
            <!-- END Job item -->

          <!-- Page navigation -->
          <nav class="text-center">
            <ul class="pagination">
              <li>
                <a href="#" aria-label="Previous">
                  <i class="ti-angle-left"></i>
                </a>
              </li>
              <li><a href="#">1</a></li>
              <li class="active"><a href="#">2</a></li>
              <li><a href="#">3</a></li>
              <li><a href="#">4</a></li>
              <li>
                <a href="#" aria-label="Next">
                  <i class="ti-angle-right"></i>
                </a>
              </li>
            </ul>
          </nav>
          <!-- END Page navigation -->

        </div>
      </section>
    </main>
    
  <#include "/vistas/includes/footer.html">
  
  <#include "/vistas/includes/scripts.html">
</body>

</html>