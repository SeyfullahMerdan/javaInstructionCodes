package day34_accessModifier_encapsulation;

public class C06_Encapsulation {

	public static void main(String[] args) {

		C05 obj = new C05();
		// System.out.println(obj.asgariMaas);
		// obj.asgariMaas=5000; // obje için asgari maası degiştirebiliyrum. Default
		// oldugunda
		// asgariMaas=6000; // assign yapamıyorum. Sadece görüntüleme ve şahıs baznda
		// degiştirebiliyorum.

		// Classic access modifierlarımzı ile bir variablea ulaşabilirsek
		// istedigimiz zaman degiştirme seçenegimiz de olur.

		System.out.println(obj.getAsgariMaas()); // 4000
		// obj.getAsgariMaas()=5000; Sadece görebiliyorum, yazdırabiliyorum ama assign
		// edemiyorum yeni bir degere....

	}

}
