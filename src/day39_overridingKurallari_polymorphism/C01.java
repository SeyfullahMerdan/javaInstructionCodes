package day39_overridingKurallari_polymorphism;

public class C01 {

	public static void staticMethod() {  // overriden
	
		System.out.println("Parent class static method");

		
	}

	@SuppressWarnings("unused")
	private void privateMethod() {
		
		System.out.println("Parent class private method");
		
	}
	
	
     public final void finalMethod() {
		
		System.out.println("Parent class final method");
		// final demek bu son hali demek
		// bir daha degi�tirilemez demektir. Bu y�zden,
		// final olarak tan�mlanan bir method override edilemez. Overridden yap�lamaz
	}
	
	
	// Child ile parent class ayn� packagede olduklar�ndan methodlar�n access modifierlar� public,protected
    // veya default olsayd� hi�bir sorun olmazd�.
	
	
     public void deneme() {
    	 
     }
     
     
     
	
	
}
