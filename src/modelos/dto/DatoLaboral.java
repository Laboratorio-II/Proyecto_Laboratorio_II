package modelos.dto;

import java.util.Date;

public class DatoLaboral {
	
	private Integer id;
	private Integer idCV;
	private String cargo;
	private String funciones;
	private Date fechaInicio;
	private Date fechaFin;
	private char estatus;
	
	public DatoLaboral() {}
	
	public DatoLaboral(Integer id, Integer idCV, String cargo, String funciones, Date fechaInicio, Date fechaFin, char estatus) {
		super();
		this.id=id;
		this.idCV=idCV;
		this.cargo=cargo;
		this.funciones=funciones;
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
		this.estatus=estatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdCV() {
		return idCV;
	}

	public void setIdCV(Integer idCV) {
		this.idCV = idCV;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getFunciones() {
		return funciones;
	}

	public void setFunciones(String funciones) {
		this.funciones = funciones;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public char getEstatus() {
		return estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
