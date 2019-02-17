package modelos.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="DatoPersonal")
@Table(name="datos_personales")
public class DatoPersonal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="usuario")
	private Integer usuario;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;
	
	@Column(name="estado_civil")
	private char estadoCivil;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="pais")
	private Integer pais;
	
	@Column(name="estado")
	private Integer estado;
	
	@Column(name="ciudad")
	private Integer ciudad;
	
	
	@Column(name="genero")
	private char genero;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="estatus")
	private char estatus;
	
	public DatoPersonal() {}
	
	public DatoPersonal(Integer usuario) {
		this.usuario = usuario;
	}
	
	public DatoPersonal(Integer usuario, String nombre, String apellido, 
			Date fechaNacimiento, char estadoCivil, String telefono,
			Integer pais,  Integer estado, Integer ciudad, char genero,  
			String descripcion, char estatus) {
		super();
		this.usuario=usuario;
		this.nombre=nombre;
		this.apellido=apellido;
		this.fechaNacimiento=fechaNacimiento;
		this.estadoCivil=estadoCivil;
		this.telefono=telefono;
		this.pais=pais;
		this.estado=estado;
		this.ciudad=ciudad;
		this.genero=genero;
		this.descripcion=descripcion;
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

	public char getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(char estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Integer getPais() {
		return pais;
	}

	public void setPais(Integer pais) {
		this.pais = pais;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Integer getCiudad() {
		return ciudad;
	}

	public void setCiudad(Integer ciudad) {
		this.ciudad = ciudad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getId() {
		return id;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getUsuario() {
		return usuario;
	}

	public void setId(Integer usuario) {
		this.usuario = usuario;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
