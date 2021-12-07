package day03_Scanner;

public class C01_Variables {

	public static void main(String[] args) {
		
		/*
		 * 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin 
		 * 2- isim ve soyisim icin iki variable olusturun ve bunlari isminiz : Mehmet soyisminiz : Bulutluoz seklinde yazdirin 
		 * 3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin 
		 * 4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin 
		 * 5– char data turunde bir variable olusturun ve yazdirin 
		 * 6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.
		 */
		
		String ismim="Seyfullah Merdan" ;
		int yasim=31;
	    char memleketIlkHarf='M';
	    boolean ErkekMisin= true;
	    
	    System.out.println(ismim);
	    System.out.println(yasim);
		System.out.println(memleketIlkHarf);
		System.out.println(ErkekMisin);
		
		
		String isminiz="Hatice";
		String soyisminiz="Kasli";
		
		
		System.out.println("isminiz : "  + isminiz);
		System.out.println("soyisminiz : "  + soyisminiz);
		
		
		
		
		int a=10;
		short b=20;
		
		System.out.println(a+b);  // ikisini toplar. toplamýný yapar.
		
		
		char ismininBasHarfi='S';
		System.out.println(ismininBasHarfi);
		
		
		
		// Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.
		
		
		int sayi=45;
		char karakter='a';  //  a 'nýn ASCII degeri 97 oluyor.
		
		System.out.println(sayi+karakter);     // ASCII Tableye göre deðer alýyor. 
		// char degiskenler matematiksel isleme sokulursa char degiskenin barindirdigi karakterin ASCII degeri isleme girer.

		
		
		
		
		
	}

}
