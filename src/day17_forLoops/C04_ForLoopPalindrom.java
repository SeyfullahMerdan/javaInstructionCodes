package day17_forLoops;

import java.util.Scanner;

public class C04_ForLoopPalindrom {

	public static void main(String[] args) {
	
		// Soru 9 ) Interview Question Kullanicidan bir String isteyin.
		// Kullanicinin girdigi String�in palindrome olup olmadigini kontrol eden bir
		// program yazin.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen tersten yazdirmak icin bir yazi girin...");
		String str = scan.nextLine();

		if (str.equals(tersineCevir(str))) {
			System.out.println("Girdiginiz String palindrome");
		} else {
			System.out.println("Girdiginiz String palindrome degil");
		}
		scan.close();
	}

	public static String tersineCevir(String str) {  // �nce alacag�m�z Stringi tersine �eviren bir method yapt�k
		// Kullan�c� bir String girince o stringi bu methoda yollayacag�m.
		// Bu methodda stringi tersine �evirecek 
		// Ard�ndan if ile girilen Stringin tersine e�it olup olmad�g�na bakacag�m.
		
		//***** Stringi al
		//***** Bo� bir variable olu�tur
		//***** Al�nan Stringi forLoopa sok-tersten sokacag�z. *** str.length()-1 �eklinde *!*
		//***** SubstringINK-EXCL methodu ile gelen her harfi yeni ,bo� string variablena atama yap ve ard�ndan kar��la�t�r!!!****
		
		
		String tersStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			tersStr += str.substring(i, i + 1);

		}

		return tersStr;

	}

}