package modelos.servicio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import modelos.dao.DatoLaboralDAO;
import modelos.dto.DatoLaboral;

public class ServicioDatoLaboral {
	
	private DatoLaboralDAO datoLaboralDAO;
	
	private static ServicioDatoLaboral instancia;	
	public static ServicioDatoLaboral getInstancia() {
		if (instancia == null) {
			instancia = new ServicioDatoLaboral();
		}
		return instancia;
	}
	
	private ServicioDatoLaboral() {
		super();
		this.datoLaboralDAO = DatoLaboralDAO.getInstancia();
	}
	
	public List<DatoLaboral> getDatosLaborales() {
		List<DatoLaboral> datoLaboral = this.datoLaboralDAO.queryAll(); 
		return datoLaboral;
	}
	
	public DatoLaboral getDatoLaboralPorId(Serializable id) {
		if (id != null) {
			return this.datoLaboralDAO.get(id);
		}
		return null;
	}
	
	public DatoLaboral incluirDatoLaboral(DatoLaboral datoLaboral) {
		this.datoLaboralDAO.save(datoLaboral);
		return datoLaboral;
	}
	
	public DatoLaboral modificarDatoLaboral(Integer id, Integer idCV,
			String cargo, String funciones, Date fechaInicio, Date fechaFin, char estatus) {
		DatoLaboral datoLaboral = this.getDatoLaboralPorId(id);
		datoLaboral.setId(id);
		datoLaboral.setIdCV(idCV);
		datoLaboral.setFunciones(cargo);
		datoLaboral.setFunciones(funciones);
		datoLaboral.setFechaInicio(fechaInicio);
		datoLaboral.setFechaFin(fechaFin);
		datoLaboral.setEstatus(estatus);
		this.datoLaboralDAO.saveOrUpdate(datoLaboral);
		return this.getDatoLaboralPorId(id);
	}
	
	public String eliminarDatoLaboral(Integer id) {
		DatoLaboral datoLaboral = this.getDatoLaboralPorId(id);
		if (datoLaboral != null) {
			this.datoLaboralDAO.delete(datoLaboral);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}

}
