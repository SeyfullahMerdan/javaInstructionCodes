package day16_forLoops;

import java.util.Scanner;

public class C05_forLoop {

	public static void main(String[] args) {
		
		// Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak
		// girilen sayiya kadar (sayý dahil) 3’un kati olan sayilari yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 100'den küçük bir tam sayý giriniz.");
		double num = scan.nextDouble();

		int sayi = (int) num; // Narrowing yaptýk, virgüllü girerse int. a çevirecek virgül kýsmýný atacak.

		// sayý negatifse veya tam sayý degilse uyarý verelim. *********Önce çözelim
		// sonra bunu yapalým.****************
		// en baþta yapmam lazým

		/*
		 * for (int i = 1 ; i <= num ; i++) { if ( i%3==0 ) { System.out.print(i + " ");
		 * // Sorunun çözümü-basit olarak } }
		 */

		if (num < 0) {
			System.out.print("Pozitif bir tam sayý girmelisiniz."); // Negatif olma durumunu bloke ettik
			// } else if(sayi!=num) {
			// System.out.print("Lütfen tam sayý giriniz."); // Virgüllü sayý girerse uyarý
			// verir. Onu engelleriz.
		} else if (sayi > 100) {
			System.out.println("Lütfen 100'den küçük bir sayý giriniz."); // 100'den büyük girebilrdi onu engelledik.
		} else {
			for (int i = 1; i <= num; i++) {
				if (i % 3 == 0) { // Asýl kodumuz burasý. Kolay kýsmý...
					System.out.print(i + " ");
				}
			}
		}

		scan.close();
	}
}