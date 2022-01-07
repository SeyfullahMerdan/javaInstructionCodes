package day38_overriding;

class Derived02{
	protected  void getDetails() {                     // Overriden
		System.out.println("Derived class ");
	}
}

public class S04 extends Derived02{                   // Overriding
	
	protected  void getDetails() {
		System.out.println("Test class ");
	}
	

	public static void main(String[] args) {
		Derived02 obj = new Derived02();  // HEm data türü hem constructor parent classdan
		obj.getDetails();           // dolayýsýyla ikisi de parentten alýþýr, aþagý inmez
	}                          // nerde oluþturudugunun bir önemi yok. Her iksi de paretntten
                  // tamamý ile Derived classýndan çalýþacak!!!!**************
}