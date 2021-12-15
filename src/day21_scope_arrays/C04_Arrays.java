package day21_scope_arrays;

import java.util.Arrays;

public class C04_Arrays {

	public static void main(String[] args) {
		
		// Array'in elemanlarýný yazdýrmak istersek lopp ile yazdýrabiliriz.******************
		int arr[] = {2,4,5,6,78,89 } ;
		// Tüm elementleri yazdýrabiliriz.
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");    // Arrayin kendisi degildir bunlar Arrayin elementleridir.
		}
		
		//////////////////// ***************************
		System.out.println("");
		System.out.println(Arrays.toString(arr));   // Elementlerini yazdýrmanýn kýsayol methodu. 
		// Ya da Arrays class'ýndan yardým alýp, direk array olarak yazdýrabiliriz.***********

	}

}
