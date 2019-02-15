package modelos.dto;

public class IdiomaConocido {
	
	private String idCV;
	private String idIdioma;
	private Integer nivel;
	private char estatus;
	
	public IdiomaConocido() {}

	public IdiomaConocido(String idCV, String idIdioma, Integer nivel, char estatus) {
		super();
		this.idCV = idCV;
		this.idIdioma = idIdioma;
		this.nivel = nivel;
		this.estatus = estatus;
	}

	public String getIdCV() {
		return idCV;
	}

	public void setIdCV(String idCV) {
		this.idCV = idCV;
	}

	public String getIdIdioma() {
		return idIdioma;
	}

	public void setIdIdioma(String idIdioma) {
		this.idIdioma = idIdioma;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public char getEstatus() {
		return estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
