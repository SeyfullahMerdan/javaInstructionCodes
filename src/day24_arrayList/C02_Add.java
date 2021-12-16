package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		//

		List<String> isimler = new ArrayList<String>();
		System.out.println("Boþ liste : " + isimler); // Liste oluþtu ama add ile eklemedik. [ ] içinde boþ liste olur.

		isimler.add("Ali");
		System.out.println("1 elemanlý liste : " + isimler);

		isimler.add("Veli");
		System.out.println("2 elemanlý liste : " + isimler);

		// add methodu listenn sonuna ekleme yapar.

		isimler.add("Can");
		System.out.println("3 elemanlý liste : " + isimler); // add yaptýkça sona ekliyor. Ýsim sýralamasý yapmýyor.

		isimler.add(1, "Ayþe Bacý");
		System.out.println("Liste : " + isimler);

		// isimler.add(5); Declare ederken belirttigimiz data type dýþýnda ekleme
		// yapamyýz

		List<String> liste2 = new ArrayList<>();
		System.out.println(liste2);

		liste2.add("Emrah");
		liste2.add("Mehmet");
		System.out.println("Liste2 þu þekildedir : " + liste2);

		isimler.addAll(4, liste2); // Ýki listeyi birleþtirirken addAll yapýyoruz
		System.out.println("sona Liste2 ekledik : " + isimler); // iki türlü ekleyebiliriz. index numarasý girerek veya
																// girmeden

		isimler.addAll(liste2);
		System.out.println("Ýndex numarasý vermeden sona Liste2 ekledik : " + isimler);

		// System.out.println(isimler+liste2); Toplamadý. add.All olmadan yapamayýz. CTE
		// verir.

	}

}
