package modelos.servicio;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import modelos.dao.CarreraDAO;
import modelos.dto.Carrera;;


public class ServicioCarrera {
	
	private CarreraDAO carreraDAO; 
	
	private static ServicioCarrera instancia;
	public static ServicioCarrera getInstancia() {
		if(instancia==null) {
			instancia= new ServicioCarrera();
		}
		return instancia;
	}

	
	private ServicioCarrera() {
		super();
		this.carreraDAO= CarreraDAO.getInstancia();
		
	}
	
	
	public List<Carrera>getCarreras(){
		List<Carrera> carera= this.carreraDAO.queryAll();
		return carera;
		
	}
	
	public Carrera IncluirCarrera(Carrera carrera1) {
		this.carreraDAO.save(carrera1);
		return carrera1;
		
	}
	
	
	
	
	
}
