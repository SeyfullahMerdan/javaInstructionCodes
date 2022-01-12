package day44_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		List<Integer> liste = new ArrayList<>();

		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		liste.add(9);
		liste.add(8);
		liste.add(2);
		System.out.println(liste); // [5, 3, 7, 1, 9, 8, 2]
	  // Iteratorun mantýgý imleç gbidir, yanýp yanýp sönen bir imleç.
	  // Iterator bir collection üyesi için oluþturulabilir. New sözcügü yoktur. 3 method vardýr.
		
		Iterator ite1=liste.iterator(); // bu liste için oluþturdum. [5, 3, 7, 1, 9, 8, 2]
		// ilk oluþtugunda ilk elemandan öncedir, yani bu durumda 5'in hemen öncesinde
		
		// içeride sadece kod 7 kerer çalýþacak,ekstradan bir listeye baglama durumu yok loopu!
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(ite1.hasNext() + "=====" + ite1.next());
		}
		
// hasNext bana true-false döndü
// next methodu imlec gibi bir sonraki elemanýn önüne gitti ve delil olarak atladýgý elemaný getirdi.
// bu iþlem eleman sayýsýnca gidiyor, loopun içinde...	
		
//****!!!! next hareket etigi müddettçe gittigi yer neresi ise orada kalýr. Bn oynatmadýgým sürece oynamaz!		
		
		
		System.out.println(ite1.hasNext());   // false verdi
		// next imlecini en son listenin en sonunda býraktýgýmýz için, hasNext yanýmda eleman yok dedi.
		
		// listenin sonunda þuanda, yine de senden sonraki elementi getir dersem exception verir.
		System.out.println(ite1.next()); // NoSuchElementException 


		// Iterator indexe baglý olmaksýzýn elementleri bir yandakine diger yandakine sýra ile götürüyor
		
		// hasNext  >>>>  True or False
		// next  >>>>>  hasnextin true verdigi elemaný gösterme
		// remove >>>> atladýgý yani son döndürdügü elemaný siler, iki defa üst üste kullanýlýrsa rte verir.!*
	}

}
