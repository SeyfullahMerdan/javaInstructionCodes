package day22_arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
		
		String isimler[] = { "Hacer", "ainag�l", "Emine", "Murat", "Kutlu" };

		// �simler array'inde Murat ismi var m�?
		// array'de arama yapmadan �ne s�rlama yapmal�y�z..

		Arrays.sort(isimler); // arrays class'i ile sort yapt�g�m�zda array'imiz kal�c� olarak degi�ir

		System.out.println(Arrays.toString(isimler)); // Kendisi k���kten b�y�ge s�ralad�. // Ainag�l, Emine, Hacer,
														// Kutlu, Murat
		// sort methodu elementleri natural order'a g�re s�ralar.

		isimler[4] = "Ainag�l"; // Ainag�l tekrar ba�a gelcek
		System.out.println(Arrays.toString(isimler)); // sort yapmad�g�m�z i�in burda Ainag�l ba�a gelmedi.
		// Bir degi�iklik yapt�k ama yeniden sort yapmad�k. Degi�iklik yaparsak nolur
		// nolmaz diye sort yapmak laz�m. Ataman�n kal�c� olmas� i�in.

		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler)); // Ainag�l tekrardan ba�a geldi.

		System.out.println(Arrays.binarySearch(isimler, "Murat")); // Var m� yok mu? Char deger,index degerii
																	// d�nd�rd�--4

		System.out.println(Arrays.binarySearch(isimler, "Merdan")); // -5 verdi. S�ralamaya g�re veriyor.
		// Kelime varsa -- index degerine g�re *** Kelime yoksa s�ralamas�na g�re -
		// �eklinde veriyor.
		System.out.println(Arrays.binarySearch(isimler, "Kursat")); // -4 verdi, Kutludan �nce gelir alfabetik olarak

	}

}
