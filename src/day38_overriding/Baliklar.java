package day38_overriding;

public class Baliklar extends Animals {

	public static void main(String[] args) {

		Baliklar balik1=new Baliklar();
		balik1.beslenme();	// Önce bu methoddda beslenme arar yoksa paretnte gider ve oradan alýr
		balik1.hareket(); // içinde bulundugu classa bakar, parente gitme ihtiyacý duymaz.  
		balik1.solunum(); //  içinde bulundugu classa bakar, parente gitme ihtiyacý duymaz. 
		
		balik1.beslenme(); // üst classa baktý bulamayýnca ve oradan aldý.
		
		// Buldugunu kendi classýndan bulamadýgýný parentten bulup getirdi.
		
		Animals blk1=new Baliklar(); // Methodu Animalsdan alýyor, ama objeyi oluþtururken constructorýn oldugu classý dikkate alýyor.
		blk1.hareket();
		
		
		
	}

	// Buraya has bir özellik varsa onun kullanýllasýný isterim.
	// Bunun içinde OVerriding var!!!****
	
	public void hareket() {   /////////// *************** Overriding Method ****************
		System.out.println("Balýklar yüzerek hareket ederler.");
	}
	
	@Override  // benden sonra kullananlar bilsinlr diye java ve baþkalarýna deklare etmek adýna bu þekilde self olarak yazýlabilir.
	public void solunum() {   // Yazmasak da Java kendisi belirler, override methodlarý bilir.
		System.out.println("Balýklar solungaçlarý ile nefes alýr");
	}
	
	
// public void solunum() {
//	System.out.println("Balýklar solungaçlarý ile nefes alýr");
// }   Java ayný classda iki tane ayný isimde method oluþturmaya izin vermez. CTE verir.
	
	
// Child classdaki bir method parent classdan bir methodu override ediyorsa istersen kendimiz manuel olarak deklare edebilriz.
// Etmesek de kodlarýmýz çalýþr ancak deklare ettigimizde java overriden methodu sürekli kontrol eder ve o methodda bir degiþiklik olursa
// CTE verir.
// O methodda overriddinge uymayan bir degiþiklik olursa CTE verir.
	
	
	
		
		
	
	
	
	
	
	
	
	
	
}
