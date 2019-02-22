<div class="row">
	<div class="col-lg-12">	
		<form id="formDedicacion" method="POST" action="#">

				  	<div class="form-group bmd-form-group">

			      		<div class="input-group">
			                <div class="input-group-prepend">
			                    <span class="input-group-text">
			                      <i class="fa fa-building"></i>
			                    </span>
			                </div>
			                <div class="col-sm-10">
						      	<div class="form-group bmd-form-group">
					                <label for="nombreDedicacion" class="bmd-label-floating">Dedicacion</label>
					                <input type="text" class="form-control" id="descripcion" name="descripcion">
					            </div>
						    </div>
			            </div>
			            
			            <div class="input-group">
			                <div class="input-group-prepend">
			                    <span class="input-group-text">
			                      <i class="fa fa-building"></i>
			                    </span>
			                </div>
			                <div class="col-sm-10">
						      	<div class="form-group bmd-form-group">
					                <label for="horasTrabajadas" class="bmd-label-floating">Horas trabajadas</label>
					                <input type="text" class="form-control" id="horasTrabajadas" name="horasTrabajadas">
					            </div>
						    </div>
			            </div>
			            
					</div>
					
				<input name="operacion" type="hidden" value="guardarDedicacion">
				<button type="submit" class="btn btn-primary" onclick="guardarDedicacion(event)">A&ntilde;adir</button>
		</form>
	</div>
</div>