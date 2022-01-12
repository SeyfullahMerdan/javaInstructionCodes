package day44_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C05_ListIterator {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		List <String> liste=new ArrayList<>();
		
		liste.add("Ali");
		liste.add("Veli");
		liste.add("Ay�e");
		liste.add("Fatma");
		liste.add("Emrah");
		System.out.println(liste); // [Ali, Veli, Ay�e, Fatma, Emrah]
		
		
		// liste olmasa iterator hi�bir �ey. Yard�mc� eleman gibidir. Beni elemeentler �zerinde gezdir diyoruz!
		ListIterator li1=liste.listIterator();  // obje olu�turmuyoruz!!!*** Liste �zerinde gezinen bir iterator,obje degildir!*
		String temp="";
		while (li1.hasNext()) {
	
		// li1.set(li1.next() + "X");   -- k�sayol , bu �ekilde de yap�labilir.
			
		temp = (String) li1.next(); // iki t�rl� de yapabiliriz.  �lk eleman� getirip ge�ici bir Stringe atay�p sonra X ekleriz.
	    li1.set(temp + "X");        // eleman� getir diyruz, sonra elemana X ekle diyoruz ve ekliyor
                                    // Iterator ile yapt�g�m�z i�in kal�c� oluyor			
			
		}
		
		System.out.println(liste); // [AliX, VeliX, Ay�eX, FatmaX, EmrahX]
		
	}

}
