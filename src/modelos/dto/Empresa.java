package modelos.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="Empresa")
@Table(name="empresas")
public class Empresa {
	
	private Integer id;
	private String nombre;
	private String rif;
	private Integer pais;
	private Integer estado;
	private Integer ciudad;
	private String direccion;
	private String sector;
	private String descripcion;
	private char estatus;
	
	public Empresa() {}
	
	public Empresa(Integer id, String nombre, String rif, Integer pais, 
			Integer estado, Integer ciudad, String direccion, String sector, 
			String descripcion, char estatus) {
		super();
		this.id=id;
		this.nombre=nombre;
		this.rif=rif;
		this.pais=pais;
		this.estado=estado;
		this.ciudad=ciudad;
		this.direccion=direccion;
		this.sector=sector;
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

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
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
