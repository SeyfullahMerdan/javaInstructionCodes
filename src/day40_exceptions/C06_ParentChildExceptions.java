package day40_exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class C06_ParentChildExceptions {

	public static void main(String[] args) {

		try {

			@SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream("src\\day40\\yazi");
			int k = 0; // Diger problemi tamam halledecem ama ya baþka çýkýnca ne yaapcam diyor java?
			while ((k = fis.read()) != -1) { // Buldum ama okuyamazsam ne yaapcam diyor?
				System.out.println((char) k);
			}

		} catch (IOException e) {

			e.printStackTrace(); // Hata yazýlarýný da consolda gösteriyor.

		} 

		System.out.println("");
		System.out.println("Görev Tamamlandý.");

	}

}
