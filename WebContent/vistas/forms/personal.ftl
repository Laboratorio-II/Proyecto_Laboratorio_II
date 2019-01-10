<form>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="nombre">Nombre</label>
      <input type="text" class="form-control" id="nombre" placeholder="Nombre...">
    </div>
    <div class="form-group col-md-6">
      <label for="apellido">Apellido</label>
      <input type="text" class="form-control" id="apellido" placeholder="Apellido...">
    </div>
  </div>
  <div class="form-group">
    <label for="direccion">Dirección</label>
    <input type="text" class="form-control" id="direccion" placeholder="Apartamento, piso, calle, avenida...">
  </div>
  <div class="form-group">
    <label for="nacimiento">Fecha de nacimiento</label>
    <input type="date" class="form-control" id="nacimiento">
  </div>
  <div class="form-row">
    <div class="form-group col-md-4">
      <label for="pais">País</label>
      <select id="pais" class="form-control">
        <option selected>Choose...</option>
        <option>...</option>
      </select>
    </div>
    <div class="form-group col-md-4">
      <label for="ciudad">Ciudad</label>
      <select id="ciudad" class="form-control">
        <option selected>Choose...</option>
        <option>...</option>
      </select>
    </div>
    <div class="form-group col-md-4">
      <label for="telefono">Teléfono</label>
      <input type="text" class="form-control" id="telefono">
    </div>
  </div>
  <button type="submit" class="btn btn-danger">Guardar</button>
</form>