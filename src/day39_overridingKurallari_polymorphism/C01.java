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
		// bir daha degiþtirilemez demektir. Bu yüzden,
		// final olarak tanýmlanan bir method override edilemez. Overridden yapýlamaz
	}
	
	
	// Child ile parent class ayný packagede olduklarýndan methodlarýn access modifierlarý public,protected
    // veya default olsaydý hiçbir sorun olmazdý.
	
	
     public void deneme() {
    	 
     }
     
     
     
	
	
}
