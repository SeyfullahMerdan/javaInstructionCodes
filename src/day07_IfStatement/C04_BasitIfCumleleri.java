package day07_IfStatement;

import java.util.Scanner;

public class C04_BasitIfCumleleri {

	public static void main(String[] args) {
		
		// Kullanýcýdan dikdörtgenin kenar uzunluklarýný isteyin ve diktörgenin kare olup olmadýgýný yazdýrýn
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen dikdörtgenin bir kenar uzunlugunu girin");
		double kenar1=scan.nextDouble();
		
        System.out.println("Lutfen dikdörtgenin diger kenar uzunlugunu girin");
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
		System.out.println("girilen dikdörtgen kare");
		}
		
		if (kenar1!=kenar2) {
		System.out.println("girilen dikdörtgen kar degil");
		}
		
	 scan.close();

	}  // main method sonu
 
}  // class sonu
