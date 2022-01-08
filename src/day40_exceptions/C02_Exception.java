package day40_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exception {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		// Kullan�c�dan istedigi kadar say� al�p bu say�lar� toplayan
		// bir program yaz�n�z.
		// Say� giri�ini bitirmek i�in q'ya bas�n�z.
		
		
		int count=0;
		int sayi=0;
		int toplam=0;
		String secim="";
		
		Scanner scan=new Scanner(System.in); // InputMismatchException hatas� verecekse try catch bloguna bunu yazaca��z!*
		
		try {
			while (count<10000) {
			//while (!secim.equalsIgnoreCase("q")) {
				
				System.out.println("l�tfen toplamak i�in bir say� giriniz:\nArd�ndan bitirmek i�in say� d���nda bir tu�a bas�n�z  ");
				sayi=scan.nextInt();
				toplam+=sayi;
				count++;  // Buraya bir count ekledim, kullanc� girebildigi kadar girsin
			}	
		} catch (InputMismatchException e) {
			System.out.println("Toplam: " + toplam);	
		}
		
		System.out.println("Toplam: " + toplam);	// hem catch hem sonras� �al��t�
	// Exceptionlar� kontrol alt�na al�yoruz***
		
		
		
		
		
	}
}
