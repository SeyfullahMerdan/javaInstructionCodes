package day03_Scanner;

public class C03_SwapVariables2 {

	public static void main(String[] args) {
		
		/*
		 2- Verilen sayi1 ve sayi2 variable�larinin degerlerini 3.bir
		      variable olmadan degistiren (SWAP) bir program yapiniz
		 */
		
		
		int sayi1=15;
		int sayi2=20;
		
		// baslang�cta sayi1 ve sayi2 bu sekilde
		
		System.out.println("baslangicta sayi1= "+sayi1+" ve sayi2= "+sayi2);
		
		// ucuncu bir variable kullanmayacaksak, verilen iki say�n�n farkindan istifade ediyoruz.
		
		// 1.adim olarak sayilar�n farkini ilk sayiya assign ediyoruz
		
		sayi1= sayi1-sayi2;    // .............bu atama/assign sonucu  sayi1=-5 olurken sayi2=20 (ayn�) kal�yor........
		
		// 2.adim fark ile sayi2 yi toplay�p sayi2 ye assign ediyoruz. 
		
		sayi2=sayi1+sayi2;     // ..............bu atama sonucu sayi1=-5 olurken sayi2=15 oldu......
		
		// 3.ad�m olarak sayi1'e (sayi2-fark) atiyorum.
		
		sayi1=sayi2-sayi1;     //  ..............15-(-5) = 20 olmus oluyor.....		
		
		System.out.println("sonucta sayi1= "+sayi1+" ve sayi2= "+sayi2);
		
		

	}

}
