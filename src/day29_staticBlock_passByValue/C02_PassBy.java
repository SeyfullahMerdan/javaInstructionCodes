package day29_staticBlock_passByValue;

public class C02_PassBy {

	public static void main(String[] args) {
		
		// 100 tl ye sat�lan bir �r�n i�in 2 farkl� indirim uygulayan iki method olu�tural�m.

		int fiyat=100;
		
		indirimYap25(fiyat); // Method call yap�yorum ve beni methoda g�t�r�yor
		System.out.println("Methoddan sonra main methoddaki fiyat : "+fiyat);

		indirimYap10(fiyat);
		System.out.println("Methoddan sonra main methoddaki fiyat : "+fiyat);  // Scopelar� farkl� oldugu i�in eski haline d�n�yor.
		
	}

	
	
	private static void indirimYap25(int fiyat) {

		fiyat*=0.75;
		System.out.println("%25 indirimli fiyat : " + fiyat);
		
	}

	
	private static void indirimYap10(int fiyat) {

		fiyat*=0.90;
		System.out.println("%10 indirimli fiyat : " + fiyat);
		
		
	}
	
	
}
