package day21_scope_arrays;

public class C03_Arrays {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Elemanlarý Ali Veli Ayþe Fatma olan bir array oluþturun

		String arry[] = new String[4];

		arry[0] = "Ali";
		arry[1] = "Veli";
		arry[2] = "Ayse";
		arry[3] = "Fatma";

		String arry2[] = { "Ali", "Veli", "Ayse", "Fatma" };

		// Elemanlarý Ali yerine Can, Ayse yerine Gul atayýn.

		arry2[0] = "Can";
		arry2[2] = "Gul";

		System.out.println(arry2[2]); // Gul

		// Son elementi yazdýrnýz.

		System.out.println(arry[arry.length - 1]); // Fatma
		// Stringde () lengthin yanýnda parntez vardý burda sadece length yazýyoruz.
		// Bize son elementi verir.

		String arr[] = new String[3];

		// System.out.println(arr[3]); // index out of bounds verdi çünkü uzunlgu bu
		// kadar degil.

		String ary[] = { "Mersin", "Adana", "Ýstanbul", "Ankara", "Konya", "Ýzmir", "Edirne" };

		System.out.println(ary[0]);

	}
}
