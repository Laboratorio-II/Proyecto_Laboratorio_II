<#if areasProfesionales??>
<#list areasProfesionales as ap>
    <tr>
	    <td id="${ap.id}">${ap.id}</td>
	    <td>${ap.nombre}</td>
	    <td class="td-actions text-right">
	          <button type="button" id="btnEliminar${ap.id}" rel="tooltip" title="Eliminar" class="btn btn-danger btn-fab btn-fab-mini btn-round" onclick="eliminarAreaProfesional(${ap.id})">
	            <i class="fa fa-times"></i>
	          </button>
	    </td>
	</tr>
<#else>
</#list>
</#if>>
