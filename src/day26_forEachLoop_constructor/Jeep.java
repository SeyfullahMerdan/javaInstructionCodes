package day26_forEachLoop_constructor;

public class Jeep {


	int ilanNo=1001;               // Variable ve Methodlar�m�z var Class�m�zda. Constructoru Jeep'dir.
	String marka;                  // Bu class� obje olu�turmak i�in kullanacag�z.
	String model;
	int yil=2001;
	int fiyat=10000;
	
	
	
	public void hiz (int hiz) {
		
		System.out.println("Araba saatte " + hiz + " km yapar.");
	}
	
    public void yakit (String yakit) {
		
		System.out.println("Araba yak�t olarak " + yakit + " kullan�r.");
	}
	
	

}
