package day01_02_Variables;

public class C03_Variables {

	public static void main(String[] args) {
		
		int sayi1=10;   // �nt say� t�r�n� ifade eder.
		int sayi2=20;
		
		String sayi3="10";    // String kelimedir s�zl�d�r. 
		String sayi4="20";
		
		
		System.out.println(sayi1+sayi2); //30 ikisi ayn� cinsten olunca topluyor.
		System.out.println(sayi3+sayi4);  // Bunlar say� de�il , yaz�d�r. Toplamaz yan yana yazar.
		
        
		String harf1="A";   // Farkl� data t�rleri ayn� de�eri alabilir.
		char harf2='A' ;   // Burada �nemli olan bu degi�kenleri degi�ken t�r�ne g�re i�lem yapabilece�imdir.
		
		// Javada data t�rleri 2'ye ayr�l�r: Primitive ve Non-Primitive (ilkel ve ilkel olmayan)
		// Primitive data t�rleri 8 adetttir: Tek Karakter=== Boolean, Char  Tam Say�=== Byte, Short, Int, Long    Virg�ll� Say�=== Float, Double  
		// Non-Primitive : ''String''
		// HEr ikisi de Variabledir. Non ve Primitiveler...
	 
        // yukaridaki degiskenleri kullanarak 30A yazdirin
        
        System.out.println(sayi1+sayi2+harf1); // 30A
        System.out.println(sayi1+sayi2+harf2); // 95
        
        // char ekstra ozelligi sebebiyle matematiksel islemlerde numerik deger alir
        
        System.out.println(harf1+sayi1+sayi2); // A1020
        System.out.println(sayi1+harf1+sayi2); // 10A20
        System.out.println(harf1+(sayi1+sayi2)); // A30
		
		


	}

}
