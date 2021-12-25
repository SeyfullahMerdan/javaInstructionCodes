package day26_forEachLoop_constructor;

public class CarRunner {

	public static void main(String[] args) {
	
		// Bir depomuz olur. Variablelar� koyar�z, runner da ise kodu �al��t�r�r�z.
        // Car class'indan bir obje olu�tural�m.
		
		   Car          car           =               new                                               Car();
    // class ismi     obje ad�      assignment    keyword-anahtars�zc�k-yeniobje anlam�nda         Constructor (call) //...�al��t�r der gibi...
		
        System.out.println(car.km);	// Deger atamad�k ama Java default deger atayacak. 	// 0
		System.out.println(car.model);  //null
		
		// Java'da Obje olu�turmak istiyorsak Constructor kullanmak zorunday�z. Constructor Javan�n olu�turdugu kod blogudur !!!
		// Method veya Variable degildir!!! Java'n�n olu�turdugu kodlar blo�u denebilir. Yap�c�d�r,M�teahhit-Kalfa denebilir.
		
		System.out.println(car.km +" "+ car.model+" "+car.renk+" "+car.yil);
		
		// Bir obje olu�tururken e�er obje i�in kendi class�nda belirlenen degerleri kullanmak istiyorsam
		// hi� bir degeri kendim atamadan obje olu�turabilirim.
		// Bu durumda hi� bir parametre kullan�lmad�g� i�in default constructor yeterli olacakt�r.
		
		// e�er obje olu�turdugum classdaki degerleri kullanamk yerine, kendi degerlerimle bir obje olu�turmak istersem
		// o zaman parametreli constructor olu�turmam gerekir.
		
		// Car car2=new Car("K�rm�z�" , "Corolla"  );
		// Car class�nda iki String parametresi olan bir constructor olmad�g� i�in bu obje olu�turmay� yapamay�z.
		
		
	}

}
