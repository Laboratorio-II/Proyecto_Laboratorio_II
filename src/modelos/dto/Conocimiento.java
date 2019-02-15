package modelos.dto;

public class Conocimiento {
	
	private Integer id;
	private String idCV;
	private String nombre;
	private char estatus;
	
	public Conocimiento() {}
	
	public Conocimiento(Integer id, String idCV, String nombre, char estatus) {
		super();
		this.id=id;
		this.idCV=idCV;
		this.nombre=nombre;
		this.estatus=estatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdCV() {
		return idCV;
	}

	public void setIdCV(String idCV) {
		this.idCV = idCV;
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
