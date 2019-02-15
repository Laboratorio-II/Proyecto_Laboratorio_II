package modelos.servicio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import modelos.dao.DedicacionDAO;
import modelos.dto.Dedicacion;

public class ServicioDedicacion {
	
	private DedicacionDAO dedicacionDAO;
	
	private static ServicioDedicacion instancia;	
	public static ServicioDedicacion getInstancia() {
		if (instancia == null) {
			instancia = new ServicioDedicacion();
		}
		return instancia;
	}
	
	private ServicioDedicacion() {
		super();
		this.dedicacionDAO = DedicacionDAO.getInstancia();
	}
	
	public List<Dedicacion> getDedicaciones() {
		List<Dedicacion> dedicacion = this.dedicacionDAO.queryAll(); 
		return dedicacion;
	}
	
	public Dedicacion getDedicacionPorId(Serializable id) {
		if (id != null) {
			return this.dedicacionDAO.get(id);
		}
		return null;
	}
	
	public Dedicacion incluirDedicacion(Dedicacion dedicacion) {
		this.dedicacionDAO.save(dedicacion);
		return dedicacion;
	}
	
	public Dedicacion modificarDedicacion(Integer id, String descripcion,
			Integer horasTrabajadas, char estatus) {
		
		Dedicacion dedicacion = this.getDedicacionPorId(id);
		dedicacion.setId(id);
		dedicacion.setDescripcion(descripcion);
		dedicacion.setHorasTrabajadas(horasTrabajadas);
		dedicacion.setEstatus(estatus);
		this.dedicacionDAO.saveOrUpdate(dedicacion);
		return this.getDedicacionPorId(id);
	}
	
	public String eliminarDedicacion(Integer id) {
		Dedicacion dedicacion = this.getDedicacionPorId(id);
		if (dedicacion != null) {
			this.dedicacionDAO.delete(dedicacion);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}

}
