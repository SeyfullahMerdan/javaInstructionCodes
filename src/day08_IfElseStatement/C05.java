package day08_IfElseStatement;

import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {

		// Kullanicidan iki say� isteyin.
		// say�lar�n ikisi de pozitif ise say�lar�n toplam�n� yazd�r�n         1
		// say�lar�n ikisi de negatif ise say�lar�n �arp�m�n� yazd�r�n              2 
		// say�lar�n iksi de farkl� i�aretlere sahipse ''farkl� i�aretlerde say�larla i�lem yapamazs�n'' yazd�r�n     3
		// say�lardan s�f�ra e�it olan varsa '' s�f�r �arpmaya g�re yutan elemand�r'' yazd�r�n.                               4
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("L�tfen iki say� giriniz. \n�lk say�y� girdikten sonra Enter tu�una basarak ikinci say�y� giriniz.");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();

         		
		if (sayi1>0 && sayi2>0 ) {
			System.out.println("Say�lar�n toplam� : "+ (sayi1+sayi2));
		} else if (sayi1<0 && sayi2<0) {
            System.out.println("Say�lar�n �arp�m� : "+(sayi1*sayi2)); 
		}  else if ((sayi1<0 && sayi2>0) || (sayi1>0 && sayi2<0)) {                  // sayi*sayi2<0  �eklinde yazsak da olur �art olarak...
            System.out.println("Farkl� i�aretlerde say�larla i�lem yapamazs�n."); 
		}  else  {
            System.out.println("S�f�r �arpmaya g�re yutan elemand�r."); 
		}
		 
		
		scan.close();
		
	}

}
