<#list usersList as user>
    	<tr>
	    <td>${user.id}</td>
	    <td>${user.email}</td>
	    <td>${user.rol}</td>
	    <td>${user.estatus}</td>
	    <td class="td-actions text-right">
	        <form>
	         <a href="perfil_profesional?user=${user.email}" rel="tooltip" title="Ver profesional" class="btn btn-info btn-fab btn-fab-mini btn-round">
	            <i class="fa fa-info"></i>
	          </a>
	          <button type="button" id="btnEliminar${user.id}" rel="tooltip" title="Eliminar" class="btn btn-danger btn-fab btn-fab-mini btn-round" onclick="onEliminar('${user.id}')">
	            <i class="fa fa-times"></i>
	          </button>
	        </form>
	        
	    </td>
	</tr>
</#list>