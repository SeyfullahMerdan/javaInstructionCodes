package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		
		// Kullan�c�dan isim ve soyisimi ayr� ayr� isteyip girilen isimleri asag�daki gibi yazd�r�n�z
		//  girilen isim: Seyfullah Merdan
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz.");
		
		String isim=scan.next();
		
		System.out.println("Lutfen soyisminizi yaziniz.");
		
		String soyisim=scan.next();
		
		System.out.println("Girilen isim: "+isim+ " " + soyisim);  // T�rnak i�areti aras�nda bo�luk yapmazsak ''+'' dan sonra gelen k�sm� birle�tirir.
		
		scan.close();

	}

}
