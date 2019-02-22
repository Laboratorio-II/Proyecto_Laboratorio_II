<#list carreras as c>
    <tr>
	    <td id="${c.id}">${c.id}</td>
	    <td>${c.nombre}</td>
	    <td>${c.idArea}</td>
	    <td class="td-actions text-right">
	          <button type="button" id="btnEliminar${c.id}" rel="tooltip" title="Eliminar" class="btn btn-danger btn-fab btn-fab-mini btn-round" onclick="eliminarCarrera(${c.id})">
	            <i class="fa fa-times"></i>
	          </button>
	    </td>
	</tr>
<#else>

</#list>