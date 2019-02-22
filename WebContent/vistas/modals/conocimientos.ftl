<!-- Modal -->
<div class="modal fade" id="conocimientos" tabindex="-1" role="dialog" aria-labelledby="conocimientosLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Conocimientos</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      
      <div class="modal-body">
        <ul type="none" id="listadoConocimientos">
        
        	<#list conocimientos as conocimiento>
				<li id="${conocimiento.id}">
	        		<span class="badge badge-info">${conocimiento.nombre}</span>
	        		<span data-toggle="modal" data-target="#conocimientos">
				      <button id="btnEliminarC${conocimiento.id}" class="btn btn-danger btn-fab btn-fab-mini btn-round" 
				      data-toggle="tooltip" data-placement="top" title="Eliminar" onclick="eliminarConocimiento(${conocimiento.id})">
						<i class="material-icons">delete</i>
					  </button>
					</span>
	        	</li>
			</#list>
        </ul>
     
        <form id="formConocimientos" method="POST" action="#">
        	<input type="text" name="conocimiento"/>
        	<input type="hidden" name="operacion" value="guardarConocimiento"/>
        	<input type="hidden" name="user" value="33"/>
        	<button type="submit" class="btn btn-danger" onclick="agregarConocimiento(event)">Agregar</button>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
      </div>
      
    </div>
  </div>
</div>