package day11_stringManipulations;

public class C02_EqualsIgnoreCase {

	public static void main(String[] args) {
		
// equalsIngnorecase iki Stringi karþýlaþtýrýrken case sensitive olmadan karþýlaþtýrýr.
// Arada bir boþluk olsa bile,bir harf farklý olsa bile sonuç yine False olur.
	// Sadece büyük-küçük harf yazýmý için geçerlidir!!!

String str1="ali";
String str2="can";
String str3="Ali Can";
String str4=str1+ " " +str2;
				
			System.out.println(str4);                  // ali can
			System.out.println(str3==str4);            // False verir. Hem degerler hem referanslar farklý...
			System.out.println(str3.equals(str4));     // False verir. Degerler farklý.
				
		System.out.println(str3.equalsIgnoreCase(str4)); // True. Ýçerik ayný, case sensitive deðil.
// ali can ile Ali Can içeriklerini eþit görüyor. equalsIngnorecase büyük-küçük harf sorununu ortadan kaldýrýr.
				
				
				
		
		
		
		
		
		
	}

}
