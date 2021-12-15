package day21_scope_arrays;

public class C02_LoopVariables {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int sayi = 10;

		for (int i = 0; i < 6; i++) {

			String isim = "Ali"; // Loopun i�erisinde variable olu�turuyoruz fakat ayn�s�n� loop d���nda
			System.out.println(sayi + " " + isim); // kullanam�yoruz.
		}

		/*
		 * System.out.println(isim); System.out.println(i);
		 */
		// Her ikisini de loop d���nda kullanamad�k. CTE verdi Java.

		// Loop i�erisinde olu�turulan variablelar loop d���nda kullan�lamazlar.
		// Bunun i�in loop d���nda da ihtiyac�m�z olan bir degi�ken varsa loopdan �nce
		// olu�turur ve emniyette kalmak i�in
		// initialize yapar�z (ilk deger atamas�..) y�zde y�z kullan�lamaz
		// diyemeyiz,garanti olsun diye.

		for (int i = 0; i < args.length; i++) {
			// int sayi=20; Say� variablei main methodda olu�turuldugundan t�m main methodda
			// ge�erlidir dolay�s� ile yeniden ayn� isimde bir variable olu�turamay�z
			String isim = "Veli"; // Bu ba�ka scope yukar�daki ba�ka scopedur. Bu y�zden burada kullanabiliyoruz.

		}

	}

}
