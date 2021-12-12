package day12_indexOfStringManipulation;

import java.util.Scanner;

public class C06_Contains {

	public static void main(String[] args) {
		
		// Kullanicidan email adresini girmesini isteyin, mail @gmail.com icermiyorsa
		// “lutfen gmail adresi giriniz”
		// gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ , @gmail.com ile
		// bitmiyorsa lutfen yazimi kontol edin yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen e-mail adresinizi giriniz");

		String email = scan.next();

		int uzunluk = email.length();   // aldýgým emaili kontrol etmek için uzunlugunu bulup
		// int variablea atýyorum. Bu þekilde girilen emailin uzunluk kontrolünü kullanabilirim.
		int index = email.lastIndexOf("@gmail.com"); //sonda olmasýný istedigim bir kelimegrubunu
		// kontrol etmek için last index of ile kontrol edip index diye variablea atadým.

		if (!email.contains("@gmail.com")) { // ! iþareti içermiyorsa anlamý katýyor
			System.out.println("lütfen gmail adresi giriniz.");
		} else if (index == uzunluk - 10) {
       // gmail ifadesi sonda oalcagý için, gmail ifadesi 10 karakterli oldugu için
		// toplam uzunluktan 10 geri gidecem eðer girilen mail adresi 10dan az ise gmail ifadesi yoktur.
		// ve gmail ifadesi sona degil baþa yazýlmýþ da olabilir.
			System.out.println("Email adresiniz kaydedildi.");

		} else {
			System.out.println("Lütfen yazýmýnýzý kontrol ediniz.");

		}

		scan.close();
		
	}

}
