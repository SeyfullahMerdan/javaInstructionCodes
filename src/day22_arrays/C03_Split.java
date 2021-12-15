package day22_arrays;

import java.util.Arrays;

public class C03_Split {

	public static void main(String[] args) {

		// Java ogrendim, #cok para ?kazand�m., c�mlesinin kelimelerini noktalama ve
		// �zel karakter olmadan
		// harf s�ras�na g�re yazd�r�n�z.

		String cumle = "Java ogrendim,  #cok para ?kazandim.,";

		String kelimeler[] = cumle.split(" ");
		System.out.println(Arrays.toString(kelimeler));

		for (int i = 0; i < kelimeler.length; i++) {
			kelimeler[i] = kelimeler[i].replaceAll("\\W", "");
			System.out.print(kelimeler[i] + " ");
		}
		System.out.println("");
		System.out.println(Arrays.toString(kelimeler));

		Arrays.sort(kelimeler);

		for (int i = 0; i < kelimeler.length; i++) {
			kelimeler[i] = kelimeler[i].replaceFirst("", " ");
			kelimeler[i] = kelimeler[i].trim();
			System.out.print(kelimeler[i]);
		}

	}

}
