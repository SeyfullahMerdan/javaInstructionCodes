package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
        LocalTime saat=LocalTime.now();
		
		System.out.println("Baþlangýç saati : " + saat);  // Baþlangýç saati : 21:11:04.573274800
		
		int sayi=10;

		for (int i = 0; i < 10000; i++) {  // I want to see that after how many second its runnig
		   sayi++; 
		}
		
		// System.out.println("Bitiþ saati : " + saat);    
		// -- Yukarýda oluþturuldu, For Loop iþleminin kaç saniyede yapýldýgýný göremeyiz, bu zaman dilimi 10.satýrda  oluþtu.
		// Eðer iþlemin kaç saniye veya dakika sürdügünü görmek istiyorsak iþlemden önce ve sonra ayrý ayrý LocalTime objesi oluþturmalýyýz****
		
		LocalTime saatBitis=LocalTime.now();		
		System.out.println("Bitiþ saati : " + saatBitis); // Bitiþ saati : 21:11:04.582274600

		
		
		double nano1=saat.getNano();		
		double nanoBitis=saatBitis.getNano();
		
		System.out.println("For Loop iþlemini : "  + (nanoBitis-nano1) + " nano saniyede tamamladý."  );
		
		
		System.out.println(saat.getMinute()); // 29  (.dakika)
		System.out.println(saat.plusMinutes(10000)); // 20:13:27.896646100
		
		System.out.println(saat.minusHours(20));  // 01:34:08.066092200
		
		LocalTime yerelSaat=LocalTime.now(ZoneId.of("Turkey") );
		System.out.println(yerelSaat);      // 23:36:38.039865100
		
		
		


	}

}
