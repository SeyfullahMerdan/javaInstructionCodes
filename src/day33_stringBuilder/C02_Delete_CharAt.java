package day33_stringBuilder;

public class C02_Delete_CharAt {

	public static void main(String[] args) {

		// Stringe ek olarak delete methodu vardýr. ÝStenen karakterleri siler.
		// charAt methodu ise indexi verir.

		StringBuilder sb = new StringBuilder("java candýr can");

		sb.deleteCharAt(11); // sadece 11. indexteki karakteri siler. Boþlugu sildi. Boþlukta karakter olarak
								// alýnýr.
		System.out.println(sb);

		sb.delete(11, 13); // ilk index inclusive, ikinci index exclusive olduðundan
		System.out.println(sb); // java candýrn

		sb.delete(11, sb.length());
		System.out.println(sb);

		sb.delete(5, 20); // 5'den itibaren siliyor. Exclusive kýsmýnda indexi -oldugundan fazla yazmama ragmen- sorun yapmýyor.
		System.out.println(sb);

	}

}
