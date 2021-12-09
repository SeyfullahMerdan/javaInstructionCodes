package day10_ternarySwitchCase;

import java.util.Scanner;

public class C02_Ternary {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");

		int x = scan.nextInt();

		String tekMiCiftMi = x % 2 == 0 ? "cift sayi" : "tek sayi"; // mecbur atama yapýlacak, atama yapmadan olmaz.
		System.out.println(tekMiCiftMi);

		System.out.println(x % 2 == 0 ? "cift sayi" : "tek sayi"); // bana göre bu daha kolay //

		scan.close();
		
	
		
		// boolean  ? --- dogru olan seçenek  : ------ yanlýþ olan seçenek
		
		
		
	}

}
