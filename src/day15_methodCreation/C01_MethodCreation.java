package day15_methodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		
		// kullanicidan ismini ve soyismini isteyin
		// iki farkli method olusturun methodlardan biri girilen kelimeleri
		// ilk harf buyuk, digerleri kucuk olacak sekilde birlestirsin
		// Ikinci method Isim ve soyismin ilk harfleri buyuk harf,
		// kalan harfler * olacak sekilde birlestirsin

		// kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihi sorun
		// ve programin kalan ksminda isim ve soyismi kullanicinin istedigi sekilde
		// kullanin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen isminizi ve soyisiminizi giriniz.\nisimden sonra Enter'a basýnýz.");
		String isim = scan.nextLine();
		String soyisim = scan.nextLine();

		// burada method call yaptýk. sonra argümanlarý sildik çünkü ihtiyacýmýz yok.
		// methodlarý duruma göre ataycagýz bir variablea

		System.out.println("Isminizin acik sekilde yazilmasini istiyorsani 1 "
				+ "\nIlk harf haric gizli yazilmasini istiyorsaniz 2'e basin");

		int tercih = scan.nextInt();

		String birlesmisIsim = null; // Seyfullah Merdan , S******** M***** gibi olacak. Tercihini alýp burada
										// verecegiz.

		if (tercih == 1) {
			birlesmisIsim = acikIsim(isim, soyisim);
		} else if (tercih == 2) {
			birlesmisIsim = gizliIsim(isim, soyisim);
		} else {
			System.out.println("Lütfen geçerli bir giriþ yapýnýz. Geçersiz giriþ.");
		}

		// Bu satirdan itibaren kullanicinin isim ve soyismi kullanici tercihine bagli
		// olarak
		// kaydedildi

		System.out.println("Kullanýcýnýn tercihi: " + birlesmisIsim);

		scan.close();

	}

	public static String gizliIsim(String isim, String soyisim) {

		isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");

		return isim + " " + soyisim;

	}

	public static String acikIsim(String isim, String soyisim) {

		isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
		soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();

		return isim + " " + soyisim;

	}

}
