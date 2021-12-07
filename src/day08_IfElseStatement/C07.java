package day08_IfElseStatement;

import java.util.Scanner;

public class C07 {

	public static void main(String[] args) {
		
		// Soru 8) Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore
		// cevap azdirin.
		// Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
		// 60 – 80.000 arasinda ise “Konusabiliriz”,
		// 60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen maaþ için bir teklif girin: ");
		double teklif = scan.nextDouble();

		if (teklif < 0) {
			System.out.println("Lütfen geçerli bir teklif verin.");
		} else if (teklif > 80000) {
			System.out.println("Kabul ediyrum.");
		} else if (teklif > 60000) {
			System.out.println("Konuþabiliriz.");
		} else {
			System.out.println("Maalesef kabul edemem");
		}

		scan.close();

	}

}
