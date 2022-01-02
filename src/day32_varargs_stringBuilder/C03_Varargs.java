package day32_varargs_stringBuilder;

public class C03_Varargs {

	public static void main(String[] args) {
	

		KafanaGoreTopla(5,10,13,0);

	}

	
	private static void KafanaGoreTopla( int sayi1, int... sayilar) {
		
		int toplam=0;
		
		for (int each : sayilar) {
			toplam+=each;             // sayi1 i dahil etmedim , onu almayacak.
		}
		System.out.println("Ýlk sayý ile digerlerinin toplamýnýn çarpýmý : " + sayi1 * toplam);
	}

	
}
