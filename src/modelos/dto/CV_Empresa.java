package modelos.dto;

import java.util.Date;

public class CV_Empresa {
	
	private Integer id;
	private String empresa;
	private String cv;
	private Date fechaAgregado;
	private char estatus;
	
	public CV_Empresa() {}
	
	public CV_Empresa(Integer id, String empresa, String cv, Date fechaAgregado, char estatus) {
		super();
		this.id=id;
		this.empresa=empresa;
		this.cv=cv;
		this.fechaAgregado=fechaAgregado;
		this.estatus=estatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	public Date getFechaAgregado() {
		return fechaAgregado;
	}

	public void setFechaAgregado(Date fechaAgregado) {
		this.fechaAgregado = fechaAgregado;
	}

	public char getEstatus() {
		return estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}
	
}
