package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.EstudioF;

public class EstudioFDAO extends GenericDAO {
	
	private static EstudioFDAO instancia;	
	public static EstudioFDAO getInstancia() {
		if (instancia == null) {
			instancia = new EstudioFDAO();
		}
		return instancia;
	}

	private EstudioFDAO() {
		super();
	}

	public List<EstudioF> queryAll() {
		return super.queryAll(EstudioF.class);
	}

	public EstudioF get(Serializable id) {
		return (EstudioF)super.get(EstudioF.class, id);
	}

	public void save(EstudioF ef) {
		super.save(ef);
	}

	public void update(EstudioF ef) {
		super.update(ef);
	}

	public void saveOrUpdate(EstudioF ef) {
		super.saveOrUpdate(ef);
	}

	public void delete(EstudioF ef) {
		super.delete(ef);
	}
	
	public EstudioF getByField(String field, Serializable value) {
		return (EstudioF)super.getByField(EstudioF.class, field, value);
	}
	
	public List<EstudioF> queryAllByField(String field, Serializable value) {
		return super.queryAllByField(EstudioF.class, field, value);
	}

}
