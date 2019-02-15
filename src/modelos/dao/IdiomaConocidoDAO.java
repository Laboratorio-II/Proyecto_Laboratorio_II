package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.IdiomaConocido;

public class IdiomaConocidoDAO extends GenericDAO {
	
	private static IdiomaConocidoDAO instancia;	
	public static IdiomaConocidoDAO getInstancia() {
		if (instancia == null) {
			instancia = new IdiomaConocidoDAO();
		}
		return instancia;
	}

	private IdiomaConocidoDAO() {
		super();
	}

	public List<IdiomaConocido> queryAll() {
		return super.queryAll(IdiomaConocido.class);
	}

	public IdiomaConocido get(Serializable id) {
		return (IdiomaConocido)super.get(IdiomaConocido.class, id);
	}

	public void save(IdiomaConocido ic) {
		super.save(ic);
	}

	public void update(IdiomaConocido ic) {
		super.update(ic);
	}

	public void saveOrUpdate(IdiomaConocido ic) {
		super.saveOrUpdate(ic);
	}

	public void delete(IdiomaConocido ic) {
		super.delete(ic);
	}

}
