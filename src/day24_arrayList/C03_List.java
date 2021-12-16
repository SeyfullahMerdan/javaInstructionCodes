package day24_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_List {

	public static void main(String[] args) {
	
		// // Verilen bir array'den istenen degere sahip elementleri silip
		// kalani yeni bir array olarak kaydedin
		// ve sonra yeni array'i yazdirin

		int arr[] = { 3, 4, 5, 6, 3, 5 };
		int silinecekEleman = 3;

		List<Integer> gecici = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != silinecekEleman) {// Eger silecegimiz eleman arrayin içinde getirigi elemana eþit degilse
				gecici.add(arr[i]);  // eþit olmayan bu elemaný lsiteyi attýk
			}
		}

		System.out.println(gecici); // list olarak istenmeyen elemanlarý haricindekileri burda görürürz. List olarka
									// yazdýrdýk.

		// sonucu Array olarak istiyorsak çevirme yöntemi vardýr.
		// Listedekileri yeni Arraye ekle diyebiliriz.

		int yeniArr[] = new int[gecici.size()]; // Eger illaki Array olarak isteniyorsa, yeni bir array oluþturup
												// boyutunu list olarak ayarlýyoruz.

		for (int i = 0; i < yeniArr.length; i++) { // listedekileri for ile yeni arraye aktarýyor...

			yeniArr[i] = gecici.get(i);

		}

		System.out.println(Arrays.toString(yeniArr)); // Yeni Arrayi yazdýrdýk

	}
}
