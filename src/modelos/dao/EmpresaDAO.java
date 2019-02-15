package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.Empresa;

public class EmpresaDAO extends GenericDAO {
	
	private static EmpresaDAO instancia;	
	public static EmpresaDAO getInstancia() {
		if (instancia == null) {
			instancia = new EmpresaDAO();
		}
		return instancia;
	}

	private EmpresaDAO() {
		super();
	}

	public List<Empresa> queryAll() {
		return super.queryAll(Empresa.class);
	}

	public Empresa get(Serializable id) {
		return (Empresa)super.get(Empresa.class, id);
	}

	public void save(Empresa e) {
		super.save(e);
	}

	public void update(Empresa e) {
		super.update(e);
	}

	public void saveOrUpdate(Empresa e) {
		super.saveOrUpdate(e);
	}

	public void delete(Empresa e) {
		super.delete(e);
	}

}
