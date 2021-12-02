package day05_Matematiksel�slemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {

		/*
		 kullanicidan 3 basamakli bir sayi alip rakamlar toplamini yazdiran bir
		 program yaziniz
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen 3 basamakl� bir say� giriniz.");
		
		int sayi=scan.nextInt();
		
		// sayi 573 olsun  --- bu �rnek �zerinden gidelim.
		
		int rakamlarToplami=0;         // tek tek rakamlar� ay�r�p, bu rakamlarToplam�na aktaracag�z. Do�al olarak rakamlar�n toplam� olacak
		
		int rakam=sayi%10;             // 10 b�l�m�nden kalan bana 1'ler basamag�n� -3- verir.
		System.out.println(rakam);
		rakamlarToplami+=rakam;        //Increment yapt�k. Rakamlar toplam� 3 oldu.   
		                               // Say�m degi�medi. Atama yapmad�m hala 573. Fakat rakamlarToplami degi�ti,�uanda 3 -atama yapt�m ��nk�.
		
		
		
		// 3'ten kurtulmak istiyorum ��nk� 3 ile i�im bitti.
		// say�y� 57 haline getirecem.
		
		
		sayi/=10;                              //   �ncrement yapt�k ve  ayn� zamanda say�ya yeni deger atad�k
		System.out.println(sayi);               // 573 � 10 a b�ld� ve 53,7 buldu ancak INT oldugu i�in virg�l� almad� ve 57 kald�.
		
		rakam=sayi%10;
		
		
		rakamlarToplami+=rakam; 
		
		// sayi hala 57. 7 yi ald�k burada ve rakamlarToplam� konteyn�r�na att�k.
		//�imdi 7'den kurtuacag�z.
		
		sayi/=10;
		 // say� art�k 5. ��nk� virg�l� almaz ve tam olarak 5 yazar. T�r� Int oldugu i�in.
		
		// ***** System.out.println(sayi); ****
		
		
		rakamlarToplami+=sayi;
		
		
		System.out.println("Girdiginiz sayinin rakamlar toplam� : " + rakamlarToplami);
		
		scan.close();
		
	}

}
