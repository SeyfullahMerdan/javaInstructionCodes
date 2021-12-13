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

			// System.out.print(i + ", "); // 30 dan sonra ,olmamasý için farklý bir yöntem
			// deneyebilriz. Ýf Else ile yaparýz veya aþgýdaki gibi

		}

		System.out.println(); // Alt satýra geçmek için kullandým. Boþ println sadce alt satýra geçmek için
								// kullanýlmaktýr!!!

		for (int i = 10; i <= 29; i++) {
			System.out.print(i + ", "); // Bu þekilde 30un yanýnda virgül olmasýný engelleim.
		}

		System.out.print("30");

	}

}