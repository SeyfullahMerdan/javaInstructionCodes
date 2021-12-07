package day00;

import java.util.Scanner;

public class Odev3 {

	public static void main(String[] args) {
		
		// Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin.
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		
		int x=scan.nextInt() ;
	
		String tekMiCiftMi=x%2==0 ? "cift sayi" : "tek sayi" ;
		System.out.println(tekMiCiftMi);
		
	    
		System.out.println(x%2==0 ? "cift sayi" : "tek sayi");
		
		
		
		
		scan.close();
		

	}

}
