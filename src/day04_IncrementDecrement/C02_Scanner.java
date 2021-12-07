package day04_IncrementDecrement;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		
		// 7) Kullanicidan ismini alip isminin bas harfini yazdirin.
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lutfen isminizi yazýnýz.");
		
		char ilkHarf=scan.next().charAt(0);    // scan.next() Stringdir ve String non-primitive dir. . koyunca methodlarý getirir.
		       // charAT e 1, 2 ,3 ,4 ,5 de yazabilirdik ama ilk harfi istedigimiz için 0 yazdýk. 0-1-2-3-4 diye gider....
		
		System.out.println("Ýsminizin ilk harfi: "+ilkHarf);
	
        
		scan.close();
		
		
	}

}
