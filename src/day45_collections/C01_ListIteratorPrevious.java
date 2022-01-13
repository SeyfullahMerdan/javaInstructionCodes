package day45_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListIteratorPrevious {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

        List <Integer> liste=new ArrayList<>();
		
		liste.add(5);
		liste.add(10);
		liste.add(15);
		liste.add(20);
		liste.add(25);
		System.out.println(liste); 
		
		
		ListIterator li=liste.listIterator();
		
		li.next(); // 5-10
		li.next(); // 10-15
		li.next(); // 15-20       20nin �n�ne geldi
		li.set(liste);
		System.out.println(liste);
		
		System.out.println( li.hasPrevious() );  // true
		
		li.previous(); // 15i sildi
		li.previous(); // 10u sildi
		li.previous();
	//  	li.previous();           nosuchaelements
		
		li.remove();
		// li.remove(); // iki defa �st �ste kullanamad�m
		
		System.out.println(liste);  // silerek getirdi


		
		while (li.hasPrevious()) {    // �n�nde var m�? true ise devam et...
			
			li.previous();  // varsa bir geri git. en ba�a kadar gidecek bu �ekilde
		
		}
		System.out.println(liste);
		
		li.next();
		li.remove();
		System.out.println(liste);
	
	}

}
