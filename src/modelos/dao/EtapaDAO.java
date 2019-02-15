package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.Etapa;

public class EtapaDAO extends GenericDAO {
	
	private static EtapaDAO instancia;	
	public static EtapaDAO getInstancia() {
		if (instancia == null) {
			instancia = new EtapaDAO();
		}
		return instancia;
	}

	private EtapaDAO() {
		super();
	}

	public List<Etapa> queryAll() {
		return super.queryAll(Etapa.class);
	}

	public Etapa get(Serializable id) {
		return (Etapa)super.get(Etapa.class, id);
	}

	public void save(Etapa etapa) {
		super.save(etapa);
	}

	public void update(Etapa etapa) {
		super.update(etapa);
	}

	public void saveOrUpdate(Etapa etapa) {
		super.saveOrUpdate(etapa);
	}

	public void delete(Etapa etapa) {
		super.delete(etapa);
	}

}
