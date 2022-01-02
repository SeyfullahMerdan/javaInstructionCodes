package day33_stringBuilder;

public class C01_StringBuilder {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		sb.length(); // Sbuilderin uzunlugunu verir. SYSO içinde yazdýrabiliriz.

		System.out.println(sb.length()); // Uzunlugunu verdi. Kullanýlan kýsmýnýn uzunlugu 0'dýr
		System.out.println(sb.capacity()); // 16 StringBuilderin kapasitesini verir. Ýlk aþamada 16'dýr, uzun degerlerde
											// artar.

		StringBuilder sb2 = new StringBuilder("Java Candýr");

		System.out.println(sb2.length()); // 11
		System.out.println(sb2.capacity()); // 27

		StringBuilder sb3 = new StringBuilder(7);
		sb3.append("Mehlika");

		System.out.println(sb3.length()); // 7
		System.out.println(sb3.capacity()); // 7

		StringBuilder sb4 = new StringBuilder(7);

		System.out.println(sb4.length()); // 0
		System.out.println(sb4.capacity()); // 7

		sb4.append("Nilgün");
		System.out.println(sb4.length()); // 6
		System.out.println(sb4.capacity()); // 7

		sb4.append(" candýr");
		System.out.println(sb4.length()); // 13
		System.out.println(sb4.capacity()); // 16

		sb.append("java");
		System.out.println(sb);
		sb.append(" candýr");
		System.out.println(sb);

		sb.append("anlaþýldý mý", 3, 7);   // 3. indexten itibaren 7. indexe kadar ekledi, 7 exclusive..
		System.out.println(sb);

		// Yazýlan bir StringB ekleme yapýlýnca mevcut kapasite kendini arttýrýr.
		// capacity*2 + 2 Olacak þekilde kapasitesini arttýrýr

	}

}
