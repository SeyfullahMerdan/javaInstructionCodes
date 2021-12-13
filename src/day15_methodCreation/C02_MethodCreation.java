package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		
		/*
		 --Kullaniciya kac sayi toplamak istedigini sorun.
		 --Kullanici 2,3 veya 4 degerini
		 * girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini
		 * yazdirin.
		 --Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse “Cok
		   sayi girdiniz, ben toplayamam” yazdirin.
		 */

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen toplamak istediginizi sayý adedini 2,3 veya 4'den birisi olarak seçin");
		
		int tercih=scan.nextInt();
		
		
		
		if (tercih>4) {
			tercih=5;
		}
		
		switch (tercih) {
		case 2:
			ikisayi();
			break;
       case 3:
			ucsayi();
			break;
       case 4:
       	   dortsayi();
	        break;
			
       case 5:
       	System.out.println("çok sayý girdiniz. Ben toplayamam.");
	        break;
	        
		default:
			System.out.println("Geçersiz giriþ yaptýnýz.");
			break;
		}
		
		
	scan.close();
	
	}

	public static void dortsayi() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen dört sayý girin\nHer sayýdan sonra Enter'a basýn.");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();

		System.out.println("Girdiginiz dört sayýnýn toplamý: "+(sayi1+sayi2+sayi3+sayi4));
		
		scan.close();

		
	}

	public static void ucsayi() {

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen üç sayý girin\nHer sayýdan sonra Enter'a basýn.");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		
		System.out.println("Girdiginiz üç sayýnýn toplamý: "+(sayi1+sayi2+sayi3));
		
		scan.close();
		
		
		
		
	}

	public static void ikisayi() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen iki sayý girin\nHer sayýdan sonra Enter'a basýn.");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("Girdiginiz iki sayýnýn toplamý: "+(sayi1+sayi2));
		
		scan.close();

		
		
	}

}
