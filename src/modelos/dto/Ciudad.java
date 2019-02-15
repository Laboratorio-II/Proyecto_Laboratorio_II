package modelos.dto;

public class Ciudad {
	
	private Integer id;
	private String nombre;
	private String idEstado;
	private char estatus;
	
	public Ciudad() {}

	public Ciudad(Integer id, String nombre, String idEstado, char estatus) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.idEstado = idEstado;
		this.estatus = estatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(String idEstado) {
		this.idEstado = idEstado;
	}

	public char getEstatus() {
		return estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
