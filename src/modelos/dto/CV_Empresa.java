package modelos.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="CV_Empresa")
@Table(name="cv_empresas")
public class CV_Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="usuarioP")
	private Integer usuario;
	
	@Column(name="usuarioE")
	private Integer empresa;
	
	@Column(name="nombreUsuario")
	private String nombreUsuario;
	
	@Column(name="nombreEmpresa")
	private String nombreEmpresa;
	
	@Column(name="fecha_agregado")
	private Date fechaAgregado;
	
	@Column(name="estatus")
	private char estatus;
	
	public CV_Empresa() {}
	
	public CV_Empresa(Integer usuario, Integer empresa,
			String nombreUsuario, String nombreEmpresa, 
			Date fechaAgregado, char estatus) {
		super();
		this.usuario=usuario;
		this.empresa=empresa;
		this.nombreUsuario=nombreUsuario;
		this.nombreEmpresa=nombreEmpresa;
		this.fechaAgregado=fechaAgregado;
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

	public Integer getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Integer empresa) {
		this.empresa = empresa;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public Date getFechaAgregado() {
		return fechaAgregado;
	}

	public void setFechaAgregado(Date fechaAgregado) {
		this.fechaAgregado = fechaAgregado;
	}

	public char getEstatus() {
		return estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}
	
}
