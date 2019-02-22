package modelos.dto;
import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder.In;


@Entity(name="CrearOferta")
@Table(name="crear_oferta")
//@NamedQuery(name="Users.findAll"), query="SELECT u FROM usuarios u")

public class Oferta implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;

	@Column(name="idempresa")
	private Integer idempresa;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="estado")
	private Integer estado;
	
	@Column(name="area")
	private Integer area;
	
	@Column(name="dedicacion")
	private Integer dedicacion;
	
	@Column(name="salario")
	private float salario;
	
	


	public Oferta() {}

	public Oferta(Integer idempresa,String descripcion, Integer estado, Integer area, Integer dedicacion, float salario) {
		super();
	
		this.idempresa=idempresa;
		this.descripcion=descripcion;
		this.estado = estado;
		this.area= area;
		this.dedicacion= dedicacion;
		this.salario = salario;
	}



	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}


	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	public Integer getIdempresa() {
		return idempresa;
	}

	public void setIdempresa(Integer idempresa) {
		this.idempresa = idempresa;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getDedicacion() {
		return dedicacion;
	}

	public void setDedicacion(Integer dedicacion) {
		this.dedicacion = dedicacion;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}




