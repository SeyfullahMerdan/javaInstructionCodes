package day34_accessModifier_encapsulation;

public class C06_Encapsulation {

	public static void main(String[] args) {

		C05 obj = new C05();
		// System.out.println(obj.asgariMaas);
		// obj.asgariMaas=5000; // obje i�in asgari maas� degi�tirebiliyrum. Default
		// oldugunda
		// asgariMaas=6000; // assign yapam�yorum. Sadece g�r�nt�leme ve �ah�s baznda
		// degi�tirebiliyorum.

		// Classic access modifierlar�mz� ile bir variablea ula�abilirsek
		// istedigimiz zaman degi�tirme se�enegimiz de olur.

		System.out.println(obj.getAsgariMaas()); // 4000
		// obj.getAsgariMaas()=5000; Sadece g�rebiliyorum, yazd�rabiliyorum ama assign
		// edemiyorum yeni bir degere....

	}

}
