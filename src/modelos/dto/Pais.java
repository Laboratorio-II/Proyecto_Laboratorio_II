package modelos.dto;

public class Pais {
	
	private Integer id;
	private String nombre;
	private char estatus;
	
	public Pais() {}

	public Pais(Integer id, String nombre, char estatus) {
		super();
		this.id = id;
		this.nombre = nombre;
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

	public char getEstatus() {
		return estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
