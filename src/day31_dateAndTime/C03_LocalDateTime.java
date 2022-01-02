package day31_dateAndTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
	
		
		LocalDateTime tarihSaat= LocalDateTime.now();     // hem zamaný hem tarihi birlikte gösterir.
		System.out.println(tarihSaat);         // 2021-12-02T21:39:31.226196400


		tarihSaat.toString();  // Stringe çeviririz bu þekilde String methodlarý kullanabiliriz.
		
		System.out.println(tarihSaat.toString().startsWith("2021"));  // true
		
		


	}

}
