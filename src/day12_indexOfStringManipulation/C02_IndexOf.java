package day12_indexOfStringManipulation;

import java.util.Scanner;

public class C02_IndexOf {

	public static void main(String[] args) {
	
		 // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		 // - Girilen kelime cumlede kullanilmamis.
		 // - Girilen kelime cumlede 1 kere kullanilmis.
		 //- Girilen kelime cumlede 1’den fazla kullanilmis.
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen bir cümle giriniz.");
		String cumle=scan.nextLine();  // cümle oldugu için yazý kýsmý 1 kelimeden fazlasý olacak. diger türlü yazarsak algýlamaz
		
		System.out.println("Lütfen varlýðýný kontrol etmek için bir kelime giriniz.");
		String kelime=scan.next();    // kelime oldugu için next. devamýný ihtiyaç yok
		
		
		int index=cumle.indexOf(kelime);   
		
		
		if (index<0) {
			System.out.println("Girilen kelime cümlede kullanýlmamýþ.");
		} else if (cumle.indexOf(kelime, index+1)<0) {  // ==(-1)
			
			System.out.println("Girilen kelime cümlede 1 kere kullanýlmýþ.");
		
		} else {
			
			System.out.println("Girilen kelime cümlede 1 defadan fazla kullanýlmýþtýr.");
		}
  scan.close();

	}

}
