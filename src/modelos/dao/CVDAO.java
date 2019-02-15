package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.CV;

public class CVDAO extends GenericDAO {
	
	private static CVDAO instancia;	
	public static CVDAO getInstancia() {
		if (instancia == null) {
			instancia = new CVDAO();
		}
		return instancia;
	}

	private CVDAO() {
		super();
	}

	public List<CV> queryAll() {
		return super.queryAll(CV.class);
	}

	public CV get(Serializable id) {
		return (CV)super.get(CV.class, id);
	}

	public void save(CV cv) {
		super.save(cv);
	}

	public void update(CV cv) {
		super.update(cv);
	}

	public void saveOrUpdate(CV cv) {
		super.saveOrUpdate(cv);
	}

	public void delete(CV cv) {
		super.delete(cv);
	}

}
