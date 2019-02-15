package modelos.dto;

public class Carrera {
	
	private Integer id;
	private String idArea;
	private String nombre;
	private char estatus;
	
	public Carrera() {}

	public Carrera(Integer id, String idArea, String nombre, char estatus) {
		super();
		this.id = id;
		this.idArea = idArea;
		this.nombre = nombre;
		this.estatus = estatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdArea() {
		return idArea;
	}

	public void setIdArea(String idArea) {
		this.idArea = idArea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getEstatus() {
		return estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
