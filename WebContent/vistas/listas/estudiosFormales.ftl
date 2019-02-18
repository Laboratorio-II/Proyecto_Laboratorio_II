<#list estudiosFormales as ef>
    <tr>
	    <td id="${ef.id}">${ef.id}</td>
	    <td>${ef.usuario}</td>
	    <td>${ef.centro}</td>
	    <td>${ef.periodo}</td>
	    <td class="td-actions text-right">
	          <button type="button" id="btnEliminar${ef.id}" rel="tooltip" title="Eliminar" class="btn btn-danger btn-fab btn-fab-mini btn-round" onclick="eliminarEstudiosFormales(${ef.id})">
	            <i class="fa fa-times"></i>
	          </button>
	        
	    </td>
	</tr>
</#list>