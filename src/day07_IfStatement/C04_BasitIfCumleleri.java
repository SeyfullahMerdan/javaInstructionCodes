package day07_IfStatement;

import java.util.Scanner;

public class C04_BasitIfCumleleri {

	public static void main(String[] args) {
		
		// Kullan�c�dan dikd�rtgenin kenar uzunluklar�n� isteyin ve dikt�rgenin kare olup olmad�g�n� yazd�r�n
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen dikd�rtgenin bir kenar uzunlugunu girin");
		double kenar1=scan.nextDouble();
		
        System.out.println("Lutfen dikd�rtgenin diger kenar uzunlugunu girin");
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
		System.out.println("girilen dikd�rtgen kare");
		}
		
		if (kenar1!=kenar2) {
		System.out.println("girilen dikd�rtgen kar degil");
		}
		
	 scan.close();

	}  // main method sonu
 
}  // class sonu
