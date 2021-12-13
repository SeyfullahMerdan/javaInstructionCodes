package day16_forLoops;

import java.util.Scanner;

public class C05_forLoop {

	public static void main(String[] args) {
		
		// Soru 4) Kullanicidan 100�den kucuk bir tamsayi isteyin. 1�den baslayarak
		// girilen sayiya kadar (say� dahil) 3�un kati olan sayilari yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen 100'den k���k bir tam say� giriniz.");
		double num = scan.nextDouble();

		int sayi = (int) num; // Narrowing yapt�k, virg�ll� girerse int. a �evirecek virg�l k�sm�n� atacak.

		// say� negatifse veya tam say� degilse uyar� verelim. *********�nce ��zelim
		// sonra bunu yapal�m.****************
		// en ba�ta yapmam laz�m

		/*
		 * for (int i = 1 ; i <= num ; i++) { if ( i%3==0 ) { System.out.print(i + " ");
		 * // Sorunun ��z�m�-basit olarak } }
		 */

		if (num < 0) {
			System.out.print("Pozitif bir tam say� girmelisiniz."); // Negatif olma durumunu bloke ettik
			// } else if(sayi!=num) {
			// System.out.print("L�tfen tam say� giriniz."); // Virg�ll� say� girerse uyar�
			// verir. Onu engelleriz.
		} else if (sayi > 100) {
			System.out.println("L�tfen 100'den k���k bir say� giriniz."); // 100'den b�y�k girebilrdi onu engelledik.
		} else {
			for (int i = 1; i <= num; i++) {
				if (i % 3 == 0) { // As�l kodumuz buras�. Kolay k�sm�...
					System.out.print(i + " ");
				}
			}
		}

		scan.close();
	}
}