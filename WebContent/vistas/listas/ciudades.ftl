${Mensaje}
<#list ciudades as c>
    <tr>
	    <td id="${c.id}">${c.id}</td>
	    <td>${c.nombre}</td>
	    <td>${c.estado}</td>
	    <td class="td-actions text-right">
	          <button type="button" id="btnEliminar${c.id}" rel="tooltip" title="Eliminar" class="btn btn-danger btn-fab btn-fab-mini btn-round" onclick="eliminarCiudad(${c.id})">
	            <i class="fa fa-times"></i>
	          </button>
	    </td>
	</tr>


</#list>