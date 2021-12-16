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
			if (arr[i] != silinecekEleman) {// Eger silecegimiz eleman arrayin i�inde getirigi elemana e�it degilse
				gecici.add(arr[i]);  // e�it olmayan bu eleman� lsiteyi att�k
			}
		}

		System.out.println(gecici); // list olarak istenmeyen elemanlar� haricindekileri burda g�r�r�rz. List olarka
									// yazd�rd�k.

		// sonucu Array olarak istiyorsak �evirme y�ntemi vard�r.
		// Listedekileri yeni Arraye ekle diyebiliriz.

		int yeniArr[] = new int[gecici.size()]; // Eger illaki Array olarak isteniyorsa, yeni bir array olu�turup
												// boyutunu list olarak ayarl�yoruz.

		for (int i = 0; i < yeniArr.length; i++) { // listedekileri for ile yeni arraye aktar�yor...

			yeniArr[i] = gecici.get(i);

		}

		System.out.println(Arrays.toString(yeniArr)); // Yeni Arrayi yazd�rd�k

	}
}
