package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MDArrays {

	public static void main(String[] args) {

		// MultiDimensional Arrayler içiçe koyulmuþ Arrayler demektir. Array oluþturmak
		// için iki yöntem vardýr:
		// 1. Yöntem: Önce deklare sonra deger atama

		int arr[][] = new int[3][2]; // Outer 3 -- Ýnner 2 elemanlý

		// System.out.println(Arrays.toString(arr)); // Yazdýgým zaman içeridekileri
		// yazdýrmaya çalýþýyor ama referanslarý yazýyor.
		// arrayin kendisini yazdýrýyor ama içindekileri yazdýrmak için parantezli
		// yazacagýz.

		System.out.println(Arrays.toString(arr[1])); // içindekileri yazdý. Primitive oldugu için parantez ihtiyacýmýz
														// var.
		System.out.println(Arrays.toString(arr[2])); // 2 .elementi yazdýrdý. non primitive oldugu için referns
														// yazdýrýyor***

		System.out.println(Arrays.deepToString(arr)); // [[0, 0], [0, 0], [0, 0]]

		arr[0][1] = 5; // içindeki elementleri degiþtirdik deger atamsý yaptýk
		arr[1][0] = 2;
		arr[2][1] = 3;

		System.out.println(Arrays.deepToString(arr)); // [[0, 5], [2, 0], [0, 3]]

		int arr2[][] = { { 0 }, { 1, 2, 3 }, { 6, 7, 8, 9 } };

		System.out.println(Arrays.deepToString(arr2)); // [[0], [1, 2, 3], [6, 7, 8, 9]]
		System.out.println(Arrays.toString(arr2[1])); // [1, 2, 3]
		System.out.println(arr2[2][1]); // 7

	}

}
