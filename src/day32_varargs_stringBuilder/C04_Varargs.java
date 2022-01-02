package day32_varargs_stringBuilder;

public class C04_Varargs {

	public static void main(String[] args) {

		KafanaGoreIslem(5, 10, 13, 0);

		// Varargs'da hiç eleman olmasa da java itiraz etmez. Önce int olarak tanýmlanan
		// sayýlarý eþleþtirir.
		// Ardýndan kalan tüm sayýlarý varargsa doldurur.

	}

	// 5 10 13 0
	private static void KafanaGoreIslem(int sayi1, int sayi2, int sayi3, int sayi4, int... sayilar) {

		// sayi2 yi VEYA varargsý kullanmasak hiç kullanmayacak, iþleme dahil etmeyecek.
		int toplam = 0;

		for (int each : sayilar) {
			toplam += each;
		}
		System.out.println("Ýlk sayý ile digerlerinin toplamýnýn çarpýmý : " + sayi1 * toplam);
	}

}
