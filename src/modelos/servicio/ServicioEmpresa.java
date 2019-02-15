package modelos.servicio;

import java.io.Serializable;
import java.util.List;

import modelos.dao.EmpresaDAO;
import modelos.dto.Empresa;

public class ServicioEmpresa {
	
	private EmpresaDAO empresaDAO;
	
	private static ServicioEmpresa instancia;	
	public static ServicioEmpresa getInstancia() {
		if (instancia == null) {
			instancia = new ServicioEmpresa();
		}
		return instancia;
	}
	
	private ServicioEmpresa() {
		super();
		this.empresaDAO = EmpresaDAO.getInstancia();
	}
	
	public List<Empresa> getEmpresas() {
		List<Empresa> empresa = this.empresaDAO.queryAll(); 
		return empresa;
	}
	
	public Empresa getEmpresaPorId(Serializable id) {
		if (id != null) {
			return this.empresaDAO.get(id);
		}
		return null;
	}
	
	public Empresa incluirEmpresa(Empresa empresa) {
		this.empresaDAO.save(empresa);
		return empresa;
	}
	
	public Empresa modificarEmpresa(Integer id, String nombre, String rif,
			String pais, String estado, String ciudad, String sector, String descripcion, char estatus) {
		
		Empresa empresa = this.getEmpresaPorId(id);
		empresa.setId(id);
		empresa.setNombre(nombre);
		empresa.setRif(rif);
		empresa.setPais(pais);
		empresa.setEstado(estado);
		empresa.setCiudad(ciudad);
		empresa.setSector(sector);
		empresa.setDescripcion(descripcion);
		empresa.setEstatus(estatus);
		this.empresaDAO.saveOrUpdate(empresa);
		return this.getEmpresaPorId(id);
	}
	
	public String eliminarEmpresa(Integer id) {
		Empresa empresa = this.getEmpresaPorId(id);
		if (empresa != null) {
			this.empresaDAO.delete(empresa);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}

}
