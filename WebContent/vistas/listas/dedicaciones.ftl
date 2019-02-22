<#list dedicaciones as d>
    <tr>
	    <td id="${d.id}">${d.id}</td>
	    <td>${d.descripcion}</td>
	    <td>${d.horasTrabajadas}</td>
	    <td class="td-actions text-right">
	          <button type="button" id="btnEliminar${d.id}" rel="tooltip" title="Eliminar" class="btn btn-danger btn-fab btn-fab-mini btn-round" onclick="eliminarDedicacion(${d.id})">
	            <i class="fa fa-times"></i>
	          </button>
	    </td>
	</tr>
<#else>

</#list>