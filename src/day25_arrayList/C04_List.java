package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_List {

	public static void main(String[] args) {
		
		// Verilen bir Listede , içinde belirli bir harf olan elemanlarý silen bir method yazýnýz.

		List <String> str=new ArrayList<String>(); 
		
		str.add("Ceyhun"); 
		str.add("Yýldýz");
		str.add("Mustafa");
		str.add("Tugba");
		str.add("Muhammed");
		
		System.out.println(str);
		
		String silinecekHarf="a";
		
	    sil(str , silinecekHarf);
	
	    str=sil(str , silinecekHarf);

	    System.out.println(str);

	    
	}

	private static List<String> sil(List<String> str, String silinecekHarf) {
		// Method yazdýrmayacak o yüzden return diyecegiz. 
		//Geriye Stringlerden oluþan liste döncegi için return type ListString oldu 
		
		
		for (int i = 0; i < str.size(); i++) {        // 0 1 2 3 4           // 0 1 3 4
			
			if ( str.get(i).contains(silinecekHarf) ) {
				str.remove(i);
				i--; // silinecegi için index out of bonds vermesin diye azaltým
			}	
		}
	
		return str ; }

}
