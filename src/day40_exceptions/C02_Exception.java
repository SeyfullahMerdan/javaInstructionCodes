package day40_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exception {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		// Kullanýcýdan istedigi kadar sayý alýp bu sayýlarý toplayan
		// bir program yazýnýz.
		// Sayý giriþini bitirmek için q'ya basýnýz.
		
		
		int count=0;
		int sayi=0;
		int toplam=0;
		String secim="";
		
		Scanner scan=new Scanner(System.in); // InputMismatchException hatasý verecekse try catch bloguna bunu yazacaðýz!*
		
		try {
			while (count<10000) {
			//while (!secim.equalsIgnoreCase("q")) {
				
				System.out.println("lütfen toplamak için bir sayý giriniz:\nArdýndan bitirmek için sayý dýþýnda bir tuþa basýnýz  ");
				sayi=scan.nextInt();
				toplam+=sayi;
				count++;  // Buraya bir count ekledim, kullancý girebildigi kadar girsin
			}	
		} catch (InputMismatchException e) {
			System.out.println("Toplam: " + toplam);	
		}
		
		System.out.println("Toplam: " + toplam);	// hem catch hem sonrasý çalýþtý
	// Exceptionlarý kontrol altýna alýyoruz***
		
		
		
		
		
	}
}
