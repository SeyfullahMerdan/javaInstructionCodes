package day03_Scanner;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		
		// Scanner isleminde String icin 2 method vardýr.
		// scan.next() dedigimizde sadece 1 kelime alýr. yani bosluk býrakana kadarki kýsmý...
		// scan.nextLine() eger kullanýcýdan daha fazla kelime gelme ihtimali varsa kullanýlýr.
		
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz.");
		
		String isim=scan.nextLine();
		
		System.out.println("Lutfen soyisminizi yaziniz.");
		
		String soyisim=scan.nextLine();
		
		System.out.println("Girilen isim: "+isim+ " " + soyisim);
		
		
		scan.close();
		
	}

}
