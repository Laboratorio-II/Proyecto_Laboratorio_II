<#list datoslaborales as dl>
    <tr>
	    <td id="${dl.id}">${dl.id}</td>
	    <td>${dl.usuario}</td>
	    <td>${dl.empresa}</td>
	    <td>${dl.cargo}</td>
	    <td class="td-actions text-right">
	    	<button type="button" id="btnEliminar${dl.id}" rel="tooltip" title="Eliminar" class="btn btn-danger btn-fab btn-fab-mini btn-round" onclick="eliminarDatosLaborales(${dl.id})">
	    		<i class="fa fa-times"></i>
	    	</button>
	    </td>
	</tr>
</#list>