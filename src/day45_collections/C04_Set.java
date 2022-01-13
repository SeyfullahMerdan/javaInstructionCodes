package day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C04_Set {

	public static void main(String[] args) {

		/*  Set interfacedir. Alt Classlar� arac�l�g� ile kullanabilirim. 
		   En h�zl�s� HashSet** -  LinkedHashSet  -  TreeSet   >>>bagl� set ve s�ral� set anlamlar�nda
		 
		 Elemanlar uniquedir. yani bir tane varsa ba�ka olmaz.tektir. Unique liste olu�turmak i�in set kullan�labilir.
		 */
		
		Set <Object> s1=new HashSet<>();
		
		s1.add(4);
		s1.add(7);
		s1.add(11);

		System.out.println(s1); // [4, 7, 11]
		
		
		s1.add("java g�zeldir");  // ba�ta deklare ettik, String kabul etmez. 
		// INteger yerine objekt yazarsak itiraz etmez
		
		System.out.println(s1); // [4, 7, java g�zeldir, 11]
		
		
		List<Object> liste=new ArrayList<>();
		
		liste.add(5);
		liste.add("Java Super");
		liste.add(true);
		liste.add('x');
		liste.add(s1);
		// bununla i�lem yapmak �ok zor, sadece depolama yapabiliriz belki
		System.out.println(liste); // [5, Java Super, true, x, [4, 7, java g�zeldir, 11]]
		
		
		
	}

}
