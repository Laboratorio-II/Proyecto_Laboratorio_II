package modelos.servicio;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import modelos.dao.UsersDAO;
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
	
	public Users getUserPorId(Serializable id) {
		if (id != null) {
			return this.usersDAO.get(id);
		}
		return null;
	}
	
	public Users incluirUsers(Users users) {
		this.usersDAO.save(users);
		return users;
	}
	
	public Users modificarUser(Integer id, String email,
			String pass, Integer rol, char estatus) {
		Users user = this.getUserPorId(id);
		user.setId(id);
		user.setEmail(email);
		user.setPass(pass);
		user.setRol(rol);
		user.setEstatus(estatus);
		this.usersDAO.saveOrUpdate(user);
		return this.getUserPorId(id);
	}
	
	public String eliminarUser(Integer id) {
		Users user = this.getUserPorId(id);
		if (user != null) {
			this.usersDAO.delete(user);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}
	
	public Users getUserPorField(String field, Serializable value) {
		if (field != null) {
			return this.usersDAO.getByField(field,value);
		}
		return null;
	}
}
