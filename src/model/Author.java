package model;

public class Author {

	Address address;
	private String firstName;
	private String lastName;
	private String tel;
	private String credential;
	private String shortBio;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCredential() {
		return credential;
	}
	public void setCredential(String credential) {
		this.credential = credential;
	}
	public String getShortBio() {
		return shortBio;
	}
	public void setShortBio(String shortBio) {
		this.shortBio = shortBio;
	}
	public Author( String firstName, String lastName, String tel,Address address, String shortBio) {
		this.address = address;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tel = tel;
		this.shortBio = shortBio;
	}
	

}