package day15_methodCreation;

public class C03_MethodOverloading {

	public static void main(String[] args) {

		// Java'da birden fazla ayn� isimle method olu�turabilir miyiz?
		// Evet olu�turulabilir.
		
		// Ayn� isimde birden fazla method olursa Java hangisini �al��t�racag�na nas�l
		// karar verecek?
        //  �smi ayn� olan methodlarda �ncelikle parmetre say�s�na bakar 
        //sonra da parametre say�s� ile arg�man say�s� e�it olanlardan arg�man data t�rleri ile parametre data t�rleri aras�nda uyuma bakar.
		// tamamen uyu�an varsa onu kullan�r.
		// tamamen uyu�an yoksa kapsayan var m� bakar ve onu kullan�r
		// birden fazla se�enek oldugunda Java her zaman en optimum olan� tercih eder.

		topla(2, 4);
		topla(3, 5, 7);
		topla(3, 5, 7, 7); // Hangisini yazarsak hangi metoda uyuyorsa o method geliyor.
		topla(3, 2.5); // En yak�n olan�n� da al�yor.
		topla(5.5, 6.3);
		topla(3.5, 7);

	}

	private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
		System.out.println("dort sayinin toplami : " + (sayi1 + sayi2 + sayi3 + sayi4));

	}

	private static void topla(int sayi1, int sayi2, int sayi3) {
		System.out.println("uc sayinin toplami : " + (sayi1 + sayi2 + sayi3));

	}

	private static void topla(int sayi1, double sayi2) {
		System.out.println("iki sayinin toplami id: " + (sayi1 + sayi2));

	}

	private static void topla(int sayi1, int sayi2) {
		System.out.println("iki sayinin toplami ii: " + (sayi1 + sayi2));

	}

	private static void topla(double sayi1, int sayi2) {
		System.out.println("iki sayinin toplami di: " + (sayi1 + sayi2));

	}

	private static void topla(double sayi1, double sayi2) {
		System.out.println("iki sayinin toplami dd: " + (sayi1 + sayi2));

	}

}