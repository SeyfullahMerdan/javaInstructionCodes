package day34_accessModifier_encapsulation;

public class C04_PublicVeriPaylasimi {

	public static void main(String[] args) {

		C03 obj = new C03(); // Veriler public oldugunda ba�ka classta ula��p istedigimiz gibi
								// degi�tirebiliyoruz.

		System.out.println(obj.isim); // Ali Can
		System.out.println(obj.maas); // 10000

		obj.isim = "Veli Cem";
		obj.maas = 15000;

		System.out.println(obj.isim); // Veli Cem
		System.out.println(obj.maas); // 15000 (( Bu deger bu obje i�in degi�ti,ba�ka objede yine en ba�taki
										// deger...))

	}

}
