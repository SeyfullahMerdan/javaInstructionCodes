package day17_forLoops;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		
		// Soru 8 ) Interview Question --- Kullanicidan bir String isteyin ve Stringi
		// tersine ceviren bir method yazin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir String giriniz.");
		String str = scan.next();

		tersDondur(str);

		System.out.println(tersDondur(str));

		scan.close();

	}

	
	private static String tersDondur(String str) {

		String tersStr = ""; 
		// Saklama kabı. Yazdıracak olsaydık böyle bir şeye ihtiyaç yoktu.
		// yeni kelime oalcagı için böyle bir variable oluşturmam lazım.
		// Olmazsa tersine çevirdigimizde saklayamayız. Yazdır demiyorsa sakla demektir.
		
		for (int i = str.length() - 1; i >= 0; i--) {
			tersStr += str.substring(i, i + 1);
		}

		return tersStr;
	}

	
	
	
	
}