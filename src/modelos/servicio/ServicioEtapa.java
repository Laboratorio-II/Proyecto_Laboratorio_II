package modelos.servicio;

import java.io.Serializable;
import java.util.List;

import modelos.dao.EtapaDAO;
import modelos.dto.Etapa;
import modelos.dto.Etapa;

public class ServicioEtapa {
	
	private EtapaDAO servicioEtapaDAO;
	
	private static ServicioEtapa instancia;	
	public static ServicioEtapa getInstancia() {
		if (instancia == null) {
			instancia = new ServicioEtapa();
		}
		return instancia;
	}
	
	private ServicioEtapa() {
		super();
		this.servicioEtapaDAO = EtapaDAO.getInstancia();
	}
	
	public List<Etapa> getEtapas() {
		List<Etapa> etapas = this.servicioEtapaDAO.queryAll(); 
		return etapas;
	}
	
	public Etapa getEtapaPorId(Serializable id) {
		if (id != null) {
			return this.servicioEtapaDAO.get(id);
		}
		return null;
	}
	
	public Etapa incluirEtapa(Etapa etapa) {
		this.servicioEtapaDAO.save(etapa);
		return etapa;
	}
	
	public Etapa modificarEtapa(Integer id, String descripcion, char estatus) {
		Etapa etapa = this.getEtapaPorId(id);
		etapa.setId(id);
		etapa.setDescripcion(descripcion);
		etapa.setEstatus(estatus);
		this.servicioEtapaDAO.saveOrUpdate(etapa);
		return this.getEtapaPorId(id);
	}
	
	public String eliminarEtapa(Integer id) {
		Etapa etapa = this.getEtapaPorId(id);
		if (etapa != null) {
			this.servicioEtapaDAO.delete(etapa);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}
	
	public Etapa getEtapaPorField(String field, Serializable value) {
		if (field != null) {
			return this.servicioEtapaDAO.getByField(field,value);
		}
		return null;
	}

	public List<Etapa> getEtapasPorField(String field, Serializable value) {
		if (field != null) {
			return this.servicioEtapaDAO.queryAllByField(field,value);
		}
		return null;
	}

}
