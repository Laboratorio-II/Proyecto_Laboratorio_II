package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.DatoLaboral;
import modelos.dto.Pais;

public class PaisDAO extends GenericDAO {
	
	private static PaisDAO instancia;	
	public static PaisDAO getInstancia() {
		if (instancia == null) {
			instancia = new PaisDAO();
		}
		return instancia;
	}

	private PaisDAO() {
		super();
	}

	public List<Pais> queryAll() {
		return super.queryAll(Pais.class);
	}

	public Pais get(Serializable id) {
		return (Pais)super.get(Pais.class, id);
	}

	public void save(Pais pais) {
		super.save(pais);
	}

	public void update(Pais pais) {
		super.update(pais);
	}

	public void saveOrUpdate(Pais pais) {
		super.saveOrUpdate(pais);
	}

	public void delete(Pais pais) {
		super.delete(pais);
	}
	
	public Pais getByField(String field, Serializable value) {
		return (Pais)super.getByField(Pais.class, field, value);
	}
	
	public List<Pais> queryAllByField(String field, Serializable value) {
		return super.queryAllByField(Pais.class, field, value);
	}

}
