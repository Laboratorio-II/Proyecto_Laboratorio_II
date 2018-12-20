<html>
<head><title>Proyecto de laboratorio II</title></head>
<body>

	<h1>${title}</h1>
	
	<h3>Integrantes</h3>
	<table>
			<tr>
				<th>Nombre</th> <th>Apellido</th>
			</tr>
		<#list integrantes as integrante>
			<tr>
				<td>${integrante.firstname}</td> <td>${integrante.lastname}</td>
			</tr>
		</#list>
	</table>
</body>
</html>