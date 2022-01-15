package day46_collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class C02_RetainAll {

	public static void main(String[] args) {

	// uniquedir. Ekleme s�ras�na g�re elemanlar eklenir ama HashSetet g�re yava�t�r.
	// ekleme ve silme h�zl�d�r***
		
		Set<String> lhs1= new LinkedHashSet<>();
		lhs1.add("Ali");
		lhs1.add("Mehmet Ali");
		lhs1.add("Hasan");
		lhs1.add("Kutlu");
		
        Set<String> lhs2= new LinkedHashSet<>();
		lhs2.add("Ali");
		lhs2.add("Mehmet Ali");
		lhs2.add("Filiz");
		
	//	System.out.println(lhs1.retainAll(lhs2)); // lhs1den lhs2 haricindekileri ��kar der ve true false d�ner
	//	System.out.println(lhs1); 
	//	System.out.println(lhs2);     // ortak elemanlar kal�yor digeri ��k�yor
		
		System.out.println(lhs2.retainAll(lhs1)); // true //lhs2den lhs1 haricini ��kard�.e�er varsa...
		System.out.println(lhs1);  // [Ali, Mehmet Ali, Hasan, Kutlu]
		System.out.println(lhs2);  // [Ali, Mehmet Ali]
		
		// Methodlar genel itibari ile digerleri ile hep ayn�.
	}

}
