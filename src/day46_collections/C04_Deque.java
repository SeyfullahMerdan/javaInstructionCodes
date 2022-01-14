package day46_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

	public static void main(String[] args) {
		
		
        Deque <String> ciftBasli = new LinkedList<>();
		
        ciftBasli.add("seyfullah");
        ciftBasli.add("furkan");
        ciftBasli.add("esra");
		// add diyince de addAll diyince de sona ekliyor.
        System.out.println(ciftBasli); // add queue den geldigi i�in sona ekler.
		
        ciftBasli.addLast(null);   // dequeden gelen �zellik
		
        System.out.println(ciftBasli); // [seyfullah, furkan, esra, null]
		
        System.out.println(ciftBasli.getLast()); // null  parantezsiz getirdi
		
        System.out.println(ciftBasli.pop());  // en ba�takini siliyor ve getiriyor. seyfullah
		System.out.println(ciftBasli);

		ciftBasli.push("Merdan");
		System.out.println(ciftBasli); // [Merdan, furkan, esra, null]
		
		ciftBasli.removeLastOccurrence("furkan");
		System.out.println(ciftBasli); // [Merdan, esra, null] belirtilen eleman�n son kullan�lan� siliyor
		

		
		
		
	}

}
