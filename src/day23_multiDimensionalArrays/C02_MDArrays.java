package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MDArrays {

	public static void main(String[] args) {

		// MultiDimensional Arrayler i�i�e koyulmu� Arrayler demektir. Array olu�turmak
		// i�in iki y�ntem vard�r:
		// 1. Y�ntem: �nce deklare sonra deger atama

		int arr[][] = new int[3][2]; // Outer 3 -- �nner 2 elemanl�

		// System.out.println(Arrays.toString(arr)); // Yazd�g�m zaman i�eridekileri
		// yazd�rmaya �al���yor ama referanslar� yaz�yor.
		// arrayin kendisini yazd�r�yor ama i�indekileri yazd�rmak i�in parantezli
		// yazacag�z.

		System.out.println(Arrays.toString(arr[1])); // i�indekileri yazd�. Primitive oldugu i�in parantez ihtiyac�m�z
														// var.
		System.out.println(Arrays.toString(arr[2])); // 2 .elementi yazd�rd�. non primitive oldugu i�in referns
														// yazd�r�yor***

		System.out.println(Arrays.deepToString(arr)); // [[0, 0], [0, 0], [0, 0]]

		arr[0][1] = 5; // i�indeki elementleri degi�tirdik deger atams� yapt�k
		arr[1][0] = 2;
		arr[2][1] = 3;

		System.out.println(Arrays.deepToString(arr)); // [[0, 5], [2, 0], [0, 3]]

		int arr2[][] = { { 0 }, { 1, 2, 3 }, { 6, 7, 8, 9 } };

		System.out.println(Arrays.deepToString(arr2)); // [[0], [1, 2, 3], [6, 7, 8, 9]]
		System.out.println(Arrays.toString(arr2[1])); // [1, 2, 3]
		System.out.println(arr2[2][1]); // 7

	}

}
