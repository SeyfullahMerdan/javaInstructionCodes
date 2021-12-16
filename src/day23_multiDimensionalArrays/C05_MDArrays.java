package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_MDArrays {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.print("L�tfen bir c�mle yaz�n�z : ");
		String cumle = scan.nextLine();

		String kelimeler[] = cumle.split(" "); // ald�g�m c�mleyi bo�luklar�ndan ay�rarak arrayin uzunlugunu belirledim

		System.out.println(Arrays.toString(kelimeler));

		System.out.println("Girilen c�mlede " + kelimeler.length + " adet kelime var. ");

	}

}