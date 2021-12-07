package day08_IfElseStatement;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		
		    Scanner scan=new Scanner(System.in);
			
			System.out.println("Lutfen bir karakter girin");
			char karakter=scan.next().charAt(0);
			
			
			if ( (karakter>='A' && karakter<='Z' ) || ( karakter>='a' && karakter<='z') ) {
			System.out.println("Girdiğiniz : " + karakter + " bir harftir.");	
			} else {
	        System.out.println("Girdiginiz : " + karakter + " bir harf degildir.");
			}
			
			
			scan.close();

			
			// Soru 2) Kullanicidan bir karakter girmesini isteyin ve 
	        //         girilen karakterin harf olup olmadigini yazdirin
	        
	        // Scanner scan=new Scanner(System.in);
	        // System.out.println("Lutfen bir karekter giriniz");
	        
	        //char karakter=scan.next().charAt(0);
	        
	        //if ((karakter>='A' && karakter<='Z') || (karakter>='a' && karakter<='z')) {
	            
	          //  System.out.println("girdiginiz :" + karakter + " bir harftir");
	        //} else {
	          //  System.out.println("girdiginiz :" + karakter + " bir harf degildir");
	       // }

			
			
		}

	}
