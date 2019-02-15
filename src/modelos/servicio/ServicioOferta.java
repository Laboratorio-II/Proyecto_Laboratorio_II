package modelos.servicio;

import java.io.Serializable;
import java.util.List;

import modelos.dao.OfertaDAO;
import modelos.dto.Carrera_Oferta;
import modelos.dto.Oferta;

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
	
	public Oferta incluirdioma(Oferta oferta) {
		this.ofertaDAO.save(oferta);
		return oferta;
	}
	
	public Oferta modificarOferta(Integer id, String ciudad, String rangoSalario, String cargo, String dedicacion,
			Carrera_Oferta[] carreras) {
		Oferta oferta = this.getOfertaPorId(id);
		oferta.setId(id);
		oferta.setCiudad(ciudad);
		oferta.setRangoSalario(rangoSalario);
		oferta.setCargo(cargo);
		oferta.setDedicacion(dedicacion);
		this.ofertaDAO.saveOrUpdate(oferta);
		return this.getOfertaPorId(id);
	}
	
	public String eliminarOferta(Integer id) {
		Oferta oferta = this.getOfertaPorId(id);
		if (oferta != null) {
			this.ofertaDAO.delete(oferta);
			return "ok";
		}
		return "No se pudo eliminar el producto";
	}

	
}
