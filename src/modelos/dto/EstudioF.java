package modelos.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="EstudioF")
@Table(name="estudios_formales")
public class EstudioF {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="usuario")
	private Integer usuario;
	
	@Column(name="centro")
	private String centro;
	
	@Column(name="nivel")
	private Integer nivel;
	
	@Column(name="estado")
	private char estado;
	
	@Column(name="periodo")
	private String periodo;
	
	public EstudioF() {}
	
	public EstudioF(Integer usuario, String centro, 
			Integer nivel, char estado, String periodo) {
		super();
		this.usuario=usuario;
		this.centro=centro;
		this.nivel=nivel;
		this.estado=estado;
		this.periodo=periodo;
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

	public String getCentro() {
		return centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	
}
