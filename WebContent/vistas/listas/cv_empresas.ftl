<table id="tabla" class="table table-striped table-bordered table-hover table-condensed">
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
			<td>x</td>
		</tr>
	
	</#list>
		
	</tbody>
</table>