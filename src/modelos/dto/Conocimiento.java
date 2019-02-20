package modelos.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Conocimiento")
@Table(name="conocimientos")
public class Conocimiento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="usuario")
	private Integer usuario;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="estatus")
	private char estatus;
	
	public Conocimiento() {}
	
	public Conocimiento(Integer usuario, String nombre, char estatus) {
		super();
		this.usuario=usuario;
		this.nombre=nombre;
		this.estatus=estatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getEstatus() {
		return estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}
	
}
