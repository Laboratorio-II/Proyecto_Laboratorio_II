package modelos.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelos.dao.utils.GenericDAO;
import modelos.dto.Idioma;

public class IdiomaDAO extends GenericDAO {
	
	private static IdiomaDAO instancia;	
	public static IdiomaDAO getInstancia() {
		if (instancia == null) {
			instancia = new IdiomaDAO();
		}
		return instancia;
	}

	private IdiomaDAO() {
		super();
	}

	public List<Idioma> queryAll() {
		return super.queryAll(Idioma.class);
	}

	public Idioma get(Serializable id) {
		return (Idioma)super.get(Idioma.class, id);
	}

	public void save(Idioma idioma) {
		super.save(idioma);
	}

	public void update(Idioma idioma) {
		super.update(idioma);
	}

	public void saveOrUpdate(Idioma idioma) {
		super.saveOrUpdate(idioma);
	}

	public void delete(Idioma idioma) {
		super.delete(idioma);
	}

}
