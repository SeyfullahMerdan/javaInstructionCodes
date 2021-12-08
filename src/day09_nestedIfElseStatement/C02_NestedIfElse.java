package day09_nestedIfElseStatement;

import java.util.Scanner;

public class C02_NestedIfElse {

	public static void main(String[] args) {
		

		/*
		 * Kullan�c�dan 4 basamakli bir sayi girmesini isteyin. Girdi�i sayi 5�e
		 * b�l�n�yorsa son rakam�n� kontrol edin. Son rakam� 0 ise ekrana �5�e b�l�nen
		 * �ift say�� yazd�r�n. Son rakam� 0 de�il ise �5�e b�l�nen tek say�� yazd�r�n.
		 * Girdi�i password 5�e b�l�nm�yorsa ekrana �Tekrar deneyin� yazd�r�n.
		 */
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen dort basamakli bir sayi girin.");
		
		int sayi=scan.nextInt();
		
		if (sayi<1000 || sayi>9999) {      // iki alan� birle�tiriyorsak or ; tek bir alan� istiyorsak ve ......
			System.out.println("Lutfen 4 basamakl� pozitif bir sayi giriniz");
		} else {        // 4 basamakl� say�lar� yakalayacak

			if (sayi%5==0) {     // 5e tam b�l�nenler
				if (sayi%10==0) {          //Son rakam 0 anlam�na geliyor bu ifade
					System.out.println("bese tam b�l�nen cift sayi");
				} else {        // son rakam 5  ��nk� ba�ka bir ihtimal yok
                    System.out.println("bese tam b�l�nen tek say�");
				}
				
				
			} else { // 5e tam b�l�nemeyenler
                  System.out.println("Lutfen tekrar deneyiniz.");
			}
			
			
		}

		scan.close();

	}

}
