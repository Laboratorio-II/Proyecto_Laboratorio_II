package modelos.servicio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import modelos.dao.DatoLaboralDAO;
import modelos.dto.DatoLaboral;
import modelos.dto.DatoPersonal;

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
	
	/*public DatoLaboral modificarDatoLaboral(Integer usuario,
			String empresa, String cargo, Integer area, char estado, String periodo) {
		DatoLaboral datoLaboral = this.getDatoLaboralPorField("usuario", usuario);
		datoLaboral.setEmpresa(id);
		datoLaboral.setIdCV(idCV);
		datoLaboral.setFunciones(cargo);
		datoLaboral.setFunciones(funciones);
		datoLaboral.setFechaInicio(fechaInicio);
		datoLaboral.setFechaFin(fechaFin);
		datoLaboral.setEstatus(estatus);
		this.datoLaboralDAO.saveOrUpdate(datoLaboral);
		return this.getDatoLaboralPorId(id);
	}*/
	
	public String eliminarDatoLaboral(Integer id) {
		DatoLaboral datoLaboral = this.getDatoLaboralPorId(id);
		if (datoLaboral != null) {
			this.datoLaboralDAO.delete(datoLaboral);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}
	
	public DatoLaboral getDatoLaboralPorField(String field, Serializable value) {
		if (field != null) {
			return this.datoLaboralDAO.getByField(field,value);
		}
		return null;
	}
	
	public List<DatoLaboral> getDatosLaboralesPorField(String field, Serializable value) {
		if (field != null) {
			return this.datoLaboralDAO.queryAllByField(field,value);
		}
		return null;
	}

}
