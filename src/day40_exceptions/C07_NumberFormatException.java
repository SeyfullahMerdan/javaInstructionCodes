package day40_exceptions;

public class C07_NumberFormatException {

	
	public static void main(String[] args) {
		
	
		String str="123a";  // NumberFormatException verir.
		
		int sayi= Integer.parseInt(str)+4;
		
		//parseInt --- Stringi intigera çevirir.
		//value of -- Stringe çevirir
		
		System.out.println(sayi);
		
		
		// Bir variableý numaralarla iþlem yapmak istedigimizde ancak variableýn sayý contain etmedigi
		// veya sayý haricinde harf digit gibi karakterleri de ihtiva ettigi durumlarda bu sorunu verir.
		
		
	
	}

}
