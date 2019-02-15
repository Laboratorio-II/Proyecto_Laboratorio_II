package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.Conocimiento;

public class ConocimientoDAO extends GenericDAO {
	
	private static ConocimientoDAO instancia;	
	public static ConocimientoDAO getInstancia() {
		if (instancia == null) {
			instancia = new ConocimientoDAO();
		}
		return instancia;
	}

	private ConocimientoDAO() {
		super();
	}

	public List<Conocimiento> queryAll() {
		return super.queryAll(Conocimiento.class);
	}

	public Conocimiento get(Serializable id) {
		return (Conocimiento)super.get(Conocimiento.class, id);
	}

	public void save(Conocimiento conocimiento) {
		super.save(conocimiento);
	}

	public void update(Conocimiento conocimiento) {
		super.update(conocimiento);
	}

	public void saveOrUpdate(Conocimiento conocimiento) {
		super.saveOrUpdate(conocimiento);
	}

	public void delete(Conocimiento conocimiento) {
		super.delete(conocimiento);
	}

}
