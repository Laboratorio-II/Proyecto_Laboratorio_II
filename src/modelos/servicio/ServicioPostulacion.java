package modelos.servicio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import modelos.dao.PostulacionDAO;
import modelos.dto.Postulacion;

public class ServicioPostulacion {
	
private PostulacionDAO postulacionDAO;
	
	private static ServicioPostulacion instancia;	
	public static ServicioPostulacion getInstancia() {
		if (instancia == null) {
			instancia = new ServicioPostulacion();
		}
		return instancia;
	}
	
	private ServicioPostulacion() {
		super();
		this.postulacionDAO = PostulacionDAO.getInstancia();
	}
	
	public List<Postulacion> getPostulaciones() {
		List<Postulacion> potulaciones = this.postulacionDAO.queryAll(); 
		return potulaciones;
	}
	
	public Postulacion getPostulacionPorId(Serializable id) {
		if (id != null) {
			return this.postulacionDAO.get(id);
		}
		return null;
	}
	
	public Postulacion incluirPostulacion(Postulacion postulacion) {
		this.postulacionDAO.save(postulacion);
		return postulacion;
	}
	
	public Postulacion modificarPostulacion(Integer id, String idCV, Integer nroEtapa, Date fechaPostulacion, String idOferta,
			char estatus) {
		Postulacion postulacion = this.getPostulacionPorId(id);
		postulacion.setId(id);
		postulacion.setIdCV(idCV);
		postulacion.setNroEtapa(nroEtapa);
		postulacion.setFechaPostulacion(fechaPostulacion);
		postulacion.setIdOferta(idOferta);
		postulacion.setEstatus(estatus);
		this.postulacionDAO.saveOrUpdate(postulacion);
		return this.getPostulacionPorId(id);
	}
	
	public String eliminarPostulacion(Integer id) {
		Postulacion postulacion = this.getPostulacionPorId(id);
		if (postulacion != null) {
			this.postulacionDAO.delete(postulacion);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}


}
