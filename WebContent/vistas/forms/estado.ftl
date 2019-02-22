<div class="row">
	<div class="col-lg-12">	
		<form id="formEstado" method="POST" action="#">

				  	<div class="form-group bmd-form-group">

			      		<div class="input-group">
			                <div class="input-group-prepend">
			                    <span class="input-group-text">
			                      <i class="fa fa-building"></i>
			                    </span>
			                </div>
			                <div class="col-sm-10">
						      	<div class="form-group bmd-form-group">
					                <label for="nombreEstado" class="bmd-label-floating">Estado</label>
					                <input type="text" class="form-control" id="nombre" name="nombre">
					            </div>
						    </div>
			            </div>
			            
			            <div class="input-group">
			                <div class="input-group-prepend">
			                    <span class="input-group-text">
			                      <i class="fa fa-compass" aria-hidden="true"></i>
			                    </span>
			                </div>
			                <div class="col-sm-10">
						      	<div class="form-group bmd-form-group">
					                <div class="form-group row">
									    <label for="estado" class="col-sm-2 col-form-label">Pais</label>
									    <div class="col-sm-10">
										      <select name="pais" id="pais" class="form-control" data-val-required="El pais es obligatorio">
										        <option selected>Selecciona el estado</option>
										        <#list paises>
												    <#items as pais>
												      <li>${user}</li>
												      <option value="${pais.id}">${pais.nombre}</option>
												    </#items>
												<#else>
												  <option selected>No hay paises registrados. Por favor, registra un pais</option>
												</#list>
										     </select>
								    	</div>
									</div>
					            </div>
						    </div>
			            </div>
			            
			            
			            
					</div>
					
				<input name="operacion" type="hidden" value="guardarEstado">
				<button type="submit" class="btn btn-primary" onclick="guardarEstado(event)">A&ntilde;adir</button>
		</form>
	</div>
</div>