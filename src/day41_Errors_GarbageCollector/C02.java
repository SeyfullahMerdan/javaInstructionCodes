package day41_Errors_GarbageCollector;

public class C02 {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 3; i--) {
		
			System.out.println(i + " " );
			
		} // Sonsuz d�ng�ye giriyor. �al���r �al���r , sonunda ram veya haf�za dolduktan sonra
		// kitlenir. Kod �al���r ama en sonunda error verir.
		
	//  Errorlar �ng�r�lemez ve ne olacag� bilinemez. Throwable class�n�n alt class�d�r. Handle edilemez.
	//	Errorlar halledilemezler. Exceptionlar halledilebilir. Errorlar runtime'da ortaya ��kar.
		
	// C01_Final.pi=5;  Final variable degi�tirilemez
		

	}

}
