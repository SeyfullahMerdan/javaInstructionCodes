package day03_Scanner;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		
		// Scanner isleminde String icin 2 method vard�r.
		// scan.next() dedigimizde sadece 1 kelime al�r. yani bosluk b�rakana kadarki k�sm�...
		// scan.nextLine() eger kullan�c�dan daha fazla kelime gelme ihtimali varsa kullan�l�r.
		
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz.");
		
		String isim=scan.nextLine();
		
		System.out.println("Lutfen soyisminizi yaziniz.");
		
		String soyisim=scan.nextLine();
		
		System.out.println("Girilen isim: "+isim+ " " + soyisim);
		
		
		scan.close();
		
	}

}
