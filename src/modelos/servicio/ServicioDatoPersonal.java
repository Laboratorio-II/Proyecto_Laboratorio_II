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
	
	public DatoPersonal modificarDatoPersonal(Integer usuario, String nombre, String apellido,
			Date fechaNacimiento, char estadoCivil, String telefono, 
			Integer pais, Integer estado, Integer ciudad, char genero,
			String descripcion) {
		
		DatoPersonal datoPersonal = this.getDatoPersonalPorField("usuario", usuario);
		datoPersonal.setNombre(nombre);
		datoPersonal.setApellido(apellido);
		datoPersonal.setFechaNacimiento(fechaNacimiento);
		datoPersonal.setEstadoCivil(estadoCivil);
		datoPersonal.setTelefono(telefono);
		datoPersonal.setPais(pais);
		datoPersonal.setEstado(estado);
		datoPersonal.setCiudad(ciudad);
		datoPersonal.setGenero(genero);
		datoPersonal.setDescripcion(descripcion);
		this.datoPersonalDAO.saveOrUpdate(datoPersonal);
		return this.getDatoPersonalPorField("usuario", usuario);
	}
	
	public String eliminarDatoPersonal(Integer id) {
		DatoPersonal datoPersonal = this.getDatoPersonalPorId(id);
		if (datoPersonal != null) {
			this.datoPersonalDAO.delete(datoPersonal);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}
	
	public DatoPersonal getDatoPersonalPorField(String field, Serializable value) {
		if (field != null) {
			return this.datoPersonalDAO.getByField(field,value);
		}
		return null;
	}

}
