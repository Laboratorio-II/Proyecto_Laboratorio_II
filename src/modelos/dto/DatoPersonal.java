package modelos.dto;

import java.util.Date;

public class DatoPersonal {
	
	//private String correo;
	//private String contrasena;
	private String nombre;
	private String apellido;
	private Integer id;
	private Date fechaNacimiento;
	private String nacionalidad;
	private char genero;
	private char estatus;
	
	public DatoPersonal() {}
	
	public DatoPersonal(String nombre, String apellido, Integer id, Date fechaNacimiento, String nacionalidad, char genero, char estatus) {
		super();
		this.nombre=nombre;
		this.apellido=apellido;
		this.id=id;
		this.fechaNacimiento=fechaNacimiento;
		this.nacionalidad=nacionalidad;
		this.genero=genero;
		this.estatus=estatus;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public char getEstatus() {
		return estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
