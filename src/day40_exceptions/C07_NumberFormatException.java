package day40_exceptions;

public class C07_NumberFormatException {

	
	public static void main(String[] args) {
		
	
		String str="123a";  // NumberFormatException verir.
		
		int sayi= Integer.parseInt(str)+4;
		
		//parseInt --- Stringi intigera �evirir.
		//value of -- Stringe �evirir
		
		System.out.println(sayi);
		
		
		// Bir variable� numaralarla i�lem yapmak istedigimizde ancak variable�n say� contain etmedigi
		// veya say� haricinde harf digit gibi karakterleri de ihtiva ettigi durumlarda bu sorunu verir.
		
		
	
	}

}
