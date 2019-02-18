package modelos.servicio;

import java.io.Serializable;
import java.util.List;

import modelos.dao.EstudioFDAO;
import modelos.dto.EstudioF;

public class ServicioEstudioF {
	
private EstudioFDAO estudioFDAO;
	
	private static ServicioEstudioF instancia;	
	public static ServicioEstudioF getInstancia() {
		if (instancia == null) {
			instancia = new ServicioEstudioF();
		}
		return instancia;
	}
	
	private ServicioEstudioF() {
		super();
		this.estudioFDAO = EstudioFDAO.getInstancia();
	}
	
	public List<EstudioF> getDatoEstudio() {
		List<EstudioF> estudioF = this.estudioFDAO.queryAll(); 
		return estudioF;
	}
	
	public EstudioF getEstudioFPorId(Serializable id) {
		if (id != null) {
			return this.estudioFDAO.get(id);
		}
		return null;
	}
	
	public EstudioF incluirEstudioF(EstudioF estudioF) {
		this.estudioFDAO.save(estudioF);
		return estudioF;
	}
	
	public String eliminarEstudioF(Integer id) {
		EstudioF estudioF = this.getEstudioFPorId(id);
		if (estudioF != null) {
			this.estudioFDAO.delete(estudioF);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}
	
	public EstudioF getEstudioFPorField(String field, Serializable value) {
		if (field != null) {
			return this.estudioFDAO.getByField(field,value);
		}
		return null;
	}
	
	public List<EstudioF> getEstudiosFPorField(String field, Serializable value) {
		if (field != null) {
			return this.estudioFDAO.queryAllByField(field,value);
		}
		return null;
	}

}
