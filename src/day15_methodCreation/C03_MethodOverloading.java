package day15_methodCreation;

public class C03_MethodOverloading {

	public static void main(String[] args) {

		// Java'da birden fazla ayný isimle method oluþturabilir miyiz?
		// Evet oluþturulabilir.
		
		// Ayný isimde birden fazla method olursa Java hangisini çalýþtýracagýna nasýl
		// karar verecek?
        //  Ýsmi ayný olan methodlarda öncelikle parmetre sayýsýna bakar 
        //sonra da parametre sayýsý ile argüman sayýsý eþit olanlardan argüman data türleri ile parametre data türleri arasýnda uyuma bakar.
		// tamamen uyuþan varsa onu kullanýr.
		// tamamen uyuþan yoksa kapsayan var mý bakar ve onu kullanýr
		// birden fazla seçenek oldugunda Java her zaman en optimum olaný tercih eder.

		topla(2, 4);
		topla(3, 5, 7);
		topla(3, 5, 7, 7); // Hangisini yazarsak hangi metoda uyuyorsa o method geliyor.
		topla(3, 2.5); // En yakýn olanýný da alýyor.
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