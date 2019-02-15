package modelos.dto;

import java.util.Date;

public class EstudioF {
	
	private Integer id;
	private String idCV;
	private String nombre;
	private String descripcion;
	private Date fechaInicio;
	private Date fechaFin;
	private String institucion;
	private char estatus;
	
	public EstudioF() {}
	
	public EstudioF(Integer id, String idCV, String nombre, String descripcion, Date fechaInicio, Date fechaFin, String institucion, char estatus) {
		super();
		this.id=id;
		this.idCV=idCV;
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
		this.institucion=institucion;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public char getEstatus() {
		return estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
