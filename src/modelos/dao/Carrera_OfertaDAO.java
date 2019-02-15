package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.Carrera_Oferta;

public class Carrera_OfertaDAO extends GenericDAO {
	
	private static Carrera_OfertaDAO instancia;	
	public static Carrera_OfertaDAO getInstancia() {
		if (instancia == null) {
			instancia = new Carrera_OfertaDAO();
		}
		return instancia;
	}

	private Carrera_OfertaDAO() {
		super();
	}

	public List<Carrera_Oferta> queryAll() {
		return super.queryAll(Carrera_OfertaDAO.class);
	}

	public Carrera_Oferta get(Serializable id) {
		return (Carrera_Oferta)super.get(Carrera_Oferta.class, id);
	}

	public void save(Carrera_Oferta carrera_oferta) {
		super.save(carrera_oferta);
	}

	public void update(Carrera_Oferta carrera_oferta) {
		super.update(carrera_oferta);
	}

	public void saveOrUpdate(Carrera_Oferta carrera_oferta) {
		super.saveOrUpdate(carrera_oferta);
	}

	public void delete(Carrera_Oferta carrera_oferta) {
		super.delete(carrera_oferta);
	}

}
