package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.DatoLaboral;

public class DatoLaboralDAO extends GenericDAO {
	
	private static DatoLaboralDAO instancia;	
	public static DatoLaboralDAO getInstancia() {
		if (instancia == null) {
			instancia = new DatoLaboralDAO();
		}
		return instancia;
	}

	private DatoLaboralDAO() {
		super();
	}

	public List<DatoLaboral> queryAll() {
		return super.queryAll(DatoLaboral.class);
	}

	public DatoLaboral get(Serializable id) {
		return (DatoLaboral)super.get(DatoLaboral.class, id);
	}

	public void save(DatoLaboral datoLaboral) {
		super.save(datoLaboral);
	}

	public void update(DatoLaboral datoLaboral) {
		super.update(datoLaboral);
	}

	public void saveOrUpdate(DatoLaboral datoLaboral) {
		super.saveOrUpdate(datoLaboral);
	}

	public void delete(DatoLaboral datoLaboral) {
		super.delete(datoLaboral);
	}

}
