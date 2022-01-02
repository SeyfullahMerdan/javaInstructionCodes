package day33_stringBuilder;

public class C03_Equals {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("java");
		StringBuilder sb2 = new StringBuilder("java");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2)); // Stringin aksine her ikisi de false veriyor.
		// Çünkü new var,her ikisinde de yeni referans oldugu için direk false diyor.
		// Ýçerige bakmýyor.

		System.out.println(sb1.compareTo(sb2)); // 0 veriyor.Fark yok.Hepsi ayný der.
		// sb1 ne kadar önde...
		// Ýlk harflerden baþlayarak bire bire sbleri karþýlaþtýrýyor.
		// Eðer tüm karakterler ayný ise sonuç olarak 0 döner. Farklý karakter bulursa
		// sb1 kýsmýndaki SBuilderin ne kadar önde
		// oldugunu söylüyor, ASCII degerine göre hareket ediyor.

		// Eðer iki SB eþit olup olmadýgýný anlamak istersek if(sb1.compareTo(sb2)==0)
		// ile bakabiliriz.

		String str = "java";

	   // System.out.println(sb1==str);             // == sb ile stringi karþýlaþtýramaz.
		System.out.println(sb1.equals(str));   // false
		// System.out.println(sb1.compareTo(str)); compare kullanýlamaz.

		// System.out.println(sb1=="Java"); // Yazýlýmý kabul etmedi.
		System.out.println(sb1.equals("java")); // itiraz etmedi ama false dedi.
		// System.out.println(sb1.compareTo("java")); Yazýlýmý kabul etmedi.

	}

}
