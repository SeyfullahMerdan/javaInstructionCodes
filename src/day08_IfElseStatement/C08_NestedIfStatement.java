package day08_IfElseStatement;

import java.util.Scanner;

public class C08_NestedIfStatement {

	public static void main(String[] args) {
		

		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir, // 2 durum
		// ve 2 durumun her birinde 2'�er durum.. (1>>2 // 1>>2)
		// calisan erkekse 65 yasindan buyukse emekli olabilir

		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen cinsiyetinizi giriniz. \nErkek i�in 'E'; Kad�n i�in 'K' giriniz."); // iki duruum
																										// mevut:..K
																										// veya E...;60
																										// veya 65...
		char cinsiyet = scan.next().toUpperCase().charAt(0); // sonucu alabilmek iki duruma baglanm�� , bu y�zden birini
																// se�iyorum

		System.out.println("L�tfen ya��n�z� giriniz."); // kolay ve mant�kl� olmas� nedeni ile cinsiyeti alarak
														// ba�lad�k. ��nk� E ve K
		double yas = scan.nextDouble(); // di�erinde ihtimaller fazla ama cinsiyette ihtimaller az....

		if (cinsiyet == 'E') {

			if (yas > 65) {
				System.out.println("Emekli Olabilirsiniz. Tebrikler. Emekliliginizin tad�n� ��kar�n!");
			} else {
				System.out.println("Ne yaz�k ki Emekli Olamazs�n�z.");
			}
		}

		else if (cinsiyet == 'K') {

			if (yas > 60) {
				System.out.println("Emekli Olabilirsiniz. Tebrikler. Emekliliginizin tad�n� ��kar�n!");
			} else {
				System.out.println("Ne yaz�k ki Emekli Olamazs�n�z.");
			}

		}

		else {
			System.out.println("L�tfen ge�erli bir cinsiyet giriniz.");
		}

		scan.close();

	}

}
