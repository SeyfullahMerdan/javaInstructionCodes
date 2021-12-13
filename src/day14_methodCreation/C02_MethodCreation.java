package day14_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {

		// Kullanicidan iki sayi isteyin
        // sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazin.
        // kullaniciya us sorun
        // 2 yazarsa kareleri toplamini yapan method, 3 yazarsa kupler toplamini yapan method calissin    // se�enek o halde switch case olabilir..
        
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen iki say� giriniz.\n�lk say�dan sonra enter'a bas�n.");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		
		// karet(sayi1, sayi2);    //parantez i�indekiler arg�mendir  -- a�ag�dakiler ise parametredir...
		// kupt(sayi1, sayi2);    // i�imizi g�rd�k. methodu �ag�rd�k bunlar� silebilirz. methodun �al��mas� i�in bunlara ihtiya� yok.
		
		/*	Bir method'u 4 adimda olu�turuyorduk
		 1-)methodu javaya olu�turtabilmek i�in method call yap�yoruz
		 2-)arguman ihtiyac� var m� belirleyelim
		 3-)javadan yard�m alarak methodu olu�tural�m
		 4-)axcess modifier ve rreturn typea karar veririz.
		    ***bundan sonra methodun yapacag� i�levi ger�ekle�tirmek i�in ger�ekle�tirecek kodlar� yazar�z.***
		 */
		
		
		
		System.out.println("Girilen say�lar�n kareler toplam�n� istiyorsan�z 2"
				+ "\nK�pler toplam�n� istiyorsan�z 3 yaz�n");
		
		int secim=scan.nextInt();        // girilen say�lar double bile olsa Switchde int. �evirecek...
		                                            // Switch de double yoktur
		
		switch (secim) {
		case 2:
			karet(sayi1, sayi2);               
			break;
		case 3:
			kupt(sayi1, sayi2);
			break;

		default:
			System.out.println("L�tfen istenen tercihlerden birisini yap�n�z.");
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

	public static void karet(double sayi3, double sayi4) {    // ad�n� degi�tirip degi�timememe bize kalm��.
		
		System.out.println("Girilen say�lar�n karelerinin toplam�= " + ((sayi3*sayi3) + (sayi4*sayi4)));
		
	}

}

