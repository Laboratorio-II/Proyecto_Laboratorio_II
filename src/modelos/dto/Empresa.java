package modelos.dto;

public class Empresa {
	
	private Integer id;
	private String contrasena;
	private String nombre;
	private String rif;
	private String pais;
	private String estado;
	private String ciudad;
	private String direccion;
	private String sector;
	private String descripcion;
	private char estatus;
	
	public Empresa() {}
	
	public Empresa(Integer id, String nombre, String rif, String pais, String estado, String ciudad, String direccion, String sector, String descripcion, char estatus) {
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

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
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
