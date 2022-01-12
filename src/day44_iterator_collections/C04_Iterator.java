package day44_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C04_Iterator {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {  // ***Interfacedir***
		
		// Iterator kullanarak t�m elementleri silin?!  // Iteratorda for degil while loop kullan�yoruz
		
		List<Integer> liste = new ArrayList<>();

		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		liste.add(9);
		liste.add(8);
		liste.add(2);
		System.out.println(liste); // [5, 3, 7, 1, 9, 8, 2]
		
		Iterator ite1=liste.iterator(); 
		
		
		while (ite1.hasNext()) {  // yan�nda eleman oldugu s�rece devam et dedi. 
			ite1.next();  // imleci bir yana kayd�r dedi
			ite1.remove(); // Son d�nd�rd�g�n-�zerinden atlad�g�n elaman� sil dedi.
		}
		
		System.out.println(liste);  // []
		
		
		
		// ListIterators , Iterator intarfaceinin childid�r. Daha fazla methoda sahiptir,bu y�zden daha �ok trch edilir.
		// En b�y�k fark, �terator koleksiyondaki ��eleri yaln�zca ileri y�nde hareket ettirebilir
		// ListIterators ise bir koleksiyondaki ��eleri hem ileri hem de geri y�nde hareket ettirebilir.!!!***
		
		
		
		
		
	}

}
