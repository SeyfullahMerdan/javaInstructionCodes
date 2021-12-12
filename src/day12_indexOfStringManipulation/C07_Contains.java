package day12_indexOfStringManipulation;

import java.util.Scanner;

public class C07_Contains {

	public static void main(String[] args) {
		
		// Kullanicidan bir cumle isteyin.
		// Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak
		// kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
		// iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor”
		// yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz.");

		String cumle = scan.nextLine(); // cümle oldugu içi nextLine .toLowerCase koyarsak case senssitive problmi
										// hallolur.

		if (cumle.contains("buyuk")) {
			System.out.println(cumle.toUpperCase());
		} else if (cumle.contains("kucuk")) {
			System.out.println(cumle.toLowerCase());
		} else if (cumle.contains("kucuk") && cumle.contains("buyuk")) { // java burda hatalý çalýþýr. çünkü aþagýdan
																			// yukarýya bakar.
			System.out.println("kucuk mu buyuk mu karar ver."); // karþýsýna gelen ilk ifi yapar, ilk yakaladýgný her
																// zaman yapar!!!
		} else {
			System.out.println("Cumle buyuk veya kucuk kelimesi içermiyor.");
		}

		scan.close();

		/*
		 * !!!!!!!!!!! !!!!!!!!!!!!! BU SEKÝLDE YAPMALIYIZ !!!!!!!
		 * !!!!!!!!!!!!!!!!!!!!!!
		 * 
		 * 
		 * if (cumle.contains("kucuk")&&cumle.contains("buyuk")) {
		 * System.out.println("kucuk mu buyuk mu karar ver."); } else if
		 * (cumle.contains("kucuk")) { System.out.println(cumle.toLowerCase()); } else
		 * if (cumle.contains("buyuk")) { System.out.println(cumle.toUpperCase()); }
		 * else { System.out.println("Cumle buyuk veya kucuk kelimesi içermiyor."); }
		 * 
		 */

	}

}
