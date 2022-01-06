package day37_inheritance;

public class Opel extends Araba {

	protected int uretimYili=1987;
	protected String model="Vectra";
	

	
	public static void main(String[] args) {

		Araba nesne=new Araba();
		nesne.method1();    // Araba classýndan method-1 çalýþtý.

		Araba nesne2=new Opel();
		nesne2.method1();   // Opel classýndan 1. method çalýþtý.

	// Tamamý ile constructorýn farklý olmasý dolayýsý ile farklý özellikleri getirecektir.
		
	}


	public void method1() {
	
		System.out.println("Opel classýndan 1. method çalýþtý.");
		
	}
	
	
	
	
}
