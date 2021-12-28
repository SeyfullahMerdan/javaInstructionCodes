package day27_constructor_constructorCall;

public class Tir {

	
	int yil=2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;
	

	public Tir(int i, String string, String string2, int j, boolean b) {
		    // int km, String model, String renk, int yil, boolean satilikMi
		
		// Tir runner classýndan yolladýgýmýz degerlerin instance variablelar
		// ile eþleþmesi için atamalarý yapmam lazým.
		
		km=i;
		model=string;
		renk=string2;
		yil=j;
		satilikMi=b;
	
	}


	public Tir(int km, String model, String renk) {
	
		// i , string ve string2 isim olarak güzel isimler degil.
		// kodumuzu sonradan incelerken anlaþýlýr degil, daha anlaþýlýr olmasý için
		// variable isimlerini anlamlý yapalým.      km - model - renk gibi mesela...
		
		 this.km=km;
		 this.model=model;
		 this.renk=renk;
		
		 // Baþýna this. yazdýgýmýzda java bu variablein class levelddaki oldugunu anlar.
		 
	}


}
