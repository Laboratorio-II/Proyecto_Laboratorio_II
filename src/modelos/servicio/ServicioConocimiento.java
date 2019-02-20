 package modelos.servicio;
 import java.io.Serializable;
 import java.util.Collections;
 import java.util.List;
 import modelos.dao.ConocimientoDAO;
 import modelos.dto.Conocimiento;
 
 
 
 
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
	
	public Conocimiento incluirConocimiento(Conocimiento conocimiento) {
		this.conoDAO.save(conocimiento);
		return conocimiento;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
