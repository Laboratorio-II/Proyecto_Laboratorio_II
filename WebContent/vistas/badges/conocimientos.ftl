<h6>Conocimientos
  	<span data-toggle="modal" data-target="#conocimientos">
      <button class="btn btn-warning btn-fab btn-fab-mini btn-round" 
      data-toggle="tooltip" data-placement="top" title="Modificar">
		<i class="material-icons">edit</i>
	  </button>
	</span>
  </h6>
  <div>
  <div id="badgesConocimientos">
  <#if conocimientos??>
<#list conocimientos as conocimiento>
	<span id="spanCono${conocimiento.id}" class="badge badge-info">${conocimiento.nombre}</span>
</#list>
</#if>
</div>
</div>