package modelos.dto;

public class Carrera_Oferta {
	
	private Integer id;
	private String idCarrera;
	private String idOferta;
	private char estatus;
	
	public Carrera_Oferta() {}

	public Carrera_Oferta(Integer id, String idCarrera, String idOferta, char estatus) {
		super();
		this.id = id;
		this.idCarrera = idCarrera;
		this.idOferta = idOferta;
		this.estatus = estatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(String idCarrera) {
		this.idCarrera = idCarrera;
	}

	public String getIdOferta() {
		return idOferta;
	}

	public void setIdOferta(String idOferta) {
		this.idOferta = idOferta;
	}

	public char getEstatus() {
		return estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
