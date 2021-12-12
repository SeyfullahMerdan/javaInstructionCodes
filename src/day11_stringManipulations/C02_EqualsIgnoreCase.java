package day11_stringManipulations;

public class C02_EqualsIgnoreCase {

	public static void main(String[] args) {
		
// equalsIngnorecase iki Stringi kar��la�t�r�rken case sensitive olmadan kar��la�t�r�r.
// Arada bir bo�luk olsa bile,bir harf farkl� olsa bile sonu� yine False olur.
	// Sadece b�y�k-k���k harf yaz�m� i�in ge�erlidir!!!

String str1="ali";
String str2="can";
String str3="Ali Can";
String str4=str1+ " " +str2;
				
			System.out.println(str4);                  // ali can
			System.out.println(str3==str4);            // False verir. Hem degerler hem referanslar farkl�...
			System.out.println(str3.equals(str4));     // False verir. Degerler farkl�.
				
		System.out.println(str3.equalsIgnoreCase(str4)); // True. ��erik ayn�, case sensitive de�il.
// ali can ile Ali Can i�eriklerini e�it g�r�yor. equalsIngnorecase b�y�k-k���k harf sorununu ortadan kald�r�r.
				
				
				
		
		
		
		
		
		
	}

}
