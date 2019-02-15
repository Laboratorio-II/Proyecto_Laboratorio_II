package modelos.servicio;

import java.io.Serializable;
import java.util.List;

import modelos.dao.EtapaDAO;
import modelos.dto.Etapa;

public class ServicioEtapa {
	
	private EtapaDAO etapaDAO;
	
	private static ServicioEtapa instancia;	
	public static ServicioEtapa getInstancia() {
		if (instancia == null) {
			instancia = new ServicioEtapa();
		}
		return instancia;
	}

	
	private ServicioEtapa() {
		super();
		this.etapaDAO = EtapaDAO.getInstancia();
	}
	

	public List<Etapa> getEtapas() {
		List<Etapa> etapas = this.etapaDAO.queryAll(); 
		return etapas;
	}
	
	public Etapa getEtapaPorId(Serializable id) {
		if (id != null) {
			return this.etapaDAO.get(id);
		}
		return null;
	}
	
	public Etapa incluirEtapa(Etapa etapa) {
		this.etapaDAO.save(etapa);
		return etapa;
	}
	
	public Etapa modificarEtapa(Integer id, String descripcion, char estatus) {
		Etapa etapa = this.getEtapaPorId(id);
		etapa.setId(id);
		etapa.setDescripcion(descripcion);
		etapa.setEstatus(estatus);
		this.etapaDAO.saveOrUpdate(etapa);
		return this.getEtapaPorId(id);
	}
	
	public String eliminarEtapa(Integer id) {
		Etapa etapa = this.getEtapaPorId(id);
		if (etapa != null) {
			this.etapaDAO.delete(etapa);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}

}
