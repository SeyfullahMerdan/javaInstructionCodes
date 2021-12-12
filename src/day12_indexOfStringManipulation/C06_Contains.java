package day12_indexOfStringManipulation;

import java.util.Scanner;

public class C06_Contains {

	public static void main(String[] args) {
		
		// Kullanicidan email adresini girmesini isteyin, mail @gmail.com icermiyorsa
		// �lutfen gmail adresi giriniz�
		// gmail.com ile bitiyorsa �Email adresiniz kaydedildi � , @gmail.com ile
		// bitmiyorsa lutfen yazimi kontol edin yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen e-mail adresinizi giriniz");

		String email = scan.next();

		int uzunluk = email.length();   // ald�g�m emaili kontrol etmek i�in uzunlugunu bulup
		// int variablea at�yorum. Bu �ekilde girilen emailin uzunluk kontrol�n� kullanabilirim.
		int index = email.lastIndexOf("@gmail.com"); //sonda olmas�n� istedigim bir kelimegrubunu
		// kontrol etmek i�in last index of ile kontrol edip index diye variablea atad�m.

		if (!email.contains("@gmail.com")) { // ! i�areti i�ermiyorsa anlam� kat�yor
			System.out.println("l�tfen gmail adresi giriniz.");
		} else if (index == uzunluk - 10) {
       // gmail ifadesi sonda oalcag� i�in, gmail ifadesi 10 karakterli oldugu i�in
		// toplam uzunluktan 10 geri gidecem e�er girilen mail adresi 10dan az ise gmail ifadesi yoktur.
		// ve gmail ifadesi sona degil ba�a yaz�lm�� da olabilir.
			System.out.println("Email adresiniz kaydedildi.");

		} else {
			System.out.println("L�tfen yaz�m�n�z� kontrol ediniz.");

		}

		scan.close();
		
	}

}
