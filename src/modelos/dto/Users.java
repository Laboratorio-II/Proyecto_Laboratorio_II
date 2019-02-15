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
	@Column(name="id")
	private Integer id;

	@Column(name="email")
	private String email;
	
	@Column(name="ucontrasenna")
	private String ucontrasenna;
	
	public Users() {
	}
	
	public Users(Integer id, String email, String email) {
		super();
		this.id = id;
		this.email = email;
		this.email = email;
	}
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUcontrasenna() {
		return this.ucontrasenna;
	}

	public void setUcontrasenna(String ucontrasenna) {
		this.ucontrasenna = ucontrasenna;
	}

}
