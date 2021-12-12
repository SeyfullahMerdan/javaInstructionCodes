package day13_stringManipulations;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		
		
		 //  s S         w W           d D
		
		String str= "Java 98ogrenmek c..ok k876olay";
		
		// replaceAll methodlarý kullanarak anlamlý þekile getirin.
		
		str=str.replaceAll("\\d", "");   // digit - rakamlar
		
		System.out.println(str);      // Java ogrenmek c..ok kolay
		
		
		
		str=str.replaceAll("\\S", "x"); // boþluk haricindekiler
		
		System.out.println(str);
		
       
		
		str=str.replaceAll("\\W", "");  // harf haricindekiler yani boþluk ve nokta
		
		System.out.println(str);
		
		// ancak str ye atama yaparsam kalýcý olur yoksa direk atama yapmaz!!
		
       str=str.replaceAll("x", " ");  // bütün x ler boþluk oldu...
		
		System.out.println(str);
	
	}

}
