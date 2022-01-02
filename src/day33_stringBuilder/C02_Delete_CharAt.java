package day33_stringBuilder;

public class C02_Delete_CharAt {

	public static void main(String[] args) {

		// Stringe ek olarak delete methodu vard�r. �Stenen karakterleri siler.
		// charAt methodu ise indexi verir.

		StringBuilder sb = new StringBuilder("java cand�r can");

		sb.deleteCharAt(11); // sadece 11. indexteki karakteri siler. Bo�lugu sildi. Bo�lukta karakter olarak
								// al�n�r.
		System.out.println(sb);

		sb.delete(11, 13); // ilk index inclusive, ikinci index exclusive oldu�undan
		System.out.println(sb); // java cand�rn

		sb.delete(11, sb.length());
		System.out.println(sb);

		sb.delete(5, 20); // 5'den itibaren siliyor. Exclusive k�sm�nda indexi -oldugundan fazla yazmama ragmen- sorun yapm�yor.
		System.out.println(sb);

	}

}
