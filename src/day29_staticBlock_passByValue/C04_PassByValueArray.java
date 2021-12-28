package day29_staticBlock_passByValue;

import java.util.Arrays;

public class C04_PassByValueArray {

	public static void main(String[] args) {

		int sayilar[]= {3,4,5,6};
		elemanDegistir(sayilar);
		
		System.out.println("eleman degi�tir methodundan snra : " + Arrays.toString(sayilar));  // atama kal�c� oldu. 10-4-5-6 oldu.
		
		
		arrayiDegistir(sayilar);
		System.out.println("arrayi degi�tir methodundan sonra : " + Arrays.toString(sayilar));  // Arrayin kendisi degi�medi. Yap�s�,orjinali degi�medi.
		                                                                                          // 10-4-5-6  olarak kald�
	}

	private static void arrayiDegistir(int[] sayilar) {  // Arrayin yap�s�n� kendisini degi�tiriyorum. Orjinalligini.
                                   // Arraye yeni bir uzunluk atad�m,tamam� ile kendisini degi�tirmek istedim 
		sayilar=new int [6];
		System.out.println("arrayi degi�tir methodunda : " + Arrays.toString(sayilar));  // i�indeki elemanlar� degi�tirdik.
		                 //  0-0-0-0-0-0
	}

	private static void elemanDegistir(int[] sayilar) {

		sayilar[0]=10;
		System.out.println("eleman degi�tir methodu i�erisinde: " + Arrays.toString(sayilar));   // 10-4-5-6 oldu. Eleman� degi�ti.
		
		
		
	}

}
