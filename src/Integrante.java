
public class Integrante {
	
	private String firstname;
	private String lastname;
	
	public Integrante() {
	}
	
	public Integrante(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	//Getter and Setter methods
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
