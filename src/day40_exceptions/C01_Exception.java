package day40_exceptions;

public class C01_Exception {

	public static void main(String[] args) {
		
		int a=20;
		int b=0;	
		System.out.println("Say�lar�n b�l�m�fark�: " + (a-b)  ); // (C01_Exception.java:11) / by zero
		System.out.println("G�rev tamamland�");
		// Exception in thread "main" 
		// java.lang.ArithmeticException: / by zero
		// Java bir problem oldugunda i�lemi ve kod yazmay� durdurur.
		// exceptionlarda bunu atlatmay� ve kullan�c�ya yans�tmay� deneyecegiz!
	
	/*	&& Try Catch Blogu ile Exceptionlar� �nleyebilir,kontrol alt�na alabiliriz!!!*****
	    
	    i�lemi yapmaya �al�� ve e�er i�lemi yaparken ------ArithmeticException v.b.---------
		olur da b�yle bir hata ile kar��la��rsan KODUN �ALI�MASINI DURDURMA
		Bu  i�lemi yap ve yoluna devam et
		*/
		
		try {
			
			System.out.println("sayilarin b�l�m� : " + a/b);
			
		} catch (ArithmeticException e) {
			
			System.out.println("S�f�ra b�l�m yap�lamaz");
			
		//	System.out.println(e.getMessage());  / by zero  HAtan�n a��klamas�n� verdi
		e.printStackTrace();  // Hem javan�n s�ylyecegi s�z� al�p hem de kod �al��mas�na devam etti.
		// e i�in obje veya variable diyebilriz.
		}
		
		
		System.out.println("G�revTamam.");
		//--- Kodum �al��may� durdurmad� ve �al��maya devam etti.
		// Bir nevi kontroll� exception verdi***
		
		
	}

}
