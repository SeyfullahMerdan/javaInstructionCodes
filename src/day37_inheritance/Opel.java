package day37_inheritance;

public class Opel extends Araba {

	protected int uretimYili=1987;
	protected String model="Vectra";
	

	
	public static void main(String[] args) {

		Araba nesne=new Araba();
		nesne.method1();    // Araba class�ndan method-1 �al��t�.

		Araba nesne2=new Opel();
		nesne2.method1();   // Opel class�ndan 1. method �al��t�.

	// Tamam� ile constructor�n farkl� olmas� dolay�s� ile farkl� �zellikleri getirecektir.
		
	}


	public void method1() {
	
		System.out.println("Opel class�ndan 1. method �al��t�.");
		
	}
	
	
	
	
}
