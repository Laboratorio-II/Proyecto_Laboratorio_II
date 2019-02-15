package modelos.servicio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import modelos.dao.DatoPersonalDAO;
import modelos.dto.DatoPersonal;

public class ServicioDatoPersonal {
	
	private DatoPersonalDAO datoPersonalDAO;
	
	private static ServicioDatoPersonal instancia;	
	public static ServicioDatoPersonal getInstancia() {
		if (instancia == null) {
			instancia = new ServicioDatoPersonal();
		}
		return instancia;
	}
	
	private ServicioDatoPersonal() {
		super();
		this.datoPersonalDAO = DatoPersonalDAO.getInstancia();
	}
	
	public List<DatoPersonal> getDatosPersonal() {
		List<DatoPersonal> datoPersonal = this.datoPersonalDAO.queryAll(); 
		return datoPersonal;
	}
	
	public DatoPersonal getDatoPersonalPorId(Serializable id) {
		if (id != null) {
			return this.datoPersonalDAO.get(id);
		}
		return null;
	}
	
	public DatoPersonal incluirDatoPersonal(DatoPersonal datoPersonal) {
		this.datoPersonalDAO.save(datoPersonal);
		return datoPersonal;
	}
	
	public DatoPersonal modificarDatoPersonal(String nombre, String apellido,
			Integer id, Date fechaNacimiento, String nacionalidad, char genero, char estatus) {
		
		DatoPersonal datoPersonal = this.getDatoPersonalPorId(id);
		datoPersonal.setNombre(nombre);
		datoPersonal.setApellido(apellido);
		datoPersonal.setId(id);//Usuariop
		datoPersonal.setFechaNacimiento(fechaNacimiento);
		datoPersonal.setNacionalidad(nacionalidad);
		datoPersonal.setGenero(genero);
		datoPersonal.setEstatus(estatus);
		this.datoPersonalDAO.saveOrUpdate(datoPersonal);
		return this.getDatoPersonalPorId(id);
	}
	
	public String eliminarDatoPersonal(Integer id) {
		DatoPersonal datoPersonal = this.getDatoPersonalPorId(id);
		if (datoPersonal != null) {
			this.datoPersonalDAO.delete(datoPersonal);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}

}
