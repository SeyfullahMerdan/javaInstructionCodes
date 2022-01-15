package day46_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C01_HashSet {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		// Verieln bir Arraydeki tekrar edilen say�lar� silip unique bir deger olu�turun.

		
		int arr[]= {3,4,5,6,7,8,4,5,6,3,8,1};
		
		Set<Integer> benzersiz=new HashSet<>(); // Seti tek olarak kullanamay�z,interfacedir
		// hashset kulland�m
		for (Integer e : arr) {
		 benzersiz.add(e);    // arrayin elemanlar�n� al�p burada tek tek sete att�m
		}  // set unique olacag� i�in tekrarlanan elemanlar� almad�. unique olarak ald�
		
		System.out.println(benzersiz);  //s�ral� olacak diye bir garanti yok.Varolan� al�yor at�yor
	// S�ral� istiyorsak treeSet kullanmal�y�z. Array degildir,settir. index yoktur each ile al�p
	 //indexe uyarlamal�y�m
		
		
		Object[] tekrarsizArr = benzersiz.toArray();
		System.out.println(Arrays.toString(tekrarsizArr)); // Seti arraye �evirdim.
	// G�r�nt�ye bakarak bu settir bu arraydir diyemeyiz	
		
        int arrT[]=new int [benzersiz.size()];		
		// Iterator ile seti arraya att�m.
        Iterator ii=benzersiz.iterator();
		for (int i = 0; i < arrT.length; i++) {    
			arrT[i]=(int) ii.next();	
		}
        System.out.println(Arrays.toString(arrT));
  
		
        System.out.println(benzersiz.equals(arrT)); // false d�nd�rd�.
        System.out.println(benzersiz.isEmpty()); // false
        System.out.println(benzersiz.remove(5)); // true
        System.out.println(benzersiz); // 1, 3, 4, 6, 7, 8]  
		
	}

}
