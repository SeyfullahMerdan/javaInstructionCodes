package day14_methodCreation;

public class C01_MethodCreation {

	public static void main(String[] args) {
	
		

		// SORU ::: Verilen iki say�n�n toplam�n� ve �arp�m�n� yap�p yazd�ran iki ayr� method olu�turun
		
		// method olu�turmak i�in 4 ad�m takip edelim.
		// 1. ad�m    method call yaz�yoruz
		// 2. ad�m    methoda arguman yazacak m�y�m yazmayacak m�y�m? 
		
		
		int sayi1=4;
		int sayi2=5;
		
		toplama(sayi1, sayi2);  // method call       // java itiraz ediyor. method olu�turman gerek diyor. methodu bulam�yorum diyor
		// 3. ad�m   olarak 1. ve 2. ad�m� yapt�ktan sonra java'dan yard�m al�p method olu�turuyorum.
        // toplama n�n �zerine t�klay�nca methodu olu�turur java.
		
		
		
		carpma(sayi1,sayi2);
		
		
		int sayi3=4;
		int sayi4=6;
		
		toplama(sayi3,sayi4);
		
	}

	
	
	
	
	
	private static void carpma(int sayi1, int sayi2) {

		System.out.println("Say�lar�n �arp�m� : "+(sayi1*sayi2));
		
		
		
		
	}


	public static void toplama(int sayi1, int sayi2) {
		
		// 4.adim erisim duzenleyici ve return type'a karar vermeliyiz
        //  erisim duzenleyici axcess modifier : public yaptik
        //  return type : bizden sadece yazdirma istedigi icin void kalabilir
		
		System.out.println("Say�lar�n toplam� : "+(sayi1+sayi2));
		
		
	}

}