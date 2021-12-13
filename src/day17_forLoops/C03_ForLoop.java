package day17_forLoops;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		
		// Soru 8 ) Interview Question --- Kullanicidan bir String isteyin ve Stringi
		// tersine ceviren bir method yazin.

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir String giriniz.");
		String str = scan.next();

		tersDondur(str);

		System.out.println(tersDondur(str));

		scan.close();

	}

	
	private static String tersDondur(String str) {

		String tersStr = ""; 
		// Saklama kab�. Yazd�racak olsayd�k b�yle bir �eye ihtiya� yoktu.
		// yeni kelime oalcag� i�in b�yle bir variable olu�turmam laz�m.
		// Olmazsa tersine �evirdigimizde saklayamay�z. Yazd�r demiyorsa sakla demektir.
		
		for (int i = str.length() - 1; i >= 0; i--) {
			tersStr += str.substring(i, i + 1);
		}

		return tersStr;
	}

	
	
	
	
}