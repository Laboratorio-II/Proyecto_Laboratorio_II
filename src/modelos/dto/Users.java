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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;

	@Column(name="email")
	private String email;
	
	@Column(name="pass")
	private String pass;
	
	@Column(name="rol")
	private Integer rol;
	
	@Column(name="estatus")
	private char estatus;
	
	public Users() {
	}
	
	public Users(String email, String pass, Integer rol, char estatus) {
		super();
		this.email = email;
		this.pass = pass;
		this.rol = rol;
		this.estatus = estatus;
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
	
	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public Integer getRol() {
		return this.rol;
	}

	public void setRol(Integer rol) {
		this.rol = rol;
	}
	
	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

}
