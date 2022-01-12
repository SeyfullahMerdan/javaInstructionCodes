package day44_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {  // ***** !!! Bütün Collectionslarda kullanýlýr. !!!!*****

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
	
	Iterator ite1=liste.iterator(); // Burasý önemli! Collection üzerinden oluþturuyorum! liste,array...
	// ilk oluþturdugumda elementlerden ilkinin önünde oluyor.!!*****!!!!!!*****
	
	ite1.next(); // ilk atlamayý yaptý. 5-3 arasýnda durdu         syso > 5
	ite1.next(); // ikinciyi yaptý. 3-7 arasýnda durdu             syso > 3
	ite1.next(); //  üçüncü atlamayý yaptý. 7-1 arasýnda durdu     syso > 7
	
	System.out.println(ite1.next()); // dördüncü atlamayý yaptý. 1-9 arasýnda durdu.  syso > 1 getirdi.
	
	///////////////////////////////////////////////////////////
	
	ite1.remove(); // son döndürülen elemaný silecek!!***
	// System.out.println(ite1.remove()); bana bir þey döndürmüyor bu yüzden de syso içinde yazdýramýyorum.
	
	System.out.println(liste); // [5, 3, 7, 9, 8, 2]  O an elinde olaný sildi. Bir sonrakini degil, atlamýþ
	//   oldugu elementi sildi
	
	
	ite1.remove(); // IllegalStateException. Hata verdi. Birini sildikten sonra elinde bir þey kalmadýgý için
	// hata verdi. O yüzden next yaptýktan sonra bir daha kullanabilirim.
	
	
	
	
	}
}
