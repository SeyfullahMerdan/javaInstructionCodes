package day17_forLoops;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		
		// Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum
		// tamsayilari toplayip, sonucu yazdiran bir program yaziniz

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen aradaki tam say�lar� toplamak i�in iki sayi giriniz...");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();

		int kucuk = 0;  // Kullan�c�n�n girecegi say�lardan hangisinin k���k oldugunu bilmedigim i�in 
		int buyuk = 0;  // if ile say�lar� k���k b�y�k diye belirledim.

		if (sayi1 > sayi2) {
			buyuk = sayi1;               // sayi1 b�y�kse sayi1 b�y�k olacak ; degilse tam tersi..
			kucuk = sayi2;

		} else {
			buyuk = sayi2;
			kucuk = sayi1;
		}

		int toplam = 0;

		for (int i = kucuk; i <= buyuk; i++) {    // k���kten ba�layarak b�y�ge dogru gidecek
			toplam += i;                             // g�rd�g� her say�y� toplam variable�n i�ine atacak
		}

		System.out.println("Girilen sayilar ve ararlar�ndaki say�lar�n toplam� : " + toplam);

		scan.close();
	}

}
