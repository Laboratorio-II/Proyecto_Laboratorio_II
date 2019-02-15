package modelos.dto;

public class CV {
	
	private Integer id;
	private Integer usuario;
	private String titulo;
	private String descripcion;
	private char estadoCivil;
	private String telefono;
	private String pais;
	private String estado;
	private String ciudad;
	private char estatus;
	
	public CV() {}
	
	public CV(Integer id, Integer usuario, String titulo, String descripcion, char estadoCivil, String telefono, String pais, String estado, String ciudad, char estatus) {
		super();
		this.id=id;
		this.usuario=usuario;
		this.titulo=titulo;
		this.descripcion=descripcion;
		this.estadoCivil=estadoCivil;
		this.telefono=telefono;
		this.pais=pais;
		this.estado=estado;
		this.ciudad=ciudad;
		this.estatus=estatus;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
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

	public char getEstatus() {
		return estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
