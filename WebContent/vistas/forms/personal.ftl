

<form id="formDatosPersonales" method="POST" action="#">
	<div class="form-group bmd-form-group">
	
		<div class="input-group">
          <div class="input-group-prepend">
              <span class="input-group-text">
                <i class="fa fa-id-card-o" aria-hidden="true"></i>
              </span>
          </div>
	       <div class="col-sm-10">
	      	<div class="form-group bmd-form-group">
                <label for="nombre" class="bmd-label-floating">Nombre</label>
                <input type="text" class="form-control" id="nombre" name="nombre" value="<#if datospersonales?has_content>${datospersonales.nombre}</#if>">
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
	                <label for="apellido" class="bmd-label-floating">Apellido</label>
	                <input type="text" class="form-control" id="apellido" name="apellido" value="<#if datospersonales?has_content>${datospersonales.apellido}</#if>">
	            </div>
		    </div>
	          </div>
	
	    		<div class="input-group">
	              <div class="input-group-prepend">
	                  <span class="input-group-text">
	                    <i class="fa fa-birthday-cake" aria-hidden="true"></i>
	                  </span>
	              </div>
	              <div class="col-sm-10">
		      	<div class="form-group bmd-form-group">
	                <label for="fechaNac" class="bmd-label-floating">Fecha de nacimiento</label>
	                <#setting date_format="yyyy-MM-dd">
					<#setting locale="en_US">
	                <input type="date" class="form-control" id="fechaNac" name="fechaNac" value="${datospersonales.fechaNacimiento?datetime("yyyy-MM-dd")?date}">
	            </div>
		    </div>
	          </div>
	
	          <!-- <div class="input-group">
	              <div class="input-group-prepend">
	                  <span class="input-group-text">
	                    <i class="fa fa-id-card-o" aria-hidden="true"></i>
	                  </span>
	              </div>
	              <div class="col-sm-10">
		      	<div class="form-group bmd-form-group">
	                <label for="identificacion" class="bmd-label-floating">Identificaci&oacute;n</label>
	                <input type="text" class="form-control" id="identificacion" name="identificacion">
	            </div>
		    </div>
	       </div>-->
	
		<!--<select id="identificacion1" class="form-control">
			<option selected>Selecciona</option>
			<option>C&eacute;dula de identidad</option>
	        <option>C&eacute;dula de extranjer&iacute;a</option>
	        <option>Pasaporte</option>
	        <option>NIF/NIT</option>
	    </select> -->
	
	          <div class="input-group">
	              <div class="input-group-prepend">
	                  <span class="input-group-text">
	                    <i class="fa fa-heart" aria-hidden="true"></i>
	                  </span>
	              </div>
	              <div class="col-sm-10">
		      	<div class="form-group bmd-form-group">
	                <div class="form-group row">
					    <label for="estadoCivil" class="col-sm-2 col-form-label">Estado civil</label>
					    <div class="col-sm-10">
						    <select name="estadoCivil" id="estadoCivil" class="form-control" data-val-required="El estado civil es obligatorio">
						        <!--  <option selected>Selecciona</option>-->
						        <#if datospersonales.estadoCivil == 'S'>
						        	<option selected value="S">Soltero(a)</option>
						        <#else>
						        	<option value="S">Soltero(a)</option>
						        </#if>
						        <#if datospersonales.estadoCivil == 'C'>
									<option selected value="C">Casado(a)</option>
								<#else>
								<option value="C">Casado(a)</option>
								</#if>
								<#if datospersonales.estadoCivil == 'D'>
									<option selected value="D">Separado(a)/Divorciado(a)</option>
								<#else>
									<option value="D">Separado(a)/Divorciado(a)</option>
								</#if>
								<#if  datospersonales.estadoCivil == 'V'>
									<option selected value="V">Viudo(a)</option>
								<#else>
									<option value="V">Viudo(a)</option>
								</#if>
							</select>
				    	</div>
					</div>
	            </div>
		    </div>
	          </div>
	
	          <div class="input-group">
	              <div class="input-group-prepend">
	                  <span class="input-group-text">
	                    <i class="fa fa-mobile" aria-hidden="true"></i>
	                  </span>
	              </div>
	              <div class="col-sm-10">
		      	<div class="form-group bmd-form-group">
	                <label for="telefono" class="bmd-label-floating">Tel&eacute;fono</label>
	                <input type="text" class="form-control" id="telefono" name="telefono" value="<#if datospersonales?has_content>${datospersonales.telefono}</#if>">
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
						      <select name="estado" id="Estado" class="form-control" data-val-required="El estado es obligatorio">
						        <option value="0" selected>Selecciona el estado</option>
						        <option value="2">Amazonas</option>
								<option value="3">Anzoátegui</option>
								<option value="4">Apure</option>
								<option value="5">Aragua</option>
								<option value="6">Barinas</option>
								<option value="7">Bolívar</option>
								<option value="8">Carabobo</option>
								<option value="9">Cojedes</option>
								<option value="10">Delta Amacuro</option>
								<option value="11">Distrito Capital</option>
								<option value="12">Falcón</option>
								<option value="13">Guárico</option>
								<option value="14">Lara</option>
								<option value="15">Mérida</option>
								<option value="16">Miranda</option>
								<option value="17">Monagas</option>
								<option value="18">Nueva Esparta</option>
								<option value="19">Portuguesa</option>
								<option value="20">Sucre</option>
								<option value="21">Táchira</option>
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
	
	          <!--  <div class="input-group">
	              <div class="input-group-prepend">
	                  <span class="input-group-text">
	                    <i class="fa fa-id-card-o" aria-hidden="true"></i>
	                  </span>
	              </div>
	              <div class="col-sm-10">
		      	<div class="form-group bmd-form-group">
	                <div class="form-group row">
					    <label for="nacionalidad" class="col-sm-2 col-form-label">Nacionalidad</label>
					    <div class="col-sm-10">
						      <select name="nacionalidad" id="nacionalidad" class="form-control" disabled="disabled">
						        <option value="0" selected>Venezuela</option>
						      </select>
				    		</div>
					 </div>
	            </div>
		    </div>
	          </div>-->
	
	          <div class="input-group">
	              <div class="input-group-prepend">
	                  <span class="input-group-text">
	                    <i class="fa fa-venus-mars" aria-hidden="true"></i>
	                  </span>
	              </div>
	              <div class="col-sm-10">
		      	<div class="form-group bmd-form-group">
	                <div class="form-group row">
					    <label for="nacionalidad" class="col-sm-2 col-form-label">G&eacute;nero</label>
					    <div class="col-sm-10">
						    <div class="form-check form-check-radio form-check-inline">
	
							  <label class="form-check-label">
							  	<#if datospersonales.genero == 'M'>
							    	<input class="form-check-input" checked type="radio" name="genero" id="genero1" value="M"> 
							    <#else>
							    	<input class="form-check-input" type="radio" name="genero" id="genero1" value="M">
							    </#if>
							    Masculino
							    <span class="circle">
							        <span class="check"></span>
							    </span>
							  </label>
							</div>
							<div class="form-check form-check-radio form-check-inline">
							  <label class="form-check-label">
							  <#if datospersonales.genero == 'F'>
							    <input class="form-check-input" checked type="radio" name="genero" id="genero2" value="F">
							  <#else>
							    <input class="form-check-input" type="radio" name="genero" id="genero2" value="F"> 
							  </#if>
							    Femenino
							    <span class="circle">
							        <span class="check"></span>
							    </span>
							  </label>
							</div>
	
				    	</div>
					 </div>
	            </div>
		    </div>
	          </div>
	
	          <!-- <div class="input-group">
	              <div class="input-group-prepend">
	                  <span class="input-group-text">
	                    <i class="fa fa-pencil" aria-hidden="true"></i>
	                  </span>
	              </div>
	              <div class="col-sm-10">
		      	<div class="form-group bmd-form-group">
	                <label for="tituloCV" class="bmd-label-floating">T&iacute;tulo breve del curr&iacute;culum</label>
	                <input type="text" class="form-control" id="tituloCV" name=""tituloCV"">
	            </div>
		    </div>
	          </div>-->
	
	          <div class="input-group">
	              <div class="input-group-prepend">
	                  <span class="input-group-text">
	                    <i class="fa fa-pencil" aria-hidden="true"></i>
	                  </span>
	              </div>
	              <div class="col-sm-10">
		      	<div class="form-group bmd-form-group">
	                <label for="descripcionPerfil" class="bmd-label-floating">Descripci&oacute;n de tu perfil profesional</label>
	                <textarea class="form-control" id="descripcionPerfil" name="descripcionPerfil" rows="3">${datospersonales.descripcion}</textarea>
	            </div>
		    </div>
	          </div>
	
	         <!--   <div class="input-group">
	              <div class="input-group-prepend">
	                  <span class="input-group-text">
	                    <i class="fa fa-language" aria-hidden="true"></i>
	                  </span>
	              </div>
	              <div class="col-sm-10">
		      	<div class="form-group bmd-form-group">
	                <div class="form-group row">
					    <label for="nacionalidad" class="col-sm-2 col-form-label">Idiomas</label>
					    <div class="col">
						      <select class="form-control selectpicker" data-style="btn btn-link" id="idioma" name="idioma">
								<option selected>Selecciona</option>
							    <option value="1">English</option>
							  	<option value="2">Espa&ntilde;ol</option>
							</select>
				    		</div>
				    	<div class="col">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">Nivel<b class="caret"></b></a>
		        			<ul class="dropdown-menu">
							  <li><a href="#">Muy b&aacute;sico</a></li>
							  <li><a href="#">B&aacute;sico</a></li>
							  <li><a href="#">Intermedio</a></li>
							  <li class="divider"></li>
							  <li><a href="#">Avanzado</a></li>
							  <li class="divider"></li>
						      <li><a href="#">Nativo</a></li>
		        			</ul>
				    	</div>
					 </div>
	            </div>
		    </div>
	          </div>-->

	</div>
	<input name="operacion" type="hidden" value="guardarDatosPersonales">
	<input name="user" type="hidden" value="33">
	<button type="submit" class="btn btn-danger" onclick="guardarDatosPersonales(event)">Guardar</button>

</form>