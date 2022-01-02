package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
        LocalTime saat=LocalTime.now();
		
		System.out.println("Ba�lang�� saati : " + saat);  // Ba�lang�� saati : 21:11:04.573274800
		
		int sayi=10;

		for (int i = 0; i < 10000; i++) {  // I want to see that after how many second its runnig
		   sayi++; 
		}
		
		// System.out.println("Biti� saati : " + saat);    
		// -- Yukar�da olu�turuldu, For Loop i�leminin ka� saniyede yap�ld�g�n� g�remeyiz, bu zaman dilimi 10.sat�rda  olu�tu.
		// E�er i�lemin ka� saniye veya dakika s�rd�g�n� g�rmek istiyorsak i�lemden �nce ve sonra ayr� ayr� LocalTime objesi olu�turmal�y�z****
		
		LocalTime saatBitis=LocalTime.now();		
		System.out.println("Biti� saati : " + saatBitis); // Biti� saati : 21:11:04.582274600

		
		
		double nano1=saat.getNano();		
		double nanoBitis=saatBitis.getNano();
		
		System.out.println("For Loop i�lemini : "  + (nanoBitis-nano1) + " nano saniyede tamamlad�."  );
		
		
		System.out.println(saat.getMinute()); // 29  (.dakika)
		System.out.println(saat.plusMinutes(10000)); // 20:13:27.896646100
		
		System.out.println(saat.minusHours(20));  // 01:34:08.066092200
		
		LocalTime yerelSaat=LocalTime.now(ZoneId.of("Turkey") );
		System.out.println(yerelSaat);      // 23:36:38.039865100
		
		
		


	}

}
