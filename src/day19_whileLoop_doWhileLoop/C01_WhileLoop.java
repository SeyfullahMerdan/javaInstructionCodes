package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
	
		
		// Soru 6 ) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam
		// kac tane olduklarini ekranda yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen pozitif bir sayi giriniz : ");

		int sayi = scan.nextInt();

		int sayac = 0; // konteynýr,bölenler, atacagýz buraya***sayýlarýn adedini tutmak için sayaca
						// ihtiyaç var. soruda istiyor çünkü
		int bolen = 1; // loopun baþlangýc degeri için gerekli deger gibi

		while (bolen <= sayi) { // sayýdan küçük oldugu sürece devam edecek sayýya kadar gidecek. çünkü
								// bölünenleri bulacagýz

			if (sayi % bolen == 0) {
				System.out.print(bolen + " "); // sayý bölünüyorsa alacam. bölünmüyorsa almayacagým.
				sayac++; // kaç defa dönerse kaç defa bölerse her seferinde bu konteynýra +1 ekleyecek
			}

			bolen++; // bölen sayý bir daha gelmesin denkleme,sonraki sayý iþleme baþlasýn diye.
		}

		System.out.println(sayi + " sayýsýnýn " + sayac + " adet böleni vardýr. ");

		scan.close();
	}

}
