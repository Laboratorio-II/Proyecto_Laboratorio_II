<table id="tablaCV_Empresas" class="table table-striped table-bordered table-hover table-condensed">
	<thead>
		<tr>
			<th>Empresa</th>
			<th>Descripcion</th>
			<th>Se agregó el</th>
			<th>Eliminar</th>
		</tr>
	</thead>
	<tbody>
	
	<#list cvs as cv>
		<tr>
			<td>${cv.nombreEmpresa}</td>
			<td>${cv.nombreEmpresa}</td>
			<td>${cv.fechaAgregado?datetime?string('yyyy-MM-dd')}</td>
			<td>
				<button type="button" id="btnEliminarCV${cv.id}" rel="tooltip" title="Eliminar" class="btn btn-danger btn-fab btn-fab-mini btn-round" onclick="eliminarCV_Empresa(${cv.id})">
	    			<i class="fa fa-times"></i>
	    		</button>
			</td>
		</tr>
	
	</#list>
		
	</tbody>
</table>