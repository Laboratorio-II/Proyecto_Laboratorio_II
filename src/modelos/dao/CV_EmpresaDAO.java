package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.CV_Empresa;

public class CV_EmpresaDAO extends GenericDAO {
	
	private static CV_EmpresaDAO instancia;	
	public static CV_EmpresaDAO getInstancia() {
		if (instancia == null) {
			instancia = new CV_EmpresaDAO();
		}
		return instancia;
	}

	private CV_EmpresaDAO() {
		super();
	}

	public List<CV_Empresa> queryAll() {
		return super.queryAll(CV_Empresa.class);
	}

	public CV_Empresa get(Serializable id) {
		return (CV_Empresa)super.get(CV_Empresa.class, id);
	}

	public void save(CV_Empresa cv_empresa) {
		super.save(cv_empresa);
	}

	public void update(CV_Empresa cv_empresa) {
		super.update(cv_empresa);
	}

	public void saveOrUpdate(CV_Empresa cv_empresa) {
		super.saveOrUpdate(cv_empresa);
	}

	public void delete(CV_Empresa cv_empresa) {
		super.delete(cv_empresa);
	}

}
