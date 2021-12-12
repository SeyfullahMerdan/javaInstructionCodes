package day11_stringManipulations;

public class C04_IndexOf {

	public static void main(String[] args) {
		

		// Parametre olarka girilen bir Char veya Stringin ilk indexni verir.
		
		
		String str="Cal�s�rsan�z, Java ogrenmek �ok kolay";
		
		System.out.println(str.indexOf('s'));  // 4
		
		System.out.println(str.indexOf("J"));  // 14
		
		
		int index=str.indexOf("r") ;    // indexof() methodu bize her zaman int. bir de�er d�ner.
		
		System.out.println(index);   // r
		
		System.out.println(str.indexOf('q'));  // -1
		
		// E�er bir Stringin index de�eri olarak -1 gelirse o Stringin olmad���n� anlar�z.
		// Bir String i�inde olmayan bir karakter veya kelime ararsak Java -1 sonucunu d�nd�r�r.
		
		System.out.println(str.indexOf('A'));  // -1 d�ner. ��nk� JAVA CASE SENS�T�VEdir !..
		
		System.out.println(str.indexOf("va og")); // 16
		
		
		// aradigimiz charSquence anlamli veya anlamsiz bir kelime olabilir
        // bu durumda java aradigimiz CS'i tek bir paket gibi dusunur ve o paketin baslangic index'ini bize verir
		
		
		System.out.println(str.indexOf('e',23)); // 25  
	
		
	}

}
