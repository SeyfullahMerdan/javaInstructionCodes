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
	  // Iteratorun mant�g� imle� gbidir, yan�p yan�p s�nen bir imle�.
	  // Iterator bir collection �yesi i�in olu�turulabilir. New s�zc�g� yoktur. 3 method vard�r.
		
		Iterator ite1=liste.iterator(); // bu liste i�in olu�turdum. [5, 3, 7, 1, 9, 8, 2]
		// ilk olu�tugunda ilk elemandan �ncedir, yani bu durumda 5'in hemen �ncesinde
		
		// i�eride sadece kod 7 kerer �al��acak,ekstradan bir listeye baglama durumu yok loopu!
		for (int i = 0; i < liste.size(); i++) {
			System.out.println(ite1.hasNext() + "=====" + ite1.next());
		}
		
// hasNext bana true-false d�nd�
// next methodu imlec gibi bir sonraki eleman�n �n�ne gitti ve delil olarak atlad�g� eleman� getirdi.
// bu i�lem eleman say�s�nca gidiyor, loopun i�inde...	
		
//****!!!! next hareket etigi m�ddett�e gittigi yer neresi ise orada kal�r. Bn oynatmad�g�m s�rece oynamaz!		
		
		
		System.out.println(ite1.hasNext());   // false verdi
		// next imlecini en son listenin en sonunda b�rakt�g�m�z i�in, hasNext yan�mda eleman yok dedi.
		
		// listenin sonunda �uanda, yine de senden sonraki elementi getir dersem exception verir.
		System.out.println(ite1.next()); // NoSuchElementException 


		// Iterator indexe bagl� olmaks�z�n elementleri bir yandakine diger yandakine s�ra ile g�t�r�yor
		
		// hasNext  >>>>  True or False
		// next  >>>>>  hasnextin true verdigi eleman� g�sterme
		// remove >>>> atlad�g� yani son d�nd�rd�g� eleman� siler, iki defa �st �ste kullan�l�rsa rte verir.!*
	}

}
