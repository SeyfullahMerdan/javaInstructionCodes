package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_ForEachLoopList {

	public static void main(String[] args) {
		
		// Bazen index ile hi� ugra�madan bir Array veya Listedeki t�m elemanlar� g�zden ge�irmek isteriz.
		// ForEachLoop her zaman s�ral� bir �ekilde vermeyebilir.
		// Arrayde de kullanabilriz
		
		
		int arr []= { 1,2,3,5,3,2,7 } ;
		
		// Bu Arrayi esnek bir list yapmak istiyorum. 
		
		
		List <Integer> yeniList = new ArrayList<>(); 
		
		for (int eleman : arr) {      // Arr deki her bir int. bana getir demek
		yeniList.add(eleman);  // for each loop getirecek eleman� yeniListe add yapacak.
		}
		
		System.out.println(yeniList);
	}

}

