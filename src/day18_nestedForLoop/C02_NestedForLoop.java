package day18_nestedForLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

	public static void main(String[] args) {

		// Kullanýcýdan 10'dan küçük pozitif bir tam sayý girmesini isteyin.
		// girdigi sayýya göre aþagýdaki þekli yazdýrýn.
		// örn: 3 girilirse
		/*
		 * 1 1 2 // Nested For temelde 2 þekilde kullanýlýr: Diktörtgen ve Üçgen
		 * þeklinde.....!!!! 1 2 3
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir tane pozitif tam sayi giriniz");
		int sayi = scan.nextInt(); // Sayý 5 olursa

		if (sayi < 10 && sayi > 0) { // Dýþ loop 1. çalýþacak J 1 yazacak. Dýþ 2. çalýþacak J i'ye kadar yani 2.ye
										// kadar gidcek...

			for (int i = 1; i <= sayi; i++) { // 1.de J 1 yazýyor /2.ye döndgnde J hem 1 hem 2 yazýyor/3.ye döndgnde J
												// hem 1 hem 2 hem 3 yazýyor...

				for (int j = 1; j <= i; j++) { // Kullanýcnýn girdigi sayýya kadar degil, satýr sayýsý kadar gitsin
												// istiyorum..!!!!

					System.out.print(j + " ");
				}
				System.out.println();
			}

		} else if (sayi >= 10) {
			System.out.println("Lütfen 10'dan küçük bir pozitif tam sayý giriniz.");

		} else {
			System.out.println(
					"Lütfen pozitif bir tam sayý giriniz.\nGirdiginiz sayý 10'dan küçük pozitif sayý olmalýdýr.");
		}

		scan.close();

	}

}
