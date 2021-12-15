package day22_arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
		
		String isimler[] = { "Hacer", "ainagül", "Emine", "Murat", "Kutlu" };

		// Ýsimler array'inde Murat ismi var mý?
		// array'de arama yapmadan öne sýrlama yapmalýyýz..

		Arrays.sort(isimler); // arrays class'i ile sort yaptýgýmýzda array'imiz kalýcý olarak degiþir

		System.out.println(Arrays.toString(isimler)); // Kendisi küçükten büyüge sýraladý. // Ainagül, Emine, Hacer,
														// Kutlu, Murat
		// sort methodu elementleri natural order'a göre sýralar.

		isimler[4] = "Ainagül"; // Ainagül tekrar baþa gelcek
		System.out.println(Arrays.toString(isimler)); // sort yapmadýgýmýz için burda Ainagül baþa gelmedi.
		// Bir degiþiklik yaptýk ama yeniden sort yapmadýk. Degiþiklik yaparsak nolur
		// nolmaz diye sort yapmak lazým. Atamanýn kalýcý olmasý için.

		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler)); // Ainagül tekrardan baþa geldi.

		System.out.println(Arrays.binarySearch(isimler, "Murat")); // Var mý yok mu? Char deger,index degerii
																	// döndürdü--4

		System.out.println(Arrays.binarySearch(isimler, "Merdan")); // -5 verdi. Sýralamaya göre veriyor.
		// Kelime varsa -- index degerine göre *** Kelime yoksa sýralamasýna göre -
		// þeklinde veriyor.
		System.out.println(Arrays.binarySearch(isimler, "Kursat")); // -4 verdi, Kutludan önce gelir alfabetik olarak

	}

}
