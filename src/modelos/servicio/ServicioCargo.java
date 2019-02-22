package modelos.servicio;
import java.util.List;
import java.io.Serializable;
import java.util.Collections;

import modelos.dao.CargoDAO;
import modelos.dao.CargoDAO;
import modelos.dto.Cargo;
import modelos.dto.Cargo;

public class ServicioCargo {
private CargoDAO servicioCargoDAO;

			
private static ServicioCargo instancia;
public static ServicioCargo getInstancia() {
	if (instancia == null) {
		instancia = new ServicioCargo();
	}
	return instancia;
}


private ServicioCargo(){
	super();
	this.servicioCargoDAO= CargoDAO.getInstancia();
			
}

public List<Cargo> getCargos() {
	List<Cargo> ServCargo= this.servicioCargoDAO.queryAll();
	return ServCargo; 
}
							
public Cargo incluirCargo(Cargo servicioCargo) {
	this.servicioCargoDAO.save(servicioCargo);
	return servicioCargo;
	
}

public Cargo getCargoPorId(Serializable id) {
	if (id != null) {
		return this.servicioCargoDAO.get(id);
	}
	return null;
}

public Cargo modificarCargo(Integer id, String nombre, char estatus) {
	Cargo cargo = this.getCargoPorField("cargo", id);
	cargo.setId(id);
	cargo.setNombre(nombre);
	cargo.setEstatus(estatus);
	this.servicioCargoDAO.saveOrUpdate(cargo);
	return this.getCargoPorId(id);
}

public String eliminarCargo(Integer id) {
	Cargo cargo = this.getCargoPorId(id);
	if (cargo != null) {
		this.servicioCargoDAO.delete(cargo);
		return "ok";
	}
	return "No se pudo eliminar el producto";
}

public Cargo getCargoPorField(String field, Serializable value) {
	if (field != null) {
		return this.servicioCargoDAO.getByField(field,value);
	}
	return null;
}

public List<Cargo> getCargosPorField(String field, Serializable value) {
	if (field != null) {
		return this.servicioCargoDAO.queryAllByField(field,value);
	}
	return null;
}
	
}
