package day06_Wrapper;

public class C04_If {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		if (a>5) {
			System.out.println("a say�s� besden buyuk"); // true oldu�u i�in ekranda yazd�r�r
		}
		
		if (a>b) {
			System.out.println("a sy�s� b den buyuk"); // sonu� false oldugu i�in ekranda sonucu yazd�rmaz. Ama kod �al���r.
		}
		
		if (b>100) {
			System.out.println("b say�s� 100'den buyuk"); // sonu� ikinci ile ayn�. kod �al���r ama yaz�lmaz.
		}
		
		
		// basit if c�mleleri bag�ms�z �al���r
		// her bir if c�mlesi kendi sat�r�na bakar,sart true ise body �al���r
		// ...�art false ise body �al��maz.
		
 		
	
		

	}

}
