package day21_scope_arrays;

public class C03_Arrays {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Elemanlar� Ali Veli Ay�e Fatma olan bir array olu�turun

		String arry[] = new String[4];

		arry[0] = "Ali";
		arry[1] = "Veli";
		arry[2] = "Ayse";
		arry[3] = "Fatma";

		String arry2[] = { "Ali", "Veli", "Ayse", "Fatma" };

		// Elemanlar� Ali yerine Can, Ayse yerine Gul atay�n.

		arry2[0] = "Can";
		arry2[2] = "Gul";

		System.out.println(arry2[2]); // Gul

		// Son elementi yazd�rn�z.

		System.out.println(arry[arry.length - 1]); // Fatma
		// Stringde () lengthin yan�nda parntez vard� burda sadece length yaz�yoruz.
		// Bize son elementi verir.

		String arr[] = new String[3];

		// System.out.println(arr[3]); // index out of bounds verdi ��nk� uzunlgu bu
		// kadar degil.

		String ary[] = { "Mersin", "Adana", "�stanbul", "Ankara", "Konya", "�zmir", "Edirne" };

		System.out.println(ary[0]);

	}
}
