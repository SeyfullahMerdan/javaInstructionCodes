package day18_nestedForLoop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		
		// Kullanýcýdan 2 tam sayý isteyin.
		// ilk sayýdan baþlayarak , ikinci sayýya kadar üçer,üçer yazdýrýn.
		// Ýkinci sayý dahil olmak zornda degil.

		// 1. büyük 2. küçük olabilir veya tam tersi olabilir. 3 ihtimal var. ya büyük
		// ya küçük ya eþit. 1.den bþlayacak o yüzden arttýrma
		// veya azaltma yaparak 3er 3er yazdýrabilirim.
		Scanner scan = new Scanner(System.in);
		System.out.println("Ýki tane pozitif tam sayi giriniz");
		int sayi = scan.nextInt();
		int sayi2 = scan.nextInt(); // Soruda 1.sayýdan diyor. Büyük-Küçük degil. 1.sayýdan baþlaycak azalarak veya
									// artarak gidecek

		if (sayi > sayi2) { // azalarak gidecek
			for (int i = sayi; i >= sayi2; i -= 3) {
				System.out.print(i + " ");
			}
		} else if (sayi < sayi2) { // artarak gidecek

			for (int i = sayi; i <= sayi2; i += 3) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("Girilen sayýlar eþittir.");
		}

		scan.close();
	}

}
