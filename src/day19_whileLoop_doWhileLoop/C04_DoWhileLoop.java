package day19_whileLoop_doWhileLoop;

public class C04_DoWhileLoop {

	public static void main(String[] args) {

		// ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yazdirin.

		////// for loop ile

		for (char i = 'm'; i > 'c'; i--) {
			System.out.println(i + " ");
		}

		////// while loop ile

		char krk = 'm';

		while (krk > 'c') {
			System.out.print(krk + " ");
			krk--;
		}

		System.out.println(" ");

		////// do While Loop ile

		char harf = 'm';
		do {
			System.out.print(harf + " ");
			harf--;
		} while (harf > 'c');

	}

}
