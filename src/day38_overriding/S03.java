package day38_overriding;

class Derived01{
	public void getDetails() {     // Overriden - Override edilmiþ yazar Java direk!
		System.out.println("Derived class ");  // Kod buraya çýkýnca bidakka der ve aþagý geri döner
	}
}


public class S03 extends Derived01{
	
	public void getDetails() {
		System.out.println("Test class ");
		super.getDetails();    // Parent classdaki class üyesini getir demek!!! Aþagý geldi ama yine bunu gördü
	}      // ilk çalýtý yazdý sonra yukarýdki parenttekini yazdýrdý

	public static void main(String[] args) {
		
		Derived01 obj = new S03();
		obj.getDetails();
	}

}

