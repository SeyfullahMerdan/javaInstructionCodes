package day32_varargs_stringBuilder;

public class C06_StringBuilder {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// StringBuilder Stringe g�re daha az yer kaplar ve mutable verilerdir, Silinir
		// ve Heap memory de yer kaplamaz.

		String str = "Ali Can";

		String str2 = new String("Veli Cem");

		StringBuilder sb = new StringBuilder("Ya�as�n D�nya");

		sb.append(" ! ! !");

		System.out.println(sb);

	    sb.reverse(); // StringBuilder methodlar� StringBuilder mutable oldugu i�in kal�c� olur. Reverse-tersten yazd�rma methodudur.

		System.out.println(sb);

		System.out.println(sb.toString().toUpperCase()); // String �zelligini kullanabiliyoruzz
		System.out.println(sb); // Ancak toString Methodu atama yapmad�. String �zerinden geldigi i�in String
								// �zelligi g�sterdi.

		sb.append(" " + str);  // ekleme �zelligi yapt�k. SB'a str'yi ekledik.

		System.out.println(sb);

	}

}
