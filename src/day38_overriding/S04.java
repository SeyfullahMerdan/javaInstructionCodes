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
		Derived02 obj = new Derived02();  // HEm data t�r� hem constructor parent classdan
		obj.getDetails();           // dolay�s�yla ikisi de parentten al���r, a�ag� inmez
	}                          // nerde olu�turudugunun bir �nemi yok. Her iksi de paretntten
                  // tamam� ile Derived class�ndan �al��acak!!!!**************
}