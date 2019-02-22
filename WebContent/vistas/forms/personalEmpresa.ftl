 <form id="formDatosLaboralesEmpresa" method="POST" action="#">



	      	<h2 class="title">Datos de la empresa</h2>

			<div class="form-group bmd-form-group">

	            <div class="input-group">
	                <div class="input-group-prepend">
	                    <span class="input-group-text">
	                      <i class="fa fa-id-card-o" aria-hidden="true"></i>
	                    </span>
	                </div>
	                <div class="col-sm-10">
				      	<div class="form-group bmd-form-group">
			                <label for="name" class="bmd-label-floating">Nombre o raz&oacute;n social</label>
			                <input type="text" class="form-control" name="nombreempresa" id="nombreempresa" value="${datosempresa.nombre}">
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
			                <label for="rif" class="bmd-label-floating">RIF de la empresa</label>
			                <input type="text" class="form-control" name="rif" id="rif">
			            </div>
				    </div>
	            </div>

	            <div class="input-group">
	                <div class="input-group-prepend">
	                    <span class="input-group-text">
	                      <i class="fa fa-globe" aria-hidden="true"></i>
	                    </span>
	                </div>
	                <div class="col-sm-10">
				      	<div class="form-group bmd-form-group">
			                <div class="form-group row">
							    <label for="pais" class="col-sm-2 col-form-label">Pa&iacute;s</label>
							    <div class="col-sm-10">
								      <select name="pais" id="pais" class="form-control">
								        <option selected value="1">Venezuela</option>
								      </select>
						    		</div>
							 </div>
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
							    <label for="estado" class="col-sm-2 col-form-label">Estado</label>
							    <div class="col-sm-10">
								      <select name="estado" id="estado" class="form-control" data-val-required="El estado es obligatorio">
								        <option value="0" selected>Selecciona el estado</option>
								        <option value="2">Amazonas</option>
										<option value="3">Anzo&aacute;tegui</option>
										<option value="4">Apure</option>
										<option value="5">Aragua</option>
										<option value="6">Barinas</option>
										<option value="7">Bol&iacute;var</option>
										<option value="8">Carabobo</option>
										<option value="9">Cojedes</option>
										<option value="10">Delta Amacuro</option>
										<option value="11">Distrito Capital</option>
										<option value="12">Falc&oacute;n</option>
										<option value="13">Gu&aacute;rico</option>
										<option value="14">Lara</option>
										<option value="15">M&eacute;rida</option>
										<option value="16">Miranda</option>
										<option value="17">Monagas</option>
										<option value="18">Nueva Esparta</option>
										<option value="19">Portuguesa</option>
										<option value="20">Sucre</option>
										<option value="21">T&aacute;chira</option>
										<option value="22">Trujillo</option>
										<option value="23">Vargas</option>
										<option value="24">Yaracuy</option>
										<option value="25">Zulia</option>
										<option value="1">Extranjero</option>
								     </select>
						    	</div>
							</div>
			            </div>
				    </div>
	            </div>

	            <div class="input-group">
	                <div class="input-group-prepend">
	                    <span class="input-group-text">
	                      <i class="fa fa-map-marker" aria-hidden="true"></i>
	                    </span>
	                </div>
	                <div class="col-sm-10">
				      	<div class="form-group bmd-form-group">
			                <div class="form-group row">
							    <label for="ciudad" class="col-sm-2 col-form-label">Ciudad</label>
							    <div class="col-sm-10">
								     <select name="ciudad" id="ciudad" class="form-control" data-val-required="La ciudad es obligatoria">
								        <option value="0" selected>Seleccione una ciudad</option>
								     </select>
						    	</div>
							 </div>
			            </div>
				    </div>
	            </div>

			    <div class="input-group">
	                <div class="input-group-prepend">
	                    <span class="input-group-text">
	                      <i class="fa fa-map-marker" aria-hidden="true"></i>
	                    </span>
	                </div>
	                <div class="col-sm-10">
				      	<div class="form-group bmd-form-group">
			                <label for="direccion" class="bmd-label-floating">Direcci&oacute;n</label>
			                <input type="text" class="form-control" name="direccionempresa" id="direccionempresa">
			            </div>
				    </div>
	            </div>



	            <!--  <div class="input-group">
	                <div class="input-group-prepend">
	                    <span class="input-group-text">
	                      <i class="fa fa-building" aria-hidden="true"></i>
	                    </span>
	                </div>
	                <div class="col-sm-10">
				      	<div class="form-group bmd-form-group">
			                <div class="form-group row">
							    <label for="sectorEmpresarial" class="col-sm-2 col-form-label">Sector empresarial</label>
							    <div class="col-sm-10">
								      <select name="sectorEmpresarial" id="sectorEmpresarial" class="form-control" data-val-required="El sector es obligatorio">
								        <option selected>Seleccione el sector</option>
								        <option value="2">Agricultura / Pesca / Ganadería</option>
										<option value="5">Construcci&oacute;n / obras</option>
										<option value="7">Educaci&oacute;n</option>
										<option value="8">Energ&iacute;a</option>
										<option value="9">Entretenimiento / Deportes</option>
										<option value="15">Fabricación</option>
										<option value="10">Finanzas / Banca</option>
										<option value="16">Gobierno / No Lucro</option>
										<option value="12">Hostelería / Turismo</option>
										<option value="3">Inform&aacute;tica / Hardware</option>
										<option value="4">Inform&aacute;tica / Software</option>
										<option value="13">Internet</option>
										<option value="23">Legal / Asesoría</option>
										<option value="18">Materias Primas</option>
										<option value="14">Medios de Comunicación</option>
										<option value="1">Publicidad / RRPP</option>
										<option value="19">RRHH / Personal</option>
										<option value="11">Salud / Medicina</option>
										<option value="17">Servicios Profesionales</option>
										<option value="21">Telecomunicaciones</option>
										<option value="22">Transporte</option>
										<option value="6">Venta al consumidor</option>
										<option value="20">Venta al por mayor</option>
								      </select>
						    	</div>
							</div>
			            </div>
				    </div>
	            </div>-->

				<div class="input-group">
	                <div class="input-group-prepend">
	                    <span class="input-group-text">
	                      <i class="fa fa-building" aria-hidden="true"></i>
	                    </span>
	                </div>
	                <div class="col-sm-10">
				      	<div class="form-group bmd-form-group">
			                <label for="descripcionEmpresa" class="bmd-label-floating">Descripci&oacute;n de la empresa</label>
			                <textarea class="form-control" name="descripcionEmpresa" id="descripcionEmpresa" rows="1"></textarea>
			            </div>
				    </div>
	            </div>
			   

	        </div>
				<input name="operacion" type="hidden" value="guardarDatosLaboralesEmpresa">
				<input name="user" type="hidden" value="39">
	      				  <button type="submit" class="btn btn-danger" onclick="guardarDatosLaboralesEmpresa(event)">Guardar</button>
	      				  </form>
	      	