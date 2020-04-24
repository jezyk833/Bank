package bank;

public class Osoba {
	
	private String name;
	private String surname;
	private String dateBirth;
	private String street;
	private int number;
	private String postalCode;
	private String city;
	public enum Gender {
		WOMEN,//("WOMEN"), 
		MAN;//("MEN");		
	}
	public enum MaritalStatus {
		MARRIED,//("MARRIED"),
		DIVORCED,//("DIVORCED"),
		SINGLE;//("SINGLE");
	}
	public enum DocumentId {
		IDCARD,//("IDCARD"),
		PASSPORT;//("PASSPORT");
		}
	public Osoba() {
		
	};
		
	public Osoba(String name, String surname, String dateBirth, String street, int number, String postalCode,
			String city,Gender gender, MaritalStatus maritalStatus, DocumentId documentId ) {
		this.name = name;
		this.surname = surname;
		this.dateBirth = dateBirth;
		this.street = street;
		this.number = number;
		this.postalCode = postalCode;
		this.city = city;
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDateBirth() {
		return dateBirth;
	}
	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	
	
}
