package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Fibonacci {

	public static void main(String[] args) {
		
		// Verilen bir sayýdan, küçük fibonacci sayýlarýný bir List olarak kaydedelim.
		// 1 1 2 3 5 8 13 21 34 55

		int sinir = 10000;

		List<Integer> fibonacci = new ArrayList<>(); // Boþ

		fibonacci.add(1); // fibonacci ye bir ekledim. // 1
		fibonacci.add(1); // fibonacci ye bir ekledim. // 1 1

		int sayi = 0; // length-1

		while (sayi < sinir) {

			sayi = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2); // ilk baþta 1 1
			// 2 1
			if (sayi >= sinir) { // 3 2
				break; // kodu kýrdý.
			}

			fibonacci.add(sayi);

		}

		System.out.println(fibonacci);

	}

}
