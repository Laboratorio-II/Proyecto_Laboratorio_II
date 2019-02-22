package modelos.servicio;

import java.io.Serializable;
import java.util.List;

import modelos.dao.OfertaDAO;
import modelos.dto.Carrera_Oferta;
import modelos.dto.Oferta;
import modelos.dto.Users;

public class ServicioOferta {
	
	private OfertaDAO ofertaDAO;
	
	private static ServicioOferta instancia;	
	public static ServicioOferta getInstancia() {
		if (instancia == null) {
			instancia = new ServicioOferta();
		}
		return instancia;
	}

	
	private ServicioOferta() {
		super();
		this.ofertaDAO = OfertaDAO.getInstancia();
	}
	

	public List<Oferta> getOfertas() {
		List<Oferta> ofertas = this.ofertaDAO.queryAll(); 
		return ofertas;
	}
	
	public Oferta getOfertaPorId(Serializable id) {
		if (id != null) {
			return this.ofertaDAO.get(id);
		}
		return null;
	}
	
	public Oferta incluirOferta(Oferta oferta) {
		this.ofertaDAO.save(oferta);
		return oferta;
	}
	
	public Oferta modificarOferta(Integer id, Integer idempresa,String descripcion, Integer estado, Integer area, Integer dedicacion, float salario) {
		Oferta oferta = this.getOfertaPorId(id);
		oferta.setIdempresa(idempresa);
		oferta.setDescripcion(descripcion);
		oferta.setEstado(estado);
		oferta.setArea(area);
		oferta.setDedicacion(dedicacion);
		oferta.setSalario(salario);
		this.ofertaDAO.saveOrUpdate(oferta);
		return this.getOfertaPorId(id);
	}
	
	public String eliminarOferta(Integer id) {
		Oferta oferta = this.getOfertaPorId(id);
		if (oferta != null) {
			this.ofertaDAO.delete(oferta);
			return "ok";
		}
		return "No se pudo eliminar la Oferta";
	}
	
	
	public Oferta getUserPorField(String field, Serializable value) {
		if (field != null) {
			return this.ofertaDAO.getByField(field,value);
		}
		return null;
			
	
	
	
	
	
	
	

	
}






}



