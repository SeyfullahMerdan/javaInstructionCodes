package day34_accessModifier_encapsulation;

public class C01 {

	private int sayiPrivate = 10; // En dar olan�
	// private class �yelerine sadece i�inde bulundugu classtan ula��labilir

	int sayiDefault = 20; // Default
	// default class �yelerine sadece i�inde bulundugu package classlardan
	// ula��labilir.
	// bir diger ad� da package access modifierd�r

	protected int sayiProtected = 30; // Genelin bir alt�
	// Ba�ka packagede olup da child olmayanlar ula�amaz.
	// ��inde bulundugu packagedeki t�m classlar ve ba�ka pacagedeki c�m classlar
	// ula�abilir.

	public int sayiPublic = 40; // en geneli
	// public class �yelerine t�m packagelerdeki t�m classlar ula�abilir.

	public static void main(String[] args) {

		C01 obj = new C01(); /// static olmad�klar� i�in obje olu�turdum ve bu �ekilde ula�acag�m,
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
	}

	public void staticOlmayan() {

		C01 obj = new C01();
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);

	}

}
