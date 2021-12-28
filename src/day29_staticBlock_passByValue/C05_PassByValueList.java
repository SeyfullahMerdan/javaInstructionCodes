package day29_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C05_PassByValueList {

	public static void main(String[] args) {

		/*
		 bir list oluþturalým.
		 sora list elemanlarýný degiþtir methodu yazýp orada list elemanlarýndan bazýlarýný degiþtirelim.
		 method void olsun.
		 main methoda döndükten sonra yeniden listi yazdýralým
		 */
		
		List<String> harfler=new ArrayList<>();
		
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
		listElemanlarDegistir(harfler);
		
		System.out.println("maÝN mETHODA DONUNCE LÝST : " + harfler);  // Obje olunca iþin içinde objenin kendisini degiþtiremeyiz
		// Ama bazý elemanlarýný degiþtirebiliriz. Yani listenin bazý elemanlaýný degiþtirebilirz.
		// Ama listenin kendisini degiþtiremeyiz.	
		
		
		listDegistir(harfler);// Methodda yen deger atadýgým halde harfler listesi degiþmedi. 
		System.out.println("Liste yeni list atadýkan sonra Main methoda dönünce List : "+ harfler);
		// Java da list ve array gibi objeler içinde Pass By Value geçerlidir. Yani farklý bir methodda array veya liste yeni deger atamasý
		// yaparsanýz orjinal array veya list degiþmez.
		
		// Liste eleman eklemek veya çýkarmakla degiþmez.
		
		
	}

	private static void listDegistir(List<String> harfler) {   // methodda yeni deger atardgým halde harfler listesi degiþmedi
		                                                       // elemanlarýný yazmadýk. listenin kendisini yazdýk ama degiþtiremedik
		                                                       // aþagýdakinde ise elemanlarý degiþtirdik.

		harfler=new ArrayList<>();
		
		System.out.println("Liste yeni deger atayýnca: "+ harfler);// Boþ list oldu. Yeni deger atayýnca.
		
		
	}

	private static void listElemanlarDegistir(List<String> harfler) {

		harfler.set(0, "D");     // Ýþin içinde obje olunca obje degiþmez ama objenin elemanlarýný degiþtirebilirz.
		                        // Listenin kendisi degiþmez ama elemanlarý degiþir.
		
		System.out.println("METHODDA DEGÝÞTÝRDGÝMÝZ LÝST : " + harfler);
		
	}

}
