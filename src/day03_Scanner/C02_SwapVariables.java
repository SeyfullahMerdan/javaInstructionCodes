package day03_Scanner;

public class C02_SwapVariables {

	public static void main(String[] args) {

		/*
		 * 1- Verilen sayi1 ve sayi2 variable�larinin degerlerini degistiren (SWAP) bir
		   program yaziniz
		   
		   Orn : sayi1=10 ve sayi2=20; 
		   kod calistiktan sonra sayi1=20 ve
		   sayi2=10 
		   
		 */

		int sayi1=10;
		int sayi2=20;
		
		System.out.println( "baslangicta sayi1=" + sayi1 + " ve sayi2=" + sayi2 );
		
		// ilk �nce bos bir variable olusturual�m.
		
		int bos;
		
		// sayi2 yi bos variable a atayacag�z
		
		bos=sayi2;  // �nce variable olusturduk sonra deger atamas� yapt�k, iilla tek sat�rda atama yapmaya gerek yok.
		
		
		// sayi2 variable �na sayi1 degerini atayacag�z.
		
		
		sayi2=sayi1;
		
		// bos variable daki degeri sayi1 e atayacag�z.
		
		
		sayi1=bos;
		
		
		System.out.println("sonucta sayi1= "+sayi1+" ve sayi2= "+sayi2);
		
		
		
	}

}
