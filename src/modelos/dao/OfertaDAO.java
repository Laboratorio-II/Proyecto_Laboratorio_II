package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.CV_Empresa;
import modelos.dto.Oferta;
import modelos.dto.Users;

public class OfertaDAO extends GenericDAO {
	
	private static OfertaDAO instancia;	
	public static OfertaDAO getInstancia() {
		if (instancia == null) {
			instancia = new OfertaDAO();
		}
		return instancia;
	}

	private OfertaDAO() {
		super();
	}

	public List<Oferta> queryAll() {
		return super.queryAll(Oferta.class);
	}

	public Oferta get(Serializable id) {
		return (Oferta)super.get(Oferta.class, id);
	}

	public void save(Oferta oferta) {
		super.save(oferta);
	}

	public void update(Oferta oferta) {
		super.update(oferta);
	}

	public void saveOrUpdate(Oferta oferta) {
		super.saveOrUpdate(oferta);
	}

	public void delete(Oferta oferta) {
		super.delete(oferta);
	}
	
	
	public Oferta getByField(String field, Serializable value) {
		return (Oferta)super.getByField(Oferta.class, field, value);
	}
	
	public List<Oferta> queryAllByField(String field, Serializable value) {
		return super.queryAllByField(Oferta.class, field, value);
	}

}
