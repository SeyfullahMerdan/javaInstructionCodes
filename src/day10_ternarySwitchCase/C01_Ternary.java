package day10_ternarySwitchCase;

import java.util.Scanner;

public class C01_Ternary {

	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Lutfen bir say� giriniz");
		double sayi3 = scan1.nextInt();
		System.out.println("Lutfen bir say� daha giriniz");
		double sayi4 = scan1.nextInt();

		// System.out.println(sayi3<sayi4? "Girdiginiz say�lardan b�y�k olmayan sayi : "
		// +sayi3 : "Girdiginiz say�lardan b�y�k olmayan sayi : " +sayi4 );

		String sonuc = (sayi3 < sayi4) ? "Girdiginiz say�lardan b�y�k olmayan sayi : " + sayi3
				: "Girdiginiz say�lardan b�y�k olan sayi : " + sayi4;
		System.out.println(sonuc);

		scan1.close();
		
	
	}

}
