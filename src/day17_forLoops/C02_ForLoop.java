package day17_forLoops;

import java.util.Scanner;

public class C02_ForLoop {

	public static void main(String[] args) {
		
		// Soru 7 ) Interview Question... Kullanicidan bir String isteyin ve Stringi
		// tersten yazdirin.
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen tersten yazd�rmak i�in bir yaz� giriniz.");
		String str = scan.nextLine();

		// cekoslavakyalilastiramadiklarimizdanmisiniz. 
		// Son indexten ba�lar 0'a kadar gelir 
		// son harf-indexi: ''length()-1''

		for (int i=str.length()-1 ; i >= 0; i--) {

			System.out.print(str.substring(i, i + 1)); // Substring ile inklusive-exclusive yaparak rakamlar� tek tek yan yana yazd�rd�m!**
		}

		scan.close();
	
	}
	
}