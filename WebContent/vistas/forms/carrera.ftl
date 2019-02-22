<div class="row">
	<div class="col-lg-12">	
		<form id="formCarrera" method="POST" action="#">

				  	<div class="form-group bmd-form-group">

			      		<div class="input-group">
			                <div class="input-group-prepend">
			                    <span class="input-group-text">
			                      <i class="fa fa-building"></i>
			                    </span>
			                </div>
			                <div class="col-sm-10">
						      	<div class="form-group bmd-form-group">
					                <label for="nombreCarrera" class="bmd-label-floating">Carrera</label>
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
									    <label for="carrera" class="col-sm-2 col-form-label">AreaProfesional</label>
									    <div class="col-sm-10">
										      <select name="areaprofesional" id="areaprofesional" class="form-control" data-val-required="El areaprofesional es obligatorio">
										        <option selected>Selecciona la carrera</option>
										        <#list areasprofesionales>
												    <#items as areaprofesional>
												      <option value="${areaprofesional.id}">${areaprofesional.nombre}</option>
												    </#items>
												<#else>
												  <option selected>No hay areasprofesionales registrados. Por favor, registra un areaprofesional</option>
												</#list>
										     </select>
								    	</div>
									</div>
					            </div>
						    </div>
			            </div>
			            
			            
			            
					</div>
					
				<input name="operacion" type="hidden" value="guardarCarrera">
				<button type="submit" class="btn btn-primary" onclick="guardarCarrera(event)">A&ntilde;adir</button>
		</form>
	</div>
</div>