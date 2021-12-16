package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//

		List<String> isimler = new ArrayList<String>();
		System.out.println("Bo� liste : " + isimler); // Liste olu�tu ama add ile eklemedik. [ ] i�inde bo� liste olur.

		isimler.add("Ali");
		System.out.println("1 elemanl� liste : " + isimler);

		isimler.add("Veli");
		System.out.println("2 elemanl� liste : " + isimler);

		// add methodu listenn sonuna ekleme yapar.

		isimler.add("Can");
		System.out.println("3 elemanl� liste : " + isimler); // add yapt�k�a sona ekliyor. �sim s�ralamas� yapm�yor.

		isimler.add(1, "Ay�e Bac�");
		System.out.println("Liste : " + isimler);

		// isimler.add(5); Declare ederken belirttigimiz data type d���nda ekleme
		// yapamy�z

		List<String> liste2 = new ArrayList<>();
		System.out.println(liste2);

		liste2.add("Emrah");
		liste2.add("Mehmet");
		System.out.println("Liste2 �u �ekildedir : " + liste2);

		isimler.addAll(4, liste2); // �ki listeyi birle�tirirken addAll yap�yoruz
		System.out.println("sona Liste2 ekledik : " + isimler); // iki t�rl� ekleyebiliriz. index numaras� girerek veya
																// girmeden

		isimler.addAll(liste2);
		System.out.println("�ndex numaras� vermeden sona Liste2 ekledik : " + isimler);

		// System.out.println(isimler+liste2); Toplamad�. add.All olmadan yapamay�z. CTE
		// verir.

	}

}
