package day33_stringBuilder;

public class C06_SubSquence {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Java ne kadar kolay");

		System.out.println(sb); // ikiside ayný sonucu döndürür
		// Ancak substring methodu string classýndan geldigi için substring
		// kullandýgýmda arkasýndan string methodlarýný kullanabilirim.
		// Fakat subsquence de bu mümkün olmaz.

		System.out.println(sb.substring(14)); // kolay

		System.out.println(sb.subSequence(14, 19));// kolay

		System.out.println(sb); // atama olmadý. Assign yapýlmadýgý sürece degiþmez.

	}

}
