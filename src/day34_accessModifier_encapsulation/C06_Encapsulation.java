package day34_accessModifier_encapsulation;

public class C06_Encapsulation {

	public static void main(String[] args) {

		C05 obj = new C05();
		// System.out.println(obj.asgariMaas);
		// obj.asgariMaas=5000; // obje için asgari maasý degiþtirebiliyrum. Default
		// oldugunda
		// asgariMaas=6000; // assign yapamýyorum. Sadece görüntüleme ve þahýs baznda
		// degiþtirebiliyorum.

		// Classic access modifierlarýmzý ile bir variablea ulaþabilirsek
		// istedigimiz zaman degiþtirme seçenegimiz de olur.

		System.out.println(obj.getAsgariMaas()); // 4000
		// obj.getAsgariMaas()=5000; Sadece görebiliyorum, yazdýrabiliyorum ama assign
		// edemiyorum yeni bir degere....

	}

}
