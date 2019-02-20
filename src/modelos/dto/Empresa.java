package modelos.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Empresa")
@Table(name="empresas")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="usuario")
	private Integer usuario;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="rif")
	private String rif;
	
	@Column(name="pais")
	private Integer pais;
	
	@Column(name="estado")
	private Integer estado;
	
	@Column(name="ciudad")
	private Integer ciudad;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="estatus")
	private char estatus;
	
	public Empresa() {}
	
	public Empresa(Integer usuario, String nombre, String rif, Integer pais, 
			Integer estado, Integer ciudad, String direccion, 
			String descripcion, char estatus) {
		super();
		this.usuario=usuario;
		this.nombre=nombre;
		this.rif=rif;
		this.pais=pais;
		this.estado=estado;
		this.ciudad=ciudad;
		this.direccion=direccion;
		this.descripcion=descripcion;
		this.estatus=estatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRif() {
		return rif;
	}

	public void setRif(String rif) {
		this.rif = rif;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
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
