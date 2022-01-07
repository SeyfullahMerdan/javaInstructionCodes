package day38_overriding;

public class Baliklar extends Animals {

	public static void main(String[] args) {

		Baliklar balik1=new Baliklar();
		balik1.beslenme();	// �nce bu methoddda beslenme arar yoksa paretnte gider ve oradan al�r
		balik1.hareket(); // i�inde bulundugu classa bakar, parente gitme ihtiyac� duymaz.  
		balik1.solunum(); //  i�inde bulundugu classa bakar, parente gitme ihtiyac� duymaz. 
		
		balik1.beslenme(); // �st classa bakt� bulamay�nca ve oradan ald�.
		
		// Buldugunu kendi class�ndan bulamad�g�n� parentten bulup getirdi.
		
		Animals blk1=new Baliklar(); // Methodu Animalsdan al�yor, ama objeyi olu�tururken constructor�n oldugu class� dikkate al�yor.
		blk1.hareket();
		
		
		
	}

	// Buraya has bir �zellik varsa onun kullan�llas�n� isterim.
	// Bunun i�inde OVerriding var!!!****
	
	public void hareket() {   /////////// *************** Overriding Method ****************
		System.out.println("Bal�klar y�zerek hareket ederler.");
	}
	
	@Override  // benden sonra kullananlar bilsinlr diye java ve ba�kalar�na deklare etmek ad�na bu �ekilde self olarak yaz�labilir.
	public void solunum() {   // Yazmasak da Java kendisi belirler, override methodlar� bilir.
		System.out.println("Bal�klar solunga�lar� ile nefes al�r");
	}
	
	
// public void solunum() {
//	System.out.println("Bal�klar solunga�lar� ile nefes al�r");
// }   Java ayn� classda iki tane ayn� isimde method olu�turmaya izin vermez. CTE verir.
	
	
// Child classdaki bir method parent classdan bir methodu override ediyorsa istersen kendimiz manuel olarak deklare edebilriz.
// Etmesek de kodlar�m�z �al��r ancak deklare ettigimizde java overriden methodu s�rekli kontrol eder ve o methodda bir degi�iklik olursa
// CTE verir.
// O methodda overriddinge uymayan bir degi�iklik olursa CTE verir.
	
	
	
		
		
	
	
	
	
	
	
	
	
	
}
