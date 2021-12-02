package day07_IfStatement;

import java.util.Scanner;

public class C02_BasitIfCumleleri {

	public static void main(String[] args) {
		
		 // Bir tam sayi isteyin ve tek mi cift mi oldugunu yazýdýrýn.
		
		 Scanner scan=new Scanner(System.in);
	     System.out.println("Lutfen bir tam sayi giriniz");
		 double sayi=scan.nextDouble();
		 
		 
		if (sayi%2==0) {
		System.out.println("girdiginiz sayi cift bir sayi");
		} else {
			
		}
		
		
      scan.close();
	}

}
