package bank;



public class Konto extends Osoba {
	private double saldo;
	public enum Operacja{ 
		WPLATA("Wpłacić Pieniądze ", "-Wpisz WPLATA"), 
		WYPLATA("Wypłacić Pieniądze", "      -Wpisz WYPLATA"), 
		SALDO("Saldo Konta", "	 -Wpisz SALDO"),
		KONTO("Założenie Konta  ", "    -Wpisz KONTO"),
		KUPIC("Kupić Walutę", "	 -Wpisz KUPIC"), 
		SPRZEDAC("Sprzedać Walutę","  	 -Wpisz SPRZEDAC"), 
		KREDYT("Wziąć Kredyt", "	 -Wpisz KREDYT"), 
		KONIEC("Koniec", "		 -Wpisz KONIEC");
		
		
	private final String title;
	private final String operacja;
	
	Operacja(String title, String operacja){
		this.title = title;
		this.operacja = operacja;

	}
	
public String getTitle() {
		return title;
	}

	public String getOperacja() {
		return operacja;
	}

}
	
	public Konto() {
		
	};		
	public Konto(String name, String surname, String dateBirth, String street, int number, String postalCode, String city,
			Gender gender, MaritalStatus maritalStatus, DocumentId documentId, double saldo) {
		super(name, surname, dateBirth, street, number, postalCode, city, gender, maritalStatus, documentId);
		this.saldo = saldo;
	}


	public void wybranaOperacja(Operacja a) {
		switch(a) {
		case WPLATA:
				System.out.println("Ile chcesz wpłacic?" );							
				break;
		case SALDO:
				System.out.println("Na koncie: "+getSaldo()+" zł");
				break;
		case WYPLATA:
			    System.out.println("Ile checsz wypłacić");
			    break;
		case KONTO:
				System.out.println("Wpisz swoje dane:");
		default:
			break;
				
	}
	}
	
	
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public void wpłata(double ile) {
	 ile+=saldo;
	  System.out.println("Transakcja przebiegła pomyślnie, wpłaciłeś:" + ile +"zł");
	  setSaldo(ile);
	}	
 
	public void wyplata(double ile) {
	 if(ile >saldo) {
	System.out.println("Brak środków na koncie");
	System.out.println("Spróbuj ponownie");	 
	 }
	 else if(ile <saldo){
		 System.out.println("Transakcja przebiegła pomyślnie" );
	 saldo-=ile;	
	 
	 }
 }
}
 
