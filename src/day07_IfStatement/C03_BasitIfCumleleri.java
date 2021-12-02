package day07_IfStatement;

import java.util.Scanner;

public class C03_BasitIfCumleleri {

	public static void main(String[] args) {
		
		/*
         * Soru 3) Kullanicidan gun ismini alin ve 
         * haftaici veya hafta sonu oldugunu yazdirin 
            Ornek:      gun=Pazar output = “Hafta sonu”
                        gun=Sali output = “Hafta ici”
         *** String icin equals method’unu kullanin
         */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gun ismi giriniz.");
		String gun=scan.next().toLowerCase();       // ikinci kelimeyi almasýný istemedim. next yazdým....
		
		if (gun.equals("pazar")||gun.equals("cumartesi")) {
			System.out.println("Hafta sonu");
		}
	
		
		// if (gun != "PAZAR") { 
		// System.out.println("pazar degil");	  // String matematiksel bir iþlem gbi == her zamn dogru cevabý vermez...
		// } 
		
		// String non primitive oldugu için == kulanýlamaz bunun yerine equals metodu kullanýlmalýdýr
		
		
		if (gun.equals("pazartesi")||gun.equals("sali")||gun.equals("carsamba")||gun.equals("persembe")||gun.equals("cuma")) {
			System.out.println("Hafta ici");
			} //system sonu
	

	
		
		scan.close();
		
		} // main sonu

} //class sonu
