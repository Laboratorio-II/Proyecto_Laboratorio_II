<!DOCTYPE html>
<html lang="en">
  <head>
   	<#assign title = "Buscar Empresa">
    <#include "includes/head.ftl" parse=true>
  </head>

  <body class="nav-on-header smart-nav bg-alt">
    <!-- Page header -->
    <header class="page-header bg-img" style="background-image: url(assets/img/empresa5.png);">
      <div class="container page-name">
        <h1 class="text-center">Buscar Empresa</h1>
        <p class="lead text-center">Use la siguiente caja de búsqueda para encontrar la empresa que necesita</p>
      </div>

      <div class="container">
       
        <form action="#">

          
            <div class="form-group col-xs-12 col-sm-4">
              <input type="text" class="form-control" placeholder="Localización: ciudad, estado o país">
            </div>

            <div class="form-group col-xs-12 col-sm-4">
              <select class="form-control selectpicker" multiple>
                <option selected>Tipo de Empresa</option>
                <option>Financiera</option>
                <option>Cuidado para la salud</option>
                <option>Venta</option>
                <option>Marketing</option>
                <option>Tecnologias de información</option>
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

    </header>
    <!-- END Page header -->


    <!-- Main container -->
    <main>
      <section class="no-padding-top bg-alt">
        <div class="container">
          <div class="row">

            <div class="col-xs-12">
              <br>
              <h5>Se encontraron <strong>357</strong> Compañias, para tu solicitud <i>10</i> de <i>20</i></h5>
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
                  <p>Esta empresa dedicada a la gestión de bases de datos también es hija de los 70, ya que se fundó en 1977. Su sistema Oracle Database ha dominado el mercado de bases de datos empresariales durante muchos años. Entre las características principales de esta empresa están una vez más el foco en la innovación y en la calidad de sus productos tecnológicos</p>
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
                  <p>En sus poco más de 20 años de historia, Amazon ha logrado revolucionar por completo nuestros hábitos de compra e incluso los de lectura, ya que su Kindle es uno de los libros electrónicos más populares a nivel mundial. Esta gran empresa del comercio electrónico basa su éxito en la atención a la experiencia del usuario: gracias a ellos, comprar en Internet es hoy más fácil que nunca.</p>
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
                  <p>La empresa de Bill Gates es el principal competidor de Apple y tiene una fecha de origen similar, ya que se fundó en 1975. Conocida sobre todo por el sistema operativo Windows y las soluciones de ofimática Microsoft Office, esta empresa emplea a 93.000 personas en 102 países diferentes. Detrás de su éxito se esconde la gran ambición de su fundador: "tener una estación de trabajo que funcione con nuestro software en cada escritorio y en cada hogar".</p>
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
    <!-- END Main container -->
	  <#include "includes/footer.ftl" parse=true>
	  <#include "includes/scripts.ftl" parse=true>
   
  </body>
</html>