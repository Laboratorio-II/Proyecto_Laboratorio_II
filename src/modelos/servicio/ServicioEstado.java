package modelos.servicio;

import java.io.Serializable;
import java.util.List;

import modelos.dao.EstadoDAO;
import modelos.dto.Estado;

public class ServicioEstado {
	
	private EstadoDAO estadoDAO;
	
	private static ServicioEstado instancia;	
	public static ServicioEstado getInstancia() {
		if (instancia == null) {
			instancia = new ServicioEstado();
		}
		return instancia;
	}

	
	private ServicioEstado() {
		super();
		this.estadoDAO = estadoDAO.getInstancia();
	}
	

	public List<Estado> getEstados() {
		List<Estado> estados = this.estadoDAO.queryAll(); 
		return estados;
	}
	
	public Estado getEstadoPorId(Serializable id) {
		if (id != null) {
			return this.estadoDAO.get(id);
		}
		return null;
	}
	
	public Estado incluirEstado(Estado estado) {
		this.estadoDAO.save(estado);
		return estado;
	}
	
	public Estado modificarEstado(Integer id, String nombre, String idPais, char estatus) {
		Estado estado = this.getEstadoPorId(id);
		estado.setId(id);
		estado.setNombre(nombre);
		estado.setIdPais(idPais);
		estado.setEstatus(estatus);
		this.estadoDAO.saveOrUpdate(estado);
		return this.getEstadoPorId(id);
	}
	
	public String eliminarEstado(Integer id) {
		Estado estado = this.getEstadoPorId(id);
		if (estado != null) {
			this.estadoDAO.delete(estado);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}
}
