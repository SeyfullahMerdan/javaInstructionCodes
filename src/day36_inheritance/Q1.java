package day36_inheritance;

class Derived {
	
	  
	  
	 public Derived(String temp) {
		System.out.println("Derived Class : "+temp);
	  }
}




   class Test01 extends Derived {
	
	public Test01(String temp) {     // Ben buraya elle super paramtreli koymazsam java buraya default const. koyar.
		super(temp) ;        // parametreli constructor çagýrmak istiyorsak biz de super() paramtreli oluþturmalýyýz.                  
		System.out.println("Test Class : " + temp);
	}
	  
	 @SuppressWarnings("unused")
	public static void main(String[] args)  {
		 
		 Test01 obj=new Test01("Merdan");
		 
	 }
	  
	  
	
}