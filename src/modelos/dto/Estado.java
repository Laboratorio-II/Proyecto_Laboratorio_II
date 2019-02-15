package modelos.dto;

public class Estado {
	
	private Integer id;
	private String nombre;
	private String idPais;
	private char estatus;
	
	public Estado() {}

	public Estado(Integer id, String nombre, String idPais, char estatus) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.idPais = idPais;
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


	public String getIdPais() {
		return idPais;
	}


	public void setIdPais(String idPais) {
		this.idPais = idPais;
	}


	public char getEstatus() {
		return estatus;
	}


	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}	

}
