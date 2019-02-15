package modelos.servicio;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import modelos.dao.CiudadDAO;
import modelos.dto.Ciudad;



public class ServicioCiudad {
	
	private CiudadDAO ciudadDAO;
	
	private static ServicioCiudad  instancia;
	public static ServicioCiudad getInstancia() {
		if(instancia== null) {
			instancia= new ServicioCiudad();
			
		}
		return instancia;
	}

	
	private ServicioCiudad() {
		super();
		this.ciudadDAO=  CiudadDAO.getInstancia();
	}
	
	public List<Ciudad> getCiudads(){
		List<Ciudad> ciudad= this.ciudadDAO.queryAll();
		return ciudad;
		
	}
	
	public Ciudad incluirCiudad(Ciudad ciu) {
		this.ciudadDAO.save(ciu);
		return ciu;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
