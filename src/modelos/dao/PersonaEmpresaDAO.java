package modelos.dao;

import java.io.Serializable;
import java.util.List;

import modelos.dao.utils.GenericDAO;
import modelos.dto.PersonaEmpresa;

public class PersonaEmpresaDAO extends GenericDAO {
	
	private static PersonaEmpresaDAO instancia;	
	public static PersonaEmpresaDAO getInstancia() {
		if (instancia == null) {
			instancia = new PersonaEmpresaDAO();
		}
		return instancia;
	}

	private PersonaEmpresaDAO() {
		super();
	}

	public List<PersonaEmpresa> queryAll() {
		return super.queryAll(PersonaEmpresa.class);
	}

	public PersonaEmpresa get(Serializable id) {
		return (PersonaEmpresa)super.get(PersonaEmpresa.class, id);
	}

	public void save(PersonaEmpresa pe) {
		super.save(pe);
	}

	public void update(PersonaEmpresa pe) {
		super.update(pe);
	}

	public void saveOrUpdate(PersonaEmpresa pe) {
		super.saveOrUpdate(pe);
	}

	public void delete(PersonaEmpresa pe) {
		super.delete(pe);
	}
	
	public PersonaEmpresa getByField(String field, Serializable value) {
		return (PersonaEmpresa)super.getByField(PersonaEmpresa.class, field, value);
	}

}
