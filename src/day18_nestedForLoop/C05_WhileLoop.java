package day18_nestedForLoop;

public class C05_WhileLoop {

	public static void main(String[] args) {
		
		// For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na tam
		// bolunebilen sayilari yazdirin.

		for (int i = 100; i < 1000; i++) {

			if (i % 15 == 0 && i % 20 == 0 && i % 90 == 0) { // for Loop ile.. Bu soru daha kolay
				System.out.println(i);
			}
		}
		//////////////////////////////////////////////////////////////////////////////////////////////////////
		int sayi = 100;

		while (sayi < 1000) {
			if (sayi % 15 == 0 && sayi % 20 == 0 && sayi % 90 == 0) {
				System.out.println(sayi);
			}
			sayi++;
		} // while parantezi

		// Eger baþlangýç ve bitiþ þartý bir sayýnýn artýþýna baglý ise veya tekrar
		// edilcek iþlem adedi belli ise for loop tercih edilir.

		// islem tekrar sayisi belli degilse veya
		// bitis icin bir sinir degerinden buyuk olma gibi bir sart varsa while loop
		// tercih edilir

	}

}
