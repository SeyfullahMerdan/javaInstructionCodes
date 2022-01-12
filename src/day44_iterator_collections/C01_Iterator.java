package day44_iterator_collections;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {


	public static void main(String[] args) {

    // Java iterator, collection elemanlarýmýzýn arasýnda gezinmemize ve elemanlarý degiþtirmemize yarar.
// Þuana kadar Array Ve Arraylisti gördük, element toplayabilen data typeleri olarak, bundan sonra set ve map gibi olanlar var
  // Bir liste düþünelim indexi olmayan,,bu durumda elemanlar arasýnda gezinmek problem oluþturur.
		
		List <Integer> liste=new ArrayList<>();
		
		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		liste.add(9);
		liste.add(8);
		liste.add(2);
		
		
		// index kullanmadan tüm elemanlarý 3 arttýrýyorum.
		
		for (Integer e : liste) {
			System.out.print(e+3 + ", "); // 8, 6, 10, 4, 12, 11, 5, 
		   // for ile her elemaný 3 arttýrdým
		}
		
		System.out.println();
		
		System.out.print(liste); // tekrar yazdýrdýgýmda listemin eski hali geliyor
		// [5, 3, 7, 1, 9, 8, 2]
		// foreach içerisinde yapýlan degþiklikler localdir. Scope farklýdýr ve o scope için geçerlidir
		System.out.println();
		
      for (Integer e : liste) {
			e+=3;          // atama yapýyorum
			System.out.print(e + ", "); // 8, 6, 10, 4, 12, 11, 5, degerlerini aldý.
		}
		
		System.out.println(liste); // [5, 3, 7, 1, 9, 8, 2] Yukarýda atama yaptýgým halde listem eski haline geri döndü
		// for each loop ile elementlere yaptýgým etkiler kalýcý olmadý.
		
		//Yani foreach loop ile index kullanmadan tüm elementlere ulaþabiliyoruz ama kalýcý degiþiklik yapamýyoruz.
		
		
	}

}
