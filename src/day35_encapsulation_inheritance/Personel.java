package day35_encapsulation_inheritance;

public class Personel {

	protected String isim;
	protected String soyisim;
	protected boolean calisiyorMu;
	protected String telNo;
	protected int yas;
	
	Personel (){
		
		// kendim 36. derste constructor ekledim.
		System.out.println("Personel parametresiz constructor �al��t�"); // >>>>>>>>>�al��t�g�n� g�rmek i�in i�ine SYSO ile yazd�r�yorum.
	}
	
	
	// Eger Variablelara access modifier yazmazsak JAva default olarak otomatik access modifier atar.
	// B�yle olursa sadce o package alt�ndaki child classlar Personal class�n� inherit edebilir.
	
	// Ba�ka packagelerdeki child classlar�nda
	// pErsonali inherit edebilmesi i�in variable ve methodlar�n access modifierini protected yapmal�yz
	
	// Public de yap�labilir ama herkesin degil de child classlar�n eri�ebilmesi i�in protected yapar�z.
	
	
	
	
	public static void main(String[] args) {

	}

	
	
	
}

