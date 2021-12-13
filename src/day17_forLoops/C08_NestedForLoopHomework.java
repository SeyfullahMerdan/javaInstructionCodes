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

		for (int i = 0; i <= sayi; i++) { // i=satýrý belirliyor/1. çalýþmasýnda içerideki loop tüm bir tur dönüyor
											// bu yüzden içeridekinin bitiþ þartýný dýþ loopun çalýþma sýrasýna
											// eþitledim.
											// sayi dersem girilen sayýya kadar ne kadarsa hepsini yazdýrýr.
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println("*");

		}

		scan.close();
	}

}
