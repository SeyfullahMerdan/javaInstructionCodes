package day07_IfStatement;

import java.util.Scanner;

public class C03_BasitIfCumleleri {

	public static void main(String[] args) {
		
		/*
         * Soru 3) Kullanicidan gun ismini alin ve 
         * haftaici veya hafta sonu oldugunu yazdirin 
            Ornek:      gun=Pazar output = �Hafta sonu�
                        gun=Sali output = �Hafta ici�
         *** String icin equals method�unu kullanin
         */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gun ismi giriniz.");
		String gun=scan.next().toLowerCase();       // ikinci kelimeyi almas�n� istemedim. next yazd�m....
		
		if (gun.equals("pazar")||gun.equals("cumartesi")) {
			System.out.println("Hafta sonu");
		}
	
		
		// if (gun != "PAZAR") { 
		// System.out.println("pazar degil");	  // String matematiksel bir i�lem gbi == her zamn dogru cevab� vermez...
		// } 
		
		// String non primitive oldugu i�in == kulan�lamaz bunun yerine equals metodu kullan�lmal�d�r
		
		
		if (gun.equals("pazartesi")||gun.equals("sali")||gun.equals("carsamba")||gun.equals("persembe")||gun.equals("cuma")) {
			System.out.println("Hafta ici");
			} //system sonu
	

	
		
		scan.close();
		
		} // main sonu

} //class sonu
