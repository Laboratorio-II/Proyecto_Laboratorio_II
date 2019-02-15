package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.Dedicacion;

public class DedicacionDAO extends GenericDAO {
	
	private static DedicacionDAO instancia;	
	public static DedicacionDAO getInstancia() {
		if (instancia == null) {
			instancia = new DedicacionDAO();
		}
		return instancia;
	}

	private DedicacionDAO() {
		super();
	}

	public List<Dedicacion> queryAll() {
		return super.queryAll(Dedicacion.class);
	}

	public Dedicacion get(Serializable id) {
		return (Dedicacion)super.get(Dedicacion.class, id);
	}

	public void save(Dedicacion dedicacion) {
		super.save(dedicacion);
	}

	public void update(Dedicacion dedicacion) {
		super.update(dedicacion);
	}

	public void saveOrUpdate(Dedicacion dedicacion) {
		super.saveOrUpdate(dedicacion);
	}

	public void delete(Dedicacion dedicacion) {
		super.delete(dedicacion);
	}

}
