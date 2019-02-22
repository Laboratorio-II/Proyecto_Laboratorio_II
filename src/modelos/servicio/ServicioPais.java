package modelos.servicio;

import java.io.Serializable;
import java.util.List;

import modelos.dao.PaisDAO;
import modelos.dto.DatoLaboral;
import modelos.dto.Pais;

public class ServicioPais {
	
	private PaisDAO paisDAO;
	
	private static ServicioPais instancia;	
	public static ServicioPais getInstancia() {
		if (instancia == null) {
			instancia = new ServicioPais();
		}
		return instancia;
	}
	
	private ServicioPais() {
		super();
		this.paisDAO = PaisDAO.getInstancia();
	}
	

	public List<Pais> getPaises() {
		List<Pais> paises = this.paisDAO.queryAll(); 
		return paises;
	}
	
	public Pais getPaisPorId(Serializable id) {
		if (id != null) {
			return this.paisDAO.get(id);
		}
		return null;
	}
	
	public Pais incluirPais(Pais pais) {
		this.paisDAO.save(pais);
		return pais;
	}
	
	public Pais modificarPais(Integer id, String nombre, char estatus) {
		Pais pais = this.getPaisPorId(id);
		pais.setId(id);
		pais.setNombre(nombre);
		pais.setEstatus(estatus);
		this.paisDAO.saveOrUpdate(pais);
		return this.getPaisPorId(id);
	}
	
	public String eliminarPais(Integer id) {
		Pais pais = this.getPaisPorId(id);
		if (pais != null) {
			this.paisDAO.delete(pais);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}
	
	public Pais getPaisPorField(String field, Serializable value) {
		if (field != null) {
			return this.paisDAO.getByField(field,value);
		}
		return null;
	}
	
	public List<Pais> getPaisesPorField(String field, Serializable value) {
		if (field != null) {
			return this.paisDAO.queryAllByField(field,value);
		}
		return null;
	}

}
