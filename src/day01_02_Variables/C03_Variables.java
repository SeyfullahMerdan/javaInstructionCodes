package day01_02_Variables;

public class C03_Variables {

	public static void main(String[] args) {
		
		int sayi1=10;   // Ýnt sayý türünü ifade eder.
		int sayi2=20;
		
		String sayi3="10";    // String kelimedir sözlüdür. 
		String sayi4="20";
		
		
		System.out.println(sayi1+sayi2); //30 ikisi ayný cinsten olunca topluyor.
		System.out.println(sayi3+sayi4);  // Bunlar sayý deðil , yazýdýr. Toplamaz yan yana yazar.
		
        
		String harf1="A";   // Farklý data türleri ayný deðeri alabilir.
		char harf2='A' ;   // Burada önemli olan bu degiþkenleri degiþken türüne göre iþlem yapabileceðimdir.
		
		// Javada data türleri 2'ye ayrýlýr: Primitive ve Non-Primitive (ilkel ve ilkel olmayan)
		// Primitive data türleri 8 adetttir: Tek Karakter=== Boolean, Char  Tam Sayý=== Byte, Short, Int, Long    Virgüllü Sayý=== Float, Double  
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
