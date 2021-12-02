package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		
		
		// Kullanıcıdan deger alma... Pc programlarının olmazsa olmazıdır. Deger almak icin 3adim takip edilir.
		// 1.adim Scanner objesi olusturmak
		
		Scanner scan=new Scanner (System.in);
		
		// 2.adim kullaniciya ne istedigimizi soylemek
		
		System.out.println("Lutfen isminizi yazınız.");
		
		String isim=scan.next();
		
        System.out.println("İsminiz: "+isim);
		
		// scan bir scanner objesidir
        // isim olarak farkli bir isim yazsak da calisir ama biz scan demeyi tercih ederiz.
        // scan bir obje oldugu icin data turu non-primitivedır
        
        // primitive data turleri sadece deger icerirken non-primitivelar degerin yanında
        // bir de methodlar barındırır.
		// scan. dedigimizde kullanabilecegimiz bu methodları gorebiliriz.
        
         scan.close();
        
        
		
	}

}
