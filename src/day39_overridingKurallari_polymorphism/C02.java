package day39_overridingKurallari_polymorphism;

public class C02 extends C01 {

	
	@SuppressWarnings("static-access")
	public static void staticMethod() { // overriding
		
		System.out.println("Child class static method");

		
		C02 obj1=new C02();
		obj1.privateMethod();
		obj1.staticMethod();
		
		
		C01 obj2=new C02();
		
		//obj2.privateMethod();
		
		// data tr� C01 oldugundan �ncelikle C01 class�ndan methoda bakmam�z gerekir ancak private oldugundan 
		// ula�amad�g�m�z bir methodu override yapamy�z.
		// dolay�s� ile signature ayn� olmas�na ragmen bu iki methodu farkl� olarak g�r�r
		
		
		obj2.staticMethod();
		// static methodlar override edilemez..
	   // dolay�s� ile signature ayn� olmas�na ragmen bu ikisini farkl� method olarak g�r�r
	// �al���yor fakat parent classdkini getiriyor. Normalde child classs� getirmeliydi.
	
	
	}

	   // -- override kabul etmedi, private oldugu i�in dedi.
	private void privateMethod() {
		
		System.out.println("Child class private method");
	}
	
	
     /* public final void finalMethod() { // final olarak tan�mlanan bir method override edilemez. Overridden yap�lamaz
		
		System.out.println("Childs class final method");
		
	} */
	
	public void deneme() {
   	 System.out.println("deneme");
    }
	
	
	
	
}
