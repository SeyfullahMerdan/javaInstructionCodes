package day32_varargs_stringBuilder;

public class C06_StringBuilder {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// StringBuilder Stringe göre daha az yer kaplar ve mutable verilerdir, Silinir
		// ve Heap memory de yer kaplamaz.

		String str = "Ali Can";

		String str2 = new String("Veli Cem");

		StringBuilder sb = new StringBuilder("Yaþasýn Dünya");

		sb.append(" ! ! !");

		System.out.println(sb);

	    sb.reverse(); // StringBuilder methodlarý StringBuilder mutable oldugu için kalýcý olur. Reverse-tersten yazdýrma methodudur.

		System.out.println(sb);

		System.out.println(sb.toString().toUpperCase()); // String özelligini kullanabiliyoruzz
		System.out.println(sb); // Ancak toString Methodu atama yapmadý. String üzerinden geldigi için String
								// özelligi gösterdi.

		sb.append(" " + str);  // ekleme özelligi yaptýk. SB'a str'yi ekledik.

		System.out.println(sb);

	}

}
