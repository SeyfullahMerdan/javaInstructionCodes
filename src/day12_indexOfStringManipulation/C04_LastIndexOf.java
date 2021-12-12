package day12_indexOfStringManipulation;

import java.util.Scanner;

public class C04_LastIndexOf {

	public static void main(String[] args) {
		
		// Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina
		// bakarak asagidaki 3 cumleden uygun olani yazdirin
		// - Girilen kelime cumlede kullanilmamis.
		// - Girilen kelime cumlede 1 kere kullanilmis.
		// - Girilen kelime cumlede 1�den fazla kullanilmis.

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir c�mle giriniz.");

		String cumle = scan.nextLine(); // c�mle oldugu i�in yaz� k�sm� 1 kelimeden fazlas� olacak. diger t�rl� yazarsak
										// alg�lamaz
		System.out.println("L�tfen varl���n� kontrol etmek i�in bir kelime giriniz.");

		String kelime = scan.next(); // kelime oldugu i�in next. devam�n� ihtiya� yok

		int ilkIndex = cumle.indexOf(kelime); //indexof methodu ile stringin hangi indexte oldugunu buldum
		int sonIndex = cumle.indexOf(kelime); // index of say� olarak d�nd�g� i�in bunu i�leme sokabilmek i�in
                                              // int bir varablea atama yapt�m.!!!***
		if (ilkIndex == (-1)) {
			System.out.println("Girilen kelime cumlede kullan�lmam�st�r");
		} else if (ilkIndex == sonIndex) {
			System.out.println("Girilen kelime cumlede 1 kere kullan�lm��");

		} else {
			System.out.println("Girilen kelime cumlede 1 kereden fazla kullan�lm�s");

		}

		scan.close();
		
		
		
	}

}
