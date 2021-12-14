package day18_nestedForLoop;

import java.util.Scanner;

public class C06_WhileLoop {

	public static void main(String[] args) {
	
		// Kullanýcýdan toplanmak üzere sayýlar isteyin...........
		// Sayý adedi 10'u geçerse veya toplam 500'ü geçerse..................
		// Bu kadar sayý yeter
		// .... adet sayý girdin, toplamý yazdýrýn.

		Scanner scan = new Scanner(System.in);

		int sayi = 0;
		int toplam = 0;
		int aded = 0;

		while (aded <= 10 && toplam <= 500) {

			System.out.println("Lütfen toplamak istediginiz sayýlarý giriniz. \nArdýndan Enter tuþuna basýnýz : ");
			sayi = scan.nextInt();

			toplam += sayi;
			aded++;

		}

		System.out.println("Bu kadar sayý yeter! " + aded + "sayý girdin. Girdigin sayýlarýn toplamý : " + toplam);

		scan.close();
	}

}
