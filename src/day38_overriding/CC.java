package day38_overriding;

public class CC extends B {


	public static void main(String[] args) {
		
	    A obj1= new CC();
        obj1.solunum();
	
	
	}
	
	
	
	public void hareket () {
		System.out.println( "Child C");
	}
	
	public void solunum () {
		System.out.println( "Child C");
		
	}
	

}