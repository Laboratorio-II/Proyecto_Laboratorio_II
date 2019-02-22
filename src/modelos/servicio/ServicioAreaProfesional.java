package modelos.servicio;

import java.util.List;
import java.io.Serializable;
import java.util.Collections;
import modelos.dao.AreaProfesionalDAO;
import modelos.dto.AreaProfesional;
import modelos.dto.DatoLaboral;
import modelos.dto.AreaProfesional;

public class ServicioAreaProfesional {
		
	private AreaProfesionalDAO servicioAreaProfesionalDAO;
	
				
	private static ServicioAreaProfesional instancia;
	public static ServicioAreaProfesional getInstancia() {
		if (instancia == null) {
			instancia = new ServicioAreaProfesional();
		}
		return instancia;
	}
	
	private ServicioAreaProfesional(){
		super();
		this.servicioAreaProfesionalDAO = servicioAreaProfesionalDAO.getInstancia();
	
	}

	public List<AreaProfesional> getAreasProfesionales() {
		List<AreaProfesional> ServicioAreaProfesional = this.servicioAreaProfesionalDAO.queryAll();
		return ServicioAreaProfesional; 
	}
									
	public AreaProfesional incluirAreaProfesional(AreaProfesional servicioAreaProfesional) {
		this.servicioAreaProfesionalDAO.save(servicioAreaProfesional);
								
		return servicioAreaProfesional;
	}
	
	public AreaProfesional getAreaProfesionalPorId(Serializable id) {
		if (id != null) {
			return this.servicioAreaProfesionalDAO.get(id);
		}
		return null;
	}
	
	public AreaProfesional modificarAreaProfesional(Integer id, String nombre, char estatus) {
		AreaProfesional areaProfesional = this.getAreaProfesionalPorField("area", id);
		areaProfesional.setId(id);
		areaProfesional.setNombre(nombre);
		areaProfesional.setEstatus(estatus);
		this.servicioAreaProfesionalDAO.saveOrUpdate(areaProfesional);
		return this.getAreaProfesionalPorId(id);
	}
	
	public String eliminarAreaProfesional(Integer id) {
		AreaProfesional areaProfesional = this.getAreaProfesionalPorId(id);
		if (areaProfesional != null) {
			this.servicioAreaProfesionalDAO.delete(areaProfesional);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}
	
	public AreaProfesional getAreaProfesionalPorField(String field, Serializable value) {
		if (field != null) {
			return this.servicioAreaProfesionalDAO.getByField(field,value);
		}
		return null;
	}
	
	public List<AreaProfesional> getAreasProfesionalesPorField(String field, Serializable value) {
		if (field != null) {
			return this.servicioAreaProfesionalDAO.queryAllByField(field,value);
		}
		return null;
	}

}
