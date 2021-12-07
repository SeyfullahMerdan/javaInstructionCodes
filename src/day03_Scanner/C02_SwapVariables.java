package day03_Scanner;

public class C02_SwapVariables {

	public static void main(String[] args) {

		/*
		 * 1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir
		   program yaziniz
		   
		   Orn : sayi1=10 ve sayi2=20; 
		   kod calistiktan sonra sayi1=20 ve
		   sayi2=10 
		   
		 */

		int sayi1=10;
		int sayi2=20;
		
		System.out.println( "baslangicta sayi1=" + sayi1 + " ve sayi2=" + sayi2 );
		
		// ilk önce bos bir variable olusturualým.
		
		int bos;
		
		// sayi2 yi bos variable a atayacagýz
		
		bos=sayi2;  // Önce variable olusturduk sonra deger atamasý yaptýk, iilla tek satýrda atama yapmaya gerek yok.
		
		
		// sayi2 variable ýna sayi1 degerini atayacagýz.
		
		
		sayi2=sayi1;
		
		// bos variable daki degeri sayi1 e atayacagýz.
		
		
		sayi1=bos;
		
		
		System.out.println("sonucta sayi1= "+sayi1+" ve sayi2= "+sayi2);
		
		
		
	}

}
