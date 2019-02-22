package modelos.servicio;

import java.io.Serializable;
import java.util.List;

import modelos.dao.EstadoDAO;
import modelos.dto.Estado;
import modelos.dto.Estado;

public class ServicioEstado {
	
	private EstadoDAO servicioEstadoDAO;
	
	private static ServicioEstado instancia;	
	public static ServicioEstado getInstancia() {
		if (instancia == null) {
			instancia = new ServicioEstado();
		}
		return instancia;
	}

	
	private ServicioEstado() {
		super();
		this.servicioEstadoDAO = servicioEstadoDAO.getInstancia();
	}
	

	public List<Estado> getEstados() {
		List<Estado> estados = this.servicioEstadoDAO.queryAll(); 
		return estados;
	}
	
	public Estado getEstadoPorId(Serializable id) {
		if (id != null) {
			return this.servicioEstadoDAO.get(id);
		}
		return null;
	}
	
	public Estado incluirEstado(Estado estado) {
		this.servicioEstadoDAO.save(estado);
		return estado;
	}
	
	public Estado modificarEstado(Integer id, Integer pais, String nombre, char estatus) {
		Estado estado = this.getEstadoPorId(id);
		estado.setId(id);
		estado.setPais(pais);
		estado.setNombre(nombre);
		estado.setEstatus(estatus);
		this.servicioEstadoDAO.saveOrUpdate(estado);
		return this.getEstadoPorId(id);
	}
	
	public String eliminarEstado(Integer id) {
		Estado estado = this.getEstadoPorId(id);
		if (estado != null) {
			this.servicioEstadoDAO.delete(estado);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}
	
	public Estado getEstadoPorField(String field, Serializable value) {
		if (field != null) {
			return this.servicioEstadoDAO.getByField(field,value);
		}
		return null;
	}

	public List<Estado> getEstadosPorField(String field, Serializable value) {
		if (field != null) {
			return this.servicioEstadoDAO.queryAllByField(field,value);
		}
		return null;
	}
}
