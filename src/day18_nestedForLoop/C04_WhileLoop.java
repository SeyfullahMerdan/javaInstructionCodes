package day18_nestedForLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		// Kullanýcýdan toplanmak üzere sayý isteyin.
		// Kullanýcý sýfýra basýncaya kadar sayilarý alýp toplamaya devam edin.
		// sýfýra bastýgýnda o ana kadar kaç sayý girdigini ve girilen sayýlarýn
		// toplamýný yazdýrýn.

		// kaç tane alacagýmýzý bilmiyoruz. 3 tane 5 tane degil,sýfýra basana kadar ....

		// Kullanýcýdan birþey alacam , obje ve bu variablelarý Looptan önce oluþturur ,
		// Loopun içinde kullanýrýz.
		// aksi takdirteLoop her döndügünde bunu tekrar oluþturur.

		Scanner scan = new Scanner(System.in);

		// Loopun içinde kullanacagým obje ve variablelarý loopdan önce oluþturmak daha
		// güzeldir
		// Çünkü loopun içinde oluþturmak loop her döndügünde yeni bir obje ve variable
		// oluþturur ve bu da hafýzayý doldurur.
		// aldýgým sayýyý toplamak eklemek toplamak için saklama kabýna ihtiyaç var
		// kullanýcýdan bir sayý almak için variable ve alýnan sayýlarýn toplamýný
		// yapýp-koymak için bir konteynýra ihtiyaç var
		// ve bir de kaç tane sayý girdigini bilmek için sayaca ihtiyaç var

		int sayi = 100; // kullanýcýdan alýnan deðer-variable // ihtiyacýmýz oan Variablelarý
						// oluþturduk.
		int toplam = 0; // aldýgým sayýyý toplamak için saklama kabýna
		int sayac = 0; // girilen sayý adedini tutacak variable

		// Kullanýcýdan deger almak için kullanacam. 0 olmadýgý sürece çalýþsýn diyecem.
		// o yüzden 100 degeri atadým. Kaç oldugu önemli degil,0 olmasýn yeter.
		// **Bu soru da 0'a basýnca iþlem bitecegi için buradaki variablelara baþka bir
		// sayý atamak daha mantýklý** //

		while (sayi != 0) { // 0'a eþit degildir=dogruç... 0'a basýldýgýnda false oalcak ve döngü duracak.

			System.out.println(
					"Lütfen toplamak eklemek için bir tam sayý giiriniz. \nArdýndn bitirmek için 0'a basýnýz : ");

			sayi = scan.nextInt();
			toplam += sayi;
			sayac++;

			// Süslü parantezi gördü loop baþa döndü... 0 görene kadar 0=false görene kadar
			// devam edecek...
		}
		// Kullanýcý sýfýra bastýgýnda loop iþlemini son kez yapýp sonra baþa dönecek ve
		// loop bitecek.

		System.out.println("Girilen sayý adedi : " + (sayac - 1)); // 0 a basýnca bitirdigi için 0 ý toplama amaçlý
																	// vermedigi için 0 ý saymýyoruz bu yüzden 1 sayý
																	// eksik göstermeliyiz.

		System.out.println("Girilen sayýlarýn toplamý : " + toplam);

		scan.close();
	}

}
