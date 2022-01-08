package day40_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// Verilen bir int array için kullanýcýdan sayý isteyin ve girilen 
		// sayýyý index oalrak kabul edip o indexteki sayýyý yazdýrýn 
		
		int arr[] = { 2,3,5,6,2,7,9,1 };
	
		/* Scanner scan=new Scanner(System.in);
		System.out.println("lütfen elementi yazdýrmak için index giriniz:   ");
		int index=scan.nextInt();	
		System.out.println("Girilen indexteki element: " + arr[index]);  */

		//	Exception -- in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8  
	  	
		//***Burada iki hata alma ihtimalim var** Her ikisi için de nasýl yapabilirim???***
		      // 1- ArrayIndexOutOfBoundsException    --- index harici bir sayý girebilir.
		      // 2- InputMismatchException            --- negatif girebilir
		
		
	try {                                      // Nested Try Catch yaparak her iki probleminde önüne geçmiþ olduk.
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen elementi yazdýrmak için index giriniz:   ");
		int index=scan.nextInt();
		System.out.println("Girilen indexteki element: " + arr[index]);	
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Girdiginiz index arrayde yok");
	}	catch (InputMismatchException e) {
		System.out.println("Girdiginiz index pozitif tam sayý olmalýdýr.");
	}	
		

	}

}
