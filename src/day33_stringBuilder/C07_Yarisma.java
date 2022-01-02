package day33_stringBuilder;

public class C07_Yarisma {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*
		 * For loop ile 1000 defa bir islem yapalim. Oncesinde ve sonrasinda zamani
		 * kontrol edip StringBuilder ve String class�larinin performanslarini
		 * karsilastiralim. 
		 * Ipucu: long TimeSb = System.nanoTime(); kullanalim		 */

		StringBuilder sb = new StringBuilder("Merhaba");
		String str = "Merhaba";
		sb.trimToSize();    // Bo�luklar� ve kapasitesini i�inde olan veriye indirdim,bo�a kapasite tutup
							// h�z� d��meyecek. Length boyutuna indirir. !!!

		long time1 = System.nanoTime();

		for (int i = 0; i < 1000; i++) {
			str += " ";
		}

		long time2 = System.nanoTime();

		long stringSure = time2 - time1;

		long time3 = System.nanoTime();

		for (int i = 0; i < 1000; i++) {
			sb.append(" ");
		}

		long time4 = System.nanoTime();

		long sbSure = time4 - time3;

		if (sbSure > stringSure) {
			System.out.println("String Builder daha h�zl�d�r");
		} else if (sbSure < stringSure) {
			System.out.println("String daha h�zl�d�r");
		} else {
			System.out.println("e�ittir.");
		}

	}

}
