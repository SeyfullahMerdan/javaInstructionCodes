package day18_nestedForLoop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		
		// Kullan�c�dan 2 tam say� isteyin.
		// ilk say�dan ba�layarak , ikinci say�ya kadar ��er,��er yazd�r�n.
		// �kinci say� dahil olmak zornda degil.

		// 1. b�y�k 2. k���k olabilir veya tam tersi olabilir. 3 ihtimal var. ya b�y�k
		// ya k���k ya e�it. 1.den b�layacak o y�zden artt�rma
		// veya azaltma yaparak 3er 3er yazd�rabilirim.
		Scanner scan = new Scanner(System.in);
		System.out.println("�ki tane pozitif tam sayi giriniz");
		int sayi = scan.nextInt();
		int sayi2 = scan.nextInt(); // Soruda 1.say�dan diyor. B�y�k-K���k degil. 1.say�dan ba�laycak azalarak veya
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
			System.out.println("Girilen say�lar e�ittir.");
		}

		scan.close();
	}

}
