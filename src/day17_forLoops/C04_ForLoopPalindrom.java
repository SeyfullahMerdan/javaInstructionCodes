package day17_forLoops;

import java.util.Scanner;

public class C04_ForLoopPalindrom {

	public static void main(String[] args) {
	
		// Soru 9 ) Interview Question Kullanicidan bir String isteyin.
		// Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir
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

	public static String tersineCevir(String str) {  // Önce alacagımız Stringi tersine çeviren bir method yaptık
		// Kullanıcı bir String girince o stringi bu methoda yollayacagım.
		// Bu methodda stringi tersine çevirecek 
		// Ardından if ile girilen Stringin tersine eşit olup olmadıgına bakacagım.
		
		//***** Stringi al
		//***** Boş bir variable oluştur
		//***** Alınan Stringi forLoopa sok-tersten sokacagız. *** str.length()-1 şeklinde *!*
		//***** SubstringINK-EXCL methodu ile gelen her harfi yeni ,boş string variablena atama yap ve ardından karşılaştır!!!****
		
		
		String tersStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			tersStr += str.substring(i, i + 1);

		}

		return tersStr;

	}

}