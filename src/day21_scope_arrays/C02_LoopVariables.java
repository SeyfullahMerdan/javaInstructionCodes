package day21_scope_arrays;

public class C02_LoopVariables {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int sayi = 10;

		for (int i = 0; i < 6; i++) {

			String isim = "Ali"; // Loopun içerisinde variable oluþturuyoruz fakat aynýsýný loop dýþýnda
			System.out.println(sayi + " " + isim); // kullanamýyoruz.
		}

		/*
		 * System.out.println(isim); System.out.println(i);
		 */
		// Her ikisini de loop dýþýnda kullanamadýk. CTE verdi Java.

		// Loop içerisinde oluþturulan variablelar loop dýþýnda kullanýlamazlar.
		// Bunun için loop dýþýnda da ihtiyacýmýz olan bir degiþken varsa loopdan önce
		// oluþturur ve emniyette kalmak için
		// initialize yaparýz (ilk deger atamasý..) yüzde yüz kullanýlamaz
		// diyemeyiz,garanti olsun diye.

		for (int i = 0; i < args.length; i++) {
			// int sayi=20; Sayý variablei main methodda oluþturuldugundan tüm main methodda
			// geçerlidir dolayýsý ile yeniden ayný isimde bir variable oluþturamayýz
			String isim = "Veli"; // Bu baþka scope yukarýdaki baþka scopedur. Bu yüzden burada kullanabiliyoruz.

		}

	}

}
