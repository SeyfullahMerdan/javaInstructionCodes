package day27_constructor_constructorCall;

public class Tir {

	
	int yil=2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;
	

	public Tir(int i, String string, String string2, int j, boolean b) {
		    // int km, String model, String renk, int yil, boolean satilikMi
		
		// Tir runner class�ndan yollad�g�m�z degerlerin instance variablelar
		// ile e�le�mesi i�in atamalar� yapmam laz�m.
		
		km=i;
		model=string;
		renk=string2;
		yil=j;
		satilikMi=b;
	
	}


	public Tir(int km, String model, String renk) {
	
		// i , string ve string2 isim olarak g�zel isimler degil.
		// kodumuzu sonradan incelerken anla��l�r degil, daha anla��l�r olmas� i�in
		// variable isimlerini anlaml� yapal�m.      km - model - renk gibi mesela...
		
		 this.km=km;
		 this.model=model;
		 this.renk=renk;
		
		 // Ba��na this. yazd�g�m�zda java bu variablein class levelddaki oldugunu anlar.
		 
	}


}
