<#list datoslaborales as dl>
    <tr>
	    <td id="${dl.id}">${dl.empresa}</td>
	    <td>${dl.cargo}</td>
	    <#if dl.estado == 'A'><#assign estatus = "Actualmente"></#if>
	    <#if dl.estado == 'F'><#assign estatus = "Finalizado"></#if>
	    <td>${estatus}</td>
	    <td>${dl.periodo}</td>
	    <td class="td-actions text-right">
	    	<button type="button" id="btnEliminar${dl.id}" rel="tooltip" title="Eliminar" class="btn btn-danger btn-fab btn-fab-mini btn-round" onclick="eliminarDatosLaborales(${dl.id})">
	    		<i class="fa fa-times"></i>
	    	</button>
	    </td>
	</tr>
</#list>