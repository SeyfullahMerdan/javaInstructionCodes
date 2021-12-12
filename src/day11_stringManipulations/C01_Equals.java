package day11_stringManipulations;

public class C01_Equals {

	public static void main(String[] args) {
		

		int a=10;
		int b=a+0;
		System.out.println(a==b); // true verir
		  
		char ch1='K';               // char matematiksel i�leme girerse ASCII degerini kullan�r demi�tik. Bu durumda ch1 ve ch2 ayn�d�r
		char ch2='K'+0;          
		
		System.out.println(ch1==ch2);  // true       // Bu y�zden burada ikisini ayn� g�r�yor.
		
		
		String str1="Ali";
		String str2="Can";
		String str3="Ali Can";                
		String str4=str1+ " " +str2;
		
		System.out.println(str4);    // str3 �n ayn�s�n� g�r�r�m. ''Ali Can''
		System.out.println(str3==str4);    // false
		
		// De�erler ayn� ama bunlar farkl� objeler der ve false verir.
		
		System.out.println(str3.equals(str4));   // true
		          
		// equals i�eri�e bakt�. equals methodu Stringin sadece degerine bakar == hem degerine hem referans�na bakar.
		
		
		// String variable'larda == hem degere hem de referansina bakar dolayisiyla objeler farkli oldugunda 
        // genelde false doner

        // str1.equals(str2) ise referanslara degil SADECE DEGERE bakar,
        // eger case sensitive olarak String degerleri ayni ise true doner
	}

}
