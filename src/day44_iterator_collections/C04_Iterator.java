package day44_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C04_Iterator {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {  // ***Interfacedir***
		
		// Iterator kullanarak tüm elementleri silin?!  // Iteratorda for degil while loop kullanýyoruz
		
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
		
		
		while (ite1.hasNext()) {  // yanýnda eleman oldugu sürece devam et dedi. 
			ite1.next();  // imleci bir yana kaydýr dedi
			ite1.remove(); // Son döndürdügün-üzerinden atladýgýn elamaný sil dedi.
		}
		
		System.out.println(liste);  // []
		
		
		
		// ListIterators , Iterator intarfaceinin childidýr. Daha fazla methoda sahiptir,bu yüzden daha çok trch edilir.
		// En büyük fark, ýterator koleksiyondaki öðeleri yalnýzca ileri yönde hareket ettirebilir
		// ListIterators ise bir koleksiyondaki öðeleri hem ileri hem de geri yönde hareket ettirebilir.!!!***
		
		
		
		
		
	}

}
