package day16_forLoops;

public class C02_forLoop {

	public static void main(String[] args) {
		
		

		// Soru 1 ) Ekrana 10 kez �Java guzeldir� yazdirin
		
	
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + ". Java g�zeldir.");          // System.out.println alt sat�ra ge�erek yazd�r�r.
		}
		
		
		for (int i = 0; i <= 10; i++) {
			System.out.print(" " + i + "." + " " + "Java g�zeldir.");   // System.out.print �eklinde yaz�ld�g�nda yanyana yazar
		}
		               // . ve java g�zeldir ayn� t�rnakta daha mant�kl�, gereksiz kod yaz�m� olmama�s a��s�ndan.
		
	}

}
