package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		
		
		// Kullanýcýdan deger alma... Pc programlarýnýn olmazsa olmazýdýr. Deger almak icin 3adim takip edilir.
		// 1.adim Scanner objesi olusturmak
		
		Scanner scan=new Scanner (System.in);
		
		// 2.adim kullaniciya ne istedigimizi soylemek
		
		System.out.println("Lutfen isminizi yazýnýz.");
		
		String isim=scan.next();
		
        System.out.println("Ýsminiz: "+isim);
		
		// scan bir scanner objesidir
        // isim olarak farkli bir isim yazsak da calisir ama biz scan demeyi tercih ederiz.
        // scan bir obje oldugu icin data turu non-primitivedýr
        
        // primitive data turleri sadece deger icerirken non-primitivelar degerin yanýnda
        // bir de methodlar barýndýrýr.
		// scan. dedigimizde kullanabilecegimiz bu methodlarý gorebiliriz.
        
         scan.close();
        
        
		
	}

}
