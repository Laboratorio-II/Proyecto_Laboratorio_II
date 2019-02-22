
<div class="row">
		<div class="col-md-12">
			<div class="card">
				<div class="card-body">
		<div>
				<div class="footer text-center">
		        <h2 class="title">Ofertas Creadas por Empresas</h2>
		        
				</div>
	 					<#list ofertas as oferta>
				    			<div class="card bg-info">
				    			<!-- este es el color azul de la info-->
							    	<div class="card-body">
							        	<div class="card-stats">
											<div class="author">
											  <div class="card-body">
											  	<div class="row">
												   <div class="col-md-12">
												    	<h2 class="card-title">${oferta.descripcion} </h2>
													       <h3>   <strong>  <em><a class="card-subtitle mb-2 text-muted">Grupo A3B</a> </em>   </strong>   </h3>
													       <h3>   <strong>  <em><a  class="card-text">Programador que sepa programar</a> </em>   </strong>   </h3>
													</div>
													</div>
													<h4><strong><em> <a href="detalle_oferta" class="card-link"  >   <button  type="button" class="btn btn-primary btn-lg"  >Ver Oferta</button> </a> 
											    						<a href="#0" class="card-link">   <button  type="button" class="btn btn-primary btn-lg"  >Cancelar postulacion</button>  </a>  </em> </strong> </h4>
											  </div>
										      </div>
											 <div class="stats ml-auto">
												    <i class="material-icons">favorite</i>
											</div>
											
										</div>
										
									</div>
									
								</div>
								</#list>
</div>