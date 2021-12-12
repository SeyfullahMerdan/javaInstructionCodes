package day12_indexOfStringManipulation;

import java.util.Scanner;

public class C02_IndexOf {

	public static void main(String[] args) {
	
		 // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		 // - Girilen kelime cumlede kullanilmamis.
		 // - Girilen kelime cumlede 1 kere kullanilmis.
		 //- Girilen kelime cumlede 1�den fazla kullanilmis.
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("L�tfen bir c�mle giriniz.");
		String cumle=scan.nextLine();  // c�mle oldugu i�in yaz� k�sm� 1 kelimeden fazlas� olacak. diger t�rl� yazarsak alg�lamaz
		
		System.out.println("L�tfen varl���n� kontrol etmek i�in bir kelime giriniz.");
		String kelime=scan.next();    // kelime oldugu i�in next. devam�n� ihtiya� yok
		
		
		int index=cumle.indexOf(kelime);   
		
		
		if (index<0) {
			System.out.println("Girilen kelime c�mlede kullan�lmam��.");
		} else if (cumle.indexOf(kelime, index+1)<0) {  // ==(-1)
			
			System.out.println("Girilen kelime c�mlede 1 kere kullan�lm��.");
		
		} else {
			
			System.out.println("Girilen kelime c�mlede 1 defadan fazla kullan�lm��t�r.");
		}
  scan.close();

	}

}
