package day29_staticBlock_passByValue;

import java.util.Arrays;

public class C04_PassByValueArray {

	public static void main(String[] args) {

		int sayilar[]= {3,4,5,6};
		elemanDegistir(sayilar);
		
		System.out.println("eleman degiþtir methodundan snra : " + Arrays.toString(sayilar));  // atama kalýcý oldu. 10-4-5-6 oldu.
		
		
		arrayiDegistir(sayilar);
		System.out.println("arrayi degiþtir methodundan sonra : " + Arrays.toString(sayilar));  // Arrayin kendisi degiþmedi. Yapýsý,orjinali degiþmedi.
		                                                                                          // 10-4-5-6  olarak kaldý
	}

	private static void arrayiDegistir(int[] sayilar) {  // Arrayin yapýsýný kendisini degiþtiriyorum. Orjinalligini.
                                   // Arraye yeni bir uzunluk atadým,tamamý ile kendisini degiþtirmek istedim 
		sayilar=new int [6];
		System.out.println("arrayi degiþtir methodunda : " + Arrays.toString(sayilar));  // içindeki elemanlarý degiþtirdik.
		                 //  0-0-0-0-0-0
	}

	private static void elemanDegistir(int[] sayilar) {

		sayilar[0]=10;
		System.out.println("eleman degiþtir methodu içerisinde: " + Arrays.toString(sayilar));   // 10-4-5-6 oldu. Elemaný degiþti.
		
		
		
	}

}
