package day08_IfElseStatement;

import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {

		// Kullanicidan iki sayý isteyin.
		// sayýlarýn ikisi de pozitif ise sayýlarýn toplamýný yazdýrýn         1
		// sayýlarýn ikisi de negatif ise sayýlarýn çarpýmýný yazdýrýn              2 
		// sayýlarýn iksi de farklý iþaretlere sahipse ''farklý iþaretlerde sayýlarla iþlem yapamazsýn'' yazdýrýn     3
		// sayýlardan sýfýra eþit olan varsa '' sýfýr çarpmaya göre yutan elemandýr'' yazdýrýn.                               4
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lütfen iki sayý giriniz. \nÝlk sayýyý girdikten sonra Enter tuþuna basarak ikinci sayýyý giriniz.");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();

         		
		if (sayi1>0 && sayi2>0 ) {
			System.out.println("Sayýlarýn toplamý : "+ (sayi1+sayi2));
		} else if (sayi1<0 && sayi2<0) {
            System.out.println("Sayýlarýn çarpýmý : "+(sayi1*sayi2)); 
		}  else if ((sayi1<0 && sayi2>0) || (sayi1>0 && sayi2<0)) {                  // sayi*sayi2<0  þeklinde yazsak da olur þart olarak...
            System.out.println("Farklý iþaretlerde sayýlarla iþlem yapamazsýn."); 
		}  else  {
            System.out.println("Sýfýr çarpmaya göre yutan elemandýr."); 
		}
		 
		
		scan.close();
		
	}

}
