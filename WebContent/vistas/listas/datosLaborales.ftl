<#list datoslaborales as dl>
    	<tr>
	    <td>${dl.id}</td>
	    <td>${dl.usuario}</td>
	    <td>${dl.empresa}</td>
	    <td>${dl.cargo}</td>
	    <td class="td-actions text-right">
	        <form>
	         <a href="perfil_profesional?user=${dl.id}" rel="tooltip" title="Ver profesional" class="btn btn-info btn-fab btn-fab-mini btn-round">
	            <i class="fa fa-info"></i>
	          </a>
	          <button type="button" id="btnEliminar${dl.id}" rel="tooltip" title="Eliminar" class="btn btn-danger btn-fab btn-fab-mini btn-round" onclick="onEliminar('${dl.id}')">
	            <i class="fa fa-times"></i>
	          </button>
	        </form>
	        
	    </td>
	</tr>
</#list>