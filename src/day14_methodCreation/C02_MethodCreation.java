package day14_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {

		// Kullanicidan iki sayi isteyin
        // sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazin.
        // kullaniciya us sorun
        // 2 yazarsa kareleri toplamini yapan method, 3 yazarsa kupler toplamini yapan method calissin    // seçenek o halde switch case olabilir..
        
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen iki sayý giriniz.\nÝlk sayýdan sonra enter'a basýn.");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		
		// karet(sayi1, sayi2);    //parantez içindekiler argümendir  -- aþagýdakiler ise parametredir...
		// kupt(sayi1, sayi2);    // iþimizi gördük. methodu çagýrdýk bunlarý silebilirz. methodun çalýþmasý için bunlara ihtiyaç yok.
		
		/*	Bir method'u 4 adimda oluþturuyorduk
		 1-)methodu javaya oluþturtabilmek için method call yapýyoruz
		 2-)arguman ihtiyacý var mý belirleyelim
		 3-)javadan yardým alarak methodu oluþturalým
		 4-)axcess modifier ve rreturn typea karar veririz.
		    ***bundan sonra methodun yapacagý iþlevi gerçekleþtirmek için gerçekleþtirecek kodlarý yazarýz.***
		 */
		
		
		
		System.out.println("Girilen sayýlarýn kareler toplamýný istiyorsanýz 2"
				+ "\nKüpler toplamýný istiyorsanýz 3 yazýn");
		
		int secim=scan.nextInt();        // girilen sayýlar double bile olsa Switchde int. çevirecek...
		                                            // Switch de double yoktur
		
		switch (secim) {
		case 2:
			karet(sayi1, sayi2);               
			break;
		case 3:
			kupt(sayi1, sayi2);
			break;

		default:
			System.out.println("Lütfen istenen tercihlerden birisini yapýnýz.");
			break;
		}
	
		
		// bizim arguman isimlerimizle, parametre isimlerimiz ayni olmak zorunda degil
        // java isimlere degil degerlere bakar
        // bu bir zorunluluk degil imkandir, istedigimizi tercih edebiliriz
       scan.close(); 
	}

	public static void kupt(double sayi1, double sayi2) {
		
		
		double kuplert=(sayi1*sayi1*sayi1) + (sayi2*sayi2*sayi2);
		System.out.println(kuplert);
		
	}

	public static void karet(double sayi3, double sayi4) {    // adýný degiþtirip degiþtimememe bize kalmýþ.
		
		System.out.println("Girilen sayýlarýn karelerinin toplamý= " + ((sayi3*sayi3) + (sayi4*sayi4)));
		
	}

}

