

package modelos.servicio;
import java.util.List;
import java.io.Serializable;
import java.util.Collections;
import modelos.dao.AreaProfesionalDAO;
import modelos.dto.AreaProfesional;



public class ServicioAreaProfesional {
		
	private AreaProfesionalDAO servicioareaprofDAO;
	
				
	private static ServicioAreaProfesional instancia;
	public static ServicioAreaProfesional getInstancia() {
		if (instancia == null) {
			instancia = new ServicioAreaProfesional();
		}
		return instancia;
	}
	
	
	private ServicioAreaProfesional(){
		super();
		this.servicioareaprofDAO = servicioareaprofDAO.getInstancia();
	
	}

	public List<AreaProfesional> getAreaPRofs() {
		List<AreaProfesional> ServAreaProf = this.servicioareaprofDAO.queryAll();
		return ServAreaProf; 
	}
	
									
	public AreaProfesional incluirUsers(AreaProfesional servarea) {
		this.servicioareaprofDAO.save(servarea);
								
		return servarea;
	}
	
	



	
	
	
	
	
}
