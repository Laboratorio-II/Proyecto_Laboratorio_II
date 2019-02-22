package modelos.servicio;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import modelos.dao.CiudadDAO;
import modelos.dto.Ciudad;
import modelos.dto.Ciudad;

public class ServicioCiudad {
	
	private CiudadDAO servicioCiudadDAO;
	
	private static ServicioCiudad  instancia;
	public static ServicioCiudad getInstancia() {
		if(instancia== null) {
			instancia= new ServicioCiudad();
			
		}
		return instancia;
	}

	private ServicioCiudad() {
		super();
		this.servicioCiudadDAO=  CiudadDAO.getInstancia();
	}
	
	public List<Ciudad> getCiudades(){
		List<Ciudad> ciudad= this.servicioCiudadDAO.queryAll();
		return ciudad;
		
	}
	
	public Ciudad incluirCiudad(Ciudad ciu) {
		this.servicioCiudadDAO.save(ciu);
		return ciu;
		
	}
	
	public Ciudad getCiudadPorId(Serializable id) {
		if (id != null) {
			return this.servicioCiudadDAO.get(id);
		}
		return null;
	}

	public Ciudad modificarCiudad(Integer id, Integer estado, String nombre, char estatus) {
		Ciudad ciudad = this.getCiudadPorField("ciudad", id);
		ciudad.setId(id);
		ciudad.setEstado(estado);
		ciudad.setNombre(nombre);
		ciudad.setEstatus(estatus);
		this.servicioCiudadDAO.saveOrUpdate(ciudad);
		return this.getCiudadPorId(id);
	}

	public String eliminarCiudad(Integer id) {
		Ciudad ciudad = this.getCiudadPorId(id);
		if (ciudad != null) {
			this.servicioCiudadDAO.delete(ciudad);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}

	public Ciudad getCiudadPorField(String field, Serializable value) {
		if (field != null) {
			return this.servicioCiudadDAO.getByField(field,value);
		}
		return null;
	}

	public List<Ciudad> getCiudadesPorField(String field, Serializable value) {
		if (field != null) {
			return this.servicioCiudadDAO.queryAllByField(field,value);
		}
		return null;
	}
	
}
