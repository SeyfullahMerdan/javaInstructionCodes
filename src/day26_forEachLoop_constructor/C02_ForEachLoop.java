package day26_forEachLoop_constructor;

public class C02_ForEachLoop {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 6, 10 };

		int carpim = 1; // �arp�mlar� koyacag�m�z bir Variable olu�turduk. Say�y� bununla �arpacag�z.
						// D�necek bir sonraki elemanla �arpacak.

		for (int i : arr) { // For veya While veya Do loop ile yapt�g�m�z bir�ok i�lemi bununla yapamay�z.

			carpim *= i;
		}

		System.out.println(carpim);

	}

}
