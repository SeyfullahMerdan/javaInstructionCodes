package day40_exceptions;

import java.util.Scanner;

public class C08_IllegalArgumentException {

	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Nas�l bilin�li olarak javaya bir exception f�rlatt�rabiliriz?***
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen konsolda g�rmek i�in ya��n�z� giriniz: ");
		int yas=scan.nextInt();
		
		try {
			
			if (yas<0) {
			   throw new IllegalArgumentException(); // constructord�r
			} else {                   // yeni bir objedir, objenin degeridir.
				System.out.println(yas);
			}
			//diger thwrows ile class adlar� kullan�l�yor ve body i�inde degilde signature da oluyor.
			
			
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("ne ettin agam, b�yle ya� m� olur");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
