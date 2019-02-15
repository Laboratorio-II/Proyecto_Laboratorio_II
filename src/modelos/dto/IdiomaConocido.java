package modelos.dto;

public class IdiomaConocido {
	
	private Integer idCV;
	private Integer idIdioma;
	private Integer nivel;
	private char estatus;
	
	public IdiomaConocido() {}

	public IdiomaConocido(Integer idCV, Integer idIdioma, Integer nivel, char estatus) {
		super();
		this.idCV = idCV;
		this.idIdioma = idIdioma;
		this.nivel = nivel;
		this.estatus = estatus;
	}

	public Integer getIdCV() {
		return idCV;
	}

	public void setIdCV(Integer idCV) {
		this.idCV = idCV;
	}

	public Integer getIdIdioma() {
		return idIdioma;
	}

	public void setIdIdioma(Integer idIdioma) {
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
