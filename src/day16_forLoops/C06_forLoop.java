package day16_forLoops;

import java.util.Scanner;

public class C06_forLoop {

	public static void main(String[] args) {

		// Soru 5) Kullanicidan 100’den kucuk pozitif bir tamsayi isteyin. 1’den
		// baslayarak
		// girilen sayiya kadar 3’un ve 5”in kati olan sayilari yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen yüzden küçük bir sayý giriniz..");
		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) { // 1'den baþlayarak numaraya kadar dedigi için
											// i=1 i<= num dedik. "Numaraya kadar 1'den baþlayarak devam et dedik."
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " "); // veya dediði için || yaptýkm.  // ve dedigi için && yaptým
			}
		}

		scan.close();

	}

}