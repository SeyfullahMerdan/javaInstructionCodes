package day40_exceptions;

public class C01_Exception {

	public static void main(String[] args) {
		
		int a=20;
		int b=0;	
		System.out.println("Sayýlarýn bölümüfarký: " + (a-b)  ); // (C01_Exception.java:11) / by zero
		System.out.println("Görev tamamlandý");
		// Exception in thread "main" 
		// java.lang.ArithmeticException: / by zero
		// Java bir problem oldugunda iþlemi ve kod yazmayý durdurur.
		// exceptionlarda bunu atlatmayý ve kullanýcýya yansýtmayý deneyecegiz!
	
	/*	&& Try Catch Blogu ile Exceptionlarý önleyebilir,kontrol altýna alabiliriz!!!*****
	    
	    iþlemi yapmaya çalýþ ve eðer iþlemi yaparken ------ArithmeticException v.b.---------
		olur da böyle bir hata ile karþýlaþýrsan KODUN ÇALIÞMASINI DURDURMA
		Bu  iþlemi yap ve yoluna devam et
		*/
		
		try {
			
			System.out.println("sayilarin bölümü : " + a/b);
			
		} catch (ArithmeticException e) {
			
			System.out.println("Sýfýra bölüm yapýlamaz");
			
		//	System.out.println(e.getMessage());  / by zero  HAtanýn açýklamasýný verdi
		e.printStackTrace();  // Hem javanýn söylyecegi sözü alýp hem de kod çalýþmasýna devam etti.
		// e için obje veya variable diyebilriz.
		}
		
		
		System.out.println("GörevTamam.");
		//--- Kodum çalýþmayý durdurmadý ve çalýþmaya devam etti.
		// Bir nevi kontrollü exception verdi***
		
		
	}

}
