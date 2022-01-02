package day32_varargs_stringBuilder;

public class C01_Immutable {

	public static void main(String[] args) {
		
		String s="Hello";
		String t= new String(s);
		
		if ("Hello".equals(s)) System.out.println("one");  ///// it works
		if(t==s)System.out.println("two");
		if(t.equals(s)) System.out.println("three");  /////    it works
		if("Hello"==s)System.out.println("four");     /////    it works
		if("Hello"==t)System.out.println("five");

		
		/*
		 
		 �mmutable degi�tirilemez demektir. 
		 
		 new ile olu�turdugumuzda e�it olarak saymad�. New keywordu obje olu�turuyor.
		 burda new yaz�ld�g� i�in otomatikmen yeni bir referans num. atad�.
		 ve e�it mi diye sorunca reddetti ��nk� ref.ler ayn� degil.
		 
		 ikinci �artta da e�it olarak g�rmedi. == i�areti her zaman dogru �al��mazd� Stringler i�in
		 Burda ekstradan bir de new s�zc�g� oldugu i�in ba�tan reddeettti.
		 
		 */
		
	
		
	}

}
