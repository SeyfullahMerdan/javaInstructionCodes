package day10_ternarySwitchCase;

import java.util.Locale;

public class C13_ToUpperCaseLowerCase {

	public static void main(String[] args) {
	
		// Verilen Stringin tamam�n� b�y�k veya k���k harfe �evirir.
		
		
				String isim="ali";   // Bunu Ali olarak yazd�ral�m
				
				System.out.println( " "+isim.toUpperCase().charAt(0) + isim.toLowerCase().charAt(1) + isim.toLowerCase().charAt(2));
				
				// bu �ekilde hata verir. Charlar� Matematiksel bir i�leme tabi tutar. ASCII de�erleri devreye girer.
				//Bu y�zden ba��na ---hi�lik-- '' koyaca��z...
				
				
				// T�rk�e lokal harfler kullanarak tamamini k���k harfe �evirelim.
				
				
				System.out.println(isim.toLowerCase(Locale.GERMANY));
				System.out.println(isim.toUpperCase(Locale.GERMAN));


	}

}
