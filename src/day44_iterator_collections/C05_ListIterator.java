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
		liste.add("Ayþe");
		liste.add("Fatma");
		liste.add("Emrah");
		System.out.println(liste); // [Ali, Veli, Ayþe, Fatma, Emrah]
		
		
		// liste olmasa iterator hiçbir þey. Yardýmcý eleman gibidir. Beni elemeentler üzerinde gezdir diyoruz!
		ListIterator li1=liste.listIterator();  // obje oluþturmuyoruz!!!*** Liste üzerinde gezinen bir iterator,obje degildir!*
		String temp="";
		while (li1.hasNext()) {
	
		// li1.set(li1.next() + "X");   -- kýsayol , bu þekilde de yapýlabilir.
			
		temp = (String) li1.next(); // iki türlü de yapabiliriz.  Ýlk elemaný getirip geçici bir Stringe atayýp sonra X ekleriz.
	    li1.set(temp + "X");        // elemaný getir diyruz, sonra elemana X ekle diyoruz ve ekliyor
                                    // Iterator ile yaptýgýmýz için kalýcý oluyor			
			
		}
		
		System.out.println(liste); // [AliX, VeliX, AyþeX, FatmaX, EmrahX]
		
	}

}
