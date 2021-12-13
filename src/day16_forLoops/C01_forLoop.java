package day16_forLoops;

public class C01_forLoop {

	public static void main(String[] args) {
		
		
		for (int i = 0; i <= 10; i += 2) { // Sýnýrý dahil etmek istiyorsak eþittir koyarýz.

			System.out.print(i + "       "); // yan yana olsun istersek -ln sileriz. Yanyana yazarýz.
			// (i + " " ) yaparsak yanyana yazýp araya boþluk koyar
		}

		// forLoop baþlangç ve bitiþ þartý bir sayýnýn degerine baglý olan durumlarda
		// tercih edilir.

		/*
		 * for (int i = 0; i < 10; i--) {
		 * 
		 * System.out.println(i + " "); // bu bir kodalama hatasýdýr!!! }
		 */
		
		// Eger baþlangýç sayýsý artýþ/azalýþ ile bitiþ degerine yaklaþmýyor,
		// uzaklaþýyor ise Loop hiç bir zaman durmaz
		// loop hiç bir zaman durmaz.
		// Bu duruma sonsuz loop deriz ve bu durumun gerçekleþmesini istemeyiz.

		for (int i = 0; i > 10; i++) { // Loop broken OLDU ! ÖLÜ DOGMUÞTUR ! forLoop Çalýþýr ama forBody çalýþmaz!!!
			System.out.println(i + " "); // i=0 i>10 == False bu durumda çalýþmýyor kod...
		}

		// eðer ilk deger için bitiþ þartý true olmazsa daha ilk adýmda loop broken olur*********************
		//
		// dolayýsýyla loop body hiç çalýþmadan,loop'un sonrasýna geçilir.
		// lopp çalýþýr ama hiç bir iþlem yapmaz.*************************

		// 3 DURUM SÖZ KONUSU..
		
		// 1-) Regular YANÝ NORMAL KOD
		// 2-) Sonsuz Döngü (Sonsuz Loop) HATA VERDÝÐÝ DURUM
		// 3-) Çalýþýp Sonuç vermeme durumu ÇALIÞTIGI AMA SONUÇ VERMEDÝGÝ DURUM.

	}

}
