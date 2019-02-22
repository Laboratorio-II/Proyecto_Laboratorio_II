package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.Cargo;
import modelos.dto.Cargo;

public class CargoDAO extends GenericDAO {
	
	private static CargoDAO instancia;	
	public static CargoDAO getInstancia() {
		if (instancia == null) {
			instancia = new CargoDAO();
		}
		return instancia;
	}

	private CargoDAO() {
		super();
	}

	public List<Cargo> queryAll() {
		return super.queryAll(Cargo.class);
	}

	public Cargo get(Serializable id) {
		return (Cargo)super.get(Cargo.class, id);
	}

	public void save(Cargo cargo) {
		super.save(cargo);
	}

	public void update(Cargo cargo) {
		super.update(cargo);
	}

	public void saveOrUpdate(Cargo cargo) {
		super.saveOrUpdate(cargo);
	}

	public void delete(Cargo cargo) {
		super.delete(cargo);
	}
	
	public Cargo getByField(String field, Serializable value) {
		return (Cargo)super.getByField(Cargo.class, field, value);
	}
	
	public List<Cargo> queryAllByField(String field, Serializable value) {
		return super.queryAllByField(Cargo.class, field, value);
	}

}
