package modelos.servicio;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import modelo.dao.UsersDAO;
import modelos.dto.Users;

public class ServicioUsers {

	private UsersDAO usersDAO;
	
	private static ServicioUsers instancia;	
	public static ServicioUsers getInstancia() {
		if (instancia == null) {
			instancia = new ServicioUsers();
		}
		return instancia;
	}
	
	private ServicioUsers() {
		super();
		this.usersDAO = UsersDAO.getInstancia();
	}
	
	public List<Users> getUsers() {
		List<Users> users = this.usersDAO.queryAll(); 
		return users;
	}
}