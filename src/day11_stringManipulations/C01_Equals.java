package day11_stringManipulations;

public class C01_Equals {

	public static void main(String[] args) {
		

		int a=10;
		int b=a+0;
		System.out.println(a==b); // true verir
		  
		char ch1='K';               // char matematiksel iþleme girerse ASCII degerini kullanýr demiþtik. Bu durumda ch1 ve ch2 aynýdýr
		char ch2='K'+0;          
		
		System.out.println(ch1==ch2);  // true       // Bu yüzden burada ikisini ayný görüyor.
		
		
		String str1="Ali";
		String str2="Can";
		String str3="Ali Can";                
		String str4=str1+ " " +str2;
		
		System.out.println(str4);    // str3 ün aynýsýný görürüm. ''Ali Can''
		System.out.println(str3==str4);    // false
		
		// Deðerler ayný ama bunlar farklý objeler der ve false verir.
		
		System.out.println(str3.equals(str4));   // true
		          
		// equals içeriðe baktý. equals methodu Stringin sadece degerine bakar == hem degerine hem referansýna bakar.
		
		
		// String variable'larda == hem degere hem de referansina bakar dolayisiyla objeler farkli oldugunda 
        // genelde false doner

        // str1.equals(str2) ise referanslara degil SADECE DEGERE bakar,
        // eger case sensitive olarak String degerleri ayni ise true doner
	}

}
