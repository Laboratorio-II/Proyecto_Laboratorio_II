package modelos.dto;

import java.io.Serializable;

import javax.persistence.*;

@Entity(name="Users")
@Table(name="usuarios")
//@NamedQuery(name="Users.findAll"), query="SELECT u FROM usuarios u")
public class Users implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ucod")
	private Integer ucod;

	@Column(name="ucorreo")
	private String ucorreo;
	
	@Column(name="ucontrasenna")
	private String ucontrasenna;
	
	public Users() {
	}
	
	public Users(Integer ucod, String ucorreo, String ucontrasenna) {
		super();
		this.ucod = ucod;
		this.ucorreo = ucorreo;
		this.ucontrasenna = ucontrasenna;
	}
	
	public Integer getUcod() {
		return this.ucod;
	}

	public void setUcod(Integer ucod) {
		this.ucod = ucod;
	}
	
	public String getUcorreo() {
		return this.ucorreo;
	}

	public void setUcorreo(String ucorreo) {
		this.ucorreo = ucorreo;
	}
	
	public String getUcontrasenna() {
		return this.ucontrasenna;
	}

	public void setUcontrasenna(String ucontrasenna) {
		this.ucontrasenna = ucontrasenna;
	}

}
