package day21_scope_arrays;

import java.util.Arrays;

public class C05_Arrays {

	public static void main(String[] args) {
	
		// Verilen 3 elemanli bir array�in tum elemanlarini bir soldaki konuma tasiyacak
		// bir program yazin. Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.

		int arr[] = { 1, 2, 3, 4, 5 }; // 3 element vermek zorunda degilim, 5 element verdim.
		int kova = arr[0]; // �nce 1'i kenara ay�rd�m, ge�i�i bir kovaya-konteyn�ra koyarak. Digerlerini
							// kayd�racam Loop ile.

		for (int i = 0; i < arr.length - 1; i++) { // arr[0]=arr[1] olsun diyecem..

			arr[i] = arr[i + 1]; // arr[0]=2 ; arr[2]=3 ; arr[3]=4... �eklinde gidecek

		}
		arr[arr.length - 1] = kova; // Son elementin indexi // Yukar�dan a�ag� �al���yor java,kaybolmas�n �ld�rmesin
									// diye ay�rd�m en son sona ekledim***
		System.out.println(Arrays.toString(arr));

	}

}
