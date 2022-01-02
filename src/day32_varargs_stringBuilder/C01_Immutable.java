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
		 
		 Ýmmutable degiþtirilemez demektir. 
		 
		 new ile oluþturdugumuzda eþit olarak saymadý. New keywordu obje oluþturuyor.
		 burda new yazýldýgý için otomatikmen yeni bir referans num. atadý.
		 ve eþit mi diye sorunca reddetti çünkü ref.ler ayný degil.
		 
		 ikinci þartta da eþit olarak görmedi. == iþareti her zaman dogru çalýþmazdý Stringler için
		 Burda ekstradan bir de new sözcügü oldugu için baþtan reddeettti.
		 
		 */
		
	
		
	}

}
