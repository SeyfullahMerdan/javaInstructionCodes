package day40_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Verilen bir int array i�in kullan�c�dan say� isteyin ve girilen 
		// say�y� index oalrak kabul edip o indexteki say�y� yazd�r�n 
		
		int arr[] = { 2,3,5,6,2,7,9,1 };
	
		/* Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen elementi yazd�rmak i�in index giriniz:   ");
		int index=scan.nextInt();	
		System.out.println("Girilen indexteki element: " + arr[index]);  */

		//	Exception -- in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8  
	  	
		//***Burada iki hata alma ihtimalim var** Her ikisi i�in de nas�l yapabilirim???***
		      // 1- ArrayIndexOutOfBoundsException    --- index harici bir say� girebilir.
		      // 2- InputMismatchException            --- negatif girebilir
		
		
	try {                                      // Nested Try Catch yaparak her iki probleminde �n�ne ge�mi� olduk.
		Scanner scan=new Scanner(System.in);
		System.out.println("l�tfen elementi yazd�rmak i�in index giriniz:   ");
		int index=scan.nextInt();
		System.out.println("Girilen indexteki element: " + arr[index]);	
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Girdiginiz index arrayde yok");
	}	catch (InputMismatchException e) {
		System.out.println("Girdiginiz index pozitif tam say� olmal�d�r.");
	}	
		

	}

}
