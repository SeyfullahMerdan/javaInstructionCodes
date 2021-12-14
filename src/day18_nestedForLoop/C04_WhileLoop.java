package day18_nestedForLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		// Kullan�c�dan toplanmak �zere say� isteyin.
		// Kullan�c� s�f�ra bas�ncaya kadar sayilar� al�p toplamaya devam edin.
		// s�f�ra bast�g�nda o ana kadar ka� say� girdigini ve girilen say�lar�n
		// toplam�n� yazd�r�n.

		// ka� tane alacag�m�z� bilmiyoruz. 3 tane 5 tane degil,s�f�ra basana kadar ....

		// Kullan�c�dan bir�ey alacam , obje ve bu variablelar� Looptan �nce olu�turur ,
		// Loopun i�inde kullan�r�z.
		// aksi takdirteLoop her d�nd�g�nde bunu tekrar olu�turur.

		Scanner scan = new Scanner(System.in);

		// Loopun i�inde kullanacag�m obje ve variablelar� loopdan �nce olu�turmak daha
		// g�zeldir
		// ��nk� loopun i�inde olu�turmak loop her d�nd�g�nde yeni bir obje ve variable
		// olu�turur ve bu da haf�zay� doldurur.
		// ald�g�m say�y� toplamak eklemek toplamak i�in saklama kab�na ihtiya� var
		// kullan�c�dan bir say� almak i�in variable ve al�nan say�lar�n toplam�n�
		// yap�p-koymak i�in bir konteyn�ra ihtiya� var
		// ve bir de ka� tane say� girdigini bilmek i�in sayaca ihtiya� var

		int sayi = 100; // kullan�c�dan al�nan de�er-variable // ihtiyac�m�z oan Variablelar�
						// olu�turduk.
		int toplam = 0; // ald�g�m say�y� toplamak i�in saklama kab�na
		int sayac = 0; // girilen say� adedini tutacak variable

		// Kullan�c�dan deger almak i�in kullanacam. 0 olmad�g� s�rece �al��s�n diyecem.
		// o y�zden 100 degeri atad�m. Ka� oldugu �nemli degil,0 olmas�n yeter.
		// **Bu soru da 0'a bas�nca i�lem bitecegi i�in buradaki variablelara ba�ka bir
		// say� atamak daha mant�kl�** //

		while (sayi != 0) { // 0'a e�it degildir=dogru�... 0'a bas�ld�g�nda false oalcak ve d�ng� duracak.

			System.out.println(
					"L�tfen toplamak eklemek i�in bir tam say� giiriniz. \nArd�ndn bitirmek i�in 0'a bas�n�z : ");

			sayi = scan.nextInt();
			toplam += sayi;
			sayac++;

			// S�sl� parantezi g�rd� loop ba�a d�nd�... 0 g�rene kadar 0=false g�rene kadar
			// devam edecek...
		}
		// Kullan�c� s�f�ra bast�g�nda loop i�lemini son kez yap�p sonra ba�a d�necek ve
		// loop bitecek.

		System.out.println("Girilen say� adedi : " + (sayac - 1)); // 0 a bas�nca bitirdigi i�in 0 � toplama ama�l�
																	// vermedigi i�in 0 � saym�yoruz bu y�zden 1 say�
																	// eksik g�stermeliyiz.

		System.out.println("Girilen say�lar�n toplam� : " + toplam);

		scan.close();
	}

}
