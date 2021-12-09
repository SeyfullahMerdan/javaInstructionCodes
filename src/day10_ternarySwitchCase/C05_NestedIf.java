package day10_ternarySwitchCase;

public class C05_NestedIf {

	public static void main(String[] args) {
		
		// Eðer çalýþan kadýnsa 60 yaþýndan büyük olduðunda emekli olabilir,
		// Çalýþan erkekse 65 yaþýndan büyükse emekli olabilir.

		// her seferinde scanner olusturmak yerine
		// ''test datalarimizi'' variable olarak da olusturabiliriz
		// ve kodun yazimi bittiginde bu test datalarini degistirerek
		// kodlarimizi test edebiliriz

		char cinsiyet = 'E';
		int yas = 60; // Bunlara TEst DAtasý denir. Her seferinde degiþtirip deneyebilirz. MAnuel
						// Testerlýk gibi...

		String sonuc = cinsiyet == 'K' ? (yas >= 60 ? "Emekli olabilirsin" : "Emekli olamazsin")
				: (yas >= 65 ? "Emekli olabilirsin" : "Emekli olamazsin");

		System.out.println(sonuc);

			
	}

}
