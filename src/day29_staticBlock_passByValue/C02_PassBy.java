package day29_staticBlock_passByValue;

public class C02_PassBy {

	public static void main(String[] args) {
		
		// 100 tl ye satýlan bir ürün için 2 farklý indirim uygulayan iki method oluþturalým.

		int fiyat=100;
		
		indirimYap25(fiyat); // Method call yapýyorum ve beni methoda götürüyor
		System.out.println("Methoddan sonra main methoddaki fiyat : "+fiyat);

		indirimYap10(fiyat);
		System.out.println("Methoddan sonra main methoddaki fiyat : "+fiyat);  // Scopelarý farklý oldugu için eski haline dönüyor.
		
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
