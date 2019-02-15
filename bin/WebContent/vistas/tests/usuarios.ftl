
<#list usersList as user>
    	<tr>
	    <td>${user.id}</td>
<<<<<<< HEAD
	    <td>${user.id}</td>
	    <td>${user.id}</td>
	    <td>${user.id}</td>
	    <td>Activo</td>
=======
	    <td>${user.email}</td>
	    <td>${user.rol}</td>
	    <td>${user.estatus}</td>
>>>>>>> 6526c37cf93b842d58da036b4d2c36aa78995d55
	    <td class="td-actions text-right">
	        <form>
	         <a href="perfil_profesional?user=${user.email}" rel="tooltip" title="Ver empresa" class="btn btn-info btn-fab btn-fab-mini btn-round">
	            <i class="fa fa-info"></i>
	          </a>
	          <button type="submit" rel="tooltip" title="Eliminar" class="btn btn-danger btn-fab btn-fab-mini btn-round">
	            <i class="fa fa-times"></i>
	          </button>
	        </form>
	        
	    </td>
	</tr>
</#list>