package day26_forEachLoop_constructor;

public class C02_ForEachLoop {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 6, 10 };

		int carpim = 1; // Çarpýmlarý koyacagýmýz bir Variable oluþturduk. Sayýyý bununla çarpacagýz.
						// Dönecek bir sonraki elemanla çarpacak.

		for (int i : arr) { // For veya While veya Do loop ile yaptýgýmýz birçok iþlemi bununla yapamayýz.

			carpim *= i;
		}

		System.out.println(carpim);

	}

}
