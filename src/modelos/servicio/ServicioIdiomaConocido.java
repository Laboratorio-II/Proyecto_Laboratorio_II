package modelos.servicio;

import java.io.Serializable;
import java.util.List;

import modelos.dao.IdiomaConocidoDAO;
import modelos.dto.IdiomaConocido;

public class ServicioIdiomaConocido {

	private IdiomaConocidoDAO idiomaConocidoDAO;
	
	private static ServicioIdiomaConocido instancia;	
	public static ServicioIdiomaConocido getInstancia() {
		if (instancia == null) {
			instancia = new ServicioIdiomaConocido();
		}
		return instancia;
	}

	
	private ServicioIdiomaConocido() {
		super();
		this.idiomaConocidoDAO = IdiomaConocidoDAO.getInstancia();
	}
	

	public List<IdiomaConocido> getIdiomasConocido() {
		List<IdiomaConocido> users = this.idiomaConocidoDAO.queryAll(); 
		return users;
	}
	
	public IdiomaConocido getIdiomaConocidoPorId(Serializable id) {
		if (id != null) {
			return this.idiomaConocidoDAO.get(id);
		}
		return null;
	}
	
	public IdiomaConocido incluirIdiomaConocido(IdiomaConocido idiomaConocido) {
		this.idiomaConocidoDAO.save(idiomaConocido);
		return idiomaConocido;
	}
	
	public IdiomaConocido modificarIdiomaConocido(Integer idCV, Integer idIdioma, Integer nivel, char estatus) {
		IdiomaConocido idiomaConocido = this.getIdiomaConocidoPorId(idCV);
		idiomaConocido.setIdCV(idCV);
		idiomaConocido.setIdIdioma(idIdioma);
		idiomaConocido.setNivel(nivel);
		idiomaConocido.setEstatus(estatus);
		this.idiomaConocidoDAO.saveOrUpdate(idiomaConocido);
		return this.getIdiomaConocidoPorId(idCV);
	}
	
	public String eliminarIdiomaConocido(Integer id) {
		IdiomaConocido idiomaConocido = this.getIdiomaConocidoPorId(id);
		if (idiomaConocido != null) {
			this.idiomaConocidoDAO.delete(idiomaConocido);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}

}
