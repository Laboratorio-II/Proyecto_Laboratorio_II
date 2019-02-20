package modelos.servicio;

import java.io.Serializable;
import java.util.List;

import modelos.dao.PersonaEmpresaDAO;
import modelos.dto.PersonaEmpresa;

public class ServicioPersonaEmpresa {
	
private PersonaEmpresaDAO personaEmpresaDAO;
	
	private static ServicioPersonaEmpresa instancia;	
	public static ServicioPersonaEmpresa getInstancia() {
		if (instancia == null) {
			instancia = new ServicioPersonaEmpresa();
		}
		return instancia;
	}
	
	private ServicioPersonaEmpresa() {
		super();
		this.personaEmpresaDAO = PersonaEmpresaDAO.getInstancia();
	}
	
	public List<PersonaEmpresa> getPersonaEmpresas() {
		List<PersonaEmpresa> personaEmpresa = this.personaEmpresaDAO.queryAll(); 
		return personaEmpresa;
	}
	
	public PersonaEmpresa getPersonaEmpresaPorId(Serializable id) {
		if (id != null) {
			return this.personaEmpresaDAO.get(id);
		}
		return null;
	}
	
	public PersonaEmpresa incluirPersonaEmpresa(PersonaEmpresa personaEmpresa) {
		this.personaEmpresaDAO.save(personaEmpresa);
		return personaEmpresa;
	}
	
	public PersonaEmpresa modificarPersonaEmpresa(Integer usuario, String nombre, String apellido,
			String cargo, String telefono) {
		
		PersonaEmpresa personaEmpresa = this.getPersonaEmpresaPorField("usuario", usuario);
		personaEmpresa.setNombre(nombre);
		personaEmpresa.setApellido(apellido);
		personaEmpresa.setCargo(cargo);
		personaEmpresa.setTelefono(telefono);
		this.personaEmpresaDAO.saveOrUpdate(personaEmpresa);
		return this.getPersonaEmpresaPorField("usuario", usuario);
	}
	
	public String eliminarPersonaEmpresa(Integer id) {
		PersonaEmpresa personaEmpresa = this.getPersonaEmpresaPorId(id);
		if (personaEmpresa != null) {
			this.personaEmpresaDAO.delete(personaEmpresa);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}
	
	public PersonaEmpresa getPersonaEmpresaPorField(String field, Serializable value) {
		if (field != null) {
			return this.personaEmpresaDAO.getByField(field,value);
		}
		return null;
	}


}
