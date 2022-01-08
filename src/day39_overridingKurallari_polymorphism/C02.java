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
		
		// data trü C01 oldugundan öncelikle C01 classýndan methoda bakmamýz gerekir ancak private oldugundan 
		// ulaþamadýgýmýz bir methodu override yapamyýz.
		// dolayýsý ile signature ayný olmasýna ragmen bu iki methodu farklý olarak görür
		
		
		obj2.staticMethod();
		// static methodlar override edilemez..
	   // dolayýsý ile signature ayný olmasýna ragmen bu ikisini farklý method olarak görür
	// çalýþýyor fakat parent classdkini getiriyor. Normalde child classsý getirmeliydi.
	
	
	}

	   // -- override kabul etmedi, private oldugu için dedi.
	private void privateMethod() {
		
		System.out.println("Child class private method");
	}
	
	
     /* public final void finalMethod() { // final olarak tanýmlanan bir method override edilemez. Overridden yapýlamaz
		
		System.out.println("Childs class final method");
		
	} */
	
	public void deneme() {
   	 System.out.println("deneme");
    }
	
	
	
	
}
