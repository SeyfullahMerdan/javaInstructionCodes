package day10_ternarySwitchCase;

import java.util.Scanner;

public class C04_Ternary {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz : ");
		double sayi = scan.nextDouble();

		// sayi>0 ? System.out.println("sayi pozitif") : System.out.println(sayi*sayi); ***
		// �eklinde yaz�nca hata verdi java,kabul etmedi.
		
		// ternary de direk sonuc veya sonuc dondurecek bir islem yapabiliriz

		System.out.println(sayi > 0 ? "sayi pozitif" : sayi * sayi); // Bunu variable a e�itleyemeyiz ��nk� data t�rleri
																		// farkl�!!!!
		//   ilk olan String ikincisi ise Int. !!!!
		
		
		//   Bu �ekilde oldugunda ancak SYSO i�inde YAZDIRILAB�L�R !!!
		
		
		scan.close();
	
	}

}
