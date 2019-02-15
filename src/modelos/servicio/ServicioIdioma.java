package modelos.servicio;

import java.io.Serializable;
import java.util.List;

import modelos.dao.IdiomaDAO;
import modelos.dto.Idioma;

public class ServicioIdioma {
	
	private IdiomaDAO idiomaDAO;
	
	private static ServicioIdioma instancia;	
	public static ServicioIdioma getInstancia() {
		if (instancia == null) {
			instancia = new ServicioIdioma();
		}
		return instancia;
	}

	
	private ServicioIdioma() {
		super();
		this.idiomaDAO = IdiomaDAO.getInstancia();
	}
	

	public List<Idioma> getIdiomas() {
		List<Idioma> idiomas = this.idiomaDAO.queryAll(); 
		return idiomas;
	}
	
	public Idioma getIdiomaPorId(Serializable id) {
		if (id != null) {
			return this.idiomaDAO.get(id);
		}
		return null;
	}
	
	public Idioma incluirIdioma(Idioma idioma) {
		this.idiomaDAO.save(idioma);
		return idioma;
	}
	
	public Idioma modificarIdioma(Integer id, String nombre, char estatus) {
		Idioma idioma = this.getIdiomaPorId(id);
		idioma.setId(id);
		idioma.setNombre(nombre);
		idioma.setEstatus(estatus);
		this.idiomaDAO.saveOrUpdate(idioma);
		return this.getIdiomaPorId(id);
	}
	
	public String eliminarIdioma(Integer id) {
		Idioma idioma = this.getIdiomaPorId(id);
		if (idioma != null) {
			this.idiomaDAO.delete(idioma);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}


}
