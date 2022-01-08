package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05_ParentChildExceptions {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		
		
		try {
			
			FileInputStream fis=new FileInputStream("src\\day40\\yazi");
			int k=0; // Diger problemi tamam halledecem ama ya baþka çýkýnca ne yaapcam diyor java?
			while((k=fis.read())!=-1){ // Buldum ama okuyamazsam ne yaapcam diyor? 
				System.out.println((char)k);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace(); // Hata yazýlarýný da consolda gösteriyor.
		
		} catch (IOException e) { // önce bunu yazasak spesifik hatayý göremeyiz. 
			// Birden fazla catchde önce daha spesifik olaný yazmak gerekiyor
			
		}

		System.out.println("Görev Tamamlandý.");


	
	}

}
