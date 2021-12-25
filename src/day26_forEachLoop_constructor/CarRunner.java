package day26_forEachLoop_constructor;

public class CarRunner {

	public static void main(String[] args) {
	
		// Bir depomuz olur. Variablelarý koyarýz, runner da ise kodu çalýþtýrýrýz.
        // Car class'indan bir obje oluþturalým.
		
		   Car          car           =               new                                               Car();
    // class ismi     obje adý      assignment    keyword-anahtarsözcük-yeniobje anlamýnda         Constructor (call) //...Çalýþtýr der gibi...
		
        System.out.println(car.km);	// Deger atamadýk ama Java default deger atayacak. 	// 0
		System.out.println(car.model);  //null
		
		// Java'da Obje oluþturmak istiyorsak Constructor kullanmak zorundayýz. Constructor Javanýn oluþturdugu kod blogudur !!!
		// Method veya Variable degildir!!! Java'nýn oluþturdugu kodlar bloðu denebilir. Yapýcýdýr,Müteahhit-Kalfa denebilir.
		
		System.out.println(car.km +" "+ car.model+" "+car.renk+" "+car.yil);
		
		// Bir obje oluþtururken eðer obje için kendi classýnda belirlenen degerleri kullanmak istiyorsam
		// hiç bir degeri kendim atamadan obje oluþturabilirim.
		// Bu durumda hiç bir parametre kullanýlmadýgý için default constructor yeterli olacaktýr.
		
		// eðer obje oluþturdugum classdaki degerleri kullanamk yerine, kendi degerlerimle bir obje oluþturmak istersem
		// o zaman parametreli constructor oluþturmam gerekir.
		
		// Car car2=new Car("Kýrmýzý" , "Corolla"  );
		// Car classýnda iki String parametresi olan bir constructor olmadýgý için bu obje oluþturmayý yapamayýz.
		
		
	}

}
