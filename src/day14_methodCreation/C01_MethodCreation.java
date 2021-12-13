package day14_methodCreation;

public class C01_MethodCreation {

	public static void main(String[] args) {
	
		

		// SORU ::: Verilen iki sayýnýn toplamýný ve çarpýmýný yapýp yazdýran iki ayrý method oluþturun
		
		// method oluþturmak için 4 adým takip edelim.
		// 1. adým    method call yazýyoruz
		// 2. adým    methoda arguman yazacak mýyým yazmayacak mýyým? 
		
		
		int sayi1=4;
		int sayi2=5;
		
		toplama(sayi1, sayi2);  // method call       // java itiraz ediyor. method oluþturman gerek diyor. methodu bulamýyorum diyor
		// 3. adým   olarak 1. ve 2. adýmý yaptýktan sonra java'dan yardým alýp method oluþturuyorum.
        // toplama nýn üzerine týklayýnca methodu oluþturur java.
		
		
		
		carpma(sayi1,sayi2);
		
		
		int sayi3=4;
		int sayi4=6;
		
		toplama(sayi3,sayi4);
		
	}

	
	
	
	
	
	private static void carpma(int sayi1, int sayi2) {

		System.out.println("Sayýlarýn çarpýmý : "+(sayi1*sayi2));
		
		
		
		
	}


	public static void toplama(int sayi1, int sayi2) {
		
		// 4.adim erisim duzenleyici ve return type'a karar vermeliyiz
        //  erisim duzenleyici axcess modifier : public yaptik
        //  return type : bizden sadece yazdirma istedigi icin void kalabilir
		
		System.out.println("Sayýlarýn toplamý : "+(sayi1+sayi2));
		
		
	}

}