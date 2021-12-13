package day17_forLoops;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		
		// Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum
		// tamsayilari toplayip, sonucu yazdiran bir program yaziniz

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen aradaki tam sayýlarý toplamak için iki sayi giriniz...");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();

		int kucuk = 0;  // Kullanýcýnýn girecegi sayýlardan hangisinin küçük oldugunu bilmedigim için 
		int buyuk = 0;  // if ile sayýlarý küçük büyük diye belirledim.

		if (sayi1 > sayi2) {
			buyuk = sayi1;               // sayi1 büyükse sayi1 büyük olacak ; degilse tam tersi..
			kucuk = sayi2;

		} else {
			buyuk = sayi2;
			kucuk = sayi1;
		}

		int toplam = 0;

		for (int i = kucuk; i <= buyuk; i++) {    // küçükten baþlayarak büyüge dogru gidecek
			toplam += i;                             // gördügü her sayýyý toplam variableýn içine atacak
		}

		System.out.println("Girilen sayilar ve ararlarýndaki sayýlarýn toplamý : " + toplam);

		scan.close();
	}

}
