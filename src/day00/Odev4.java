package day00;

import java.util.Scanner;

public class Odev4 {

	public static void main(String[] args) {
		
		
		// Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin.
		 
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi girin");
	    
		double girilenSayi=scan.nextDouble() ;
		
		System.out.println(girilenSayi<=0 ? -1*girilenSayi : girilenSayi);
		
		
		// Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin,
        //         negatifse sayinin karesini yazdirin.
		
		System.out.println(girilenSayi>0 ? "sayi pozitiftir" : girilenSayi*girilenSayi );
		
		
		
		scan.close();
		
		
		
	}

}
