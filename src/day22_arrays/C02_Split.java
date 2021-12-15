package day22_arrays;

import java.util.Arrays;

public class C02_Split {

	public static void main(String[] args) {
		
		// Java ögrenmek çok güzel cümlesini ters sýrada yazdýrýn

		String cumle = " Java ogrenmek cok guzel";

		String kelimeler[] = cumle.split(" ");
		System.out.println(Arrays.toString(kelimeler));

		for (int i = kelimeler.length - 1; i > 0; i--) {

			System.out.print(kelimeler[i] + " "); // Biz arrayi yazdýrmaýgýmýz için , sadece eleentleri yazdýrdýgýmýz
													// için virgüller gitti
		}
	}
}
