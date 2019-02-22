<#list etapas as e>
    <tr>
	    <td id="${e.id}">${e.id}</td>
	    <td>${e.nombre}</td>
	    <td class="td-actions text-right">
	          <button type="button" id="btnEliminar${e.id}" rel="tooltip" title="Eliminar" class="btn btn-danger btn-fab btn-fab-mini btn-round" onclick="eliminarDedicacion(${e.id})">
	            <i class="fa fa-times"></i>
	          </button>
	    </td>
	</tr>
<#else>

</#list>