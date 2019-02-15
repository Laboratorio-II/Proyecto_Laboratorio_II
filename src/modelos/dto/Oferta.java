package modelos.dto;

public class Oferta {
	
	private Integer id;
	private String ciudad;
	private String rangoSalario;
	private String cargo;
	private String dedicacion;
	private Carrera_Oferta carreras[];
	
	public Oferta() {}

	public Oferta(Integer id, String ciudad, String rangoSalario, String cargo, String dedicacion,
			Carrera_Oferta[] carreras) {
		super();
		this.id = id;
		this.ciudad = ciudad;
		this.rangoSalario = rangoSalario;
		this.cargo = cargo;
		this.dedicacion = dedicacion;
		this.carreras = carreras;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getRangoSalario() {
		return rangoSalario;
	}

	public void setRangoSalario(String rangoSalario) {
		this.rangoSalario = rangoSalario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDedicacion() {
		return dedicacion;
	}

	public void setDedicacion(String dedicacion) {
		this.dedicacion = dedicacion;
	}

	public Carrera_Oferta[] getCarreras() {
		return carreras;
	}

	public void setCarreras(Carrera_Oferta[] carreras) {
		this.carreras = carreras;
	}

}
