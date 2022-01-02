package day32_varargs_stringBuilder;

public class C05_Varargs {

	public static void main(String[] args) {

		// KafanaGoreTopla(5,10,13,0, "Ali Can");

		/*
		 * Varargsdan �nce farkl� parametreler kullan�labilir*** ama varargsdan sonra
		 * parametre yaz�lamaz yazarsan�z java varargs son parametre olmal�d�r diye sizi
		 * uyar�r ve CTE verir
		 */

		KafanaGoreTopla("Ali Can", 5, 10, 13, 0);
	}

	private static void KafanaGoreTopla(String string, int... i) {
		int toplam = 0;
		for (int each : i) {
			toplam += each;
		}
		System.out.println("�lk say� ile digerlerinin toplam�n�n �arp�m� : " + string + toplam);
	}

	/*
	 * private static void KafanaGoreTopla(int...sayilar , String sonparametre) {
	 * 
	 * int toplam=0;
	 * 
	 * for (int each : sayilar) { toplam+=each; }
	 * System.out.println("�lk say� ile digerlerinin toplam�n�n �arp�m� : " + sayi1
	 * * toplam); }
	 */

}
