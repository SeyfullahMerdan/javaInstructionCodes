package day46_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {

	// Gelen sona gelir,silinen baþtan silinir.
	// first in first out (FÝFO)	
		
		Queue <String> kuyruk = new LinkedList<>();
		
		kuyruk.add("seyfullah");
		kuyruk.add("furkan");
		kuyruk.add("esra");
		
		System.out.println(kuyruk); // [seyfullah, furkan, esra]
		
		kuyruk.remove();
		System.out.println(kuyruk); // [furkan, esra]  ilk elemaný çýkardý.
		
		System.out.println(kuyruk.offer(null)); // eleman ekledi, offer---sunmak anlamýnda
		System.out.println(kuyruk);  // [furkan, esra, null] Sona ekledi.
	
		System.out.println(kuyruk.peek()); // furkan    ilk elamaný getirir ama silmez
		System.out.println(kuyruk.poll()); // furkan   ilk elemaný siler ve getirri gösterir
		// eleman yoksa null der. exception atmaz ama remove methodu ex. atar
		kuyruk.add("esra");
		System.out.println(kuyruk); // [esra, null, esra]  unique olma durumu yok...
		
		
	}

}
