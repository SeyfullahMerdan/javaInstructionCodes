package day05_Matematiksel�slemler;

public class C01_MatematikselIslemler {

	public static void main(String[] args) {
		
		System.out.println(4*(5+2)/3); 
		
		// i�lem �nceligine g�re hareket eder. 
		
		// �nce parantez i�i sonra �arpma veya b�lme... E�er hepsi �ncelikli ise Java Soldan Sa�a yapar...
		
		
		System.out.println(4*(2+5)/3); // Her ikisi de ayn� t�rden ise o t�rden yazar. Burada int. mesela...
		
		
		double sonuc=4*(2+5)/3 ;     
		//  sol taraf variable sag taraf de�er... �nce de�er hesaplan�r sonra atama yap�l�r (Assigment i�lemleri)
		//  �nce 9'u buldu sonra atama yapt�.
		System.out.println(sonuc);      // double oldugu i�in virg�ll� yazd�rd�.
		
		
		
		 sonuc= (double)(4*(2+5)/3) ;
	        
	        
	     System.out.println(sonuc); // 9.0
	        
	        
	     sonuc=(double)4 * (2+5)/3 ;
	        
	     System.out.println(sonuc); // 9.333333333333334
	        
	     sonuc=4 * (2+5)/(double)3 ;
	       
	     System.out.println(sonuc); // 9.333333333333334
	        
	        
	        int sayi1=5;
	        int sayi2=2;
	        double sayi3=2;
	        
	        
	        System.out.println(sayi1/sayi2); // 5/2=2
	        
	        System.out.println(sayi1/sayi3); // 5/2=2.5
	        
	        System.out.println(sayi1+sayi3/sayi2); // 6.0
		
		
		
		
		// i�lemi double �evirmek i�in say�lardan birinin �n�ne double yazmam�z yeterli.
	    // baz� durumlarda int al�p double yapmam�z gerekebilir... 
		
	
	}

}
