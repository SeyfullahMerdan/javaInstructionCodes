package day41_Errors_GarbageCollector;

public class C02 {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 3; i--) {
		
			System.out.println(i + " " );
			
		} // Sonsuz döngüye giriyor. Çalýþýr çalýþýr , sonunda ram veya hafýza dolduktan sonra
		// kitlenir. Kod çalýþýr ama en sonunda error verir.
		
	//  Errorlar öngörülemez ve ne olacagý bilinemez. Throwable classýnýn alt classýdýr. Handle edilemez.
	//	Errorlar halledilemezler. Exceptionlar halledilebilir. Errorlar runtime'da ortaya çýkar.
		
	// C01_Final.pi=5;  Final variable degiþtirilemez
		

	}

}
