package day35_encapsulation_inheritance;

public class Personel {

	protected String isim;
	protected String soyisim;
	protected boolean calisiyorMu;
	protected String telNo;
	protected int yas;
	
	Personel (){
		
		// kendim 36. derste constructor ekledim.
		System.out.println("Personel parametresiz constructor çalýþtý"); // >>>>>>>>>Çalýþtýgýný görmek için içine SYSO ile yazdýrýyorum.
	}
	
	
	// Eger Variablelara access modifier yazmazsak JAva default olarak otomatik access modifier atar.
	// Böyle olursa sadce o package altýndaki child classlar Personal classýný inherit edebilir.
	
	// Baþka packagelerdeki child classlarýnda
	// pErsonali inherit edebilmesi için variable ve methodlarýn access modifierini protected yapmalýyz
	
	// Public de yapýlabilir ama herkesin degil de child classlarýn eriþebilmesi için protected yaparýz.
	
	
	
	
	public static void main(String[] args) {

	}

	
	
	
}

