<div class="row">
	<div class="col-lg-12">	
		<form id="formCiudad" method="POST" action="#">

				  	<div class="form-group bmd-form-group">

			      		<div class="input-group">
			                <div class="input-group-prepend">
			                    <span class="input-group-text">
			                      <i class="fa fa-building"></i>
			                    </span>
			                </div>
			                <div class="col-sm-10">
						      	<div class="form-group bmd-form-group">
					                <label for="nombreCiudad" class="bmd-label-floating">Ciudad</label>
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
									    <label for="ciudad" class="col-sm-2 col-form-label">Estado</label>
									    <div class="col-sm-10">
										      <select name="estado" id="estado" class="form-control" data-val-required="El estado es obligatorio">
										        <option selected>Selecciona la ciudad</option>
										        <#list estados>
												    <#items as estado>
												      <option value="${estado.id}">${estado.nombre}</option>
												    </#items>
												<#else>
												  <option selected>No hay estados registrados. Por favor, registra un estado</option>
												</#list>
										     </select>
								    	</div>
									</div>
					            </div>
						    </div>
			            </div>
			            
			            
			            
					</div>
					
				<input name="operacion" type="hidden" value="guardarCiudad">
				<button type="submit" class="btn btn-primary" onclick="guardarCiudad(event)">A&ntilde;adir</button>
		</form>
	</div>
</div>