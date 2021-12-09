package day10_ternarySwitchCase;

public class C05_NestedIf {

	public static void main(String[] args) {
		
		// E�er �al��an kad�nsa 60 ya��ndan b�y�k oldu�unda emekli olabilir,
		// �al��an erkekse 65 ya��ndan b�y�kse emekli olabilir.

		// her seferinde scanner olusturmak yerine
		// ''test datalarimizi'' variable olarak da olusturabiliriz
		// ve kodun yazimi bittiginde bu test datalarini degistirerek
		// kodlarimizi test edebiliriz

		char cinsiyet = 'E';
		int yas = 60; // Bunlara TEst DAtas� denir. Her seferinde degi�tirip deneyebilirz. MAnuel
						// Testerl�k gibi...

		String sonuc = cinsiyet == 'K' ? (yas >= 60 ? "Emekli olabilirsin" : "Emekli olamazsin")
				: (yas >= 65 ? "Emekli olabilirsin" : "Emekli olamazsin");

		System.out.println(sonuc);

			
	}

}
