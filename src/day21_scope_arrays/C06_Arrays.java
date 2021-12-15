package day21_scope_arrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {

		// Verilen bir array�in tum elemanlarini toplayan bir program yazalim.

		int arr[] = { 3, 5, 8, 75, 38, 20 };

		int toplam = 0;

		for (int i = 0; i < arr.length; i++) {

			toplam += arr[i];

		}
		System.out.println("Elementlerin toplam� : " + toplam + "'dir.");

		////////////////////////// *****************************************/////
		// Array'in t�m elemanlar�n� �nce k���kten b�y�ge sonra b�y�kten k���ge//
		////////////////////////// yazd�r�n�z.///////////////////////////////////

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// B�y�kten k����e A-dan Z-ye
		// Ya for loop ile elementleri ters s�rada yzd�r�r�z.

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		// array yapmak isterseniz ayn� uzunlukta bir arrray olu�turup
		// elemanlar� ters s�rada yeni arraye tas�yabilrisiniz.

		int tersArray[] = new int[arr.length];

		for (int i = 0; i < tersArray.length; i++) {
			tersArray[i] = arr[arr.length - 1 - i];
		}

		System.out.println(Arrays.toString(tersArray));

	}

}
