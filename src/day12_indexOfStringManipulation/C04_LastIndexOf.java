package day12_indexOfStringManipulation;

import java.util.Scanner;

public class C04_LastIndexOf {

	public static void main(String[] args) {
		
		// Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina
		// bakarak asagidaki 3 cumleden uygun olani yazdirin
		// - Girilen kelime cumlede kullanilmamis.
		// - Girilen kelime cumlede 1 kere kullanilmis.
		// - Girilen kelime cumlede 1’den fazla kullanilmis.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz.");

		String cumle = scan.nextLine(); // cümle oldugu için yazý kýsmý 1 kelimeden fazlasý olacak. diger türlü yazarsak
										// algýlamaz
		System.out.println("Lütfen varlýðýný kontrol etmek için bir kelime giriniz.");

		String kelime = scan.next(); // kelime oldugu için next. devamýný ihtiyaç yok

		int ilkIndex = cumle.indexOf(kelime); //indexof methodu ile stringin hangi indexte oldugunu buldum
		int sonIndex = cumle.indexOf(kelime); // index of sayý olarak döndügü için bunu iþleme sokabilmek için
                                              // int bir varablea atama yaptým.!!!***
		if (ilkIndex == (-1)) {
			System.out.println("Girilen kelime cumlede kullanýlmamýstýr");
		} else if (ilkIndex == sonIndex) {
			System.out.println("Girilen kelime cumlede 1 kere kullanýlmýþ");

		} else {
			System.out.println("Girilen kelime cumlede 1 kereden fazla kullanýlmýs");

		}

		scan.close();
		
		
		
	}

}
