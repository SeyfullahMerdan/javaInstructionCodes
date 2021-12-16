package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_MDArrays {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen bir cümle yazýnýz : ");
		String cumle = scan.nextLine();

		String kelimeler[] = cumle.split(" "); // aldýgým cümleyi boþluklarýndan ayýrarak arrayin uzunlugunu belirledim

		System.out.println(Arrays.toString(kelimeler));

		System.out.println("Girilen cümlede " + kelimeler.length + " adet kelime var. ");

	}

}