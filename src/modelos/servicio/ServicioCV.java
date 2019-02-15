package modelos.servicio;

import java.io.Serializable;
import java.util.List;

import modelos.dao.CVDAO;
import modelos.dto.CV;

public class ServicioCV {
	
	private CVDAO cvDAO;
	
	private static ServicioCV instancia;	
	public static ServicioCV getInstancia() {
		if (instancia == null) {
			instancia = new ServicioCV();
		}
		return instancia;
	}
	
	private ServicioCV() {
		super();
		this.cvDAO = CVDAO.getInstancia();
	}
	
	public List<CV> getUsers() {
		List<CV> cv = this.cvDAO.queryAll(); 
		return cv;
	}
	
	public CV getCVPorId(Serializable id) {
		if (id != null) {
			return this.cvDAO.get(id);
		}
		return null;
	}
	
	public CV incluirCV(CV cv) {
		this.cvDAO.save(cv);
		return cv;
	}
	
	public CV modificarCV(Integer id, Integer usuario,
		String titulo, String descripcion, char estadoCivil,
		String telefono, String pais, String estado, String ciudad, char estatus) {
		CV cv = this.getCVPorId(id);
		cv.setId(id);
		cv.setUsuario(usuario);
		cv.setTitulo(titulo);
		cv.setPais(pais);
		cv.setEstado(estado);
		cv.setCiudad(ciudad);
		cv.setEstatus(estatus);
		this.cvDAO.saveOrUpdate(cv);
		return this.getCVPorId(id);
	}
	
	public String eliminarCV(Integer id) {
		CV cv = this.getCVPorId(id);
		if (cv != null) {
			this.cvDAO.delete(cv);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}
}
