package day45_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LinkedList {

	public static void main(String[] args) {
		
		
        List<Integer>ll=new LinkedList<>(); // List ve üzerindekiler var. Yukarýdakiler kullanýyorum
		// Ýnterfacedeki methodlarý override ederek kullanabiliyorum. LinkedListe override ettigimiz için
        // LinkListtekini çalýþtýrýrýrým.
        // LinkedList constructor ile obje oluþturdum ama List interface olmasýna ragmen override aracýlýgý il
        // oradaki methodlarý kullanabildim.
        
        
		System.out.println(ll); // []
		
		ll.add(5);
		ll.add(7);

		System.out.println(ll); // [5, 7]
		
		
	    ll.add(9); 
	    
	    // Data türünü list seçtigimiz için sadece List Interfacendeki methodlarý kullanabiliriz.
	// LinkedList classýnda override ettigimiz için interface olmasýna ragmen List methodlarýný kullanabildik***!!!
	
	     
	    Queue <Integer> ll2=new LinkedList<>();  // 
		
	    ll2.add(5);
		ll2.add(7);
		ll2.clear(); // Data türü queue seçilince queue interfaceden gelen methodlarý kullanabildik
		
		
		Deque <Integer> ll3= new LinkedList<>();
		
		ll3.add(5);            // Dequedeki methodlarý getirdi. 
		ll3.add(7);
		ll3.addLast(20);
		
		// hangi özellik lazýmsa data türünü ona göre seçebiliriz.
		// En büyük avantajýmýz data türüne göre methodlar olmasý ve ihtiyaýmýza göre istedigimizi seçebiliriz.
	
	}

}
