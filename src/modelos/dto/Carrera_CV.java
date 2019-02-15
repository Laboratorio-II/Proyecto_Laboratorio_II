package modelos.dto;

public class Carrera_CV {
	
	private String idCarrera;
	private String idCV;
	private Integer annoInicio;
	private Integer annoFinalizacion;
	private String Universidad;
	
	public Carrera_CV() {}

	public Carrera_CV(String idCarrera, String idCV, Integer annoInicio, Integer annoFinalizacion, String universidad) {
		super();
		this.idCarrera = idCarrera;
		this.idCV = idCV;
		this.annoInicio = annoInicio;
		this.annoFinalizacion = annoFinalizacion;
		Universidad = universidad;
	}

	public String getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(String idCarrera) {
		this.idCarrera = idCarrera;
	}

	public String getIdCV() {
		return idCV;
	}

	public void setIdCV(String idCV) {
		this.idCV = idCV;
	}

	public Integer getAnnoInicio() {
		return annoInicio;
	}

	public void setAnnoInicio(Integer annoInicio) {
		this.annoInicio = annoInicio;
	}

	public Integer getAnnoFinalizacion() {
		return annoFinalizacion;
	}

	public void setAnnoFinalizacion(Integer annoFinalizacion) {
		this.annoFinalizacion = annoFinalizacion;
	}

	public String getUniversidad() {
		return Universidad;
	}

	public void setUniversidad(String universidad) {
		Universidad = universidad;
	}

}
