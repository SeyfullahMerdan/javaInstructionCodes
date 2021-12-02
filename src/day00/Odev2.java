package day00;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {

		/*
		  Soru1 ) Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin.
		  Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin.
		  Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin.
		  Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin,
		           negatifse sayinin karesini yazdirin.
		 */

		
	// 1. Soru
		
	//	Scanner scan=new Scanner (System.in);
	//	System.out.println("Lutfen bir sayý giriniz");
	//	double sayi1=scan.nextInt();
	//	System.out.println("Lutfen bir sayý daha giriniz");
	//	double sayi2=scan.nextInt();
		
	//	if (sayi1<sayi2) {
	//		System.out.println("Girdiginiz sayýlardan büyük olmayan sayi : " + sayi1);
	//	} else {
     //       System.out.println("Girdiginiz sayýlardan büyük olmayan sayi : " + sayi2);
	//	}
		
	
		
		// Ternary ile Sonucu verme
		
		Scanner scan1=new Scanner (System.in);
		System.out.println("Lutfen bir sayý giriniz");
		double sayi3=scan1.nextInt();
		System.out.println("Lutfen bir sayý daha giriniz");
		double sayi4=scan1.nextInt();
		
		// System.out.println(sayi3<sayi4? "Girdiginiz sayýlardan büyük olmayan sayi : " +sayi3 : "Girdiginiz sayýlardan büyük olmayan sayi : " +sayi4  );
		
		String sonuc=(sayi3<sayi4) ? "Girdiginiz sayýlardan büyük olmayan sayi : " + sayi3 : "Girdiginiz sayýlardan büyük olmayan sayi : " + sayi4 ;
		System.out.println(sonuc);
		
		
		scan1.close();
		
		
		
		
		
	}

}
