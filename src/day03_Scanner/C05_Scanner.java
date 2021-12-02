package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		
		// Kullanýcýdan isim ve soyisimi ayrý ayrý isteyip girilen isimleri asagýdaki gibi yazdýrýnýz
		//  girilen isim: Seyfullah Merdan
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz.");
		
		String isim=scan.next();
		
		System.out.println("Lutfen soyisminizi yaziniz.");
		
		String soyisim=scan.next();
		
		System.out.println("Girilen isim: "+isim+ " " + soyisim);  // Týrnak iþareti arasýnda boþluk yapmazsak ''+'' dan sonra gelen kýsmý birleþtirir.
		
		scan.close();

	}

}
