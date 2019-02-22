package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.Estado;
import modelos.dto.Estado;

public class EstadoDAO extends GenericDAO {
	
	private static EstadoDAO instancia;	
	public static EstadoDAO getInstancia() {
		if (instancia == null) {
			instancia = new EstadoDAO();
		}
		return instancia;
	}

	private EstadoDAO() {
		super();
	}

	public List<Estado> queryAll() {
		return super.queryAll(Estado.class);
	}

	public Estado get(Serializable id) {
		return (Estado)super.get(Estado.class, id);
	}

	public void save(Estado estado) {
		super.save(estado);
	}

	public void update(Estado estado) {
		super.update(estado);
	}

	public void saveOrUpdate(Estado estado) {
		super.saveOrUpdate(estado);
	}

	public void delete(Estado estado) {
		super.delete(estado);
	}
	
	public Estado getByField(String field, Serializable value) {
		return (Estado)super.getByField(Estado.class, field, value);
	}
	
	public List<Estado> queryAllByField(String field, Serializable value) {
		return super.queryAllByField(Estado.class, field, value);
	}

}
