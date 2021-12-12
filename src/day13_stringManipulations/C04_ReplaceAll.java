package day13_stringManipulations;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		
		
		 //  s S         w W           d D
		
		String str= "Java 98ogrenmek c..ok k876olay";
		
		// replaceAll methodlar� kullanarak anlaml� �ekile getirin.
		
		str=str.replaceAll("\\d", "");   // digit - rakamlar
		
		System.out.println(str);      // Java ogrenmek c..ok kolay
		
		
		
		str=str.replaceAll("\\S", "x"); // bo�luk haricindekiler
		
		System.out.println(str);
		
       
		
		str=str.replaceAll("\\W", "");  // harf haricindekiler yani bo�luk ve nokta
		
		System.out.println(str);
		
		// ancak str ye atama yaparsam kal�c� olur yoksa direk atama yapmaz!!
		
       str=str.replaceAll("x", " ");  // b�t�n x ler bo�luk oldu...
		
		System.out.println(str);
	
	}

}
