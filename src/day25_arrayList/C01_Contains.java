package day25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {
		
		// Verilen bir array'de tekrar eden elementleri sadece birer tane yazarak unique
		// elementlerden olu�an bir array haline getirelim.

		int arr[] = { 2, 3, 5, 4, 3, 2, 6, 7, 2, 8, 5, 6, 9 };  // 2 3 5 4 6 7 8 9 biz bu hale gelmesini istiyoruz.

		List<Integer> tekrarsiz = new ArrayList<>();  // list yapt�m i�ine atacam ayn� degilse

		for (int i = 0; i < arr.length; i++) {  // for ile arrayden getirip listin i�inde yoksa at diyecem
			if (!tekrarsiz.contains(arr[i])) {
				tekrarsiz.add(arr[i]);
			}
		}

		System.out.println(tekrarsiz);

		int tekrarsizArray[] = new int[tekrarsiz.size()]; // Yeni bir Array olu�turdum. 0,0,0,0,0,0,0,0 �eklinde �uanda.
		// Arrayde kendi at�yordu.

		for (int i = 0; i < tekrarsizArray.length; i++) {

			tekrarsizArray[i] = tekrarsiz.get(i); // loopun i�inde s�ras� ile indexlere ATAMA yaparak arraye att�m.!!**

		}

		System.out.println(Arrays.toString(tekrarsizArray)); // Listeledik sonra yeni arraye aktard�k.

	}

}
