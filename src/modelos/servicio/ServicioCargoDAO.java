package modelos.servicio;
import java.util.List;
import java.io.Serializable;
import java.util.Collections;

import modelos.dao.AreaProfesionalDAO;
import modelos.dao.CargoDAO;
import modelos.dto.AreaProfesional;
import modelos.dto.Cargo;





public class ServicioCargoDAO {
private CargoDAO servCargoDAO;

			
private static ServicioCargoDAO instancia;
public static ServicioCargoDAO getInstancia() {
	if (instancia == null) {
		instancia = new ServicioCargoDAO();
	}
	return instancia;
}


private ServicioCargoDAO(){
	super();
	this.servCargoDAO= CargoDAO.getInstancia();
			
}

public List<Cargo> getCargo() {
	List<Cargo> ServCargo= this.servCargoDAO.queryAll();
	return ServCargo; 
}

								
public Cargo incluirCargo(Cargo servcargo) {
	this.servCargoDAO.save(servcargo);
	return servcargo;
	
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
