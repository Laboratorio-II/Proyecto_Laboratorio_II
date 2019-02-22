package modelos.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Dedicacion")
@Table(name="dedicaciones")
public class Dedicacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="horastrabajadas")
	private Integer horasTrabajadas;
	
	@Column(name="estatus")
	private char estatus;
	
	public Dedicacion() {}

	public Dedicacion(String descripcion, Integer horasTrabajadas, char estatus) {
		super();
		this.descripcion = descripcion;
		this.horasTrabajadas = horasTrabajadas;
		this.estatus = estatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(Integer horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public char getEstatus() {
		return estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
