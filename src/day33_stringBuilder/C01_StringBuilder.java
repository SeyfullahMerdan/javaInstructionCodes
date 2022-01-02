package day33_stringBuilder;

public class C01_StringBuilder {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		sb.length(); // Sbuilderin uzunlugunu verir. SYSO i�inde yazd�rabiliriz.

		System.out.println(sb.length()); // Uzunlugunu verdi. Kullan�lan k�sm�n�n uzunlugu 0'd�r
		System.out.println(sb.capacity()); // 16 StringBuilderin kapasitesini verir. �lk a�amada 16'd�r, uzun degerlerde
											// artar.

		StringBuilder sb2 = new StringBuilder("Java Cand�r");

		System.out.println(sb2.length()); // 11
		System.out.println(sb2.capacity()); // 27

		StringBuilder sb3 = new StringBuilder(7);
		sb3.append("Mehlika");

		System.out.println(sb3.length()); // 7
		System.out.println(sb3.capacity()); // 7

		StringBuilder sb4 = new StringBuilder(7);

		System.out.println(sb4.length()); // 0
		System.out.println(sb4.capacity()); // 7

		sb4.append("Nilg�n");
		System.out.println(sb4.length()); // 6
		System.out.println(sb4.capacity()); // 7

		sb4.append(" cand�r");
		System.out.println(sb4.length()); // 13
		System.out.println(sb4.capacity()); // 16

		sb.append("java");
		System.out.println(sb);
		sb.append(" cand�r");
		System.out.println(sb);

		sb.append("anla��ld� m�", 3, 7);   // 3. indexten itibaren 7. indexe kadar ekledi, 7 exclusive..
		System.out.println(sb);

		// Yaz�lan bir StringB ekleme yap�l�nca mevcut kapasite kendini artt�r�r.
		// capacity*2 + 2 Olacak �ekilde kapasitesini artt�r�r

	}

}
