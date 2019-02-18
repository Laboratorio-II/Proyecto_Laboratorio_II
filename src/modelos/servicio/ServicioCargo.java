package modelos.servicio;
import java.util.List;
import java.io.Serializable;
import java.util.Collections;

import modelos.dao.AreaProfesionalDAO;
import modelos.dao.CargoDAO;
import modelos.dto.AreaProfesional;
import modelos.dto.Cargo;





public class ServicioCargo {
private CargoDAO servCargoDAO;

			
private static ServicioCargo instancia;
public static ServicioCargo getInstancia() {
	if (instancia == null) {
		instancia = new ServicioCargo();
	}
	return instancia;
}


private ServicioCargo(){
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
