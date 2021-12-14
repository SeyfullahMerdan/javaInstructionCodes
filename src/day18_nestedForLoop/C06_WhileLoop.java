package day18_nestedForLoop;

import java.util.Scanner;

public class C06_WhileLoop {

	public static void main(String[] args) {
	
		// Kullan�c�dan toplanmak �zere say�lar isteyin...........
		// Say� adedi 10'u ge�erse veya toplam 500'� ge�erse..................
		// Bu kadar say� yeter
		// .... adet say� girdin, toplam� yazd�r�n.

		Scanner scan = new Scanner(System.in);

		int sayi = 0;
		int toplam = 0;
		int aded = 0;

		while (aded <= 10 && toplam <= 500) {

			System.out.println("L�tfen toplamak istediginiz say�lar� giriniz. \nArd�ndan Enter tu�una bas�n�z : ");
			sayi = scan.nextInt();

			toplam += sayi;
			aded++;

		}

		System.out.println("Bu kadar say� yeter! " + aded + "say� girdin. Girdigin say�lar�n toplam� : " + toplam);

		scan.close();
	}

}
