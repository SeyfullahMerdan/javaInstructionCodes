package day08_IfElseStatement;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		

        Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen yasinizi girin");
		
		long yas=scan.nextLong();
	
		
		if (yas<65) {
		System.out.println("Emekli olamazsin, calismalisin.");	          //  iki durum varsa if else kullanýyoruz
		} else {
        System.out.println("Emekli olabilirsin.");
		}

		
		
		
		scan.close();
		
		
		//  // Soru 3) Kullaniciya yasini sorun, 
        //          eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”, 
        //          65’e esit veya buyukse “Emekli olabilirsin” yazdirin
        //Scanner scan=new Scanner(System.in);
        //System.out.println("lutfen yasýnýzý gýrýnýz:");
        //int yas=scan.nextInt();
        
        
        //if (yas<65) {
        //    System.out.println("emekli olamazsin, calismalisin");
       // } else {
         //   System.out.println("Emekli olabilirsin");
        //}
        
        // scan.close();
		
		
		
		
		

	}

}
