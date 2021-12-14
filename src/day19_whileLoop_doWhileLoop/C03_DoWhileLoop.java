package day19_whileLoop_doWhileLoop;

public class C03_DoWhileLoop {

	public static void main(String[] args) {
		
		
		int i = 0;

		while (i < 5) { // 0 1 2 3 4 0'da ba�lad� kontrol etmeye. Ba�a d�n�p d�n�p 5'e gelene kadar
						// kontrol etti(5 hari�)
			System.out.print(i + " "); // 6 kere kontrol �al��m�� oluyor. 1 kere fazladan kontrol etmi� oluyor asl�nda
										// biz g�rmesek de...
			i++;
		}
		// while loop �nce kontrol eder sonra kodu �al��t�r�r.
		// loop i�nde art�� yap�lsa da bir sonraki kontrole kadar kod �al��maya devam
		// eder.
		// bu da baz� durumalrda hatal� sonu�lara ula�mam�za sebep olabilir.

		System.out.println(" ");

		// do-while loop ise �nce i�lemi yapar ve sonra �art� kontrol eder.
		// �zellikle kullan�c�dan deger almalarda do-while loop tercih edilir.

		int b = 0;
		do {
			System.out.println(b + " "); // 0 1 2 3 4
			b++; // 1 2 3 4 5 -- 5 geldiginde a�ag�ya bakt� ve yukar�ya kodu �al��t�rmaya
					// gitmedi.
		} while (b < 5); // kontrol 5 defa �al��m�� oldu. whilea g�re 1 az �al��t�
	}

}
