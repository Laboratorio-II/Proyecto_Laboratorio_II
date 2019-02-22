<#list idiomas as i>
    <tr>
	    <td id="${i.id}">${i.id}</td>
	    <td>${i.nombre}</td>
	    <td class="td-actions text-right">
	          <button type="button" id="btnEliminar${i.id}" rel="tooltip" title="Eliminar" class="btn btn-danger btn-fab btn-fab-mini btn-round" onclick="eliminarIdioma(${i.id})">
	            <i class="fa fa-times"></i>
	          </button>
	    </td>
	</tr>
<#else>

</#list>