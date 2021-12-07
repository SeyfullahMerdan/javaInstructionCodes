package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		
		
		// Kullan�c�dan deger alma... Pc programlar�n�n olmazsa olmaz�d�r. Deger almak icin 3adim takip edilir.
		// 1.adim Scanner objesi olusturmak
		
		Scanner scan=new Scanner (System.in);
		
		// 2.adim kullaniciya ne istedigimizi soylemek
		
		System.out.println("Lutfen isminizi yaz�n�z.");
		
		String isim=scan.next();
		
        System.out.println("�sminiz: "+isim);
		
		// scan bir scanner objesidir
        // isim olarak farkli bir isim yazsak da calisir ama biz scan demeyi tercih ederiz.
        // scan bir obje oldugu icin data turu non-primitived�r
        
        // primitive data turleri sadece deger icerirken non-primitivelar degerin yan�nda
        // bir de methodlar bar�nd�r�r.
		// scan. dedigimizde kullanabilecegimiz bu methodlar� gorebiliriz.
        
         scan.close();
        
        
		
	}

}
