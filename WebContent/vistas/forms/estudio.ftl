<div class="row">
				  <div class="col-lg-12">

				  	<form id="formDatosEstudios" method="POST" action="#">

				  	<div class="form-group bmd-form-group">


			      		<div class="input-group">
			                <div class="input-group-prepend">
			                    <span class="input-group-text">
			                      <i class="fa fa-university" aria-hidden="true"></i>
			                    </span>
			                </div>
			                <div class="col-sm-10">
						      	<div class="form-group bmd-form-group">
					                <label for="centroEducativo" class="bmd-label-floating">Centro educativoOOO</label>
					                <input type="text" class="form-control" name="centroEducativo" id="centroEducativo">
					            </div>
						    </div>
			            </div>

			            <div class="input-group">
			                <div class="input-group-prepend">
			                    <span class="input-group-text">
			                      <i class="fa fa-graduation-cap" aria-hidden="true"></i>
			                    </span>
			                </div>
			                <div class="col-sm-10">
						      	<div class="form-group bmd-form-group">
					                <div class="form-group row">
									    <label for="nivelEstudios" class="col-sm-2 col-form-label">Nivel de estudios</label>
									    <div class="col-sm-10">
										    <select name="nivelEstudios" id="nivelEstudios" class="form-control" data-val-required="El nivel de estudios es obligatorio">
										        <option selected>Selecciona</option>
										        <option value="1">Educaci&oacute;n b&aacute;sica primaria</option>
												<option value="2">Educaci&oacute;n b&aacute;sica secundaria</option>
												<option value="3">Bachillerato/Educaci&oacute;n Media</option>
												<option value="4">Educaci&oacute;n T&eacute;cnico/Profesional</option>
												<option value="5">Universidad</option>
												<option value="5">Postgrado</option>
											</select>
								    	</div>
									</div>
					            </div>
						    </div>
			            </div>

			            <div class="input-group">
			                <div class="input-group-prepend">
			                    <span class="input-group-text">
			                      <i class="fa fa-check" aria-hidden="true"></i>
			                    </span>
			                </div>
			                <div class="col-sm-10">
						      	<div class="form-group bmd-form-group">
					                <div class="form-group row">
									    <label for="estadoEstudio" class="col-sm-2 col-form-label">Estado</label>
									    <div class="col-sm-10">
										    <div class="form-check form-check-radio form-check-inline">

											  <label class="form-check-label">
											    <input class="form-check-input" type="radio" name="estadoEstudio" id="estado1" value="Cursando"> Cursando
											    <span class="circle">
											        <span class="check"></span>
											    </span>
											  </label>
											</div>
											<div class="form-check form-check-radio form-check-inline">
											  <label class="form-check-label">
											    <input class="form-check-input" type="radio" name="estadoEstudio" id="estado2" value="Completado"> Completado
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

			            <div class="input-group">
			                <div class="input-group-prepend">
			                    <span class="input-group-text">
			                      <i class="fa fa-calendar-o" aria-hidden="true"></i>
			                    </span>
			                </div>
			                <div class="col-sm-10">
						      	<div class="form-group bmd-form-group">
					                <label for="periodo" class="bmd-label-floating">Periodo</label>
					                <input type="text" class="form-control" name="periodo" id="periodo">
					            </div>
						    </div>
			            </div>
			            <input name="operacion" type="hidden" value="guardarEstudiosFormales">
				<input name="user" type="hidden" value="33">
				<button type="submit" class="btn btn-primary" onclick="guardarEstudiosFormales(event)">A&ntilde;adir</button>
				</div>
				</form>
			</div>	
				  	


				

				</div>
