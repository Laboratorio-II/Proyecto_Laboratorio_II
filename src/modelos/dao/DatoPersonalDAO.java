package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.DatoPersonal;

public class DatoPersonalDAO extends GenericDAO {
	
	private static DatoPersonalDAO instancia;	
	public static DatoPersonalDAO getInstancia() {
		if (instancia == null) {
			instancia = new DatoPersonalDAO();
		}
		return instancia;
	}

	private DatoPersonalDAO() {
		super();
	}

	public List<DatoPersonal> queryAll() {
		return super.queryAll(DatoPersonal.class);
	}

	public DatoPersonal get(Serializable id) {
		return (DatoPersonal)super.get(DatoPersonal.class, id);
	}

	public void save(DatoPersonal dp) {
		super.save(dp);
	}

	public void update(DatoPersonal dp) {
		super.update(dp);
	}

	public void saveOrUpdate(DatoPersonal dp) {
		super.saveOrUpdate(dp);
	}

	public void delete(DatoPersonal dp) {
		super.delete(dp);
	}

}
