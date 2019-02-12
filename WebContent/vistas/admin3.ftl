
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="assets/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>
    Perfil Admin
  </title>
  <#include "/vistas/includes/links.html">
  
   <meta charset="utf-8" />
    
    <script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
    <script src="http://code.highcharts.com/highcharts.js"></script>
    <script src="http://code.highcharts.com/modules/exporting.js"></script>
  
</head>

<body class="profile-page sidebar-collapse">
  <#include "/vistas/includes/navbarAdmin.ftl">
  <div class="page-header header-filter" data-parallax="true" style="background-image: url('assets/img/pexels-photo-1432942.jpeg');"></div>
  <div class="main main-raised">
    <div class="profile-content">
    	<div class="container">
    		
    			<div class="footer text-center">
		        	<h1 class="title">Estadisticas</h1>
				</div>

    			 <div class="col-md-">
		             <div class="description text-center">
		             <h3> Modificar Entidades Basicas</h3>
		         
		           
    					<a href="areasME2" class="btn btn-primary btn-lg active" role="button" onclick="" aria-pressed="true">Paises</a>
    					
    					<a href="#pablo" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Cuidades</a>
    					
    					<a href="#pablo" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Areas Prof.</a>
    					
    					<a href="#pablo"  class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Tipos Ded.</a>
    					
				      		              </div>
				      
		            </div>
    			    	
    			    	
    	<div>
    		<div class="col-md-">	
    			<div  id="grafica"></div>
					    <script>
					     $(function($){
					         $('#grafica').highcharts({
					             title:{text:''},xAxis:{categories:['Registros','Busquedas','Postulaciones Aceptadas']},yAxis:{title:'Porcentaje %',plotLines:[{value:0,width:1,color:'#808080'}]}, tooltip:{valueSuffix:''},
					             legend:{layout:'vertical',align:'right',verticalAlign:'middle',borderWidth:0},
					             series:[{type: 'column',name: 'Empresas',data: [100,130, 110]}, 
					             {type: 'spline',name: 'Busquedas',data: [60,180, 250]}, 
					             {type: 'column',name: 'Profesionales',data: [350, 370,110]}, 
					             {type: 'spline',name: 'Registros',data: [40, 120, 160]},
					             {type: 'spline',name: 'Postulaciones Aceptadas',data: [40,60, 80]}
					           ],
					             plotOptions:{line:{dataLabels:{enabled:true}}}
					         });
					     }); </script>
    			 </div>
    		</div>
    			 
    			 
					
					
    	</br>
    	    	</br>
    	    	</br>
    	
    			
    			
    			<div>
    			<form class="form">
  				<div class="row">
  				
  				
				<div class="container">
				
				 <div class="row">
				
				
				
				<div style="float:left;margin-right:50px;">
					<canvas id="canvas1"></canvas>
					<div id="leyenda1" class="leyenda"></div>
				</div>
	 
				<div style="float:left;">
					<canvas id="canvas2"></canvas>
					<div id="leyenda2" class="leyenda leyendaH"></div>
				</div>
	 
					<script>
/**
 * Clase para generar graficos de pastel
 * Tiene que recibir:
 *	el id del canvas
 *	la anchura y altura del canvas
 *	un array con los valores a mostrar del tipo:
 *		var valores={
 *			"Access":	{valor:10,color:"blue"},
 *			"PHP":		{valor:23,color:"red"},
 *			"Python":	{valor:18,color:"green"},
 *			".NET":		{valor:12,color:"Orange"},
 *			"C++":		{valor:30,color:"Cyan"}
 *		}
 */
var miPastel=function(canvasId,width,height,valores) {
	this.canvas=document.getElementById(canvasId);;
	this.canvas.width=width;
	this.canvas.height=height;
	this.radio=Math.min(this.canvas.width/2,this.canvas.height/2)
	this.context=this.canvas.getContext("2d");
	this.valores=valores;
	this.tamanoDonut=0;
 
	/**
	 * Dibuja un gráfico de pastel
	 */
	this.dibujar=function() {
		this.total=this.getTotal();
		var valor=0;
		var inicioAngulo=0;
		var angulo=0;
 
		// creamos los quesos del pastel
		for(var i in this.valores)
		{
			valor=valores[i]["valor"];
			color=valores[i]["color"];
			angulo=2*Math.PI*valor/this.total;
 
			this.context.fillStyle=color;
			this.context.beginPath();
			this.context.moveTo(this.canvas.width/2, this.canvas.height/2);
			this.context.arc(this.canvas.width/2, this.canvas.height/2, this.radio, inicioAngulo, (inicioAngulo+angulo));
			this.context.closePath();
			this.context.fill();
			inicioAngulo+=angulo;
		}
	}
 
	/**
	 * Dibuja un gráfico de pastel con una redonda en medio en modo de donut
	 * Tiene que recibir:
	 *	el tamaño de la redonda central (0 no hay redonda - 1 es todo)
	 *	el color de la redonda
	 */
	this.dibujarDonut=function(tamano,color) {
		this.tamanoDonut=tamano;
		this.dibujar();
 
		// creamos un circulo del color recibido en medio
		this.context.fillStyle=color;
		this.context.beginPath();
		this.context.moveTo(this.canvas.width/2, this.canvas.height/2);
		this.context.arc(this.canvas.width/2, this.canvas.height/2, this.radio*tamano, 0, 2*Math.PI);
		this.context.closePath();
		this.context.fill();
	}
 
	/**
	 * Pone el tanto por ciento de cada uno de los valores
	 * Tiene que recibir:
	 *	el color del texto
	 */
	this.ponerPorCiento=function(color){
		var valor=0;
		var etiquetaX=0;
		var etiquetaY=0;
		var inicioAngulo=0;
		var angulo=0;
		var texto="";
		var incrementar=0;
 
		// si hemos dibujado un donut, tenemos que incrementar el valor del radio
		// para que quede centrado
		if(this.tamanoDonut)
			incrementar=(this.radio*this.tamanoDonut)/2;
 
		this.context.font="bold 12pt Calibri";
		this.context.fillStyle=color;
		for(var i in this.valores)
		{
			valor=valores[i]["valor"];
			angulo=2*Math.PI*valor/this.total;
 
			// calculamos la posición del texto
			etiquetaX=this.canvas.width/2+(incrementar+this.radio/2)*Math.cos(inicioAngulo+angulo/2);
			etiquetaY=this.canvas.height/2+(incrementar+this.radio/2)*Math.sin(inicioAngulo+angulo/2);
 
			texto=Math.round(100*valor/this.total);
 
			// movemos la posición unos pixels si estamos en la parte izquierda
			// del pastel para que quede mas centrado
			if(etiquetaX<this.canvas.width/2)
				etiquetaX-=10;
 
			// ponemos los valores
			this.context.beginPath();
			this.context.fillText(texto+"%", etiquetaX, etiquetaY);
			this.context.stroke();
 
			inicioAngulo+=angulo;
		}
	}
 
	/**
	 * Function que devuelve la suma del total de los valores recibidos en el array
	 */
	this.getTotal=function() {
		var total=0;
		for(var i in this.valores)
		{
			total+=valores[i]["valor"];
		}
		return total;
	}
 
	/**
	 * Función que devuelve una lista (<ul><li>) con la leyenda
	 * Tiene que recibir el id donde poner la leyenda
	 */
	this.ponerLeyenda=function(leyendaId) {
		var codigoHTML="<ul class='leyenda'>";
 
		for(var i in this.valores)
		{
			codigoHTML+="<li><span style='background-color:"+valores[i]["color"]+"'></span>"+i+"</li>";
		}
		codigoHTML+="</ul>";
		document.getElementById(leyendaId).innerHTML=codigoHTML;
	}
}
 
// definimos los valores de nuestra gráfica
var valores={
	"Registros de Profesionales":{valor:10,color:"#008080"},
	"Registros de Empresas":{valor:23,color:"#B22222"},
	"Busquedas de Ofertas":{valor:18,color:"#3CB371"},
	"Busquedas de Profesionales":{valor:12,color:"#CD853F"},
	"Ofertas Creadas":{valor:30,color:"Cyan"},
	"Postulaciones":{valor:20,color:"#FFA07A"}

}
 
// generamos el primer pastel
var pastel=new miPastel("canvas1",300,300,valores);
pastel.dibujar();
pastel.ponerPorCiento("white");
pastel.ponerLeyenda("leyenda1");
 
// generamos el segundo pastel
var pastel=new miPastel("canvas2",300,300,valores);
pastel.dibujarDonut(0.5,"white");
pastel.ponerPorCiento("white");
pastel.ponerLeyenda("leyenda2");
</script>
				
				
				</div>
				</div>
				</div>
				
				</form>
				</div>
				
				
				
				
				
				
				<div class="row">
		    				<div class="card bg-info">
							    <div class="card-body">
							        <h5 class="card-category card-category-social">
							            <i class="fa fa-"></i> Candidatos
							        </h5>
							        <h4 class="card-title">
							            700 Registrados
							        </h4>
							
							        <div class="card-stats">
							            <div class="author">
							                <a href="#pablo">
							                <div class="progress-container">
											    <span class="progress-badge">Representa el 50% de todos los usuarios registrados</span>
											    <div class="progress">
											        <div class="progress-bar" role="progressbar" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100" style="width: 50%;">
											        </div>
											    </div>
											</div>
							                  
							                </a>
							            </div>
							           <div class="stats ml-auto">
							                <i class="material-icons">favorite</i>
							            </div>
							        </div>
							    </div>
							</div>
							
							<div class="card bg-info">
							    <div class="card-body">
							        <h5 class="card-category card-category-social">
							            <i class="fa fa-"></i> Empresas
							        </h5>
							        <h4 class="card-title">
							            700 Registradas
							        </h4>
							
							        <div class="card-stats">
							            <div class="author">
							                <a href="#pablo">
							                <div class="progress-container">
											    <span class="progress-badge">Representa el 50% de todos los usuarios registrados</span>
											    <div class="progress">
											        <div class="progress-bar" role="progressbar" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100" style="width: 50%;">
											        </div>
											    </div>
											</div>
							                </a>
							            </div>
							           <div class="stats ml-auto">
							                <i class="material-icons">favorite</i>
							            </div>
							        </div>
							    </div>
							</div>
							
							<div class="card bg-success">
							    <div class="card-body">
							        <h5 class="card-category card-category-social">
							            <i class="fa fa-"></i> Ofertas de empleo
							        </h5>
							        <h4 class="card-title">
							            5000 Publicadas
							        </h4>
							
							        <div class="card-stats">
							            <div class="author">
							                <a href="#pablo">
							                   <div class="progress-container">
											    <span class="progress-badge">De las cuales el 60% se encuentran activas</span>
											    <div class="progress">
											        <div class="progress-bar" role="progressbar" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
											        </div>
											    </div>
											</div>
							                </a>
							            </div>
							           <div class="stats ml-auto">
							                <i class="material-icons">favorite</i>
							            </div>
							        </div>
							    </div>
							</div>
							
							<div class="card bg-success">
							    <div class="card-body">
							        <h5 class="card-category card-category-social">
							            <i class="fa fa-"></i> Aplicaciones de candidatos
							        </h5>
							        <h4 class="card-title">
							            12000 Realizadas
							        </h4>
							
							        <div class="card-stats">
							            <div class="author">
							                <a href="#pablo">
							                <div class="progress-container">
											    <span class="progress-badge">De las cuales el 80% han tenido resultados exitosos</span>
											    <div class="progress">
											        <div class="progress-bar" role="progressbar" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100" style="width: 80%;">
											        </div>
											    </div>
											</div>
							
							                </a>
							            </div>
							           <div class="stats ml-auto">
							                <i class="material-icons">favorite</i>
							            </div>
							        </div>
							    </div>
							</div>
							
		    			</div>
    			
    				</div>
    			
    			
    	</div>
    </div>
  
  		<div class="col-md-11 ml-auto mr-auto">
 			
  				<div class="card-body text-center">
  				<!-- <a href="postulations"  class="btn btn-danger" role="tab" data-toggle="tab">
  					Postulaciones realizadas
  				</a>   -->
  			
    			<#include "/vistas/tests/modal.ftl">
    			<#include "/vistas/modals/conocimientos.ftl">
    			<#include "/vistas/modals/areas.ftl">
    			<#include "/vistas/modals/dedicacion.ftl">
    			<#include "/vistas/modals/areasME.ftl">
    			
  				</div>
  			
  		</div>
    


  
  <#include "/vistas/includes/footer.html">
  
  <#include "/vistas/includes/scripts.html">
  
  
</body>

</html>
