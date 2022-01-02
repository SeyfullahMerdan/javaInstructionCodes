package day33_stringBuilder;

public class C05_Reverse {

	public static void main(String[] args) {

		// Verilen cümleyi tersine çevirelim.

		StringBuilder sb = new StringBuilder("Java ögrendim");

		sb.reverse();

		System.out.println(sb);  // midnergö avaJ

	}

}