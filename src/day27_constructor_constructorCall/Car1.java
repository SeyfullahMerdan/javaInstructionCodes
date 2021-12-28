package day27_constructor_constructorCall;

public class Car1 {



	int yil=2000;             // Bu kalýba uymak þartý ile bu kalýbýn özelliklerini degiþtirebilriz !!!***    
	String renk;
	String model;
	int km;                 // Burada kalýp olarak ne eklenmiþsse onu kullanabiliriz. Yeni ekleyemeyiz
	                       // Ancak deger atamsýný Runner classda yapabiliriz.
	boolean satilikMi;     // Lego adam nasýl kalýplanmýþsa o, kafasý yoksa, kafayý ekleyemeyiz ama rengini,kýyafetini vs. degiþtiririz.
	
	public Car1(int km, String model, String renk, int yil, boolean satilikMi) {
		// atama yapacagimiz tum ozellikleri parametre olarak yolladik
	}
	

                          // Planlarken kalýbý çok iyi planlamalýyýz.
	public Car1() {
		                  // Bu parametresiz olmak zorunda degil ama digr classlarda buna baglý objeler olabilir
		                 // Bu yüzden mutlaka bir tane default constructor oluþturmak lazým.
	}



	public Car1(int i) { // bu satirdaki int km ile class level'daki int km farkli scope'lardadir    // Instance Variable --- Lokal Variable farký...
		km=i;            // ayný isimde diye birbirinin aynýsý görmez.  // Javaya bu ikisinin ayný variable oldugunu söylemem gerekiyor.
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
