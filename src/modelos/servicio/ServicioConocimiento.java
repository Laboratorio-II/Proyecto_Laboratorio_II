 package modelos.servicio;
 import java.io.Serializable;
 import java.util.Collections;
 import java.util.List;
 import modelos.dao.ConocimientoDAO;
 import modelos.dto.Conocimiento;
import modelos.dto.DatoLaboral;
 
 
 
 
public class ServicioConocimiento {

	
	private ConocimientoDAO conoDAO;
	private static ServicioConocimiento instacia;
	public static ServicioConocimiento getInstancia() {
		if(instacia== null) {
			instacia = new ServicioConocimiento();
			
		}
			return instacia;
			
	}
	
	private ServicioConocimiento() {
		super();
		this.conoDAO= ConocimientoDAO.getInstancia();
		
	}
	
	public List<Conocimiento> getConocimientos(){
		List<Conocimiento> cono= this.conoDAO.queryAll();
		return cono;
		
	}
	
	public Conocimiento getConocimientoPorId(Serializable id) {
		if (id != null) {
			return this.conoDAO.get(id);
		}
		return null;
	}
	
	public Conocimiento incluirConocimiento(Conocimiento conocimiento) {
		this.conoDAO.save(conocimiento);
		return conocimiento;
	}
	
	public Conocimiento getConocimientoPorField(String field, Serializable value) {
		if (field != null) {
			return this.conoDAO.getByField(field,value);
		}
		return null;
	}
	
	public List<Conocimiento> getConocimientosPorField(String field, Serializable value) {
		if (field != null) {
			return this.conoDAO.queryAllByField(field,value);
		}
		return null;
	}
	
	public String eliminarConocimiento(Integer id) {
		Conocimiento conocimiento = this.getConocimientoPorId(id);
		if (conocimiento != null) {
			this.conoDAO.delete(conocimiento);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}
	
	
	
}
