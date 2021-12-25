package day26_forEachLoop_constructor;

public class Jeep {


	int ilanNo=1001;               // Variable ve Methodlarýmýz var Classýmýzda. Constructoru Jeep'dir.
	String marka;                  // Bu classý obje oluþturmak için kullanacagýz.
	String model;
	int yil=2001;
	int fiyat=10000;
	
	
	
	public void hiz (int hiz) {
		
		System.out.println("Araba saatte " + hiz + " km yapar.");
	}
	
    public void yakit (String yakit) {
		
		System.out.println("Araba yakýt olarak " + yakit + " kullanýr.");
	}
	
	

}
