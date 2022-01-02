package day33_stringBuilder;

public class C03_Equals {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("java");
		StringBuilder sb2 = new StringBuilder("java");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2)); // Stringin aksine her ikisi de false veriyor.
		// ��nk� new var,her ikisinde de yeni referans oldugu i�in direk false diyor.
		// ��erige bakm�yor.

		System.out.println(sb1.compareTo(sb2)); // 0 veriyor.Fark yok.Hepsi ayn� der.
		// sb1 ne kadar �nde...
		// �lk harflerden ba�layarak bire bire sbleri kar��la�t�r�yor.
		// E�er t�m karakterler ayn� ise sonu� olarak 0 d�ner. Farkl� karakter bulursa
		// sb1 k�sm�ndaki SBuilderin ne kadar �nde
		// oldugunu s�yl�yor, ASCII degerine g�re hareket ediyor.

		// E�er iki SB e�it olup olmad�g�n� anlamak istersek if(sb1.compareTo(sb2)==0)
		// ile bakabiliriz.

		String str = "java";

	   // System.out.println(sb1==str);             // == sb ile stringi kar��la�t�ramaz.
		System.out.println(sb1.equals(str));   // false
		// System.out.println(sb1.compareTo(str)); compare kullan�lamaz.

		// System.out.println(sb1=="Java"); // Yaz�l�m� kabul etmedi.
		System.out.println(sb1.equals("java")); // itiraz etmedi ama false dedi.
		// System.out.println(sb1.compareTo("java")); Yaz�l�m� kabul etmedi.

	}

}
