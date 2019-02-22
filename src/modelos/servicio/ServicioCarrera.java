package modelos.servicio;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import modelos.dao.CarreraDAO;
import modelos.dto.Carrera;
import modelos.dto.Carrera;;

public class ServicioCarrera {
	
	private CarreraDAO servicioCarreraDAO; 
	
	private static ServicioCarrera instancia;
	public static ServicioCarrera getInstancia() {
		if(instancia==null) {
			instancia= new ServicioCarrera();
		}
		return instancia;
	}

	private ServicioCarrera() {
		super();
		this.servicioCarreraDAO= CarreraDAO.getInstancia();
		
	}

	public List<Carrera>getCarreras(){
		List<Carrera> carrera= this.servicioCarreraDAO.queryAll();
		return carrera;
		
	}
	
	public Carrera incluirCarrera(Carrera carrera1) {
		this.servicioCarreraDAO.save(carrera1);
		return carrera1;
		
	}
	
	public Carrera getCarreraPorId(Serializable id) {
		if (id != null) {
			return this.servicioCarreraDAO.get(id);
		}
		return null;
	}

	public Carrera modificarCarrera(Integer id, Integer idArea, String nombre, char estatus) {
		Carrera carrera = this.getCarreraPorField("carrera", id);
		carrera.setId(id);
		carrera.setIdArea(idArea);
		carrera.setNombre(nombre);
		carrera.setEstatus(estatus);
		this.servicioCarreraDAO.saveOrUpdate(carrera);
		return this.getCarreraPorId(id);
	}

	public String eliminarCarrera(Integer id) {
		Carrera carrera = this.getCarreraPorId(id);
		if (carrera != null) {
			this.servicioCarreraDAO.delete(carrera);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}

	public Carrera getCarreraPorField(String field, Serializable value) {
		if (field != null) {
			return this.servicioCarreraDAO.getByField(field,value);
		}
		return null;
	}

	public List<Carrera> getCarrerasPorField(String field, Serializable value) {
		if (field != null) {
			return this.servicioCarreraDAO.queryAllByField(field,value);
		}
		return null;
	}
	
	
	
}
