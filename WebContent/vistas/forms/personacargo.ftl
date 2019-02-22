 <form id="formDatosPersonalesEmpresa" method="POST" action="#">

	      	<h2 class="title">Datos de la persona de contacto</h2>

			<div class="form-group bmd-form-group">

	            <div class="input-group">
	                <div class="input-group-prepend">
	                    <span class="input-group-text">
	                      <i class="fa fa-id-card-o" aria-hidden="true"></i>
	                    </span>
	                </div>
	                <div class="col-sm-10">
				      	<div class="form-group bmd-form-group">
			                <label for="nameContact" class="bmd-label-floating">Nombres</label>
			                <input type="text" class="form-control" name="nombreContactoPC" id="nombreContactoPC" value="${personaacargo.nombre}">
			            </div>
				    </div>
	            </div>

				<div class="input-group">
	                <div class="input-group-prepend">
	                    <span class="input-group-text">
	                      <i class="fa fa-id-card-o" aria-hidden="true"></i>
	                    </span>
	                </div>
	                <div class="col-sm-10">
				      	<div class="form-group bmd-form-group">
			                <label for="apellidos" class="bmd-label-floating">Apellidos</label>
			                <input type="text" class="form-control" name="apellidosPC" id="apellidosPC" value="${personaacargo.apellido}">
			            </div>
				    </div>
	            </div>

	            <div class="input-group">
	                <div class="input-group-prepend">
	                    <span class="input-group-text">
	                      <i class="fa fa-group"></i>
	                    </span>
	                </div>
	                <div class="col-sm-10">
				      	<div class="form-group bmd-form-group">
			                <div class="form-group row">
							    <label for="cargo" class="col-sm-2 col-form-label">Cargo</label>
							    <div class="col-sm-10">
								      <select name="cargo" id="cargo" class="form-control" data-val-required="El sector es obligatorio">
								        <option selected>Selecciona tu cargo</option>
								        <option value="1">Presidente</option>
										<option value="2">Director</option>
										<option value="3">Gerente</option>
										<option value="4">Jefe</option>
										<option value="5">Coordinador</option>
										<option value="6">Analista</option>
								      </select>
						    	</div>
							</div>
			            </div>
				    </div>
	            </div>

	            <div class="input-group">
	                <div class="input-group-prepend">
	                    <span class="input-group-text">
	                      <i class="fa fa-phone"></i>
	                    </span>
	                </div>
	                <div class="col-sm-10">
				      	<div class="form-group bmd-form-group">
			                <label for="telefono" class="bmd-label-floating">Tel&eacute;fono</label>
			                <input type="text" class="form-control" name="telefonoPC" id="telefonoPC" value="${personaacargo.telefono}">
			            </div>
				    </div>
	            </div>

	        </div>
	        <input name="operacion" type="hidden" value="guardarDatosPersonalesEmpresa">
	        <input name="user" type="hidden" value="39">
	      				  <button type="submit" class="btn btn-danger" onclick="guardarDatosPersonalesEmpresa(event)">Guardar</button>
	      				  </form>