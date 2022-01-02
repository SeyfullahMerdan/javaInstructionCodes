package day33_stringBuilder;

public class C06_SubSquence {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Java ne kadar kolay");

		System.out.println(sb); // ikiside ayn� sonucu d�nd�r�r
		// Ancak substring methodu string class�ndan geldigi i�in substring
		// kulland�g�mda arkas�ndan string methodlar�n� kullanabilirim.
		// Fakat subsquence de bu m�mk�n olmaz.

		System.out.println(sb.substring(14)); // kolay

		System.out.println(sb.subSequence(14, 19));// kolay

		System.out.println(sb); // atama olmad�. Assign yap�lmad�g� s�rece degi�mez.

	}

}
