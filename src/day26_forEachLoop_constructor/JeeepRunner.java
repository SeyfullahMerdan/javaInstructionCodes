package day26_forEachLoop_constructor;

public class JeeepRunner {

	public static void main(String[] args) {
		
		
		// Jeep classýndan br obje oluþturalým ve özelliklerini yazdýralým.

		Jeep jeep1 = new Jeep(); // Biz buradan oradaki tüm özellik ve variable ve methodlara ulaþabilirz artýk.

		System.out.println(jeep1.fiyat + " " + jeep1.ilanNo + " " + jeep1.marka + " " + jeep1.model + " " + jeep1.yil); // 10000
																														// 1001
																														// null
																														// null
																														// 2001
																														// ---
																														// Jeep
																														// Classýnda
																														// verdigimiz
																														// degerler.Vermedigimiz
																														// için
																														// default
																														// degerler...

		// Jeep clasýndaki variablelar instance variablelar oldugundan atadýgým degerler
		// sadece benim objem için degerleri degiþtirir
		// jeep classýndaki degerlere hiç bakmaz.

		jeep1.fiyat = 15000;
		jeep1.ilanNo = 1005;
		jeep1.marka = "Toyota";
		jeep1.model = "Corolla";
		jeep1.yil = 2006;

		System.out.println(jeep1.fiyat + " " + jeep1.ilanNo + " " + jeep1.marka + " " // 15000 1005 Toyota Corolla 2006
				+ jeep1.model + " " + jeep1.yil); // Yukarýda verdgim degerleri yazdýrdý. Sadece bu obje için yazdýrdý.

		jeep1.hiz(150); // Araba saatte 150 km yapar.
		jeep1.yakit("benzin"); // Araba yakýt olarak benzin kullanýr.

	}

}
