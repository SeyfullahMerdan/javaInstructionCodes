package day16_forLoops;

public class C03_forLoop {

	public static void main(String[] args) {
	
		// Soru 2 ) 10 ile 30 arasindaki (10-30 dahil) sayilari aralarinda virgul olarak
		// ayni satirda yazdirin

		for (int i = 10; i <= 30; i++) {

			if (i == 30) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}

			// System.out.print(i + ", "); // 30 dan sonra ,olmamas� i�in farkl� bir y�ntem
			// deneyebilriz. �f Else ile yapar�z veya a�g�daki gibi

		}

		System.out.println(); // Alt sat�ra ge�mek i�in kulland�m. Bo� println sadce alt sat�ra ge�mek i�in
								// kullan�lmakt�r!!!

		for (int i = 10; i <= 29; i++) {
			System.out.print(i + ", "); // Bu �ekilde 30un yan�nda virg�l olmas�n� engelleim.
		}

		System.out.print("30");

	}

}