package day08_IfElseStatement;

import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
	
		 Scanner scan=new Scanner(System.in);
			
			System.out.println("Lutfen �cgenin bir kenar uzunlugunu girin");
			double kenar1=scan.nextDouble();
			
	        System.out.println("Lutfen �cgenin diger kenar uzunlugunu girin");
			double kenar2=scan.nextDouble();
			
			System.out.println("Lutfen �cgenin obur kenar uzunlugunu girin");
			double kenar3=scan.nextDouble();
			
			
			
			if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("girilen �lc�ler eskenar �cgendir.");	
			} else {
	        System.out.println("eskenar �cgen degildir.");
			}
			
			// // Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin 
	        //          eger uc kenar uzunlugu birbirine esit ise ekrana �Eskenar ucgen� yazdirin. 
	        //          Diger durumlarda ekrana  �Eskenar degil� yazdirin.
	        
	        //Scanner scan=new Scanner(System.in);
	        //System.out.println("Lutfen �cgenin kenar uzunluklarini yaz�n�z \nilk kenar� girdikten sonra diger kenarlar i�in enter'e bas�n");
	        
	        //double kenar1=scan.nextDouble();
	        //double kenar2=scan.nextDouble();
	        //double kenar3=scan.nextDouble();
	        
	       // if (kenar1==kenar2 && kenar2==kenar3) {
	        //    System.out.println("Eskenar ucgen");
	        //} else {
	         //   System.out.println("Eskenar ucgen degil");
	        //}

		    
			
			scan.close();
	
		
	}

}
