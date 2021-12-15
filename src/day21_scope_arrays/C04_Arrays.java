package day21_scope_arrays;

import java.util.Arrays;

public class C04_Arrays {

	public static void main(String[] args) {
		
		// Array'in elemanlar�n� yazd�rmak istersek lopp ile yazd�rabiliriz.******************
		int arr[] = {2,4,5,6,78,89 } ;
		// T�m elementleri yazd�rabiliriz.
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");    // Arrayin kendisi degildir bunlar Arrayin elementleridir.
		}
		
		//////////////////// ***************************
		System.out.println("");
		System.out.println(Arrays.toString(arr));   // Elementlerini yazd�rman�n k�sayol methodu. 
		// Ya da Arrays class'�ndan yard�m al�p, direk array olarak yazd�rabiliriz.***********

	}

}
