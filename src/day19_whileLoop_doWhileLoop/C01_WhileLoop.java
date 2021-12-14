package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
	
		
		// Soru 6 ) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam
		// kac tane olduklarini ekranda yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.print("L�tfen pozitif bir sayi giriniz : ");

		int sayi = scan.nextInt();

		int sayac = 0; // konteyn�r,b�lenler, atacag�z buraya***say�lar�n adedini tutmak i�in sayaca
						// ihtiya� var. soruda istiyor ��nk�
		int bolen = 1; // loopun ba�lang�c degeri i�in gerekli deger gibi

		while (bolen <= sayi) { // say�dan k���k oldugu s�rece devam edecek say�ya kadar gidecek. ��nk�
								// b�l�nenleri bulacag�z

			if (sayi % bolen == 0) {
				System.out.print(bolen + " "); // say� b�l�n�yorsa alacam. b�l�nm�yorsa almayacag�m.
				sayac++; // ka� defa d�nerse ka� defa b�lerse her seferinde bu konteyn�ra +1 ekleyecek
			}

			bolen++; // b�len say� bir daha gelmesin denkleme,sonraki say� i�leme ba�las�n diye.
		}

		System.out.println(sayi + " say�s�n�n " + sayac + " adet b�leni vard�r. ");

		scan.close();
	}

}
