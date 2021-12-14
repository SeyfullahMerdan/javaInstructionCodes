package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {

	public static void main(String[] args) {
	
		// Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini
		// yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen pozitif bir sayi giriniz : ");

		int sayi = scan.nextInt(); // 345 ise �nt data t�r�

		int rakamlarToplami = 0;
		int rakam = 0;

		/*
		 * while (sayi>0) { say� 0'dan b�y�k olsun yeter, while true oalcak ve alt taraf
		 * �al��acak. rakam=sayi%10; say�n�n sonsuza gitme ihtimali yok ��nk� kullan�c�
		 * girecek. rakamlarToplami+=rakam; sayi/=10; }
		 * 
		 * System.out.print("Girdiginiz say�n�n rakamlar toplam� : "+rakamlarToplami);
		 */

		// *****For Loop ile********
		// Say� Str in. olmad�g� i�in matematiksel i�lemlere tabiki giremeyecektir.
		String sayiStr = "" + sayi; // 345 ise data t�r� String olur
		// Say�y� ba��na hi�lik ekleyerek Stringe �evirebilirim. Bir nevi int � String
		// yapm�� olduk. DAta t�r� String �zerinden gideecegiz.
		// ********* // int olarak verilen bir say�n�n basamak say�s�n� bulmak istesek
		// k�sa yoldan *******************
		// *********// o say�y� Stringe �evirip str.length() methodunu kullanbilriiz.
		// !!!!!!!!!!!!!

		for (int i = 0; i < sayiStr.length(); i++) {

			rakam = sayi % 10;
			rakamlarToplami += rakam;
			sayi /= 10;
		}
		System.out.print("Girdiginiz say�n�n rakamlar toplam� : " + rakamlarToplami);

		scan.close();
	}
}
