package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.Carrera;

public class CarreraDAO extends GenericDAO {
	
	private static CarreraDAO instancia;	
	public static CarreraDAO getInstancia() {
		if (instancia == null) {
			instancia = new CarreraDAO();
		}
		return instancia;
	}

	private CarreraDAO() {
		super();
	}

	public List<Carrera> queryAll() {
		return super.queryAll(Carrera.class);
	}

	public Carrera get(Serializable id) {
		return (Carrera)super.get(Carrera.class, id);
	}

	public void save(Carrera carrera) {
		super.save(carrera);
	}

	public void update(Carrera carrera) {
		super.update(carrera);
	}

	public void saveOrUpdate(Carrera carrera) {
		super.saveOrUpdate(carrera);
	}

	public void delete(Carrera carrera) {
		super.delete(carrera);
	}

}
