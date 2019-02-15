package modelos.dto;

public class Etapa {
	
	private Integer nro;
	private String descripcion;
	private char estatus;
	
	public Etapa() {}

	public Etapa(Integer nro, String descripcion, char estatus) {
		super();
		this.nro = nro;
		this.descripcion = descripcion;
		this.estatus = estatus;
	}

	public Integer getNro() {
		return nro;
	}

	public void setNro(Integer nro) {
		this.nro = nro;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public char getEstatus() {
		return estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
