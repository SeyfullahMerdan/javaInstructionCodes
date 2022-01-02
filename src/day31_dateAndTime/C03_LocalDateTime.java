package day31_dateAndTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
	
		
		LocalDateTime tarihSaat= LocalDateTime.now();     // hem zaman� hem tarihi birlikte g�sterir.
		System.out.println(tarihSaat);         // 2021-12-02T21:39:31.226196400


		tarihSaat.toString();  // Stringe �eviririz bu �ekilde String methodlar� kullanabiliriz.
		
		System.out.println(tarihSaat.toString().startsWith("2021"));  // true
		
		


	}

}
