package day27_constructor_constructorCall;

public class Car1 {



	int yil=2000;             // Bu kal�ba uymak �art� ile bu kal�b�n �zelliklerini degi�tirebilriz !!!***    
	String renk;
	String model;
	int km;                 // Burada kal�p olarak ne eklenmi�sse onu kullanabiliriz. Yeni ekleyemeyiz
	                       // Ancak deger atams�n� Runner classda yapabiliriz.
	boolean satilikMi;     // Lego adam nas�l kal�planm��sa o, kafas� yoksa, kafay� ekleyemeyiz ama rengini,k�yafetini vs. degi�tiririz.
	
	public Car1(int km, String model, String renk, int yil, boolean satilikMi) {
		// atama yapacagimiz tum ozellikleri parametre olarak yolladik
	}
	

                          // Planlarken kal�b� �ok iyi planlamal�y�z.
	public Car1() {
		                  // Bu parametresiz olmak zorunda degil ama digr classlarda buna bagl� objeler olabilir
		                 // Bu y�zden mutlaka bir tane default constructor olu�turmak laz�m.
	}



	public Car1(int i) { // bu satirdaki int km ile class level'daki int km farkli scope'lardadir    // Instance Variable --- Lokal Variable fark�...
		km=i;            // ayn� isimde diye birbirinin ayn�s� g�rmez.  // Javaya bu ikisinin ayn� variable oldugunu s�ylemem gerekiyor.
	}



	public Car1(int i, int j) {
		// yil     km
		
		yil=i;
		km=j;
		
	}



	
	
	public void Hiz(int hiz) {
		System.out.println("araba saatte " + hiz + " km yapar");
	}
	
	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanir");
	}
	
	
	

}
