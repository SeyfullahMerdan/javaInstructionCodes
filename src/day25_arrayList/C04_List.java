package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_List {

	public static void main(String[] args) {
		
		// Verilen bir Listede , i�inde belirli bir harf olan elemanlar� silen bir method yaz�n�z.

		List <String> str=new ArrayList<String>(); 
		
		str.add("Ceyhun"); 
		str.add("Y�ld�z");
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
		// Method yazd�rmayacak o y�zden return diyecegiz. 
		//Geriye Stringlerden olu�an liste d�ncegi i�in return type ListString oldu 
		
		
		for (int i = 0; i < str.size(); i++) {        // 0 1 2 3 4           // 0 1 3 4
			
			if ( str.get(i).contains(silinecekHarf) ) {
				str.remove(i);
				i--; // silinecegi i�in index out of bonds vermesin diye azalt�m
			}	
		}
	
		return str ; }

}
