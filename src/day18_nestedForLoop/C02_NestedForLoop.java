package day18_nestedForLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

	public static void main(String[] args) {

		// Kullan�c�dan 10'dan k���k pozitif bir tam say� girmesini isteyin.
		// girdigi say�ya g�re a�ag�daki �ekli yazd�r�n.
		// �rn: 3 girilirse
		/*
		 * 1 1 2 // Nested For temelde 2 �ekilde kullan�l�r: Dikt�rtgen ve ��gen
		 * �eklinde.....!!!! 1 2 3
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir tane pozitif tam sayi giriniz");
		int sayi = scan.nextInt(); // Say� 5 olursa

		if (sayi < 10 && sayi > 0) { // D�� loop 1. �al��acak J 1 yazacak. D�� 2. �al��acak J i'ye kadar yani 2.ye
										// kadar gidcek...

			for (int i = 1; i <= sayi; i++) { // 1.de J 1 yaz�yor /2.ye d�ndgnde J hem 1 hem 2 yaz�yor/3.ye d�ndgnde J
												// hem 1 hem 2 hem 3 yaz�yor...

				for (int j = 1; j <= i; j++) { // Kullan�cn�n girdigi say�ya kadar degil, sat�r say�s� kadar gitsin
												// istiyorum..!!!!

					System.out.print(j + " ");
				}
				System.out.println();
			}

		} else if (sayi >= 10) {
			System.out.println("L�tfen 10'dan k���k bir pozitif tam say� giriniz.");

		} else {
			System.out.println(
					"L�tfen pozitif bir tam say� giriniz.\nGirdiginiz say� 10'dan k���k pozitif say� olmal�d�r.");
		}

		scan.close();

	}

}
