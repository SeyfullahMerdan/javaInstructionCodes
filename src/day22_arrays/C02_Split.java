package day22_arrays;

import java.util.Arrays;

public class C02_Split {

	public static void main(String[] args) {
		
		// Java �grenmek �ok g�zel c�mlesini ters s�rada yazd�r�n

		String cumle = " Java ogrenmek cok guzel";

		String kelimeler[] = cumle.split(" ");
		System.out.println(Arrays.toString(kelimeler));

		for (int i = kelimeler.length - 1; i > 0; i--) {

			System.out.print(kelimeler[i] + " "); // Biz arrayi yazd�rma�g�m�z i�in , sadece eleentleri yazd�rd�g�m�z
													// i�in virg�ller gitti
		}
	}
}
