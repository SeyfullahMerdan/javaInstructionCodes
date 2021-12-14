package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {

	public static void main(String[] args) {
	
		// Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini
		// yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen pozitif bir sayi giriniz : ");

		int sayi = scan.nextInt(); // 345 ise Ýnt data türü

		int rakamlarToplami = 0;
		int rakam = 0;

		/*
		 * while (sayi>0) { sayý 0'dan büyük olsun yeter, while true oalcak ve alt taraf
		 * çalýþacak. rakam=sayi%10; sayýnýn sonsuza gitme ihtimali yok çünkü kullanýcý
		 * girecek. rakamlarToplami+=rakam; sayi/=10; }
		 * 
		 * System.out.print("Girdiginiz sayýnýn rakamlar toplamý : "+rakamlarToplami);
		 */

		// *****For Loop ile********
		// Sayý Str in. olmadýgý için matematiksel iþlemlere tabiki giremeyecektir.
		String sayiStr = "" + sayi; // 345 ise data türü String olur
		// Sayýyý baþýna hiçlik ekleyerek Stringe çevirebilirim. Bir nevi int ý String
		// yapmýþ olduk. DAta türü String üzerinden gideecegiz.
		// ********* // int olarak verilen bir sayýnýn basamak sayýsýný bulmak istesek
		// kýsa yoldan *******************
		// *********// o sayýyý Stringe çevirip str.length() methodunu kullanbilriiz.
		// !!!!!!!!!!!!!

		for (int i = 0; i < sayiStr.length(); i++) {

			rakam = sayi % 10;
			rakamlarToplami += rakam;
			sayi /= 10;
		}
		System.out.print("Girdiginiz sayýnýn rakamlar toplamý : " + rakamlarToplami);

		scan.close();
	}
}
