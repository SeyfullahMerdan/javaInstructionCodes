package day17_forLoops;

import java.util.Scanner;

public class C08_NestedForLoopHomework {

	public static void main(String[] args) {
	
		
		// 12 )Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
		// asagidaki sekli cizdirin
		// *
		// * *
		// * * *
		// * * * *

		Scanner scan = new Scanner(System.in);
		System.out.println("Pozitif sayi giriniz");
		int sayi = scan.nextInt();

		for (int i = 0; i <= sayi; i++) { // i=sat�r� belirliyor/1. �al��mas�nda i�erideki loop t�m bir tur d�n�yor
											// bu y�zden i�eridekinin biti� �art�n� d�� loopun �al��ma s�ras�na
											// e�itledim.
											// sayi dersem girilen say�ya kadar ne kadarsa hepsini yazd�r�r.
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println("*");

		}

		scan.close();
	}

}
