<!-- Modal -->
<div class="modal fade" id="dedicaciones" tabindex="-1" role="dialog" aria-labelledby="dedicacionesLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Dedicaciones</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      
      <div class="modal-body">
        <ul class="float-left">
        	<li>
        		<span class="badge badge-success">Full-time</span>
        		<span data-toggle="modal" data-target="#conocimientos">
			      <button class="btn btn-danger btn-fab btn-fab-mini btn-round" 
			      data-toggle="tooltip" data-placement="top" title="Eliminar">
					<i class="material-icons">delete</i>
				  </button>
				</span>
        	</li>
        	<li>
        		<span class="badge badge-success">Part-time</span>
        		<span data-toggle="modal" data-target="#conocimientos">
			      <button class="btn btn-danger btn-fab btn-fab-mini btn-round" 
			      data-toggle="tooltip" data-placement="top" title="Eliminar">
					<i class="material-icons">delete</i>
				  </button>
				</span>
        	</li>
        	<li>
        		<span class="badge badge-success">Freelancer</span>
        		<span data-toggle="modal" data-target="#conocimientos">
			      <button class="btn btn-danger btn-fab btn-fab-mini btn-round" 
			      data-toggle="tooltip" data-placement="top" title="Eliminar">
					<i class="material-icons">delete</i>
				  </button>
				</span>
        	</li>
        	<li>
        		<span class="badge badge-success">Pasant&iacute;a</span>
        		<span data-toggle="modal" data-target="#conocimientos">
			      <button class="btn btn-danger btn-fab btn-fab-mini btn-round" 
			      data-toggle="tooltip" data-placement="top" title="Eliminar">
					<i class="material-icons">delete</i>
				  </button>
				</span>
        	</li>
        </ul>
        <form>
        	<input type="text" id="nuevo"/>
        	<button type="submit" class="btn btn-danger">Agregar</button>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
      </div>
      
    </div>
  </div>
</div>