package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.Users;

public class UsersDAO extends GenericDAO {
	
	private static UsersDAO instancia;	
	public static UsersDAO getInstancia() {
		if (instancia == null) {
			instancia = new UsersDAO();
		}
		return instancia;
	}

	private UsersDAO() {
		super();
	}

	public List<Users> queryAll() {
		return super.queryAll(Users.class);
	}
	
	public Users get(Serializable id) {
		return (Users)super.get(Users.class, id);
	}
	
	public void save(Users users) {
		super.save(users);
	}
	
	public void update(Users user) {
		super.update(user);
	}
	
	public void saveOrUpdate(Users user) {
		super.saveOrUpdate(user);
	}
	
	public void delete(Users user) {
		super.delete(user);
	}

}
