package day32_varargs_stringBuilder;

public class C05_Varargs {

	public static void main(String[] args) {

		// KafanaGoreTopla(5,10,13,0, "Ali Can");

		/*
		 * Varargsdan önce farklý parametreler kullanýlabilir*** ama varargsdan sonra
		 * parametre yazýlamaz yazarsanýz java varargs son parametre olmalýdýr diye sizi
		 * uyarýr ve CTE verir
		 */

		KafanaGoreTopla("Ali Can", 5, 10, 13, 0);
	}

	private static void KafanaGoreTopla(String string, int... i) {
		int toplam = 0;
		for (int each : i) {
			toplam += each;
		}
		System.out.println("Ýlk sayý ile digerlerinin toplamýnýn çarpýmý : " + string + toplam);
	}

	/*
	 * private static void KafanaGoreTopla(int...sayilar , String sonparametre) {
	 * 
	 * int toplam=0;
	 * 
	 * for (int each : sayilar) { toplam+=each; }
	 * System.out.println("Ýlk sayý ile digerlerinin toplamýnýn çarpýmý : " + sayi1
	 * * toplam); }
	 */

}
