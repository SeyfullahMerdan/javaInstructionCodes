package day31_dateAndTime;

import java.time.LocalTime;

public class C04_DateTime {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Bir String ve bir int. variable olu�turula�m.
		// Bir Loop i�erisinde bu variablelar� 1000 kere degi�tirelim.
		// i�lem s�relerini k�yaslayalim.

		LocalTime saat = LocalTime.now();

		System.out.println("baslangic saati " + saat); //

		int sayi = 10;

		for (int i = 0; i < 10000; i++) {
			sayi++;
		}

		LocalTime saatBitis = LocalTime.now();
		System.out.println("bitis saati " + saatBitis);
		double nano1 = saat.getNano();
		double nanobitis = saatBitis.getNano();

		System.out.println("int For loop " + (nanobitis - nano1) + " nano saniyede tamamlandi");

		LocalTime saatS = LocalTime.now();

		System.out.println("baslangic saati " + saatS); //

		String str = "celil";

		for (int i = 0; i < 10000; i++) {
			str += " ";
		}

		LocalTime saatBitisS = LocalTime.now();
		System.out.println("bitis saati " + saatBitisS);
		double nanoS = saatS.getNano();
		double nanobitisS = saatBitisS.getNano();

		System.out.println("String For loop " + (nanobitisS - nanoS) + " nano saniyede tamamlandi");

		double stringSure = nanobitisS - nanoS; // 7.28346E7 72.834.600 nono saniye
		double intSure = nanobitis - nano1; // 7.999.700 nono saniye

		System.out.println("int String'den " + (stringSure - intSure) + " nano saniye daha hizli bitirdi");

	}
}
