package day12_indexOfStringManipulation;

import java.util.Scanner;

public class C07_Contains {

	public static void main(String[] args) {
		
		// Kullanicidan bir cumle isteyin.
		// Cumle �buyuk� kelimesi iceriyorsa tum cumleyi buyuk harf olarak
		// kucuk� kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
		// iki kelimeyi de icermiyorsa �Cumle kucuk yada buyuk kelimesi icermiyor�
		// yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir c�mle giriniz.");

		String cumle = scan.nextLine(); // c�mle oldugu i�i nextLine .toLowerCase koyarsak case senssitive problmi
										// hallolur.

		if (cumle.contains("buyuk")) {
			System.out.println(cumle.toUpperCase());
		} else if (cumle.contains("kucuk")) {
			System.out.println(cumle.toLowerCase());
		} else if (cumle.contains("kucuk") && cumle.contains("buyuk")) { // java burda hatal� �al���r. ��nk� a�ag�dan
																			// yukar�ya bakar.
			System.out.println("kucuk mu buyuk mu karar ver."); // kar��s�na gelen ilk ifi yapar, ilk yakalad�gn� her
																// zaman yapar!!!
		} else {
			System.out.println("Cumle buyuk veya kucuk kelimesi i�ermiyor.");
		}

		scan.close();

		/*
		 * !!!!!!!!!!! !!!!!!!!!!!!! BU SEK�LDE YAPMALIYIZ !!!!!!!
		 * !!!!!!!!!!!!!!!!!!!!!!
		 * 
		 * 
		 * if (cumle.contains("kucuk")&&cumle.contains("buyuk")) {
		 * System.out.println("kucuk mu buyuk mu karar ver."); } else if
		 * (cumle.contains("kucuk")) { System.out.println(cumle.toLowerCase()); } else
		 * if (cumle.contains("buyuk")) { System.out.println(cumle.toUpperCase()); }
		 * else { System.out.println("Cumle buyuk veya kucuk kelimesi i�ermiyor."); }
		 * 
		 */

	}

}
