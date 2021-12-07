package day05_MatematikselÝslemler;

public class C01_MatematikselIslemler {

	public static void main(String[] args) {
		
		System.out.println(4*(5+2)/3); 
		
		// iþlem önceligine göre hareket eder. 
		
		// önce parantez içi sonra çarpma veya bölme... Eðer hepsi öncelikli ise Java Soldan Saða yapar...
		
		
		System.out.println(4*(2+5)/3); // Her ikisi de ayný türden ise o türden yazar. Burada int. mesela...
		
		
		double sonuc=4*(2+5)/3 ;     
		//  sol taraf variable sag taraf deðer... Önce deðer hesaplanýr sonra atama yapýlýr (Assigment iþlemleri)
		//  önce 9'u buldu sonra atama yaptý.
		System.out.println(sonuc);      // double oldugu için virgüllü yazdýrdý.
		
		
		
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
		
		
		
		
		// iþlemi double çevirmek için sayýlardan birinin önüne double yazmamýz yeterli.
	    // bazý durumlarda int alýp double yapmamýz gerekebilir... 
		
	
	}

}
