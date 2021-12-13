package day16_forLoops;

public class C02_forLoop {

	public static void main(String[] args) {
		
		

		// Soru 1 ) Ekrana 10 kez “Java guzeldir” yazdirin
		
	
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + ". Java güzeldir.");          // System.out.println alt satýra geçerek yazdýrýr.
		}
		
		
		for (int i = 0; i <= 10; i++) {
			System.out.print(" " + i + "." + " " + "Java güzeldir.");   // System.out.print þeklinde yazýldýgýnda yanyana yazar
		}
		               // . ve java güzeldir ayný týrnakta daha mantýklý, gereksiz kod yazýmý olmamaýs açýsýndan.
		
	}

}
