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
	
	public void saveOrUpdate(Users users) {
		super.saveOrUpdate(users);
	}
	
	public void save(Users users) {
		super.save(users);
	}

}
