package modelos.servicio;

import java.io.Serializable;
import java.util.List;

import modelos.dao.CV_EmpresaDAO;
import modelos.dto.CV_Empresa;

public class ServicioCV_Empresa {
	
	private CV_EmpresaDAO CV_EmpresaDAO;
	private static ServicioCV_Empresa instacia;
	public static ServicioCV_Empresa getInstancia() {
		if(instacia== null) {
			instacia = new ServicioCV_Empresa();
			
		}
			return instacia;
			
	}
	
	private ServicioCV_Empresa() {
		super();
		this.CV_EmpresaDAO= CV_EmpresaDAO.getInstancia();
		
	}
	
	public List<CV_Empresa> getCV_Empresa(){
		List<CV_Empresa> CV_Empresa= this.CV_EmpresaDAO.queryAll();
		return CV_Empresa;
		
	}
	
	public CV_Empresa getCV_EmpresaPorId(Serializable id) {
		if (id != null) {
			return this.CV_EmpresaDAO.get(id);
		}
		return null;
	}
	
	public CV_Empresa incluirCV_Empresa(CV_Empresa CV_Empresa) {
		this.CV_EmpresaDAO.save(CV_Empresa);
		return CV_Empresa;
	}
	
	public CV_Empresa getCV_EmpresaPorField(String field, Serializable value) {
		if (field != null) {
			return this.CV_EmpresaDAO.getByField(field,value);
		}
		return null;
	}
	
	public List<CV_Empresa> getCV_EmpresasPorField(String field, Serializable value) {
		if (field != null) {
			return this.CV_EmpresaDAO.queryAllByField(field,value);
		}
		return null;
	}
	
	public String eliminarCV_Empresa(Integer id) {
		CV_Empresa CV_Empresa = this.getCV_EmpresaPorId(id);
		if (CV_Empresa != null) {
			this.CV_EmpresaDAO.delete(CV_Empresa);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}
	
}
