<table class="table table-hover">

	<thead>
         <tr>
             <th><i class="fa fa-hashtag"></i>Cedula</th>
             <th><i class="fa fa-crosshairs"></i>Nombre y Apellido</th>
             <th><i class="fa fa-street-view"></i>Perfil</th>
             <th><i class="fa fa-id-badge"></i>Especialidad</th>
             <th><i class="fa fa-smile-o"></i>Estado</th>
             <th></th>
         </tr>
     </thead>
     
     <tbody>
     
     	<#list usersList as user>
	     	<tr>
			    <td>${user.id}</td>
			    <td>${user.ucorreo}</td>
			    <td>${user.ucorreo}</td>
			    <td>${user.ucontrasenna}</td>
			    <td>Activo</td>
			    <td class="td-actions text-right">
			        <form>
			         <a href="perfil_profesional" rel="tooltip" title="Ver empresa" class="btn btn-info btn-fab btn-fab-mini btn-round">
			            <i class="fa fa-info"></i>
			          </a>
			          <button type="submit" rel="tooltip" title="Eliminar" class="btn btn-danger btn-fab btn-fab-mini btn-round">
			            <i class="fa fa-times"></i>
			          </button>
			        </form>
			        
			    </td>
			</tr>
		</#list>
		
     	
     </tbody>

</table>