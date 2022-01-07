package day38_overriding;

class Derived01{
	public void getDetails() {     // Overriden - Override edilmi� yazar Java direk!
		System.out.println("Derived class ");  // Kod buraya ��k�nca bidakka der ve a�ag� geri d�ner
	}
}


public class S03 extends Derived01{
	
	public void getDetails() {
		System.out.println("Test class ");
		super.getDetails();    // Parent classdaki class �yesini getir demek!!! A�ag� geldi ama yine bunu g�rd�
	}      // ilk �al�t� yazd� sonra yukar�dki parenttekini yazd�rd�

	public static void main(String[] args) {
		
		Derived01 obj = new S03();
		obj.getDetails();
	}

}

