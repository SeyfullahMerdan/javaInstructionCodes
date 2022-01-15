package day46_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C01_HashSet {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		// Verieln bir Arraydeki tekrar edilen sayýlarý silip unique bir deger oluþturun.

		
		int arr[]= {3,4,5,6,7,8,4,5,6,3,8,1};
		
		Set<Integer> benzersiz=new HashSet<>(); // Seti tek olarak kullanamayýz,interfacedir
		// hashset kullandým
		for (Integer e : arr) {
		 benzersiz.add(e);    // arrayin elemanlarýný alýp burada tek tek sete attým
		}  // set unique olacagý için tekrarlanan elemanlarý almadý. unique olarak aldý
		
		System.out.println(benzersiz);  //sýralý olacak diye bir garanti yok.Varolaný alýyor atýyor
	// Sýralý istiyorsak treeSet kullanmalýyýz. Array degildir,settir. index yoktur each ile alýp
	 //indexe uyarlamalýyým
		
		
		Object[] tekrarsizArr = benzersiz.toArray();
		System.out.println(Arrays.toString(tekrarsizArr)); // Seti arraye çevirdim.
	// Görüntüye bakarak bu settir bu arraydir diyemeyiz	
		
        int arrT[]=new int [benzersiz.size()];		
		// Iterator ile seti arraya attým.
        Iterator ii=benzersiz.iterator();
		for (int i = 0; i < arrT.length; i++) {    
			arrT[i]=(int) ii.next();	
		}
        System.out.println(Arrays.toString(arrT));
  
		
        System.out.println(benzersiz.equals(arrT)); // false döndürdü.
        System.out.println(benzersiz.isEmpty()); // false
        System.out.println(benzersiz.remove(5)); // true
        System.out.println(benzersiz); // 1, 3, 4, 6, 7, 8]  
		
	}

}
