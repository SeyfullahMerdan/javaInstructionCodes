package day04_IncrementDecrement;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		
		// 7) Kullanicidan ismini alip isminin bas harfini yazdirin.
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lutfen isminizi yaz�n�z.");
		
		char ilkHarf=scan.next().charAt(0);    // scan.next() Stringdir ve String non-primitive dir. . koyunca methodlar� getirir.
		       // charAT e 1, 2 ,3 ,4 ,5 de yazabilirdik ama ilk harfi istedigimiz i�in 0 yazd�k. 0-1-2-3-4 diye gider....
		
		System.out.println("�sminizin ilk harfi: "+ilkHarf);
	
        
		scan.close();
		
		
	}

}
