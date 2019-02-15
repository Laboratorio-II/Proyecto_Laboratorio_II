package modelos.dto;

public class Dedicacion {
	
	private Integer id;
	private String descripcion;
	private Integer horasTrabajadas;
	private char estatus;
	
	public Dedicacion() {}

	public Dedicacion(Integer id, String descripcion, Integer horasTrabajadas, char estatus) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.horasTrabajadas = horasTrabajadas;
		this.estatus = estatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(Integer horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public char getEstatus() {
		return estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
