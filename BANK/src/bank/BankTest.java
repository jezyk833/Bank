package bank;

import java.util.Scanner;
import bank.Konto.Operacja;

public class BankTest {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Witamy, w naszym banku!!!");
		System.out.println();
		System.out.println("W czy możemy pomóc?");
		System.out.println();
		Konto konto = new Konto();
		for(int i=0; i<1000000000; i++) {
			System.out.println("Czy chcesz:");
		for (Konto.Operacja oper : Konto.Operacja.values()) {			
			System.out.printf("%2S %19S %n",  oper.getTitle(), oper.getOperacja());	
					};
		Operacja a =Operacja.valueOf(sc.next());
		konto.wybranaOperacja(a);
		if(a.equals(Operacja.WPLATA)) {
			Double kwota =sc.nextDouble();
			konto.wpłata(kwota);
			System.out.println("Dokonano wpłaty:"+ konto.getSaldo()+ " zł");
		} else if (a.equals(Operacja.WYPLATA)) {
			Double kwota = sc.nextDouble();
			konto.wyplata(kwota);
			System.out.println("Zostało na koncie:" + konto.getSaldo() +" zł");
		}else if(a.equals(Operacja.KONTO)) {
			int liczba=1;
			for (int j=1; j<=liczba; j++) {
			Konto NewKonto = new Konto();
			System.out.println("Podaj imiE");
			NewKonto.setName(sc.next());
			System.out.println("Podaj nazwisko");
			NewKonto.setSurname(sc.next());
			System.out.println("Podaj Date Urodzenia DD-MM-YYYY");
			NewKonto.setDateBirth(sc.next());
			System.out.println("Podaj ulicę");
			NewKonto.setStreet(sc.next());
			System.out.println("Numer domu/mieszkania");
			NewKonto.setNumber(sc.nextInt());
			System.out.println("Podaj kod pocztowy");
			NewKonto.setPostalCode(sc.next());
			System.out.println("Miasto");
			NewKonto.setCity(sc.next());
			System.out.println("Podaj płeć z wymienionych:");
			for (Osoba.Gender plec : Osoba.Gender.values()) {
				System.out.println(plec);
				
		    if (plec.equals(Osoba.Gender.MAN)){
		    System.out.println(Osoba.Gender.values());
		    } else  System.out.println(Osoba.Gender.values());
		    }
			}
			System.out.println("Podaj stan cywilny:");
			for (Osoba.MaritalStatus status : Osoba.MaritalStatus.values()) {
				System.out.println(status);
			}
			System.out.println("Podaj dokument tożsamości");
			for (Osoba.DocumentId dokument : Osoba.DocumentId.values()) {
				System.out.println(dokument);
			}
			
			}
			
		}

		}
}

