package modelos.dto;

import java.util.Date;

public class Postulacion {
	
	private Integer id;
	private String idCV;
	private Integer nroEtapa;
	private Date fechaPostulacion;
	private String idOferta;
	private char estatus;
	
	public Postulacion() {}

	public Postulacion(Integer id, String idCV, Integer nroEtapa, Date fechaPostulacion, String idOferta,
			char estatus) {
		super();
		this.id = id;
		this.idCV = idCV;
		this.nroEtapa = nroEtapa;
		this.fechaPostulacion = fechaPostulacion;
		this.idOferta = idOferta;
		this.estatus = estatus;
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

	public Integer getNroEtapa() {
		return nroEtapa;
	}

	public void setNroEtapa(Integer nroEtapa) {
		this.nroEtapa = nroEtapa;
	}

	public Date getFechaPostulacion() {
		return fechaPostulacion;
	}

	public void setFechaPostulacion(Date fechaPostulacion) {
		this.fechaPostulacion = fechaPostulacion;
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
