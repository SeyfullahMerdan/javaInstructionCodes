package day45_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LinkedList {

	public static void main(String[] args) {
		
		
        List<Integer>ll=new LinkedList<>(); // List ve �zerindekiler var. Yukar�dakiler kullan�yorum
		// �nterfacedeki methodlar� override ederek kullanabiliyorum. LinkedListe override ettigimiz i�in
        // LinkListtekini �al��t�r�r�r�m.
        // LinkedList constructor ile obje olu�turdum ama List interface olmas�na ragmen override arac�l�g� il
        // oradaki methodlar� kullanabildim.
        
        
		System.out.println(ll); // []
		
		ll.add(5);
		ll.add(7);

		System.out.println(ll); // [5, 7]
		
		
	    ll.add(9); 
	    
	    // Data t�r�n� list se�tigimiz i�in sadece List Interfacendeki methodlar� kullanabiliriz.
	// LinkedList class�nda override ettigimiz i�in interface olmas�na ragmen List methodlar�n� kullanabildik***!!!
	
	     
	    Queue <Integer> ll2=new LinkedList<>();  // 
		
	    ll2.add(5);
		ll2.add(7);
		ll2.clear(); // Data t�r� queue se�ilince queue interfaceden gelen methodlar� kullanabildik
		
		
		Deque <Integer> ll3= new LinkedList<>();
		
		ll3.add(5);            // Dequedeki methodlar� getirdi. 
		ll3.add(7);
		ll3.addLast(20);
		
		// hangi �zellik laz�msa data t�r�n� ona g�re se�ebiliriz.
		// En b�y�k avantaj�m�z data t�r�ne g�re methodlar olmas� ve ihtiya�m�za g�re istedigimizi se�ebiliriz.
	
	}

}
