package day09_nestedIfElseStatement;

import java.util.Scanner;

public class C02_NestedIfElse {

	public static void main(String[] args) {
		

		/*
		 * Kullanýcýdan 4 basamakli bir sayi girmesini isteyin. Girdiði sayi 5’e
		 * bölünüyorsa son rakamýný kontrol edin. Son rakamý 0 ise ekrana “5’e bölünen
		 * çift sayý” yazdýrýn. Son rakamý 0 deðil ise “5’e bölünen tek sayý” yazdýrýn.
		 * Girdiði password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdýrýn.
		 */
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen dort basamakli bir sayi girin.");
		
		int sayi=scan.nextInt();
		
		if (sayi<1000 || sayi>9999) {      // iki alaný birleþtiriyorsak or ; tek bir alaný istiyorsak ve ......
			System.out.println("Lutfen 4 basamaklý pozitif bir sayi giriniz");
		} else {        // 4 basamaklý sayýlarý yakalayacak

			if (sayi%5==0) {     // 5e tam bölünenler
				if (sayi%10==0) {          //Son rakam 0 anlamýna geliyor bu ifade
					System.out.println("bese tam bölünen cift sayi");
				} else {        // son rakam 5  çünkü baþka bir ihtimal yok
                    System.out.println("bese tam bölünen tek sayý");
				}
				
				
			} else { // 5e tam bölünemeyenler
                  System.out.println("Lutfen tekrar deneyiniz.");
			}
			
			
		}

		scan.close();

	}

}
