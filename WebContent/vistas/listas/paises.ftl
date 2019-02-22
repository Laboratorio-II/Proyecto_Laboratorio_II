<#list paises as p>
    <tr>
	    <td id="${p.id}">${p.id}</td>
	    <td>${p.nombre}</td>
	    <td class="td-actions text-right">
	          <button type="button" id="btnEliminar${p.id}" rel="tooltip" title="Eliminar" class="btn btn-danger btn-fab btn-fab-mini btn-round" onclick="eliminarPais(${c.id})">
	            <i class="fa fa-times"></i>
	          </button>
	    </td>
	</tr>
<#else>

</#list>