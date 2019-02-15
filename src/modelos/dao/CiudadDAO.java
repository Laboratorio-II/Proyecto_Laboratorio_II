package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.Ciudad;

public class CiudadDAO extends GenericDAO {
	
	private static CiudadDAO instancia;	
	public static CiudadDAO getInstancia() {
		if (instancia == null) {
			instancia = new CiudadDAO();
		}
		return instancia;
	}

	private CiudadDAO() {
		super();
	}

	public List<Ciudad> queryAll() {
		return super.queryAll(Ciudad.class);
	}

	public Ciudad get(Serializable id) {
		return (Ciudad)super.get(Ciudad.class, id);
	}

	public void save(Ciudad ciudad) {
		super.save(ciudad);
	}

	public void update(Ciudad ciudad) {
		super.update(ciudad);
	}

	public void saveOrUpdate(Ciudad ciudad) {
		super.saveOrUpdate(ciudad);
	}

	public void delete(Ciudad ciudad) {
		super.delete(ciudad);
	}

}
