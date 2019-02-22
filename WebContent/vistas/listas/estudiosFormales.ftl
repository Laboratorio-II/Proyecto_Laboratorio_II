<#list estudiosFormales as ef>
    <tr>
	    <td id="${ef.id}">${ef.centro}</td>
	    <#if ef.nivel == 1><#assign nivel = "Educación básica primaria">
	    <#elseif ef.nivel == 2><#assign nivel = "Educación básica secundaria">
	    <#elseif ef.nivel == 3><#assign nivel = "Bachillerato/Educación media">
	    <#elseif ef.nivel == 4><#assign nivel = "Educación técnico/Profesional">
	    <#elseif ef.nivel == 5><#assign nivel = "Universidad">
	    <#elseif ef.nivel == 6><#assign nivel = "Postgrado">
	    <#else><#assign nivel = " ">
	    </#if>
	    <td>${nivel}</td>
	    <#if ef.estado == 'A'><#assign estatusE = "Cursando">
	    <#elseif ef.estado == 'F'><#assign estatusE = "Culminado">
	    <#else><#assign estatusE = " ">
	    </#if>
	    <td>${estatusE}</td>
	    <td>${ef.periodo}</td>
	    <td class="td-actions text-right">
	          <button type="button" id="btnEliminar${ef.id}" rel="tooltip" title="Eliminar" class="btn btn-danger btn-fab btn-fab-mini btn-round" onclick="eliminarEstudiosFormales(${ef.id})">
	            <i class="fa fa-times"></i>
	          </button>
	        
	    </td>
	</tr>
</#list>