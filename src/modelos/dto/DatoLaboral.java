package modelos.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="DatoLaboral")
@Table(name="datos_laborales")
public class DatoLaboral {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="usuario")
	private Integer usuario;
	
	@Column(name="empresa")
	private String empresa;
	
	@Column(name="cargo")
	private String cargo;
	
	@Column(name="area")
	private Integer area;
	
	@Column(name="estado")
	private char estado;
	
	@Column(name="periodo")
	private String periodo;
	
	public DatoLaboral() {}
	
	public DatoLaboral(Integer id, Integer usuario, String empresa, String cargo, 
			Integer area, char estado, String periodo) {
		super();
		this.id=id;
		this.usuario=usuario;
		this.empresa=empresa;
		this.cargo=cargo;
		this.area=area;
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

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
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
