package day19_whileLoop_doWhileLoop;

public class C03_DoWhileLoop {

	public static void main(String[] args) {
		
		
		int i = 0;

		while (i < 5) { // 0 1 2 3 4 0'da baþladý kontrol etmeye. Baþa dönüp dönüp 5'e gelene kadar
						// kontrol etti(5 hariç)
			System.out.print(i + " "); // 6 kere kontrol çalýþmýþ oluyor. 1 kere fazladan kontrol etmiþ oluyor aslýnda
										// biz görmesek de...
			i++;
		}
		// while loop önce kontrol eder sonra kodu çalýþtýrýr.
		// loop içnde artýþ yapýlsa da bir sonraki kontrole kadar kod çalýþmaya devam
		// eder.
		// bu da bazý durumalrda hatalý sonuçlara ulaþmamýza sebep olabilir.

		System.out.println(" ");

		// do-while loop ise önce iþlemi yapar ve sonra þartý kontrol eder.
		// özellikle kullanýcýdan deger almalarda do-while loop tercih edilir.

		int b = 0;
		do {
			System.out.println(b + " "); // 0 1 2 3 4
			b++; // 1 2 3 4 5 -- 5 geldiginde aþagýya baktý ve yukarýya kodu çalýþtýrmaya
					// gitmedi.
		} while (b < 5); // kontrol 5 defa çalýþmýþ oldu. whilea göre 1 az çalýþtý
	}

}
