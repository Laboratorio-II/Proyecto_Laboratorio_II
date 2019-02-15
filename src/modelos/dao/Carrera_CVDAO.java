package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.Carrera_CV;

public class Carrera_CVDAO extends GenericDAO {
	
	private static Carrera_CVDAO instancia;	
	public static Carrera_CVDAO getInstancia() {
		if (instancia == null) {
			instancia = new Carrera_CVDAO();
		}
		return instancia;
	}

	private Carrera_CVDAO() {
		super();
	}

	public List<Carrera_CV> queryAll() {
		return super.queryAll(Carrera_CV.class);
	}

	public Carrera_CV get(Serializable id) {
		return (Carrera_CV)super.get(Carrera_CV.class, id);
	}

	public void save(Carrera_CV carrera_cv) {
		super.save(carrera_cv);
	}

	public void update(Carrera_CV carrera_cv) {
		super.update(carrera_cv);
	}

	public void saveOrUpdate(Carrera_CV carrera_cv) {
		super.saveOrUpdate(carrera_cv);
	}

	public void delete(Carrera_CV carrera_cv) {
		super.delete(carrera_cv);
	}

}
