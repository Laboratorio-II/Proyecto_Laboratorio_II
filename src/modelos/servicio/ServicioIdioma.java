package modelos.servicio;

import java.io.Serializable;
import java.util.List;

import modelos.dao.IdiomaDAO;
import modelos.dto.Idioma;
import modelos.dto.Idioma;

public class ServicioIdioma {
	
	private IdiomaDAO servicioIdiomaDAO;
	
	private static ServicioIdioma instancia;	
	public static ServicioIdioma getInstancia() {
		if (instancia == null) {
			instancia = new ServicioIdioma();
		}
		return instancia;
	}

	private ServicioIdioma() {
		super();
		this.servicioIdiomaDAO = IdiomaDAO.getInstancia();
	}
	

	public List<Idioma> getIdiomas() {
		List<Idioma> idiomas = this.servicioIdiomaDAO.queryAll(); 
		return idiomas;
	}
	
	public Idioma getIdiomaPorId(Serializable id) {
		if (id != null) {
			return this.servicioIdiomaDAO.get(id);
		}
		return null;
	}
	
	public Idioma incluirIdioma(Idioma idioma) {
		this.servicioIdiomaDAO.save(idioma);
		return idioma;
	}
	
	public Idioma modificarIdioma(Integer id, String nombre, char estatus) {
		Idioma idioma = this.getIdiomaPorId(id);
		idioma.setId(id);
		idioma.setNombre(nombre);
		idioma.setEstatus(estatus);
		this.servicioIdiomaDAO.saveOrUpdate(idioma);
		return this.getIdiomaPorId(id);
	}
	
	public String eliminarIdioma(Integer id) {
		Idioma idioma = this.getIdiomaPorId(id);
		if (idioma != null) {
			this.servicioIdiomaDAO.delete(idioma);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}
	
	public Idioma getIdiomaPorField(String field, Serializable value) {
		if (field != null) {
			return this.servicioIdiomaDAO.getByField(field,value);
		}
		return null;
	}

	public List<Idioma> getIdiomasPorField(String field, Serializable value) {
		if (field != null) {
			return this.servicioIdiomaDAO.queryAllByField(field,value);
		}
		return null;
	}


}
