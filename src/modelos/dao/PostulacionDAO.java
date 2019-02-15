package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.Postulacion;

public class PostulacionDAO extends GenericDAO {
	
	private static PostulacionDAO instancia;	
	public static PostulacionDAO getInstancia() {
		if (instancia == null) {
			instancia = new PostulacionDAO();
		}
		return instancia;
	}

	private PostulacionDAO() {
		super();
	}

	public List<Postulacion> queryAll() {
		return super.queryAll(Postulacion.class);
	}

	public Postulacion get(Serializable id) {
		return (Postulacion)super.get(Postulacion.class, id);
	}

	public void save(Postulacion postulacion) {
		super.save(postulacion);
	}

	public void update(Postulacion postulacion) {
		super.update(postulacion);
	}

	public void saveOrUpdate(Postulacion postulacion) {
		super.saveOrUpdate(postulacion);
	}

	public void delete(Postulacion postulacion) {
		super.delete(postulacion);
	}

}
