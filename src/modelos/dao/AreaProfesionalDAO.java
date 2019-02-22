package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.AreaProfesional;
import modelos.dto.DatoLaboral;

public class AreaProfesionalDAO extends GenericDAO {
	
	private static AreaProfesionalDAO instancia;	
	public static AreaProfesionalDAO getInstancia() {
		if (instancia == null) {
			instancia = new AreaProfesionalDAO();
		}
		return instancia;
	}

	private AreaProfesionalDAO() {
		super();
	}

	public List<AreaProfesional> queryAll() {
		return super.queryAll(AreaProfesional.class);
	}

	public AreaProfesional get(Serializable id) {
		return (AreaProfesional)super.get(AreaProfesional.class, id);
	}

	public void save(AreaProfesional areaProfesional) {
		super.save(areaProfesional);
	}

	public void update(AreaProfesional areaProfesional) {
		super.update(areaProfesional);
	}

	public void saveOrUpdate(AreaProfesional areaProfesional) {
		super.saveOrUpdate(areaProfesional);
	}

	public void delete(AreaProfesional areaProfesional) {
		super.delete(areaProfesional);
	}
	
	public AreaProfesional getByField(String field, Serializable value) {
		return (AreaProfesional)super.getByField(AreaProfesional.class, field, value);
	}
	
	public List<AreaProfesional> queryAllByField(String field, Serializable value) {
		return super.queryAllByField(AreaProfesional.class, field, value);
	}

}
