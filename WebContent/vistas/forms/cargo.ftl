<div class="row">
	<div class="col-lg-12">	
		<form id="formCargo" method="POST" action="#">

				  	<div class="form-group bmd-form-group">

			      		<div class="input-group">
			                <div class="input-group-prepend">
			                    <span class="input-group-text">
			                      <i class="fa fa-building"></i>
			                    </span>
			                </div>
			                <div class="col-sm-10">
						      	<div class="form-group bmd-form-group">
					                <label for="nombreCargo" class="bmd-label-floating">Cargo</label>
					                <input type="text" class="form-control" id="nombre" name="nombre">
					            </div>
						    </div>
			            </div>
			            
					</div>
					
				<input name="operacion" type="hidden" value="guardarCargo">
				<button type="submit" class="btn btn-primary" onclick="guardarCargo(event)">A&ntilde;adir</button>
		</form>
	</div>
</div>