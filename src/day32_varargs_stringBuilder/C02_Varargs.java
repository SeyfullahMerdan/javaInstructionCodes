package day32_varargs_stringBuilder;

public class C02_Varargs {

	public static void main(String[] args) {

		topla(5, 8, 10);

		// Varargslar list gibi davranýr ama array methodlarý ile çalýþýr.

	}

	private static void topla(int... i) {

		int toplam = 0;

		for (int each : i) {

			toplam += each;

		}

		System.out.println("Girilen sayýlarýn toplamý : " + toplam);

	}

}
