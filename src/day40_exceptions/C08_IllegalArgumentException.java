package day40_exceptions;

import java.util.Scanner;

public class C08_IllegalArgumentException {

	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Nasýl bilinçli olarak javaya bir exception fýrlattýrabiliriz?***
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen konsolda görmek için yaþýnýzý giriniz: ");
		int yas=scan.nextInt();
		
		try {
			
			if (yas<0) {
			   throw new IllegalArgumentException(); // constructordýr
			} else {                   // yeni bir objedir, objenin degeridir.
				System.out.println(yas);
			}
			//diger thwrows ile class adlarý kullanýlýyor ve body içinde degilde signature da oluyor.
			
			
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("ne ettin agam, böyle yaþ mý olur");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
