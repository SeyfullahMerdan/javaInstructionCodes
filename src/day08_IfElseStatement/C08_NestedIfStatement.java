package day08_IfElseStatement;

import java.util.Scanner;

public class C08_NestedIfStatement {

	public static void main(String[] args) {
		

		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir, // 2 durum
		// ve 2 durumun her birinde 2'þer durum.. (1>>2 // 1>>2)
		// calisan erkekse 65 yasindan buyukse emekli olabilir

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen cinsiyetinizi giriniz. \nErkek için 'E'; Kadýn için 'K' giriniz."); // iki duruum
																										// mevut:..K
																										// veya E...;60
																										// veya 65...
		char cinsiyet = scan.next().toUpperCase().charAt(0); // sonucu alabilmek iki duruma baglanmýþ , bu yüzden birini
																// seçiyorum

		System.out.println("Lütfen yaþýnýzý giriniz."); // kolay ve mantýklý olmasý nedeni ile cinsiyeti alarak
														// baþladýk. Çünkü E ve K
		double yas = scan.nextDouble(); // diðerinde ihtimaller fazla ama cinsiyette ihtimaller az....

		if (cinsiyet == 'E') {

			if (yas > 65) {
				System.out.println("Emekli Olabilirsiniz. Tebrikler. Emekliliginizin tadýný çýkarýn!");
			} else {
				System.out.println("Ne yazýk ki Emekli Olamazsýnýz.");
			}
		}

		else if (cinsiyet == 'K') {

			if (yas > 60) {
				System.out.println("Emekli Olabilirsiniz. Tebrikler. Emekliliginizin tadýný çýkarýn!");
			} else {
				System.out.println("Ne yazýk ki Emekli Olamazsýnýz.");
			}

		}

		else {
			System.out.println("Lütfen geçerli bir cinsiyet giriniz.");
		}

		scan.close();

	}

}
