package day21_scope_arrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {

		// Verilen bir array’in tum elemanlarini toplayan bir program yazalim.

		int arr[] = { 3, 5, 8, 75, 38, 20 };

		int toplam = 0;

		for (int i = 0; i < arr.length; i++) {

			toplam += arr[i];

		}
		System.out.println("Elementlerin toplamý : " + toplam + "'dir.");

		////////////////////////// *****************************************/////
		// Array'in tüm elemanlarýný önce küçükten büyüge sonra büyükten küçüge//
		////////////////////////// yazdýrýnýz.///////////////////////////////////

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// Büyükten küçüðe A-dan Z-ye
		// Ya for loop ile elementleri ters sýrada yzdýrýrýz.

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		// array yapmak isterseniz ayný uzunlukta bir arrray oluþturup
		// elemanlarý ters sýrada yeni arraye tasýyabilrisiniz.

		int tersArray[] = new int[arr.length];

		for (int i = 0; i < tersArray.length; i++) {
			tersArray[i] = arr[arr.length - 1 - i];
		}

		System.out.println(Arrays.toString(tersArray));

	}

}
