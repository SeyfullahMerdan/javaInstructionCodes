package day32_varargs_stringBuilder;

public class C04_Varargs {

	public static void main(String[] args) {

		KafanaGoreIslem(5, 10, 13, 0);

		// Varargs'da hi� eleman olmasa da java itiraz etmez. �nce int olarak tan�mlanan
		// say�lar� e�le�tirir.
		// Ard�ndan kalan t�m say�lar� varargsa doldurur.

	}

	// 5 10 13 0
	private static void KafanaGoreIslem(int sayi1, int sayi2, int sayi3, int sayi4, int... sayilar) {

		// sayi2 yi VEYA varargs� kullanmasak hi� kullanmayacak, i�leme dahil etmeyecek.
		int toplam = 0;

		for (int each : sayilar) {
			toplam += each;
		}
		System.out.println("�lk say� ile digerlerinin toplam�n�n �arp�m� : " + sayi1 * toplam);
	}

}
