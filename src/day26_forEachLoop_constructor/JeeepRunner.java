package day26_forEachLoop_constructor;

public class JeeepRunner {

	public static void main(String[] args) {
		
		
		// Jeep class�ndan br obje olu�tural�m ve �zelliklerini yazd�ral�m.

		Jeep jeep1 = new Jeep(); // Biz buradan oradaki t�m �zellik ve variable ve methodlara ula�abilirz art�k.

		System.out.println(jeep1.fiyat + " " + jeep1.ilanNo + " " + jeep1.marka + " " + jeep1.model + " " + jeep1.yil); // 10000
																														// 1001
																														// null
																														// null
																														// 2001
																														// ---
																														// Jeep
																														// Class�nda
																														// verdigimiz
																														// degerler.Vermedigimiz
																														// i�in
																														// default
																														// degerler...

		// Jeep clas�ndaki variablelar instance variablelar oldugundan atad�g�m degerler
		// sadece benim objem i�in degerleri degi�tirir
		// jeep class�ndaki degerlere hi� bakmaz.

		jeep1.fiyat = 15000;
		jeep1.ilanNo = 1005;
		jeep1.marka = "Toyota";
		jeep1.model = "Corolla";
		jeep1.yil = 2006;

		System.out.println(jeep1.fiyat + " " + jeep1.ilanNo + " " + jeep1.marka + " " // 15000 1005 Toyota Corolla 2006
				+ jeep1.model + " " + jeep1.yil); // Yukar�da verdgim degerleri yazd�rd�. Sadece bu obje i�in yazd�rd�.

		jeep1.hiz(150); // Araba saatte 150 km yapar.
		jeep1.yakit("benzin"); // Araba yak�t olarak benzin kullan�r.

	}

}
