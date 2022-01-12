package day44_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {  // ***** !!! B�t�n Collectionslarda kullan�l�r. !!!!*****

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
	
	Iterator ite1=liste.iterator(); // Buras� �nemli! Collection �zerinden olu�turuyorum! liste,array...
	// ilk olu�turdugumda elementlerden ilkinin �n�nde oluyor.!!*****!!!!!!*****
	
	ite1.next(); // ilk atlamay� yapt�. 5-3 aras�nda durdu         syso > 5
	ite1.next(); // ikinciyi yapt�. 3-7 aras�nda durdu             syso > 3
	ite1.next(); //  ���nc� atlamay� yapt�. 7-1 aras�nda durdu     syso > 7
	
	System.out.println(ite1.next()); // d�rd�nc� atlamay� yapt�. 1-9 aras�nda durdu.  syso > 1 getirdi.
	
	///////////////////////////////////////////////////////////
	
	ite1.remove(); // son d�nd�r�len eleman� silecek!!***
	// System.out.println(ite1.remove()); bana bir �ey d�nd�rm�yor bu y�zden de syso i�inde yazd�ram�yorum.
	
	System.out.println(liste); // [5, 3, 7, 9, 8, 2]  O an elinde olan� sildi. Bir sonrakini degil, atlam��
	//   oldugu elementi sildi
	
	
	ite1.remove(); // IllegalStateException. Hata verdi. Birini sildikten sonra elinde bir �ey kalmad�g� i�in
	// hata verdi. O y�zden next yapt�ktan sonra bir daha kullanabilirim.
	
	
	
	
	}
}
